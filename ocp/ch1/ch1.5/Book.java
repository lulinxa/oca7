interface Printable {
	void print();
}
class ShoppingItem {
	public void description() {
		System.out.println("Shoping Item");
	}
}
class Chair extends ShoppingItem {
	public void description() {
		System.out.println("Chair");
	}
}
public class Book extends ShoppingItem implements Printable {
	public void description(){
		System.out.println("Book");
	}
	public void print() {
		System.out.println("Printing book");
	}
}

