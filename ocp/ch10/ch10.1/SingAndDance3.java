import java.util.Set;

class Sing extends Thread {
	public void run() {
		System.out.println("Singing");
	}
}

public class SingAndDance3 {
	public static void main(String args[]) throws InterruptedException {
		Thread sing = new Sing();
		Thread newThread = new Thread(sing);
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		for(Thread t : threadSet)
			System.out.println(t + " --- " + t.getState());
		System.out.println(newThread.getState());
		newThread.start();
		System.out.println(newThread.getState());
		newThread.join();
		System.out.println(newThread.getState());
		newThread.notify();

	}
}
