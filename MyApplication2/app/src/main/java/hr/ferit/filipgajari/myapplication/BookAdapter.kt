package hr.ferit.filipgajari.myapplication

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_book.view.*

class BookAdapter(val books: MutableList<Book>): RecyclerView.Adapter<BookHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): BookHolder {
        //kreira viewe kad se pokrene aplikacija
        val bookView = LayoutInflater.from(p0.context).inflate(R.layout.item_book, p0, false) //inflatea iz item_book
        return BookHolder(bookView)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BookHolder, position: Int) {
        val book = books.get(position)
        holder.bind(book)
    }

}

class BookHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(book: Book) {
        itemView.bookTitle.text = book.title
        itemView.authorTitle.text = book.author
    }


}
