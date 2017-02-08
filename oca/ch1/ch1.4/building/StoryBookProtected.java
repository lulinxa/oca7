package building;
import library.BookProtected;
public class StoryBookProtected extends BookProtected {
  public StoryBookProtected() {
    BookProtected book = new BookProtected();
    /*
     * String auth = book.author; ->
     * StoryBookProtected can't access #protected members
     * of its base class using reference variables
     *
     */
    // String auth = book.author;
    author = "ABC";
    modifyTemplate();
  }
}
/*

EXAM TIP A concise but not too simple way of stating the previous rule is this: a
derived class can inherit and access protected members of its base class, regardless
of the package in which it’s defined. A derived class in a separate package
can’t access protected members of its base class using reference variables.

*/
