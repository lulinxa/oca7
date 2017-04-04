import java.util.*;

enum IceCream { CHOCOLATE, STRAWBERRY, WALNUT }

class Emp {
	String name;
	Emp(String name) {
		this.name = name;
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

		
	}
}
