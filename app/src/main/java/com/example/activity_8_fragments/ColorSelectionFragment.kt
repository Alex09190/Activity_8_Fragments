package com.example.activity_8_fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner

class ColorSelectionFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):View? {
        val layout = inflater.inflate(R.layout.fragment_color_selection, container, false)

        val spinner = layout.findViewById<Spinner>(R.id.spinner)

        spinner.adapter = ArrayAdapter( requireContext(), android.R.layout.simple_dropdown_item_1line,
                arrayOf("White", "Red", "Lime", "Yellow", "Black", "Cyan") )

        spinner.onItemSelectedListener = object: OnItemSelectedListener {


            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            /*
                parent?.run{ layout.setBackgroundColor(
                    getItemAtPosition(p2).toString()
                    )
                }
             */
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        return layout
    }



}