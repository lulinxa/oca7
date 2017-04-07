import java.util.*;

class Person implements Comparable<Person> {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Person person) {
		// ascending
		//return (this.age - person.age);
		// descending order
		return (person.age - this.age);
	}
	public String toString() {
		return name;
	}
}

class TestComparable {
	public static void main(String args[]) {
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("Shreya", 12));
		set.add(new Person("Harry", 40));
		set.add(new Person("Paul", 30));
		Iterator<Person> iter = set.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
}
