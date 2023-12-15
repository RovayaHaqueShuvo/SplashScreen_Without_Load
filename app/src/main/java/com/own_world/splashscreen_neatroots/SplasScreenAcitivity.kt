package com.own_world.splashscreen_neatroots

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplasScreenAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splas_screen_acitivity)
        SplashScreen()

    }

    private fun SplashScreen() {
        launchOpratation().execute()
    }

    private open inner class launchOpratation : AsyncTask<String, Void, String>() {
        override fun doInBackground(vararg params: String?): String {

            for (i in 0..3) {
                try {
                    Thread.sleep(1000)
                } catch (e: Exception) {
                    Thread.interrupted()
                }
            }
            return String()
        }

        override fun onPostExecute(result: String?) {
            val intent = Intent(this@SplasScreenAcitivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}




