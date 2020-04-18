package com.example.myfirstapp

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_items.*
import kotlinx.android.synthetic.main.item_row.view.*
import sqlite.Item
import sqlite.ItemsDatabaseOpenHelper


class ItemsActivity : AppCompatActivity() {
    private var itemsHandler : ItemsDatabaseOpenHelper = ItemsDatabaseOpenHelper(this, null);
    var itemsList : MutableList<Item> = mutableListOf()
    var searchManager : SearchManager? = null
    var toast : Toast? = null;
    var homePageLevel : String = ""
    var x1 : Float= 0.0f;
    var x2 : Float = 0.0f;
    var y1 : Float = 0.0f;
    var y2 : Float = 0.0f;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#673AB7")))
        supportActionBar?.title = "Oggetti"

        val intent = intent
        val bundle = intent?.extras
        homePageLevel = bundle?.getString("HOME_PAGE_LEVEL").toString()

        LoadQuery("%")


        val listView = findViewById(R.id.itemsListView) as ListView

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
                        if (x1 < x2 && (x1 - x2 > 500 || x1 - x2 < -500)) {
                            var intent = Intent(baseContext, ActivityHomePage::class.java)
                            when (homePageLevel) {
                                "dm" -> { intent = Intent(baseContext, ActivityDM::class.java) }
                                "negozi" -> { intent = Intent(baseContext, GeneraNegoziActivity::class.java) }
                            }
                            startActivity(intent)
                            overridePendingTransition(R.anim.enter2, R.anim.exit2);

                            //SWIPE RIGHT
                        } else if (x1 > x2 && (x1 - x2 > 500  || x1 - x2 < -500)) {
                            var intent = Intent(baseContext, EnchantmentsActivity::class.java)
                            startActivity(intent)
                            overridePendingTransition(R.anim.enter, R.anim.exit);
                        }
                    }
                }
                return false
            }
        })
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item != null) {
            when (item.itemId) {
                R.id.add -> {
                    startActivity(Intent(this, AddItemActivity::class.java))
                }
                R.id.app_bar_search -> {
//                    itemsList = itemsList.asSequence().filter { x -> x.name.contains() }
                    Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
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
                    intent = Intent(this, ActivityHomePage::class.java)
                    when (homePageLevel) {
                        "dm" -> { intent = Intent(this, ActivityDM::class.java) }
                        "negozi" -> { intent = Intent(this, GeneraNegoziActivity::class.java) }
                    }
                    startActivity(intent)
                    overridePendingTransition(R.anim.enter2, R.anim.exit2);

                    //SWIPE RIGHT
                } else if (x1 > x2) {
                    var intent = Intent(this, EnchantmentsActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.enter, R.anim.exit);
                }

            }
        }

        return false;
    }


// -------------------------------------------------------------------------------------------------------------------------------------------------
    public fun LoadQuery(name: String) {
        val projections = arrayOf(ItemsDatabaseOpenHelper.COLUMN_ID, ItemsDatabaseOpenHelper.COLUMN_NAME, ItemsDatabaseOpenHelper.COLUMN_DESCRIPTION)
        val selectionArgs = arrayOf(name)
        val cursor = itemsHandler.query(projections, "name like ?", selectionArgs, "name")
        itemsList.clear()
        if (cursor.moveToFirst()) {

            do {
                val id = cursor.getInt(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_ID))
                val name = cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_NAME))
                val description = cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_DESCRIPTION))
//                val category = cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_CATEGORY))
//                val idVirtualTable = cursor.getInt(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_ID_VIRTUAL_TABLE))
//                val rarity = cursor.getString(cursor.getColumnIndex(ItemsDatabaseOpenHelper.COLUMN_RARITY))

                itemsList.add(Item(id, name, description, null, 0, null))

            } while (cursor.moveToNext())
        }

        //adapter
        var myItemsAdapter = MyItemsAdapter(this, itemsList as ArrayList<Item>)
        itemsListView.adapter = myItemsAdapter

    }

    //--------------------------------------------------------------------- ADAPTER ------------------------------------------------------------------------------

    inner class MyItemsAdapter : BaseAdapter {
        var itemListAdapter = ArrayList<Item>()
        var itemListAdapterFull = ArrayList<Item>()
        var context: Context? = null

        constructor(context: Context, listItemsAdapter: ArrayList<Item>) : super() {
            this.itemListAdapter = listItemsAdapter
            this.context = context
            this.itemListAdapterFull = ArrayList(itemListAdapter)
        }


        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            //inflate layout row.xml
            var myView = layoutInflater.inflate(R.layout.item_row, null)
            val myItem = itemListAdapter[position]
            myView.titleTv.text = myItem.name
            myView.itemDesc.text = myItem.description


            //delete button click
            myView.deleteBtn.setOnClickListener {
                val selectionArgs = arrayOf(myItem.id.toString())
                var item = itemsHandler.getItems()[myItem.id]
                itemsHandler.delete("ID=?", selectionArgs)
                toast = Toast.makeText(parent?.context, "Oggetto" + item.name + "eliminato", Toast.LENGTH_LONG)
                LoadQuery("%")
            }
            //edit//update button click
            myView.editBtn.setOnClickListener {
                GoToUpdateFun(myItem)
            }

            return myView
        }

        override fun getItem(position: Int): Any {
            return itemListAdapter[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return itemListAdapter.size
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


    }

    private fun GoToUpdateFun(myItem: Item) {
        var intent = Intent(this, AddItemActivity::class.java)
        intent.putExtra(ItemsDatabaseOpenHelper.COLUMN_ID, myItem.id) //put id
        intent.putExtra(ItemsDatabaseOpenHelper.COLUMN_NAME, myItem.name) //put name
        intent.putExtra(ItemsDatabaseOpenHelper.COLUMN_DESCRIPTION, myItem.description) //put description
        startActivity(intent) //start activity
    }



}
