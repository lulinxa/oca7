import java.util.*;

class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Person person) {
		return this.age - person.age;
	}
	public String toString() {
		return name + ":" + age;
	}
}

class TITT47 {
	public static void main(String args[]) {
		Person p1 = new Person("Shreya", 32);
		Person p2 = new Person("Harry", 40);
		Person p3 = new Person("Paul", 30);

		Person[] objArray = new Person[]{p1,p2,p3};

		Arrays.sort(objArray);

		for(Person p : objArray) 
			System.out.println(p);
	}
}
