abstract class MyClass {
	public final int finalVar;
}
public class MyDerivedClass extends MyClass {
	MyDerivedClass() {
		super();
		finalVar = 1000;
	}
}
