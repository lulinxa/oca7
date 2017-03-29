interface Livable {
	boolean status = true;
	int ratings = 10;
}
class Home implements Livable {
	boolean status;
	static int ratings = 7;
	Home() {
		System.out.println(status);
		System.out.println(Livable.status);

		System.out.println(ratings);
		System.out.println(Livable.ratings);
	}

	public static void main(String... args){
		Home h = new Home();
	}
}
