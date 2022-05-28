package com.example.navigationcomponet

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class PrimerFragment : Fragment(R.layout.fragment_primer) {
    lateinit var btnIrAct: Button
    lateinit var btnIrAct2 : Button
    lateinit var btncuarto : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnIrAct = view.findViewById(R.id.btnIrAct)
        btnIrAct2 = view.findViewById(R.id.btnIrAct2)
        btncuarto = view.findViewById(R.id.btncuarto)

        btnIrAct.setOnClickListener {
            //Toast.makeText(activity, "Hola desde fragment", Toast.LENGTH_LONG).show()

            findNavController().navigate(R.id.action_primerFragment_to_segundoFragment)
        }

        btnIrAct2.setOnClickListener{
            findNavController().navigate(R.id.action_primerFragment_to_tercerFragment)
        }
        btncuarto.setOnClickListener{
            findNavController().navigate(R.id.action_primerFragment_to_cuartoFragment2)
        }
    }
}