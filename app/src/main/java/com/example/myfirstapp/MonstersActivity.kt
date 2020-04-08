package com.example.myfirstapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity

class MonstersActivity : AppCompatActivity() {

    var homePageLevel : String = ""
    var x1 : Float= 0.0f;
    var x2 : Float = 0.0f;
    var y1 : Float = 0.0f;
    var y2 : Float = 0.0f;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monsters)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#673AB7")))
        supportActionBar?.title = "Mostri"

        val intent = intent
        val bundle = intent?.extras
        homePageLevel = bundle?.getString("HOME_PAGE_LEVEL").toString()
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
                    intent = Intent(this, EnchantementsActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.enter2, R.anim.exit2);
                    //SWIPE RIGHT
                } else if (x1 > x2) {
                    intent = Intent(this, ActivityHomePage::class.java)
                    when (homePageLevel) {
                        "dm" -> { intent = Intent(this, ActivityDM::class.java)}
                        "negozi" -> {intent = Intent(this, GeneraNegoziActivity::class.java)}
                    }

                    startActivity(intent)
                    overridePendingTransition(R.anim.enter, R.anim.exit);
                }

            }
        }

        return false;
    }

}