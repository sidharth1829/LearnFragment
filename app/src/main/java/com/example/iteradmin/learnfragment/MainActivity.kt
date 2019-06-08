package com.example.iteradmin.learnfragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x=0
        val button = findViewById<Button>(R.id.main_button)
        button.setOnClickListener {


            val fragmentManager = supportFragmentManager
            val fragmentTransition = fragmentManager.beginTransaction()

            val secondFragment = SecondFragment()
            val firstFragment = MyFragment()
            if(x%2 == 0) {
                fragmentTransition.replace(R.id.frag_one, secondFragment)
                fragmentTransition.addToBackStack(null)
                fragmentTransition.commit()

            }
            else
            {
                fragmentTransition.replace(R.id.frag_one, firstFragment)
                fragmentTransition.addToBackStack(null)
                fragmentTransition.commit()
            }
            x++
        }
    }
}
