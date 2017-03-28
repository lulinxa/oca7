interface Flyable {
	void fly();
}

class BirdSanctuary {
	Flyable bird = new Flyable() {
		public void fly() {
			System.out.println("Flying high in the sky");
		}

		// new method - not in interface
		public void hungry() {
			System.out.println("eat");
		}
	};

	/*
	 * Can't call bird.hungry 'cause bird is defined as Flyable
	 * and there is no hungry method in interface.
	 * So the variable bird can access only the members defined
	 * in interface Flyable.
	 */
}
