public class DowncastWithImplicitCasting {
	public static void main(String args[]){
		ShoppingItem shoppingItem = new ShoppingItem();

//		Book book = shoppingItem;
//		Chair chair = shoppingItem;
//		Printable printable = shoppingItem;

		Object o = shoppingItem;
	}
}

/* in the absence of explicit casting, 
 * there is no way to get ClassCastException - a RuntimeException
 */
