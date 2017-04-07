import java.util.*;

class Person implements Comparable<Person> {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Person p) {
		return name.compareTo(p.name);
	}
	public String toString() {
		return name + age;
	}
}

class TITT46 {
	public static void main(String... args) {
		TreeSet<Person> set = new TreeSet<>(
			new Comparator<Person>() {
				public int compare(Person a, Person b) {
					return a.age - b.age;
				}
			}
		);
		Person p1 = new Person("Shreya", 12);
		Person p2 = new Person("Harry", 40);
		Person p3 = new Person("Paul", 30);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		Iterator<Person> i = set.iterator();
		while(i.hasNext())
			System.out.println(i.next()+":");
	}
}
