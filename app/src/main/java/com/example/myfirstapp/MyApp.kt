package com.example.myfirstapp

import android.app.Application
import liste.base.IncantesimiBase
import liste.base.MostriBase
import liste.base.OggettiBase
import sqlite.*

class MyApp : Application() {

    private var itemsHandler: ItemsDatabaseOpenHelper = ItemsDatabaseOpenHelper(this, null);
    private var monstersHandler: MonstersDatabaseOpenHelper = MonstersDatabaseOpenHelper(this, null);
    private var enchantmentsHandler: EnchantmentsDatabaseOpenHelper = EnchantmentsDatabaseOpenHelper(this, null);


    override fun onCreate() {
        super.onCreate()
        createBaseDB()
    }


    fun createBaseDB() {
        //AGGIUNGERE ALTRE LISTE BASE
        itemsHandler.onUpgrade(itemsHandler.writableDatabase,1,1)
        monstersHandler.onUpgrade(monstersHandler.writableDatabase, 1,1 )
        enchantmentsHandler.onUpgrade(enchantmentsHandler.writableDatabase, 1,1 )

        // Items -----------------------------------------------------------------------------------
        var listaDB: List<Item> = itemsHandler.getItems()
        var listaBase = OggettiBase().getOggettiBase();
        itemsHandler.readableDatabase.execSQL("select * from items")

        if (listaDB.isEmpty())
            for (item: Item in listaBase) {
                var itemDb = listaDB.asSequence()
                    .filter { x -> x.name?.toUpperCase().equals(item.name?.toUpperCase()) }
                    .firstOrNull()
                if (itemDb == null)
                    itemsHandler.addItem(item)
                else if (!itemDb.equalsAttributues(item)) {
                    item.id = listaDB.asSequence()
                        .filter { x -> x.name?.toUpperCase().equals(item.name?.toUpperCase()) }
                        .first().id
                    itemsHandler.updateItem(item)

                }

            }


        // Monsters --------------------------------------------------------------------------------

        var listaMostriDB : List<Monster> = monstersHandler.getMonsters()
        var listaMostriBase = MostriBase().getMostriBase()

        if (listaMostriDB.isEmpty())
            for (monster: Monster in listaMostriBase) {
                var monsterDb = listaMostriDB.asSequence()
                    .filter { x -> x.name?.toUpperCase().equals(monster.name?.toUpperCase()) }
                    .firstOrNull()
                if (monsterDb == null)
                    monstersHandler.addMonster(monster)
                else if (!monsterDb.equalsAttributues(monster)) {
                    monster.id = listaDB.asSequence()
                        .filter { x -> x.name?.toUpperCase().equals(monster.name?.toUpperCase()) }
                        .first().id
                    monstersHandler.updateMonster(monster)

                }

            }

        // Enchantments --------------------------------------------------------------------------------

        var listaIncantesimiDB : List<Enchantment> = enchantmentsHandler.getEnchantements()
        var listaIncantesimiBase = IncantesimiBase().getIncantesimiBase()

        if (listaIncantesimiDB.isEmpty())
            for (enchant: Enchantment in listaIncantesimiBase) {
                var enchantDb = listaIncantesimiDB.asSequence()
                    .filter { x -> x.italianName?.toUpperCase().equals(enchant.italianName?.toUpperCase()) }
                    .firstOrNull()
                if (enchantDb == null)
                    enchantmentsHandler.addEnchantment(enchant)
                else if (!enchantDb.equalsAttributues(enchant)) {
                    enchant.id = listaIncantesimiDB.asSequence()
                        .filter { x -> x.italianName?.toUpperCase().equals(enchant.italianName?.toUpperCase()) }
                        .first().id
                    enchantmentsHandler.updateEnchantment(enchant)

                }

            }

    }

}

