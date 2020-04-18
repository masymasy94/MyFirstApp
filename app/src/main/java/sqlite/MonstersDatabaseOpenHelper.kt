package sqlite

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteQueryBuilder
import java.util.*

class MonstersDatabaseOpenHelper (context: Context, factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION){

    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "ddapp.db"
        val TABLE_NAME = "monsters"
        val COLUMN_ID = "id"
        val COLUMN_NAME = "name"
        val COLUMN_SIZE = "size"
        val COLUMN_SPECIES = "species" // type
        val COLUMN_ALIGNMENT = "alignment"
        val COLUMN_HIT_POINTS = "hit_points"
        val COLUMN_HIT_POINTS_DICES = "hit_points_dices"
        val COLUMN_ARMOR_CLASS = "armor_class"
        val COLUMN_ARMOR_CLASS_TYPE = "armor_class_type"
        val COLUMN_SPEED = "speed"
        val COLUMN_CHALLANGE = "challenge"
        val COLUMN_EXPERIENCE = "experience"

        val COLUMN_SAVING_THROWS = "saving_throws"
        val COLUMN_ABILITIES = "abilities"
        val COLUMN_SENSES = "senses"
        val COLUMN_LANGUAGES = "languages"
        val COLUMN_PASSIVE_ACTIONS = "passive_actions"
        val COLUMN_ACTIONS = "actions"
        val COLUMN_LEGENDARY_ACTIONS = "legendary_actions"
        val COLUMN_LEGENDARY_ACTIONS_DESCRIPTION = "legendary_actions_description"
        val COLUMN_DAMAGE_RESISTENCES = "damage_resistances"
        val COLUMN_DAMAGE_IMMUNITIES = "damage_immunities"
        val COLUMN_CONDITION_RESISTANCE = "condition_resistance"
        val COLUMN_CONDITION_IMMUNITIES = "condition_immunities"
        val COLUMN_STRENGHT = "strenght"
        val COLUMN_STRENGHT_MODIFIER = "strenght_modifier"
        val COLUMN_DEXTERITY = "dexterity"
        val COLUMN_DEXTERITY_MODIFIER = "dexterity_modifier"
        val COLUMN_INTELLIGENCE = "intelligence"
        val COLUMN_INTELLIGENCE_MODIFIER = "intelligence_modifier"
        val COLUMN_CONSTITUTION = "constitution"
        val COLUMN_CONSTITUTION_MODIFIER = "constitution_modifier"
        val COLUMN_WISDOM = "wisdom"
        val COLUMN_WISDOM_MODIFIER = "wisdom_modifier"
        val COLUMN_CHARISMA = "charisma"
        val COLUMN_CHARISMA_MODIFIER = "charisma_modifier"

        val COLUMN_REACTIONS = "reactions"

    }

    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_PRODUCTS_TABLE = ("CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY,"
                + COLUMN_NAME + " TEXT, "
                + COLUMN_SIZE + " TEXT, "
                + COLUMN_SPECIES + " TEXT, "
                + COLUMN_ALIGNMENT + " TEXT, "
                + COLUMN_HIT_POINTS +  " INTEGER, "
                + COLUMN_HIT_POINTS_DICES +  " TEXT, "
                + COLUMN_ARMOR_CLASS +  " INTEGER, "
                + COLUMN_ARMOR_CLASS_TYPE + " TEXT, "
                + COLUMN_SPEED +  " TEXT, "
                + COLUMN_CHALLANGE +  " INTEGER, "
                + COLUMN_EXPERIENCE +  " INTEGER, "
                + COLUMN_SAVING_THROWS + " TEXT, "
                + COLUMN_ABILITIES + " TEXT, "
                + COLUMN_SENSES + " TEXT, "
                + COLUMN_LANGUAGES + " TEXT, "
                + COLUMN_PASSIVE_ACTIONS + " TEXT, "
                + COLUMN_ACTIONS + " TEXT, "
                + COLUMN_LEGENDARY_ACTIONS + " TEXT, "
                + COLUMN_LEGENDARY_ACTIONS_DESCRIPTION + " TEXT, "
                + COLUMN_DAMAGE_RESISTENCES + " TEXT, "
                + COLUMN_DAMAGE_IMMUNITIES + " TEXT, "
                + COLUMN_CONDITION_RESISTANCE + " TEXT, "
                + COLUMN_CONDITION_IMMUNITIES + " TEXT, "
                + COLUMN_STRENGHT + " INTEGER, "
                + COLUMN_STRENGHT_MODIFIER + " INTEGER, "
                + COLUMN_DEXTERITY + " INTEGER, "
                + COLUMN_DEXTERITY_MODIFIER + " INTEGER, "
                + COLUMN_INTELLIGENCE + " INTEGER, "
                + COLUMN_INTELLIGENCE_MODIFIER + " INTEGER, "
                + COLUMN_CONSTITUTION + " INTEGER, "
                + COLUMN_CONSTITUTION_MODIFIER + " INTEGER, "
                + COLUMN_WISDOM + " INTEGER, "
                + COLUMN_WISDOM_MODIFIER + " INTEGER, "
                + COLUMN_CHARISMA + " INTEGER, "
                + COLUMN_CHARISMA_MODIFIER + " INTEGER, "
                + COLUMN_REACTIONS + " TEXT "
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

    fun addMonster(monster: Monster) {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(COLUMN_NAME, monster.name)
        values.put(COLUMN_SIZE, monster.size)
        values.put(COLUMN_SPECIES, monster.species)
        values.put(COLUMN_ALIGNMENT, monster.alignment)
        values.put(COLUMN_HIT_POINTS, monster.hitPoints)
        values.put(COLUMN_HIT_POINTS_DICES, monster.hitPointsDices)
        values.put(COLUMN_ARMOR_CLASS, monster.armorClass)
        values.put(COLUMN_ARMOR_CLASS_TYPE, monster.armorClassType)
        values.put(COLUMN_SPEED, monster.speed)
        values.put(COLUMN_CHALLANGE, monster.challenge)
        values.put(COLUMN_EXPERIENCE, monster.experience)
        values.put(COLUMN_SAVING_THROWS, monster.savingThrows)
        values.put(COLUMN_ABILITIES, monster.abilities)
        values.put(COLUMN_SENSES, monster.senses)
        values.put(COLUMN_LANGUAGES, monster.languages)
        values.put(COLUMN_PASSIVE_ACTIONS, monster.passiveActions)
        values.put(COLUMN_ACTIONS, monster.actions)
        values.put(COLUMN_LEGENDARY_ACTIONS, monster.legendaryActions)
        values.put(COLUMN_LEGENDARY_ACTIONS_DESCRIPTION, monster.legendaryActionsDescription)

        values.put(COLUMN_DAMAGE_RESISTENCES, monster.resistenzaDanni)
        values.put(COLUMN_DAMAGE_IMMUNITIES, monster.immunitaDanni)
        values.put(COLUMN_CONDITION_RESISTANCE, monster.resistenzaCondizioni)
        values.put(COLUMN_CONDITION_IMMUNITIES, monster.immunitaCondizioni)

        values.put(COLUMN_STRENGHT, monster.strenght)
        values.put(COLUMN_STRENGHT_MODIFIER, monster.strenghtModifier)
        values.put(COLUMN_DEXTERITY, monster.dexterity)
        values.put(COLUMN_DEXTERITY_MODIFIER, monster.dexterityModifier)
        values.put(COLUMN_INTELLIGENCE, monster.intelligence)
        values.put(COLUMN_INTELLIGENCE_MODIFIER, monster.intelligenceModifier)
        values.put(COLUMN_CONSTITUTION, monster.constitution)
        values.put(COLUMN_CONSTITUTION_MODIFIER, monster.constitutionModifier)
        values.put(COLUMN_WISDOM, monster.wisdom)
        values.put(COLUMN_WISDOM_MODIFIER, monster.wisdomModifier)
        values.put(COLUMN_CHARISMA, monster.charisma)
        values.put(COLUMN_CHARISMA_MODIFIER, monster.charismaModifier)
        values.put(COLUMN_REACTIONS, monster.reactions)

        db.insert(TABLE_NAME, null, values)
        db.close()
    }

    fun updateMonster(monster: Monster): Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(COLUMN_NAME, monster.name)
        values.put(COLUMN_SIZE, monster.size)
        values.put(COLUMN_SPECIES, monster.species)
        values.put(COLUMN_ALIGNMENT, monster.alignment)
        values.put(COLUMN_HIT_POINTS, monster.hitPoints)
        values.put(COLUMN_HIT_POINTS_DICES, monster.hitPointsDices)
        values.put(COLUMN_ARMOR_CLASS, monster.armorClass)
        values.put(COLUMN_ARMOR_CLASS_TYPE, monster.armorClassType)
        values.put(COLUMN_SPEED, monster.speed)
        values.put(COLUMN_CHALLANGE, monster.challenge)
        values.put(COLUMN_EXPERIENCE, monster.experience)
        values.put(COLUMN_SAVING_THROWS, monster.savingThrows)
        values.put(COLUMN_ABILITIES, monster.abilities)
        values.put(COLUMN_SENSES, monster.senses)
        values.put(COLUMN_LANGUAGES, monster.languages)
        values.put(COLUMN_PASSIVE_ACTIONS, monster.passiveActions)
        values.put(COLUMN_ACTIONS, monster.actions)
        values.put(COLUMN_LEGENDARY_ACTIONS, monster.legendaryActions)
        values.put(COLUMN_LEGENDARY_ACTIONS_DESCRIPTION, monster.legendaryActionsDescription)

        values.put(COLUMN_DAMAGE_RESISTENCES, monster.resistenzaDanni)
        values.put(COLUMN_DAMAGE_IMMUNITIES, monster.immunitaDanni)
        values.put(COLUMN_CONDITION_RESISTANCE, monster.resistenzaCondizioni)
        values.put(COLUMN_CONDITION_IMMUNITIES, monster.immunitaCondizioni)

        values.put(COLUMN_STRENGHT, monster.strenght)
        values.put(COLUMN_STRENGHT_MODIFIER, monster.strenghtModifier)
        values.put(COLUMN_DEXTERITY, monster.dexterity)
        values.put(COLUMN_DEXTERITY_MODIFIER, monster.dexterityModifier)
        values.put(COLUMN_INTELLIGENCE, monster.intelligence)
        values.put(COLUMN_INTELLIGENCE_MODIFIER, monster.intelligenceModifier)
        values.put(COLUMN_CONSTITUTION, monster.constitution)
        values.put(COLUMN_CONSTITUTION_MODIFIER, monster.constitutionModifier)
        values.put(COLUMN_WISDOM, monster.wisdom)
        values.put(COLUMN_WISDOM_MODIFIER, monster.wisdomModifier)
        values.put(COLUMN_CHARISMA, monster.charisma)
        values.put(COLUMN_CHARISMA_MODIFIER, monster.charismaModifier)
        values.put(COLUMN_REACTIONS, monster.reactions)

        val success = db.update(TABLE_NAME, values, "$COLUMN_ID=?", arrayOf(monster.id.toString())).toLong()
        db.close()
        return Integer.parseInt("$success") != -1
    }

    fun getMonsters(): List<Monster> {

        val cursor = this?.getAll()
        if (cursor == null || cursor.count == 0) {
            return Collections.emptyList()
        }
        cursor.moveToFirst()

        var result : MutableList<Monster> = mutableListOf()

        // per il primo oggetto
        if (cursor != null) {
            var monster : Monster = Monster(
                cursor.getInt(cursor.getColumnIndex(COLUMN_ID)),
                cursor.getString(cursor.getColumnIndex(COLUMN_NAME)),
                cursor.getString(cursor.getColumnIndex(COLUMN_SIZE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_SPECIES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ALIGNMENT)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_HIT_POINTS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_HIT_POINTS_DICES)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_ARMOR_CLASS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ARMOR_CLASS_TYPE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_SPEED)),
                cursor.getDouble(cursor.getColumnIndex(COLUMN_CHALLANGE)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_EXPERIENCE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_SAVING_THROWS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ABILITIES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_SENSES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_LANGUAGES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_PASSIVE_ACTIONS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ACTIONS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_LEGENDARY_ACTIONS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_LEGENDARY_ACTIONS_DESCRIPTION)),
                cursor.getString(cursor.getColumnIndex(COLUMN_DAMAGE_RESISTENCES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_DAMAGE_IMMUNITIES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_CONDITION_RESISTANCE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_CONDITION_IMMUNITIES)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_STRENGHT)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_STRENGHT_MODIFIER)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_DEXTERITY)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_DEXTERITY_MODIFIER)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_INTELLIGENCE)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_INTELLIGENCE_MODIFIER)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_CONSTITUTION)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_CONSTITUTION_MODIFIER)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_WISDOM)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_WISDOM_MODIFIER)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_CHARISMA)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_CHARISMA_MODIFIER)),
                cursor.getString(cursor.getColumnIndex(COLUMN_REACTIONS))
            )
            result.add(monster)
        }

        while (cursor.moveToNext()) {
            var monster : Monster = Monster(
                cursor.getInt(cursor.getColumnIndex(COLUMN_ID)),
                cursor.getString(cursor.getColumnIndex(COLUMN_NAME)),
                cursor.getString(cursor.getColumnIndex(COLUMN_SIZE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_SPECIES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ALIGNMENT)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_HIT_POINTS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_HIT_POINTS_DICES)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_ARMOR_CLASS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ARMOR_CLASS_TYPE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_SPEED)),
                cursor.getDouble(cursor.getColumnIndex(COLUMN_CHALLANGE)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_EXPERIENCE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_SAVING_THROWS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ABILITIES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_SENSES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_LANGUAGES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_PASSIVE_ACTIONS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_ACTIONS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_LEGENDARY_ACTIONS)),
                cursor.getString(cursor.getColumnIndex(COLUMN_LEGENDARY_ACTIONS_DESCRIPTION)),
                cursor.getString(cursor.getColumnIndex(COLUMN_DAMAGE_RESISTENCES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_DAMAGE_IMMUNITIES)),
                cursor.getString(cursor.getColumnIndex(COLUMN_CONDITION_RESISTANCE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_CONDITION_IMMUNITIES)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_STRENGHT)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_STRENGHT_MODIFIER)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_DEXTERITY)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_DEXTERITY_MODIFIER)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_INTELLIGENCE)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_INTELLIGENCE_MODIFIER)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_CONSTITUTION)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_CONSTITUTION_MODIFIER)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_WISDOM)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_WISDOM_MODIFIER)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_CHARISMA)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_CHARISMA_MODIFIER)),
                cursor.getString(cursor.getColumnIndex(COLUMN_REACTIONS))
            )
            result.add(monster)
        }

        cursor.close()
        return result
    }

    fun query(projection: Array<String>, selection: String, selectionArgs: Array<String>, sorOrder: String): Cursor {
        val qb = SQLiteQueryBuilder();
        qb.tables = MonstersDatabaseOpenHelper.TABLE_NAME
        return this.readableDatabase.query(TABLE_NAME, projection, selection, selectionArgs, null, null, sorOrder)

    }

    fun delete(selection: String, selectionArgs: Array<String>): Int {
        return this.writableDatabase.delete(TABLE_NAME, selection, selectionArgs)

    }

    fun update(values: ContentValues, selection: String, selectionArgs: Array<String>): Int {
        return this.writableDatabase.update(TABLE_NAME, values, selection, selectionArgs)
    }

}