package building;
import library.BookPublic;
public class House {
  House(){
    BookPublic book = new BookPublic();
    String value = book.isbn;
    book.printBook();
  }
}
