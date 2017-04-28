class TimeBomb extends Thread {
	public void run() {
		for(int i = 9; i >= 0; --i) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]) {
		TimeBomb t = new TimeBomb();
		System.out.println("Countdown");
		t.start();
		try {
			t.join();
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("BOOM!!");
	}
}
