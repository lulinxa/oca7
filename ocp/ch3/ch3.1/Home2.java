interface Livable {
	void live();
}
interface GuestHouse {
	void live(int i);
}
class Home implements Livable, GuestHouse {
	public void live(){
		System.out.println("live");
	}
	public void live(int i) {
		System.out.println("live for: " + i);
	}
}
