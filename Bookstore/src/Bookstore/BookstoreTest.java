package Bookstore;

public class BookstoreTest {

    public static void main(String[] arr) {
        {
            Book[] books = new Book[10];
            String str1 = "nume";
            String str2 = "autor";
            String str3 = "editura";

            for (int i = 0; i < 10; i++) {
                String str11;
                str11= str1+ Integer.toString(i);
                String str22;
                str22 = str2 + Integer.toString(i);
                String str33;
                str33= str3+Integer.toString(i);
                books[i] = new Book(str11, str22, str33, i * 2);
                System.out.println(books[i]);
                System.out.println("\n");
            }
            System.out.println(books.length);
            Book b=new Book(str1,str2,str3,1);
            System.out.println(BookStoreCheck.are_duplicate(books,b));
            System.out.println(BookStoreCheck.comp_grosime(books[3],b));


        }
    }
}






