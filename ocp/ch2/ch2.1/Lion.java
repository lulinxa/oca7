class Lion extends Animal {
	Lion(String food, double avgLife) {
		super(food, avgLife);
	}
	void eat() {
		System.out.println("Lion-hunt: " + food);
	}
}
