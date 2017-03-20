class Shopping {
	public static void main(String... args){
		Book book = new Book();
		Printable printable = book;
		printable.print();

		ShoppingItem shoppingItem = book;
		shoppingItem.description();

		// printable.description(); -> can't compile
		// need for explicit cast
		((Book) printable).description();


	}
}
