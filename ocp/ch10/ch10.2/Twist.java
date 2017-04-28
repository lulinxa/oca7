public class Twist {
	public static void main(String args[]) {
		Thread sing = new Sing();
		sing.start();
		throw new RuntimeException("main");
	}
}

class Sing extends Thread {
	public void run() {
		System.out.println("Singing");
		throw new RuntimeException("run");
	}
}
