class Sing extends Thread {
	public void run() {
		System.out.println("Sing");
	}
}

public class CantCallStartOnSameThreadMoreThanOnce {
	public static void main(String args[]) {
		Thread sing = new Sing();
		sing.run();
		sing.run();
		sing.start();
		sing.start();
	}
}
