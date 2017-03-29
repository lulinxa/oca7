abstract class Animal {
	void move() {}
	// if below code included 
	// Lion class will not compile
	/* 
	String live() {
		return "live";
	}
	*/
}
class Lion extends Animal {
	void live() {}
}
