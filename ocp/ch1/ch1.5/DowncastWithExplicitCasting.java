public class DowncastWithExplicitCasting{
	static void downCast(ShoppingItem item){
		Book book = (Book) item;
		Chair chair = (Chair) item;
		Printable printable = (Printable) item;
	}
	public static void main(String args[]){
		ShoppingItem item = new ShoppingItem();
		downCast(item);
	}
}
