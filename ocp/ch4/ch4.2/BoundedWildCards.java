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
class Phone extends Gift {
	String model;
	Phone(String model) {
		this.model = model;
	}
	public String toString() {
		return model;
	}
}

class BoundedWildCards {
	public static void wrapGift(List<? extends Gift> list) {
		for(Gift item : list) {
			System.out.println("GiftWrap - " + item);
		}
	}
	public static void main(String args[]){
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("Oracle"));
		bookList.add(new Book("Java"));
		wrapGift(bookList);

		List<Phone> pList = new ArrayList<Phone>();
		pList.add(new Phone("HTC"));
		pList.add(new Phone("iPhone"));
		wrapGift(pList);

		/*
		List<String> stringList = new ArrayList<String>();
		stringList.add("Paul");
		stringList.add("Shreya");
		wrapGift(stringList);
		*/
	}
}
