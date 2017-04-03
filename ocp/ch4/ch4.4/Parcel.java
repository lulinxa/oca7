class Phone {}
class Parcel<T> {
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
/*
 * javac Parcel.java -Xlint:unchecked
 */
class App {
	public static void main(String args[]) {
		Parcel parcel = new Parcel<Phone>();
		parcel.set("harry");
		System.out.println(parcel.get());
	}
}
