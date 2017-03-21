abstract class Animal {
	protected String food;
	protected double avgLife;

	Animal(String food, double avgLife){
		this.food = food;
		this.avgLife = avgLife;
	}

	abstract void eat();

	void live() {
		System.out.println("Natural habitat: forest");
	}
}
