import java.util.*;

class City {
	String name;
	City(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
//	public int hashCode() {
//		return name.hashCode();
//	}		
//	public boolean equals(Object o) {
//		if(o instanceof City) {
//			City c = (City)o;
//			return c.name.equals(name);
//		}
//		else
//			return false;
//	}
}

public class UseLinkedHashSet {
	public static void main(String args[]) {
		Set<City> route = new LinkedHashSet<>();

		route.add(new City("Seattle"));
		route.add(new City("Copengagen"));
		route.add(new City("NewDelhi"));

		List<City> extendedRoute = new ArrayList<>();
		extendedRoute.add(new City("Beijing"));
		extendedRoute.add(new City("Tokyo"));

		route.addAll(extendedRoute);

		Iterator<City> iter = route.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		//System.out.println(new City("Zgb").equals(new City("Zgb")));

		// Prints false because City doesn't override equals()
		System.out.println(route.contains(new City("Seattle")));
	}
}
