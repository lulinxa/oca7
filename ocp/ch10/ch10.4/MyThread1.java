class MyThread1 implements Runnable {
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("In run method; thread name is: " + getName());
	}
	public static void main(String args[]) {
		Thread t = new MyThread1();
		t.start();
		System.out.println("In main method; thread name is: " + Thread.currentThread().getName());
	}
}
	
