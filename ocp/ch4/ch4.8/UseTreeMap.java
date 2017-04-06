import java.util.*;

enum IceCream { STRAWBERRY, CHOCOLATE, WALNUT }

class Flavor implements Comparable<Flavor>{
	String name;
	Flavor(String name) {
		this.name = name;
	}
	public int compareTo(Flavor f) {
		return this.name.compareTo(f.name);
	}
}

class MyComparator implements Comparator<Flavor> {
	public int compare(Flavor f1, Flavor f2) {
		return f2.name.compareTo(f1.name);
	}
}

class UseTreeMap {
	public static void main(String args[]) {
		
		Map<IceCream, String> flavorMap = new TreeMap<>();
		flavorMap.put(IceCream.CHOCOLATE, "Paul");
		flavorMap.put(IceCream.STRAWBERRY, "Shreya");

		for(String s : flavorMap.values())
			System.out.println(s);

		Map<Flavor, String> fMap = new TreeMap<>();
		// line below throws runtime exception
		// fMap didn't get Comparator object nor keys that
		// implement Comparable interface
		fMap.put(new Flavor("Chocolate"), "Paul"); 

		Map<Flavor, String> fMap2 = new TreeMap<>(new MyComparator());
		fMap2.put(new Flavor("Chocolate"), "Paul");
		fMap2.put(new Flavor("Vanilla"), "Selvan");
		for(Flavor f : fMap2.keySet())
			System.out.println(f.name);

		/*
		 * Unlike a HashMap, a TreeMap uses method compare() or compareTo() to determine
		 * the equality of its keys. In the following example, a TreeMap can access the value
		 * associated with a key, even though its key doesn’t override its method equals() or
         * hashCode():
		 */
		System.out.println(fMap2.get(new Flavor("Chocolate")));
	}
}

/*
 * The natural order of enum elements is the sequence in which thery're defined.
 * The set of values that are retrieved from TreeMap is sirted on its keys not in its values
 */
