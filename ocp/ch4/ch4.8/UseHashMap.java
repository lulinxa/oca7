import java.util.*;

enum IceCream { CHOCOLATE, STRAWBERRY, WALNUT }
enum Color { RED, WHITE, BLUE }

class Emp {
	String name;
	Emp(String name) {
		this.name = name;
	}
	public int hashCode() {
		return name.hashCode();
	}
	public boolean equals(Object o) {
		if(o instanceof Emp) {
			return ((Emp)o).name.equals(name);
		}
		else
			return false;
	}
	public String toString() {
		return "Emp:" + name;
	}
}

class UseHashMap {
	public static void main(String args[]) {

		Map<String, Double> salaryMap = new HashMap<>();
		salaryMap.put("Paul", 8888.8);
		salaryMap.put("Shreya", 99999.9);
		salaryMap.put("Selvan", 5555.5);

		Map<String, Object> copySalaryMap = new HashMap<>(salaryMap);

		Set<String> keys = copySalaryMap.keySet();
		for(String k : keys)
			System.out.println(k);
		
		// removing pari from first map doesn't remove pari from its copy
		salaryMap.remove("Paul");

		keys = copySalaryMap.keySet();
		for(String k : keys)
			System.out.println(k);
		
		/* this doesn't compile */
		//Map<Object, String> m = new HashMap<>(salaryMap);

		// legit
		Map<String, List<Double>> sMap = new HashMap<>();
		// generics ArrayList<Double> doesn't work
		Map<String, List<Double>> sMap2 = new HashMap<String, List<Double>>();


		Map<String, List<IceCream>> iceCreamMap = new HashMap<>();
		List<IceCream> iceCreamList = new ArrayList<>();
		iceCreamList.add(IceCream.WALNUT);
		iceCreamList.add(IceCream.CHOCOLATE);
		iceCreamMap.put("Shreya", iceCreamList);
		System.out.println(iceCreamMap.get("Shreya"));

		// Emp
		Map<Emp, Emp> empMgrEmp = new HashMap<>();
		empMgrEmp.put(new Emp("Shreya"), new Emp("Selvan"));
		empMgrEmp.put(new Emp("Paul"), new Emp("Selvan"));
		System.out.println(empMgrEmp.get(new Emp("Paul"))); // prints null if hashCode and equlas not in Emp

		//comment hashCode() of Emp
		System.out.println(empMgrEmp.containsKey(new Emp("Shreya")));
		System.out.println(empMgrEmp.containsValue(new Emp("Selvan")));

		/*
		 * adding pair such that key already exists replaces value with new one
		 * one null key pre map
		 * remove(key) removing one pair
		 * clear() removing all pairs in map
		 */
		empMgrEmp.remove(new Emp("Shreya"));
		System.out.println(empMgrEmp);

		// List as key in Map
		Map<List, String> flavorMapListAsKey = new HashMap<>();
		
		List<IceCream> ic = new ArrayList<>();
		ic.add(IceCream.WALNUT);
		ic.add(IceCream.CHOCOLATE);
		flavorMapListAsKey.put(ic, "Shreya");
		
		List<IceCream> ic2 = new ArrayList<>();
		ic2.add(IceCream.WALNUT);
		ic2.add(IceCream.CHOCOLATE);

		System.out.println(flavorMapListAsKey.remove(ic2));
		
		System.out.println();

		Map<Color, String> colorMap = new HashMap<>();
		colorMap.put(Color.RED, "Passion");
		colorMap.put(Color.WHITE, "Stability");
		colorMap.put(Color.BLUE, "Sea");

		Collection<String> meaning = colorMap.values();
		Set<Color> colors = colorMap.keySet();
		Set<Map.Entry<Color, String>> colorsMeaning = colorMap.entrySet();

		System.out.println(meaning);
		System.out.println(colors);
		System.out.println(colorsMeaning);
		for(Map.Entry pair : colorsMeaning)
			System.out.println(pair.getKey() + "=" + pair.getValue());
	}
}
