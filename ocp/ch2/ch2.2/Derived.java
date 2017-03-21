class Base {
	final void finalMethod() {}
	// private final void finalMethod() {}
}

class Derived extends Base {
	void finalMethod() {}
	// final void finalMethod() {}
}
// if comments toggled it will compile 'cause it just seems that 
// Derived is ovverriding method finalMethod() -> it is private so
// it can't be overriden
// finalMethod() in Derived class is a new method
