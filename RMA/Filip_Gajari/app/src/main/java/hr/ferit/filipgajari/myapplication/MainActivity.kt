package hr.ferit.filipgajari.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG: String = "DRC"

    /*fun createReport(age: Int): String {
        val oldAge: Int = age * 2
        //val oldAge = age * 2

        return oldAge.toString()
    }*/
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpUi()
    }

    private fun setUpUi() {
        messageAction.setOnClickListener {view -> showMessage()}
    }

    private fun showMessage() {
        val message: String = messageInput.text.toString()
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        Log.d(TAG, "In show message ${message.toUpperCase()}")
    }
}
