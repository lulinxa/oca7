class Foo {
	Inner inner;
	Foo() {
		Outer outer = new Outer();
		//Inner inner = outer.new Inner();
		inner = outer.new Inner();
	}
}
