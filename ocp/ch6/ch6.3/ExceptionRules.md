### Exception overriding

#### Rule1
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
~~~java
class Base {
	void aMethod() throws IOException {}
}
class Derived extends Base {
	void aMethod() throws FileNotFoundException {} // this compiles
}
~~~
