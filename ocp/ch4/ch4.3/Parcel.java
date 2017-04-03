class Parcel<T> {
	public <X> void deliver(X x) {
		System.out.println(x.getClass());
	}
	public static void main(String args[]){
		Parcel<String> parcel = new Parcel<>();
		parcel.<Integer>deliver(new Integer(10));
		//parcel.<>deliver(new Integer(10));
		parcel.deliver("Hello");
	}
}
