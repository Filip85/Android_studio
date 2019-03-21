package hr.ferit.filipgajari.myapplication

object BookRepository{
    val books: MutableList<Book> = createBooks()

    private fun createBooks(): MutableList<Book> {
        return mutableListOf<Book>(
            Book("50 nijansi zute", "abc1"),
            Book("51 nijansi zute", "abc2"),
            Book("52 nijansi zute", "abc3"),
            Book("53 nijansi zute", "abc4")
        )
    }
}