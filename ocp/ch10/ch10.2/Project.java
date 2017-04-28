class ScreenDesign extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++)
			System.out.println(i);
	}
}

class Developer {
	ScreenDesign design;
	Developer(ScreenDesign design) {
		this.design = design;
	}
	public void code() {
		try {
			System.out.println("Waiting for design to complete");
			design.join();
			System.out.println("Coding phase start");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class Project {
	public static void main(String args[]) {
		ScreenDesign sd = new ScreenDesign();
		sd.start();
		Developer d = new Developer(sd);
		d.code();
	}
}
