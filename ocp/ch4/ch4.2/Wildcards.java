import java.util.List;
import java.util.ArrayList;

class Gift {}
class Book extends Gift {
	String title;
	Book(String title) {
		this.title = title;
	}
	public String toString() {
		return title;
	}
}

class Wildcards {
	public static void wrapGift(List<?> list) {
		for(Object item : list) {
			System.out.println("GiftWrap - " + item);
		}
	}
	public static void main(String args[]){
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("Oracle"));
		bookList.add(new Book("Java"));
		wrapGift(bookList);

		List<String> stringList = new ArrayList<String>();
		stringList.add("Paul");
		stringList.add("Shreya");
		wrapGift(stringList);
	}
}
/*
 * List<?> l = new ArrayList<Book>(); ? - referes to any type
 * l.add(new Book()); -> this doesn't compile
 */
