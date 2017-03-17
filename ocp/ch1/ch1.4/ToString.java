class Book {
	String title;
	Book(String s){
		title = s;
	}
	@Override
	public String toString() {
		return title;
	}
}
public class ToString {
	public static void main(String... args){
		Book b = new Book("Java Certification");
		System.out.println(b);
	}
}
