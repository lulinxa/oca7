### Exception overriding

#### Rule1
##### If a base class method doesn't declare to throw a checked exception, an overriding method in the derived class can't declare to throw a checked exception
~~~java
class Base {
	public void aMethod() {}
	public void noRuntimeException() {}
}
class Derived extends Base {
	public void aMethod() throws Exception {} // this fails to compile
	public void noRuntimeException() throws RuntimeException {} // this compiles
}
~~~

#### Rule2
##### If a base class method declares to throw a checked exception, an overriding method in the derived class bcan choose not to declare to throw any checked exception
~~~java
class Base {
	public void aMethod() throws IOException {}
	public void noRuntimeException() throws RuntimeException {}
}
class Derived extends Base {
	public void aMethod() {} // this compiles
	public void noRuntimeException() {} // this compiles
}
~~~

#### Rule3
##### If a base class method declares to throw a checked exception, an overrridng method in the derived class cannot declare to throw a superclass of the exception thrown by the one in the base class
~~~java
class Base {
	public void aMethod() throws IOException {}
	public void noRuntimeException() throws NullPointerException {}
}
class Derived extends Base {
	public void aMethod() throws Exception {} // this fails to compile
	public void noRuntimeException() throws RuntimeException {} // this compiles
}
~~~

#### Rule4
##### If a base class method declares to throw a checked exception, an overriding method in the derived class can declare to throw sam exception
~~~java
class Base {
	public void aMethod() throws IOException {}
	public void noRuntimeException() throws Error{}
}
class Derived extends Base {
	public void aMethod() throws IOException {} // this compiles
	public void noRuntimeException() throws RuntimeException {} // this compiles
}
~~~

#### Rule5
##### If a base class method declares to throw a checked exceptionm an overridinf method in the derived class can declare to throw a derived class of the exception thrown by the one in the base class
~~~java
class Base {
	void aMethod() throws IOException {}
}

class Derived extends Base {
	void aMethod() throws FileNotFoundException {} // this compiles
}
~~~
