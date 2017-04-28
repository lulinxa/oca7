class Book {
	String title;
	int copiesSold = 0;
	Book(String title) {
		this.title = title;
	}
	synchronized public void newSale() {
		++copiesSold;
	}
	synchronized public void returnBook() {
		--copiesSold;
	}
}

class OnlineBuy extends Thread {
	private Book book;
	public OnlineBuy(Book book) {
		this.book = book;
	}
	@Override
	public void run() {
		book.newSale();
	}
}
class OnlineReturn extends Thread {
	private Book book;
	public OnlineReturn(Book book) {
		this.book = book;
	}
	@Override
	public void run() {
		book.returnBook();
	}
}

class ShopingCart {
	public static void main(String args[]) {
		Book book = new Book("Java");
		Thread task1 = new OnlineBuy(book);
		Thread task2 = new OnlineBuy(book);
		Thread task3 = new OnlineReturn(book);
		Thread task4 = new OnlineBuy(book);
		task1.start();
		task2.start();
		task3.start();
		task4.start();
		System.out.println(book.copiesSold);
	}
}
