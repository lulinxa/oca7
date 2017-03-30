class Parcel<T> { // T - type parameter
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
}

class Phone {}
class Book {}

public class ParcelGeneric {
	public static void main(String args[]){
		Parcel<Book> parcel = new Parcel<>();
		parcel.set(new Book());
		Book myBook = parcel.get();
		// this won't compile
		//System.out.println((Phone)parcel.get());
	}
}
