package com.example.myfirstapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class ActivityHomePage : AppCompatActivity() {

    var x1 : Float = 0.0f;
    var x2 : Float = 0.0f;
    var y1 : Float = 0.0f;
    var y2 : Float = 0.0f;


    var toast : Toast? = null;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)


        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#673AB7")))
        supportActionBar?.title = "Home"
    }



    override fun onSaveInstanceState(outState: Bundle) {
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#673AB7")))
        outState?.run {
            super.onSaveInstanceState(outState)
        }
    }

    override fun onResume() {
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#673AB7")))
        super.onResume()
    }


    fun dmButtonPressed(view: View) {
        toast?.cancel()
        val intent = Intent(this@ActivityHomePage, ActivityDM::class.java)
        startActivity(intent)
    }

    fun pcButtonPressed(view: View) {
//        val intent = Intent(this, ActivityPC::class.java)
//        startActivity(intent)
        toast = Toast.makeText(this@ActivityHomePage, "Funzione non ancora implementata", Toast.LENGTH_LONG)
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
                    intent = Intent(this@ActivityHomePage, MonstersActivity::class.java)
                    intent.putExtra("HOME_PAGE_LEVEL","home")
                    startActivity(intent)
                    overridePendingTransition(R.anim.enter2, R.anim.exit2);

                //SWIPE RIGHT
                } else if (x1 > x2) {
                    toast?.cancel()
                    var intent = Intent(this@ActivityHomePage, ItemsActivity::class.java)
                    intent.putExtra("HOME_PAGE_LEVEL","home")
                    startActivity(intent)
                    overridePendingTransition(R.anim.enter, R.anim.exit);
                }

            }
        }

        return false;
    }

}
