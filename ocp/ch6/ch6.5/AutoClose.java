import java.io.*;

class AutoClose {
	void readFileContents(String filename) {
		File file = new File(filename);
		try(FileInputStream fin = new FileInputStream(file)) {
			//
		} catch (IOException ex) { //FileNotFoundException -no!, 'cause fin.close() throws IOException
			System.out.println(ex.toString());
		}
	}
}
/*
class AutoClose {
	void readFileContents(String filename) throws IOException{
		File file = new File(filename);
		try(FileInputStream fin = new FileInputStream(file)) {
			//
		}
	}
}
*/
