import java.util.*;

class SearchArray {
	public static void main(String args[]) {
		Object[] myArray = new Object[3];
		myArray[0] = "Java";
		myArray[1] = "EJava";
		myArray[2] = "Guru";
		int position = Arrays.binarySearch(myArray, "Java");
		System.out.println(position);
	}
}
