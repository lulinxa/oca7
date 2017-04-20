import java.io.*;

class TwistThrowsException2 {
	public void readFile(String file) throws FileNotFoundException {
		System.out.println("readFile");
	}

	public static void main(String args[]) { 
		System.out.println("main");
		new TwistThrowsException2().readFile("Hello.txt");
	}
}
	
