 import java.util.*;

class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name;
	}
}

class TestComparator {
	public static void main(String args[]) {
		TreeSet<Person> set = new TreeSet<>(
			new Comparator<Person>() {
				public int compare(Person a, Person b) {
					return (a.age - b.age);
				}
			}
		);
		set.add(new Person("Shreya", 12));
		set.add(new Person("Haryy", 40));
		set.add(new Person("Paul", 30));

		Iterator<Person> i = set.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
