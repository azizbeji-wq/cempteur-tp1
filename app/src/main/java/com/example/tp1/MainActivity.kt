package com.example.tp1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var compteur = 0
    private lateinit var textView: TextView

    companion object {
        private const val KEY_COMPTEUR = "key_compteur"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        val btnIncrement = findViewById<Button>(R.id.btnIncrement)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnmoins =findViewById<Button>(R.id.btnmoins)

        // Restaurer l'état si l'activité est recréée (ex: rotation de l'écran)
        if (savedInstanceState != null) {
            compteur = savedInstanceState.getInt(KEY_COMPTEUR, 0)
            mettreAJourAffichage()
        }

        // Clic sur Incrémenter
        btnIncrement.setOnClickListener {
            compteur++
            mettreAJourAffichage()
        }

        // Clic sur Réinitialiser
        btnReset.setOnClickListener {
            compteur = 0
            mettreAJourAffichage()
        }
        btnmoins.setOnClickListener {
            compteur--
            mettreAJourAffichage()
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_COMPTEUR, compteur)
    }

    private fun mettreAJourAffichage() {
        textView.text = "Nombre : $compteur"
    }
}