import java.util.ArrayList;

class Emp {
	int id;
	String name;
	Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public boolean equals(Object o) {
		if(o instanceof Emp) {
			Emp emp = (Emp)o;
			if(emp.id == this.id && emp.name.equals(this.name))
				return true;
		}
		return false;
	}
}

class UsingEquals {
	public static void main(String... args) {
		ArrayList<Emp> list = new ArrayList<Emp>();

		list.add(new Emp(121, "Shreya"));
		list.add(new Emp(55, "Harry"));
		list.add(new Emp(15, "Paul"));
		list.add(new Emp(121, "Shreya"));

		System.out.println(list.size());

		Emp emp = new Emp(121, "Shreya");

		list.remove(emp);

		System.out.println(list.size());
	}
}
