package com.example.myfirstapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import liste.base.MostriBase
import liste.base.OggettiBase
import sqlite.Item
import sqlite.ItemsDatabaseOpenHelper
import sqlite.Monster
import sqlite.MonstersDatabaseOpenHelper


class ActivityHomePage : AppCompatActivity() {

    var x1 : Float = 0.0f;
    var x2 : Float = 0.0f;
    var y1 : Float = 0.0f;
    var y2 : Float = 0.0f;


    var toast : Toast? = null;
    private var itemsHandler: ItemsDatabaseOpenHelper = ItemsDatabaseOpenHelper(this, null);
    private var monstersHandler: MonstersDatabaseOpenHelper = MonstersDatabaseOpenHelper(this, null);


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)

        createBaseDB()

        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#673AB7")))
        supportActionBar?.title = "Home"
    }

    fun createBaseDB() {
        //AGGIUNGERE ALTRE LISTE BASE
        itemsHandler.onUpgrade(itemsHandler.writableDatabase,1,1)
        monstersHandler.onUpgrade(monstersHandler.writableDatabase, 1,1 )


        // Items -----------------------------------------------------------------------------------
        var listaDB: List<Item> = itemsHandler.getItems()
        var listaBase = OggettiBase().getOggettiBase();


//        if (listaDB.isEmpty())   if da decommentare al rilascio // TODO
        for (item: Item in listaBase) {
            var itemDb = listaDB.asSequence()
                .filter { x -> x.name?.toUpperCase().equals(item.name?.toUpperCase()) }
                .firstOrNull()
            if (itemDb == null)
                itemsHandler.addItem(item)
            else if (!itemDb.equalsAttributues(itemDb)) {
                item.id = listaDB.asSequence()
                    .filter { x -> x.name?.toUpperCase().equals(item.name?.toUpperCase()) }
                    .first().id
                itemsHandler.updateItem(item)

            }

        }


        // Monsters --------------------------------------------------------------------------------

        var listaMostriDB : List<Monster> = monstersHandler.getMonsters()
        var listaMostriBase = MostriBase().getMostriBase()

//        if (listaMostriDB.isEmpty())  if da decommentare al rilascio // TODO
        for (monster: Monster in listaMostriBase) {
            var monsterDb = listaMostriDB.asSequence()
                .filter { x -> x.name?.toUpperCase().equals(monster.name?.toUpperCase()) }
                .firstOrNull()
            if (monsterDb == null)
                monstersHandler.addMonster(monster)
            else if (!monsterDb.equalsAttributues(monsterDb)) {
                monster.id = listaDB.asSequence()
                    .filter { x -> x.name?.toUpperCase().equals(monster.name?.toUpperCase()) }
                    .first().id
                monstersHandler.updateMonster(monster)

            }

        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState?.run {
            super.onSaveInstanceState(outState)
        }
    }


    fun dmButtonPressed(view: View) {
        toast?.cancel()
        val intent = Intent(this, ActivityDM::class.java)
        startActivity(intent)
    }

    fun pcButtonPressed(view: View) {
//        val intent = Intent(this, ActivityPC::class.java)
//        startActivity(intent)
        toast = Toast.makeText(this, "Funzione non ancora implementata", Toast.LENGTH_LONG)
        toast!!.show()
    }

    override fun onBackPressed() {
        toast?.cancel();
        super.onBackPressed()
    }

    override fun onTouchEvent(motionEvent : MotionEvent): Boolean {

        when (motionEvent.action) {
            MotionEvent.ACTION_DOWN -> {
                x1 = motionEvent.x
                y1 = motionEvent.y
            }
            MotionEvent.ACTION_UP -> {
                x2 = motionEvent.x
                y2 = motionEvent.y

                //SWIPE LEFT
                if (x1 < x2) {
                    toast?.cancel()
                    intent = Intent(this, MonstersActivity::class.java)
                    intent.putExtra("HOME_PAGE_LEVEL","home")
                    startActivity(intent)
                    overridePendingTransition(R.anim.enter2, R.anim.exit2);

                //SWIPE RIGHT
                } else if (x1 > x2) {
                    toast?.cancel()
                    var intent = Intent(this, ItemsActivity::class.java)
                    intent.putExtra("HOME_PAGE_LEVEL","home")
                    startActivity(intent)
                    overridePendingTransition(R.anim.enter, R.anim.exit);
                }

            }
        }

        return false;
    }

}
