package hr.ferit.filipgajari.myapplication

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USERNAME = "username"
        const val TAG = "second"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //logUserName()
        setUpUi()
    }

    private fun setUpUi() {
        usernameAction.setOnClickListener{ sendUsername() }
    }

    private fun sendUsername() {
        val username = usernameInput.text.toString()

        val resultIntent = Intent()
        resultIntent.putExtra(MainActivity.EXTRA_USERNAME, username)
        setResult(Activity.RESULT_OK, resultIntent)
        finish()
    }

    /*private fun logUserName() {
        //treba dohvatiti intent
        Log.d(TAG, intent?.getStringExtra(EXTRA_USERNAME) ?: "nothing recieved.")
    }*/
}
