public class UpcastWithImplicitCasting {
	public static void main(String args[]){
		Book book = new Book();
		
		//won't compile
		//Chair chair = book;

		ShoppingItem shoppingItem = book;
		Printable printable = book;
		Object object = book;

		Chair chair2 = new Chair();
		// chair doesn't implement printable
		//Printable printable2 = chair;
	}
}
