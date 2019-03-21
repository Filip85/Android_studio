package hr.ferit.filipgajari.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpUi()
    }

    private fun setUpUi() {
        booksDisplay.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        booksDisplay.itemAnimator = DefaultItemAnimator()
        booksDisplay.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))

        booksDisplay.adapter = BookAdapter(BookRepository.books)


    }
}
