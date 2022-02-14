package com.raqueveque.navcollapsedviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        //Configuramos el toolbar
//        setSupportActionBar(findViewById(R.id.toolbar))
//        //Le agregamos el navController
//        val navController = findNavController(R.id.fragmentContainerView)
//        val config = AppBarConfiguration(navController.graph)
//        findViewById<Toolbar>(R.id.toolbar).setupWithNavController(
//            navController, config)
    }

    //Inflamos el menu creado para que se muestre en el toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = findNavController(R.id.fragmentContainerView)
        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
    }
}