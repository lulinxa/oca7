abstract class Gift {
	abstract double getWeight();
}

class Book extends Gift {
	public double getWeight() { return 3.2; }
}
class Phone extends Gift {
	public double getWeight() { return 1.1; }
}

class Parcel<T extends Gift> { // implements doesn't compile -> everything (class interface enum) is extends
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public void shipParcel() {
		/*
		 * Exception:
		 * type of t is Object
		 * Object doesn't have getWeight()
		 *
		 * after changing Parce<t> to Parcel<T extends Gift> this compiles
		 */
		if(t.getWeight() > 10)
			System.out.println("Ship by courier ABC");
		else
			System.out.println("Ship by courier XYZ");
	}
}

