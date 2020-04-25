package com.example.myfirstapp

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_monsters.*
import kotlinx.android.synthetic.main.monster_row.view.*
import sqlite.ItemsDatabaseOpenHelper
import sqlite.Monster
import sqlite.MonstersDatabaseOpenHelper

class MonstersActivity : AppCompatActivity() {

    private var monstersHandler : MonstersDatabaseOpenHelper = MonstersDatabaseOpenHelper(this, null);
    var monstersList : MutableList<Monster> = mutableListOf()

    var homePageLevel : String = ""
    var x1 : Float= 0.0f;
    var x2 : Float = 0.0f;
    var y1 : Float = 0.0f;
    var y2 : Float = 0.0f;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monsters)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#673AB7")))
        supportActionBar?.title = "Bestiario"

        homePageLevel = intent?.extras?.getString("HOME_PAGE_LEVEL").toString()

        LoadMonsterQuery("%")

        val listView = findViewById(R.id.monstersListView) as ListView

        listView.setOnTouchListener(
            object : View.OnTouchListener {
                override fun onTouch(v: View?, event: MotionEvent): Boolean {
                    var downX = 0.0f
                    var upX = 0.0f
                    when (event.action) {
                        MotionEvent.ACTION_DOWN -> {
                            x1 = event.x
                            y1 = event.y
                        }
                        MotionEvent.ACTION_UP -> {
                            x2 = event.x
                            y2 = event.y
                            //SWIPE LEFT
                            if (x1 < x2 && (x1 - x2 > 400 || x1 - x2 < -400)) {
                                intent = Intent(baseContext, EnchantmentsActivity::class.java)
                                startActivity(intent)
                                overridePendingTransition(R.anim.enter2, R.anim.exit2);
                                //SWIPE RIGHT
                            } else if (x1 > x2 && (x1 - x2 > 400  || x1 - x2 < -400)) {

                                when (homePageLevel) {
                                    null -> {intent = Intent(baseContext, ActivityHomePage::class.java)}
                                    "" -> {intent = Intent(baseContext, ActivityHomePage::class.java)}
                                    "dm" -> { intent = Intent(baseContext, ActivityDM::class.java)}
                                    "negozi" -> {intent = Intent(baseContext, GeneraNegoziActivity::class.java)}
                                }
                                startActivity(intent)
                                overridePendingTransition(R.anim.enter, R.anim.exit);
                            }
                        }
                    }
                    return false
                }
            })

    }

    // sovrascrivi la barra base
    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)

        var menuItem : MenuItem = menu.findItem(R.id.app_bar_search)
        var searchView : SearchView = menuItem.actionView as SearchView

        searchView.setOnQueryTextListener(
            object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String): Boolean {
                    return false
                }

                override fun onQueryTextChange(newText: String): Boolean {
                    if (newText.isBlank())
                        LoadMonsterQuery("%")
                    else
                        LoadMonsterQuery("%" + newText + "%")
                    return false
                }
            }

        )

        return super.onCreateOptionsMenu(menu)
    }

    override fun onResume() {
        super.onResume()
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item != null) {
            when (item.itemId) {
                R.id.add -> {
                    startActivity(Intent(this, AddMonsterActivity::class.java))
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

    public fun LoadMonsterQuery(name: String) {
        val projections = arrayOf(MonstersDatabaseOpenHelper.COLUMN_ID,
            MonstersDatabaseOpenHelper.COLUMN_NAME,
            MonstersDatabaseOpenHelper.COLUMN_SIZE,
            MonstersDatabaseOpenHelper.COLUMN_SPECIES,
            MonstersDatabaseOpenHelper.COLUMN_ALIGNMENT,
            MonstersDatabaseOpenHelper.COLUMN_HIT_POINTS,
            MonstersDatabaseOpenHelper.COLUMN_HIT_POINTS_DICES,
            MonstersDatabaseOpenHelper.COLUMN_ARMOR_CLASS,
            MonstersDatabaseOpenHelper.COLUMN_ARMOR_CLASS_TYPE,
            MonstersDatabaseOpenHelper.COLUMN_SPEED,
            MonstersDatabaseOpenHelper.COLUMN_CHALLANGE,
            MonstersDatabaseOpenHelper.COLUMN_EXPERIENCE,
            MonstersDatabaseOpenHelper.COLUMN_SAVING_THROWS,
            MonstersDatabaseOpenHelper.COLUMN_ABILITIES,
            MonstersDatabaseOpenHelper.COLUMN_SENSES,
            MonstersDatabaseOpenHelper.COLUMN_LANGUAGES,
            MonstersDatabaseOpenHelper.COLUMN_PASSIVE_ACTIONS,
            MonstersDatabaseOpenHelper.COLUMN_ACTIONS,
            MonstersDatabaseOpenHelper.COLUMN_LEGENDARY_ACTIONS,
            MonstersDatabaseOpenHelper.COLUMN_LEGENDARY_ACTIONS_DESCRIPTION,
            MonstersDatabaseOpenHelper.COLUMN_DAMAGE_RESISTENCES,
            MonstersDatabaseOpenHelper.COLUMN_DAMAGE_IMMUNITIES,
            MonstersDatabaseOpenHelper.COLUMN_CONDITION_RESISTANCE,
            MonstersDatabaseOpenHelper.COLUMN_CONDITION_IMMUNITIES,
            MonstersDatabaseOpenHelper.COLUMN_STRENGHT,
            MonstersDatabaseOpenHelper.COLUMN_STRENGHT_MODIFIER,
            MonstersDatabaseOpenHelper.COLUMN_DEXTERITY,
            MonstersDatabaseOpenHelper.COLUMN_DEXTERITY_MODIFIER,
            MonstersDatabaseOpenHelper.COLUMN_INTELLIGENCE,
            MonstersDatabaseOpenHelper.COLUMN_INTELLIGENCE_MODIFIER,
            MonstersDatabaseOpenHelper.COLUMN_CONSTITUTION,
            MonstersDatabaseOpenHelper.COLUMN_CONSTITUTION_MODIFIER,
            MonstersDatabaseOpenHelper.COLUMN_WISDOM,
            MonstersDatabaseOpenHelper.COLUMN_WISDOM_MODIFIER,
            MonstersDatabaseOpenHelper.COLUMN_CHARISMA,
            MonstersDatabaseOpenHelper.COLUMN_CHARISMA_MODIFIER,
            MonstersDatabaseOpenHelper.COLUMN_REACTIONS
        )


        val selectionArgs = arrayOf(name)
        val cursor = monstersHandler.query(projections, "name like ?", selectionArgs, "name")
        monstersList.clear()
        if (cursor.moveToFirst()) {

            do {

                monstersList.add(
                    Monster(cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_ID)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_NAME)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_SIZE)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_SPECIES)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_ALIGNMENT)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_HIT_POINTS)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_HIT_POINTS_DICES)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_ARMOR_CLASS)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_ARMOR_CLASS_TYPE)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_SPEED)),
                    cursor.getDouble(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_CHALLANGE)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_EXPERIENCE)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_SAVING_THROWS)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_ABILITIES)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_SENSES)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_LANGUAGES)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_PASSIVE_ACTIONS)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_ACTIONS)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_LEGENDARY_ACTIONS)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_LEGENDARY_ACTIONS_DESCRIPTION)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_DAMAGE_RESISTENCES)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_DAMAGE_IMMUNITIES)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_CONDITION_RESISTANCE)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_CONDITION_IMMUNITIES)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_STRENGHT)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_STRENGHT_MODIFIER)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_DEXTERITY)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_DEXTERITY_MODIFIER)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_INTELLIGENCE)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_INTELLIGENCE_MODIFIER)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_CONSTITUTION)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_CONSTITUTION_MODIFIER)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_WISDOM)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_WISDOM_MODIFIER)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_CHARISMA)),
                    cursor.getInt(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_CHARISMA_MODIFIER)),
                    cursor.getString(cursor.getColumnIndex(MonstersDatabaseOpenHelper.COLUMN_REACTIONS))
                    )
                )

            } while (cursor.moveToNext())
        }

        //adapter
        var myMonstersAdapter = MyMonstersAdapter(this, monstersList as ArrayList<Monster>)
        monstersListView.adapter = myMonstersAdapter

    }


    inner class MyMonstersAdapter : BaseAdapter {
        var monstersListAdapter = ArrayList<Monster>()
        var monstersListAdapterFull = ArrayList<Monster>()
        var context: Context? = null

        constructor(context: Context, listMonstersAdapter: ArrayList<Monster>) : super() {
            this.monstersListAdapter = listMonstersAdapter
            this.context = context
            this.monstersListAdapterFull = ArrayList(listMonstersAdapter)
        }

        fun numberToChallange(challange : Double?) : String {
            if (challange == null)
                return ""
            if (challange < 1 && challange > 0) {
               when(challange) {
                   0.125 -> return "1/8"
                   0.25 -> return "1/4"
                   0.5 -> return "1/2"
               }

            } else {
                return challange.toInt().toString()
            }

            return challange.toInt().toString()
        }


        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            //inflate layout row.xml
            var myView = layoutInflater.inflate(R.layout.monster_row, null)
            val myMonster = monstersListAdapter[position]
            myView.nameCr.text = myMonster.name + " - Sfida " + numberToChallange(myMonster.challenge)
            myView.monsterGenericDesc.text = myMonster.size + " " + myMonster.species +", "+ myMonster.alignment
            // todo


            //delete button click
            myView.deleteMonsterBtn.setOnClickListener {
                val selectionArgs = arrayOf(myMonster.id.toString())
                var monster = monstersHandler.getMonsters()[myMonster.id]
                monstersHandler.delete("ID=?", selectionArgs)
            }
            //edit//update button click
            myView.editMonsterBtn.setOnClickListener {
                GoToUpdateFun(myMonster)
            }

            return myView
        }

        override fun getItem(position: Int): Any {
            return monstersListAdapter[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return monstersListAdapter.size
        }

    }

    private fun GoToUpdateFun(myMonster: Monster) {
        var intent = Intent(this, AddMonsterActivity::class.java)
        intent.putExtra(ItemsDatabaseOpenHelper.COLUMN_ID, myMonster.id)
        intent.putExtra(ItemsDatabaseOpenHelper.COLUMN_NAME, myMonster.name)
        intent.putExtra(ItemsDatabaseOpenHelper.COLUMN_DESCRIPTION, myMonster.passiveActions)
        // TODO
        startActivity(intent) //start activity
    }



}