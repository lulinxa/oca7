import java.io.*;

class TwistThrowsException {
	public void readFile(String file) throws FileNotFoundException {
		System.out.println("readFile");
		throw new FileNotFoundException();
	}
	void useReadFile(String name) throws FileNotFoundException {
		System.out.println("useReadFile");
		try {
			readFile(name);
		} catch (FileNotFoundException e) {
			// code 
		}
	}

	public static void main(String args[]) { //throws FileNotFoundException
		new TwistThrowsException().useReadFile("a"); // compilation error this is not srounded with try - catch nor main declares to throw FNFException
	}
}
	
