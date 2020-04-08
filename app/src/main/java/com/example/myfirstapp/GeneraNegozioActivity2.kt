package com.example.myfirstapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.Gravity
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.genera_negozi_2.*
import sqlite.Item
import sqlite.ItemsDatabaseOpenHelper

class GeneraNegozioActivity2 : AppCompatActivity() {
    private var itemsHandler : ItemsDatabaseOpenHelper = ItemsDatabaseOpenHelper(this, null);
    val NUMERO_OGGETTI_NEGOZIO_PRINCIPIANTE = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.genera_negozi_2)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#673AB7")))
        supportActionBar?.title = "Generatore Negozi 2"

        textViewGeneraNegozi2.gravity = Gravity.CENTER_HORIZONTAL
        textViewGeneraNegozi2.movementMethod = ScrollingMovementMethod()
    }

    fun generaNegozioPrincipiantePortrait2(view: View) {

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
                    text += item.name + " x"+ (1..3).random() +"\n"
                    i++
                }
            }
        }
        textViewGeneraNegozi2.text = text;
    }

}
