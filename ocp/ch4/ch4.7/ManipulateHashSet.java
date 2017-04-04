import java.util.*;

class ManipulateHashSet {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add(null);
		list.add("Shreya");
		list.add("Selvan");
		list.add("Shreya");
		list.add(null);
		System.out.println(list);

		HashSet<String> set = new HashSet<String>();
		set.addAll(list); //only one null elemeent added

		for(String s : set)
			System.out.println(s);
		
		set.add("Harry");

		System.out.println(set.contains("Shreya"));
		System.out.println(set.remove("Selvan"));
		System.out.println(set.size());

		set.add(null); 
		set.add(null);

		for(String s : set)
			System.out.println(s);

		System.out.println();
		System.out.println(set);
	}
}
