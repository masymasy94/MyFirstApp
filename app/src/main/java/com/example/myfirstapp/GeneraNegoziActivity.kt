package com.example.myfirstapp

import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.genera_negozi.*
import sqlite.Item
import sqlite.ItemsDatabaseOpenHelper

class GeneraNegoziActivity : AppCompatActivity() {

    var x1 : Float = 0.0f;
    var x2 : Float = 0.0f;
    var y1 : Float = 0.0f;
    var y2 : Float = 0.0f;

    private var testo: String? = null;
    var view: TextView? = null;
    private var itemsHandler : ItemsDatabaseOpenHelper = ItemsDatabaseOpenHelper(this, null);
    val NUMERO_OGGETTI_NEGOZIO_PRINCIPIANTE = 15
    val NUMERO_OGGETTI_NEGOZIO_AVANZATO = 50


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.genera_negozi)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#673AB7")))
        supportActionBar?.title = "Generatore Negozi"


        if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            textView2.gravity = Gravity.CENTER_HORIZONTAL
            textView2.movementMethod = ScrollingMovementMethod()
            view = textView2
        }
        else {
            textView.gravity = Gravity.CENTER_HORIZONTAL
            textView.movementMethod = ScrollingMovementMethod()
            view = textView
        }


    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.run {

            if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE && textView2 != null)
                putString(testo, textView2.text.toString())
            else if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT && textView != null)
                putString(testo, textView.text.toString())
        }
        super.onSaveInstanceState(outState)

    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {

        if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE && textView2 != null){
            textView2.movementMethod = ScrollingMovementMethod()
            textView2.text = savedInstanceState?.getString(testo)
            textView2.gravity = view?.gravity!!

        }
        else if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT && textView != null){
            textView.movementMethod = ScrollingMovementMethod()
            textView.text = savedInstanceState?.getString(testo)

        }

    }


    // VERTICALE


    fun generaNegozioPrincipiantePortrait(view: View) {

        negozioPrincipianteButton.text = "Rigenera negozio Principiante"
        negozioAvanzatoButton.text = "Genera negozio avanzato"
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
        textView.text = text;
    }

    fun generaNegozioAvanzato(view: View) {
        negozioPrincipianteButton.text = "Genera negozio Principiante"
        negozioAvanzatoButton.text = "Rigenera negozio avanzato"
        textView.text = "Negozio gud in fase di implementazione";
    }


    // ORIZZONTALE


    fun generaNegozioPrincipianteOrizzontale(view: View) {
        textView2.text = "Negozio easy in fase di implementazione";
    }

    fun generaNegozioAvanzatoOrizzantale(view: View) {
        textView2.text = "Negozio gud in fase di implementazione";
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
                    intent = Intent(this, MonstersActivity::class.java)
                    intent.putExtra("HOME_PAGE_LEVEL","negozi")
                    startActivity(intent)
                    overridePendingTransition(R.anim.enter2, R.anim.exit2);

                    //SWIPE RIGHT
                } else if (x1 > x2) {
                    var intent = Intent(this, ItemsActivity::class.java)
                    intent.putExtra("HOME_PAGE_LEVEL","negozi")
                    startActivity(intent)
                    overridePendingTransition(R.anim.enter, R.anim.exit);
                }

            }
        }

        return false;
    }

}


