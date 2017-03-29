interface Livable {
	void live();
}
interface GuestHouse {
	void live();
	void welcome();
}
class HomeInterfaces implements Livable, GuestHouse {
	public void live() {
		System.out.println("live");
	}
	public void welcome() {
		System.out.println("welcome");
	}
}
