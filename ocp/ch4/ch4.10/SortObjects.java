import java.util.Arrays;
import java.util.Comparator;

class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ":" + age;
	}
}

public class SortObjects {
	public static void main(String args[]) {
		Person p1 = new Person("Shreya", 32);
		Person p2 = new Person("Harry", 40);
		Person p3 = new Person("Paul", 30);

		Person[] objArray = new Person[] {p1, p2, p3};

		Arrays.sort(objArray,
			new Comparator<Person>() {
				public int compare(Person a, Person b) {
					return (a.age - b.age);
				}
			}
		);
		for(Person p : objArray)
			System.out.print(p + " ");
	}
}
