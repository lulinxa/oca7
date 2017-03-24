class Foo1 {
	Outer.Inner inner;
	Foo() {
		Outer o = new Outer();
		inner = o.new Inner();
	}
}
