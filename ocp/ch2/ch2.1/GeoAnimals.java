public class GeoAnimals {
	Animal[] animals = new Animal[2];

	GeoAnimals() {
		animals[0] = new Lion("Antelope", 20);
		animals[1] = new Elephant("Bananas", 60);
	}

	void flashCards() {
		for (Animal a : animals) {
			a.eat();
			a.live();
		}
	}

	public static void main(String... args){
		GeoAnimals myAnimals = new GeoAnimals();
		myAnimals.flashCards();
	}
}
