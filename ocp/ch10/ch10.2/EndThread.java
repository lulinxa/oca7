class Sing extends Thread {
	boolean status = true;
	public void run() {
		while(status)
			System.out.println("Singing");
	}
	public void setStatus(boolean value) {
		status = value;
	}
}

class EndThread {
	public static void main(String args[]) {
		Sing sing = new Sing();
		sing.start();
		for(int i = 0; i < 100000; i++);
		sing.setStatus(false);
	}
}
