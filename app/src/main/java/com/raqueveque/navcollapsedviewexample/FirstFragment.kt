package com.raqueveque.navcollapsedviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.CollapsingToolbarLayout
import java.lang.NumberFormatException

class FirstFragment : Fragment() {

    private var param2: Int? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        //Usamos 1 EditText para insertar los datos que se van a pasar
//        val myStr: EditText = view.findViewById(R.id.insetText)
        //Navigator:
        //Cada conexion crea un id. Ese id define la accion que se va a realizar
//        view.findViewById<Button>(R.id.secondFragment).setOnClickListener {
            //Creamos un accion, que contenga la navegacion de los fragments y los datos que se pasan
//            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment().setMyInt(11).setMyStr(myStr.text.toString())
            //Pasamos la accion:
//            view.findNavController().navigate(action)
//        }
//        view.findViewById<Button>(R.id.thirdFragment).setOnClickListener {
//            view.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
//        }

        return view
    }

    //Configuramos el toolbar, con el layout y el navGraph
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        val navController = findNavController()
//        val appBarConfiguration = AppBarConfiguration(navController.graph)
//        val toolbar = view.findViewById<Toolbar>(R.id.toolbar)
//        val layout = view.findViewById<CollapsingToolbarLayout>(R.id.collapsingToolbarLayout)
//        layout.setupWithNavController(toolbar, navController, appBarConfiguration)
//
//        super.onViewCreated(view, savedInstanceState)
//    }
}