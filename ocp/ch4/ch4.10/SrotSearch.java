import java.util.*;

public class SrotSearch {
	static final Comparator<Integer> INT_COMPARATOR = new Comparator<Integer>() {
		public int compare(Integer i, Integer j) {
			return j.compareTo(i);
		}
	};

	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(9999);
		list.add(10);
		list.add(55);
		list.add(28);

		Collections.sort(list, null);
		System.out.println(Collections.binarySearch(list, 55));

		Collections.sort(list, INT_COMPARATOR);
		System.out.println(Collections.binarySearch(list, 55));

	}
}
