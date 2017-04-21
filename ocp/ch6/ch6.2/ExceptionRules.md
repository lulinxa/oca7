### Exception overriding


#### Rule1
~~~ Java
class Base {
	public void aMethod() {}
	public void noRuntimeException() {}
}
class Derived {
	public void aMethod() throws Exception {} // this fails to compile
	public void noRuntimeException() throws RuntimeException {} // this compiles
}
~~~

#### Rule2
~~~ Java
class Base {
	public void aMethod() throws IOException {}
	public void noRuntimeException() throws RuntimeException {}
}
class Derived {
	public void aMethod() {} // this compiles
	public void noRuntimeException() {} // this compiles
}
~~~

#### Rule3
~~~ Java
class Base {
	public void aMethod() throws IOException {}
	public void noRuntimeException() throws NullPointerException {}
}
class Derived {
	public void aMethod() throws Exception {} // this fails to compile
	public void noRuntimeException() throws RuntimeException {} // this compiles
}
~~~

#### Rule4
~~~ Java
class Base {
	public void aMethod() throws IOException {}
	public void noRuntimeException() throws Error{}
}
class Derived {
	public void aMethod() throws IOException {} // this compiles
	public void noRuntimeException() throws RuntimeException {} // this compiles
}
~~~

#### Rule5
~~~ Java
class Base {
	void aMethod() throws IOException {}
}
class Derived {
	void aMethod() throws FileNotFoundException {} // this compiles
}
~~~
