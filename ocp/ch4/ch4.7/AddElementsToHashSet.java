import java.util.HashSet;

class AddElementsToHashSet {
	public static void main(String args[]){

		String s1 = new String("Harry");
		String s2 = new String("Shreya");
		String s3 = new String("Selvan");
		String s4 = new String("Shreya");

		HashSet<String> set = new HashSet<>();

		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);

		for(String e : set)
			System.out.println(e);

	}
}
