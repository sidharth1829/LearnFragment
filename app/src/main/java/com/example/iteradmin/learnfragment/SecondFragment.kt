package com.example.iteradmin.learnfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondFragment:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val secondView: View = inflater.inflate(R.layout.second_fragment, container, false)

        val text = secondView.findViewById<TextView>(R.id.text)
        val button = secondView.findViewById<Button>(R.id.frag_btton)

        button.setOnClickListener {
            Toast.makeText(context, "maar khake manega kya??", Toast.LENGTH_LONG).show()
        }
        return secondView
    }
}