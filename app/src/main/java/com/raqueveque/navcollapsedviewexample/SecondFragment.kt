package com.raqueveque.navcollapsedviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {

    /**
     * Navigator
     * Usando el pase de datos por argumentos
     * Se crea una clase automatica, esta contine las variables que se crearon en el navGraph
     * */
    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        Toast.makeText(activity, args.myInt.toString() + args.myStr, Toast.LENGTH_SHORT).show()

        return view
    }
}