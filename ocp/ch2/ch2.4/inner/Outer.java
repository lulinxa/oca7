class Outer {
	Inner objectInner = new Inner();
	class Inner {
		Inner() {
			System.out.println("Inner created - constructor");
		}
	}
	void aMethod() {
		Inner objectInner = new Inner();
	}
	// won't compile
	//static void staticMethod() {
	//	Inner in = new Inner();
	//}
	
	static void staticMethod() {
		Outer outerObj = new Outer();
		Inner innerObject = outerObj.new Inner();

		// or
		Inner innerObj = new Outer().new Inner();
	}
}
