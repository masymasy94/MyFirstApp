package com.example.myfirstapp

import android.app.AlertDialog
import android.app.SearchManager
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import android.widget.BaseAdapter
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_enchantements.*
import kotlinx.android.synthetic.main.enchantment_row.view.*
import sqlite.Enchantment
import sqlite.EnchantmentsDatabaseOpenHelper

class EnchantmentsActivity : AppCompatActivity() {

    private var enchantmentsHandler : EnchantmentsDatabaseOpenHelper = EnchantmentsDatabaseOpenHelper(this, null);
    var enchantmentList : MutableList<Enchantment> = mutableListOf()
    var x1 : Float= 0.0f;
    var x2 : Float = 0.0f;
    var y1 : Float = 0.0f;
    var y2 : Float = 0.0f;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enchantements)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#673AB7")))
        supportActionBar?.title = "Incantesimi"



        enchantmentsListView.setOnTouchListener(
            object : View.OnTouchListener {
                override fun onTouch(v: View?, event: MotionEvent): Boolean {

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
                                var intent = Intent(baseContext, ActivityHomePage::class.java)
                                intent = Intent(this@EnchantmentsActivity, ItemsActivity::class.java)
                                startActivity(intent)
                                overridePendingTransition(R.anim.enter2, R.anim.exit2);

                                //SWIPE RIGHT
                            } else if (x1 > x2 && (x1 - x2 > 400  || x1 - x2 < -400)) {
                                var intent = Intent(this@EnchantmentsActivity, MonstersActivity::class.java)
                                startActivity(intent)
                                overridePendingTransition(R.anim.enter, R.anim.exit);
                            }
                        }
                    }
                    return false
                }
            }

        )





    }




    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item != null) {
            when (item.itemId) {
                R.id.add -> {
                    startActivity(Intent(this, AddEnchantmentActivity::class.java))
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

    // sovrascrivi la barra base
    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)

        var menuItem : MenuItem = menu.findItem(R.id.app_bar_search)
        var searchView : SearchView = menuItem.actionView as SearchView

        searchView.setOnQueryTextListener(
            object : SearchView.OnQueryTextListener {

                // TODO salvare ricerca in variabile globale
                override fun onQueryTextSubmit(query: String): Boolean {
                    return false
                }

                override fun onQueryTextChange(newText: String): Boolean {
                    if (newText.isBlank())
                        LoadQuery("%")
                    else
                        LoadQuery("%" + newText + "%")
                    return false
                }
            }

        )

        return super.onCreateOptionsMenu(menu)
    }

    override fun onResume() {
        super.onResume()
        LoadQuery("%") // TODO da cambiare con variabile della barra di ricerca
    }

    public fun LoadQuery(italian_name: String) {
        val projections = arrayOf(
            EnchantmentsDatabaseOpenHelper.COLUMN_ID,
            EnchantmentsDatabaseOpenHelper.COLUMN_ITALIAN_NAME,
            EnchantmentsDatabaseOpenHelper.COLUMN_ENGLISH_NAME,
            EnchantmentsDatabaseOpenHelper.COLUMN_LEVEL,
            EnchantmentsDatabaseOpenHelper.COLUMN_CLASS_OF_MAGIC,
            EnchantmentsDatabaseOpenHelper.COLUMN_CASTING_TIME,
            EnchantmentsDatabaseOpenHelper.COLUMN_RANGE,
            EnchantmentsDatabaseOpenHelper.COLUMN_COMPONENTS,
            EnchantmentsDatabaseOpenHelper.COLUMN_DURATION,
            EnchantmentsDatabaseOpenHelper.COLUMN_DESCRIPTION)
        val selectionArgs = arrayOf(italian_name)
        val cursor = enchantmentsHandler.query(projections, "italian_name like ?", selectionArgs, "italian_name")
        enchantmentList.clear()
        if (cursor.moveToFirst()) {

            do {
                val id = cursor.getInt(cursor.getColumnIndex(EnchantmentsDatabaseOpenHelper.COLUMN_ID))
                val italianName = cursor.getString(cursor.getColumnIndex(EnchantmentsDatabaseOpenHelper.COLUMN_ITALIAN_NAME))
                val englishName = cursor.getString(cursor.getColumnIndex(EnchantmentsDatabaseOpenHelper.COLUMN_ENGLISH_NAME))
                val level = cursor.getInt(cursor.getColumnIndex(EnchantmentsDatabaseOpenHelper.COLUMN_LEVEL))
                val classOfMagic = cursor.getString(cursor.getColumnIndex(EnchantmentsDatabaseOpenHelper.COLUMN_CLASS_OF_MAGIC))
                val castingTime = cursor.getString(cursor.getColumnIndex(EnchantmentsDatabaseOpenHelper.COLUMN_CASTING_TIME))
                val range = cursor.getString(cursor.getColumnIndex(EnchantmentsDatabaseOpenHelper.COLUMN_RANGE))
                val components = cursor.getString(cursor.getColumnIndex(EnchantmentsDatabaseOpenHelper.COLUMN_COMPONENTS))
                val duration = cursor.getString(cursor.getColumnIndex(EnchantmentsDatabaseOpenHelper.COLUMN_DURATION))
                val description = cursor.getString(cursor.getColumnIndex(EnchantmentsDatabaseOpenHelper.COLUMN_DESCRIPTION))

                enchantmentList.add(Enchantment(
                    id,
                    italianName,
                    englishName,
                    level,
                    classOfMagic,
                    castingTime,
                    range,
                    components,
                    duration,
                    description
                ))

            } while (cursor.moveToNext())
        }

        //adapter
        var myEnchantmentsAdapter = MyEnchantmentsAdapter(this, enchantmentList as ArrayList<Enchantment>)
        enchantmentsListView.adapter = myEnchantmentsAdapter

    }


    inner class MyEnchantmentsAdapter : BaseAdapter {
        var enchantmentListAdapter = ArrayList<Enchantment>()
        var enchantmentListAdapterFull = ArrayList<Enchantment>()
        var context: Context? = null

        constructor(context: Context, listEnchantmentsAdapter: ArrayList<Enchantment>) : super() {
            this.enchantmentListAdapter = listEnchantmentsAdapter
            this.context = context
            this.enchantmentListAdapterFull = ArrayList(enchantmentListAdapter)
        }


        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            //inflate layout row.xml
            var myView = layoutInflater.inflate(R.layout.enchantment_row, null)
            val myEnchantment = enchantmentListAdapter[position]
            var lv : String
            if (myEnchantment.level == 0) {
                lv = " - Trucchetto"
            } else {
                lv = " (Lv " + myEnchantment.level +")"
            }
            myView.enchantmentTitle.text = myEnchantment.italianName + lv
            myView.enchantmentDesc.text = myEnchantment.description


            //delete button click
            myView.deleteEnchantmentBtn.setOnClickListener {

                val dialogBuilder = AlertDialog.Builder(this@EnchantmentsActivity)
                    .setCancelable(true)
                    .setPositiveButton("Elimina!!", DialogInterface.OnClickListener {
                            dialog, id ->
                        val selectionArgs = arrayOf(myEnchantment.id.toString())
                        enchantmentsHandler.delete("ID=?", selectionArgs)
                        LoadQuery("%")
                        dialog.cancel()

                        var toast = Toast.makeText(this@EnchantmentsActivity, "Incantesimo " +  myEnchantment.italianName + " eliminato", Toast.LENGTH_LONG)
                        toast.show()
                    })
                    // negative button text and action
                    .setNegativeButton("Non eliminare!", DialogInterface.OnClickListener {
                            dialog, id -> dialog.cancel()
                    })

                val alert = dialogBuilder.create()
                alert.setTitle("Vuoi eliminare l'incantesimo " +  myEnchantment.italianName + "?")
                alert.show()


            }
            //edit//update button click
            myView.editEnchantBtn.setOnClickListener {
                GoToUpdateFun(myEnchantment)
            }

            return myView
        }

        override fun getItem(position: Int): Any {
            return enchantmentListAdapter[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return enchantmentListAdapter.size
        }


        inner class SearchResultItemsActivity : AppCompatActivity() {

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                handleIntent(intent)
            }

            override fun onNewIntent(intent: Intent) {
                super.onNewIntent(intent)
                handleIntent(intent)
            }

            private fun handleIntent(intent: Intent) {

                if (Intent.ACTION_SEARCH == intent.action) {
                    val query = intent.getStringExtra(SearchManager.QUERY)

                }
            }
        }

        private fun GoToUpdateFun(myEnchantment: Enchantment) {
            var intent = Intent(baseContext, AddEnchantmentActivity::class.java)
            intent.putExtra(EnchantmentsDatabaseOpenHelper.COLUMN_ID, myEnchantment.id) //put id
            intent.putExtra(EnchantmentsDatabaseOpenHelper.COLUMN_ITALIAN_NAME, myEnchantment.italianName) //put name
            intent.putExtra(EnchantmentsDatabaseOpenHelper.COLUMN_DESCRIPTION, myEnchantment.description) //put description
            startActivity(intent) //start activity
        }

    }




}
