package sqlite

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteQueryBuilder
import java.util.*

class EnchantmentsDatabaseOpenHelper (context: Context, factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION
    ){

    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "ddapp.db"
        val TABLE_NAME = "enchantments"
        val COLUMN_ID = "id"
        val COLUMN_ITALIAN_NAME = "italian_name"
        val COLUMN_ENGLISH_NAME = "english_name"
        val COLUMN_LEVEL = "level"
        val COLUMN_CLASS_OF_MAGIC = "class_of_magic"
        val COLUMN_CASTING_TIME = "casting_time"
        val COLUMN_RANGE = "range"
        val COLUMN_COMPONENTS = "components"
        val COLUMN_DURATION = "duration"
        val COLUMN_DESCRIPTION = "description"

    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_PRODUCTS_TABLE = ("CREATE TABLE IF NOT EXISTS " +
                  TABLE_NAME + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY,"
                + COLUMN_ITALIAN_NAME + " TEXT, "
                + COLUMN_ENGLISH_NAME + " TEXT, "
                + COLUMN_LEVEL +  " INTEGER, "
                + COLUMN_CLASS_OF_MAGIC + " TEXT, "
                + COLUMN_CASTING_TIME + " TEXT, "
                + COLUMN_RANGE + " TEXT, "
                + COLUMN_COMPONENTS + " TEXT, "
                + COLUMN_DURATION + " TEXT, "
                + COLUMN_DESCRIPTION + " TEXT"
                + ")")
        this.writableDatabase.execSQL(CREATE_PRODUCTS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    fun getAll(): Cursor? {
        return this.writableDatabase.rawQuery("SELECT * FROM ${TABLE_NAME}", null)
    }

    fun addEnchantment(enchantment: Enchantment) {
        val values = ContentValues()

        values.put(COLUMN_ITALIAN_NAME, enchantment.italianName)
        values.put(COLUMN_ENGLISH_NAME, enchantment.englishName)
        values.put(COLUMN_LEVEL, enchantment.level)
        values.put(COLUMN_CLASS_OF_MAGIC, enchantment.classOfMagic)
        values.put(COLUMN_CASTING_TIME, enchantment.castingTime)
        values.put(COLUMN_RANGE, enchantment.range)
        values.put(COLUMN_COMPONENTS, enchantment.components)
        values.put(COLUMN_DURATION, enchantment.duration)
        values.put(COLUMN_DESCRIPTION, enchantment.description)

        this.writableDatabase.insert(TABLE_NAME, null, values)
        this.writableDatabase.close()
    }

    fun updateEnchantment(enchantment: Enchantment) : Boolean {
        val values = ContentValues()

        values.put(COLUMN_ITALIAN_NAME, enchantment.italianName)
        values.put(COLUMN_ENGLISH_NAME, enchantment.englishName)
        values.put(COLUMN_LEVEL, enchantment.level)
        values.put(COLUMN_CLASS_OF_MAGIC, enchantment.classOfMagic)
        values.put(COLUMN_CASTING_TIME, enchantment.castingTime)
        values.put(COLUMN_RANGE, enchantment.range)
        values.put(COLUMN_COMPONENTS, enchantment.components)
        values.put(COLUMN_DURATION, enchantment.duration)
        values.put(COLUMN_DESCRIPTION, enchantment.description)

        val success = this.writableDatabase.update(TABLE_NAME, values, "$COLUMN_ID=?", arrayOf(enchantment.id.toString())).toLong()
        this.writableDatabase.close()
        return Integer.parseInt("$success") != -1
    }

    fun getEnchantements() : List<Enchantment> {
        val cursor = this?.getAll()
        if (cursor == null || cursor.count == 0) {
            return Collections.emptyList()
        }
        cursor.moveToFirst()

        var result : MutableList<Enchantment> = mutableListOf()

        if (cursor != null) {
            var enchantment : Enchantment = Enchantment(
                cursor.getInt(cursor.getColumnIndex(COLUMN_ID)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ITALIAN_NAME)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ENGLISH_NAME)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_LEVEL)),
                cursor.getString(cursor.getColumnIndex(COLUMN_CLASS_OF_MAGIC)),
                cursor.getString(cursor.getColumnIndex(COLUMN_CASTING_TIME)),
                cursor.getString(cursor.getColumnIndex(COLUMN_RANGE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_COMPONENTS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_DURATION)),
                cursor.getString(cursor.getColumnIndex(COLUMN_DESCRIPTION))
            )
            result.add(enchantment)
        }

        while (cursor.moveToNext()) {
            var enchantment : Enchantment = Enchantment(
                cursor.getInt(cursor.getColumnIndex(COLUMN_ID)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ITALIAN_NAME)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ENGLISH_NAME)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_LEVEL)),
                cursor.getString(cursor.getColumnIndex(COLUMN_CLASS_OF_MAGIC)),
                cursor.getString(cursor.getColumnIndex(COLUMN_CASTING_TIME)),
                cursor.getString(cursor.getColumnIndex(COLUMN_RANGE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_COMPONENTS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_DURATION)),
                cursor.getString(cursor.getColumnIndex(COLUMN_DESCRIPTION))
            )
            result.add(enchantment)
        }

        cursor.close()
        return result
    }

    fun query(projection: Array<String>, selection: String, selectionArgs: Array<String>, sorOrder: String): Cursor {
        val qb = SQLiteQueryBuilder();
        qb.tables = TABLE_NAME
        return this.readableDatabase.query(TABLE_NAME, projection, selection, selectionArgs, null, null, sorOrder)
    }

    fun delete(selection: String, selectionArgs: Array<String>): Int {
        return this.writableDatabase.delete(TABLE_NAME, selection, selectionArgs)

    }

}