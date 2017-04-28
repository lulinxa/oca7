class Counter {
	public static long count = 0;
}

class UserCounter implements Runnable {
	public void increment() {
		synchronized(this) {
			Counter.count++;
			System.out.print(Counter.count + " ");
		}
	}
	public void run() {
		increment();
		increment();
		increment();
	}
}

public class DataRace {
	public static void main(String args[]) {
		UserCounter c = new UserCounter();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}

