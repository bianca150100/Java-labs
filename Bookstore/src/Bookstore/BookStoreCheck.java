package Bookstore;

import java.security.KeyStore;

public class BookStoreCheck {

    public static int are_duplicate(Book[] books, Book b)
    {
        for (int i=0;i<books.length;i++)
            if (b.equals(books[i]))
                return 1;
            return 0;
    }

    public static Book comp_grosime(Book a, Book b)
    {
        if (a.getNrPagini() > b.getNrPagini())
            return a;
        return b;
    }
}
