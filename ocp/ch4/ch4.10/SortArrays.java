import java.util.Arrays;

class SortArrays {
	public static void main(String args[]) {
		int[] intArray = {20, 14, 4, 10, 5, 3};

		for(int i : intArray)
			System.out.print(i + " ");
		System.out.println();

		
		Arrays.sort(intArray);

		for(int i : intArray)
			System.out.print(i + " ");
		System.out.println();
		System.out.println();

		intArray = new int[] {20, 14, 4, 10, 5, 3};
		
		for(int i : intArray)
			System.out.print(i + " ");
		System.out.println();

		
		Arrays.sort(intArray, 1, 5);

		for(int i : intArray)
			System.out.print(i + " ");
		System.out.println();
		System.out.println();
		

		String[] strArray = {"ocP", "oCP", "OcP", "OCp", "Ocp"};
		for(String str : strArray)
			System.out.print(str + " ");
		System.out.println();
		Arrays.sort(strArray);
		for(String str : strArray)
			System.out.print(str + " ");

		



	}
}
