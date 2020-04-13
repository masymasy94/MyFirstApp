package sqlite

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteQueryBuilder
import java.util.*

class ItemsDatabaseOpenHelper(context: Context, factory: SQLiteDatabase.CursorFactory?) : SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION){

    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "ddapp.db"
        val TABLE_NAME = "items"
        val COLUMN_ID = "id"
        val COLUMN_NAME = "name"
        val COLUMN_DESCRIPTION = "description"
        val COLUMN_CATEGORY = "category"
        val COLUMN_ID_VIRTUAL_TABLE = "idVirtualTable"
        val COLUMN_RARITY = "rarity"
    }


    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_PRODUCTS_TABLE = ("CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY,"
                + COLUMN_NAME + " TEXT,"
                + COLUMN_DESCRIPTION + " TEXT,"
                + COLUMN_CATEGORY + " TEXT,"
                + COLUMN_ID_VIRTUAL_TABLE + " INTEGER,"
                + COLUMN_RARITY +  " TEXT "
                + ")")
        db.execSQL(CREATE_PRODUCTS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    fun getAll(): Cursor? {
        val db = this.readableDatabase
        return db.rawQuery("SELECT * FROM $TABLE_NAME", null)
    }

    fun addItem(item: Item) {
        val values = ContentValues()
        values.put(COLUMN_NAME, item.name)
        values.put(COLUMN_DESCRIPTION, item.description)
        values.put(COLUMN_CATEGORY, item.category)
        values.put(COLUMN_ID_VIRTUAL_TABLE, item.idVirtualTable)
        values.put(COLUMN_RARITY, item.rarity)
        val db = this.writableDatabase
        db.insert(TABLE_NAME, null, values)
        db.close()
    }

    fun updateItem(item: Item): Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(COLUMN_NAME, item.name)
        values.put(COLUMN_DESCRIPTION, item.description)
        values.put(COLUMN_CATEGORY, item.category)
        values.put(COLUMN_ID_VIRTUAL_TABLE, item.idVirtualTable)
        values.put(COLUMN_RARITY, item.rarity)

        val success = db.update(TABLE_NAME, values, "$COLUMN_ID=?", arrayOf(item.id.toString())).toLong()
        db.close()
        return Integer.parseInt("$success") != -1
    }


    fun getItems(): List<Item> {

        val cursor = this!!.getAll()
        if (cursor == null || cursor.count == 0) {
            return Collections.emptyList()
        }
        cursor!!.moveToFirst()

        var result : MutableList<Item> = mutableListOf()

        // per il primo oggetto
        if (cursor != null) {
            var item : Item = Item(
                cursor.getInt(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_ID)),
                cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_NAME)),
                cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_DESCRIPTION)),
                cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_CATEGORY)),
                cursor.getInt(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_ID_VIRTUAL_TABLE)),
                cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_RARITY))
            )

            result.add(item)
        }

        while (cursor.moveToNext()) {
            var item : Item = Item(
                cursor.getInt(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_ID)),
                cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_NAME)),
                cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_DESCRIPTION)),
                cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_CATEGORY)),
                cursor.getInt(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_ID_VIRTUAL_TABLE)),
                cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_RARITY))
            )

            result.add(item)
        }

        cursor.close()
        return result
    }

    fun insert(values: ContentValues): Long {
        return this.writableDatabase.insert(TABLE_NAME, "", values)
    }

    fun query(projection: Array<String>, selection: String, selectionArgs: Array<String>, sorOrder: String): Cursor {
        val qb = SQLiteQueryBuilder();
        qb.tables = TABLE_NAME
        return this.readableDatabase.query(TABLE_NAME, projection, selection, selectionArgs, null, null, sorOrder) // non va senza %

    }

    fun delete(selection: String, selectionArgs: Array<String>): Int {
        return this.writableDatabase.delete(TABLE_NAME, selection, selectionArgs)

    }

    fun update(values: ContentValues, selection: String, selectionArgs: Array<String>): Int {
        return this.writableDatabase.update(TABLE_NAME, values, selection, selectionArgs)
    }




}