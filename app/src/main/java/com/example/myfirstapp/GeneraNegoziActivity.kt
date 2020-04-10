package com.example.myfirstapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.genera_negozi_test.*
import sqlite.Item
import sqlite.ItemsDatabaseOpenHelper

class GeneraNegoziActivity : AppCompatActivity() {
    val list = intArrayOf(1,1,1,1,1,1,2,2,2,3)
    private var itemsHandler : ItemsDatabaseOpenHelper = ItemsDatabaseOpenHelper(this, null);
    val NUMERO_OGGETTI_NEGOZIO_PRINCIPIANTE = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.genera_negozi_test)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#673AB7")))
        supportActionBar?.title = "Generatore Negozi Test"

        textViewTest.movementMethod = ScrollingMovementMethod()
    }

    fun generaNegozio(view: View) {

        var items : List<Item> = itemsHandler.getItems().asSequence().filter { x -> "Common" == x.rarity }.toList()

        var text : String =
            "Il negozio Principiante è composto da $NUMERO_OGGETTI_NEGOZIO_PRINCIPIANTE oggetti di rarità Comune (quantità compresa tra 1 e 3):" +
                    "\n\n\n\n"

        if (items.isEmpty())
            text = "Problemi col database :C"
        else {
            var i : Int = 0;
            while ( i < NUMERO_OGGETTI_NEGOZIO_PRINCIPIANTE) {
                var item = items[(0 until (items.size - 1)).random()];
                if (!text.contains(item.name.toString())) {

                    text += item.name + " x"+ list.random() +"\n"
                    i++
                }
            }
        }
        textViewTest.text = text;
    }

}
