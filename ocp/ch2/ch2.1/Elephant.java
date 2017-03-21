class Elephant extends Animal {
	Elephant(String food, double avgLife){
		super(food, avgLife);
	}
	void eat() {
		System.out.println("Elephant-method eat");
	}
	void moveTrunk() {
		System.out.println("Elephant-method moveTrunk");
	}
}
