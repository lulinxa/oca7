package pack2;
import pack1.*;
class Class2 extends Class1 {
	Class2() {
		Class1 cls1 = new Class1();
		name = "Derived";
		// This doesn't compile
		// you can't access protected member of the base class using 
		// reference variable of base class if derived and base classes
		// are in different packages
		// !!!!!!!!
		/*
		 * System.out.println(cls1.name);
		 */
		System.out.println(this.name);
	}
	public static void main(String args[]){
		Class2 c = new Class2();
	}
}
