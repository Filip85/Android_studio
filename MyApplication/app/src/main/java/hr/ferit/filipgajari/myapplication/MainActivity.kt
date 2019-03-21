package hr.ferit.filipgajari.myapplication

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val REQUEST_USERNAME = 1
        const val EXTRA_USERNAME = "username"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpUi()
    }

    private fun setUpUi() {
        navigateAction.setOnClickListener{ navigateToSecondactivity()}
    }

    private fun navigateToSecondactivity() {
        val navigation = Intent(this, SecondActivity::class.java)

       // navigation.putExtra(SecondActivity.EXTRA_USERNAME, "Filip")
        //startActivity(navigation)

        startActivityForResult(navigation, REQUEST_USERNAME)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when(requestCode){
            REQUEST_USERNAME -> {
                if(resultCode == Activity.RESULT_OK){
                    display(data)
                }
            }
        }
    }

    private fun display(data: Intent?) {
        Log.d("first", data?.getStringExtra((EXTRA_USERNAME) ?: "nothing"))

    }
}
