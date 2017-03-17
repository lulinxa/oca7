public class Book {
	void issueBook(int days) {
		if(days > 0)
			System.out.println("Book issued");
		else 
			System.out.println("Cannot issue for 0 or less days");
	}
}
