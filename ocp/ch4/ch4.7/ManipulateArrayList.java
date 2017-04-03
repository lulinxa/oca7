import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ManipulateArrayList {
	public static void main(String... args){

		ArrayList<String> list = new ArrayList<>(); // capacity of 10

		list.add("Harry");
		list.add("Selvan");
		list.add("Harry");

		list.add(0, "Paul"); // adds Paul at first position

		list.remove("Harry"); // uses equals to remove firstoccurrence

		String oldValue = list.set(0, "Shreya"); // replaces elem at postiion 0 and stores it in oldValue

		//list.get(7); // IndexOutOfBoundsException

		System.out.println("list contains Harry : " + list.contains("Harry"));

		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());

	}
}
