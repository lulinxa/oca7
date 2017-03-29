class Engine {}

class Statistics {
	static Engine engine;
}
class Car {
	Engine engine;
}
class PartsFactory {
	Object createEngine() {
		Engine engine = new Engine();
		// code
		return engine;
	}
}
class TestCar {
	boolean testEngine(Engine engine) {
		// code
	}
}

/*
 * Only Car class HAS-A Engine class 'cause
 * Car defines an instance variable of thype Engine
 */
