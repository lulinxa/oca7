class Sing implements Runnable {
	@Override
	public void run() {
		System.out.println("Singing.... ");
	}
}

public class SingAndDance2 {
	public static void main(String args[]) {
		Thread sing = new Thread(new Sing(), "Thread that implements RUNNABLE");
		sing.start();
		System.out.println("Dacing");
	}
}

