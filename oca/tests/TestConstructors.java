class Animal {
	Animal() {
		System.out.println("Constructor from Animal");
	}
	Animal(String s) {
		System.out.println(s);
	}
}
class Horse extends Animal {
	Horse() {
		System.out.println("What will be called?");
	}
}
class TestConstructors {
	public static void main(String args[]) {
		Animal a = new Animal("Animal constructor");
		Animal h = new Horse();
	}
}
