class Sing extends Thread {
	public void run() {
		System.out.println("Singing.... ");
	}
	public void start() {
		System.out.println("Starting... ");
	}
}

class SingAndDance {
	public static void main(String args[]) {
		Thread sing = new Sing();
		sing.start();
		System.out.println("Dancing");
	}
}
