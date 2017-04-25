import java.io.*;

class AutoClose {
	void readFileContents(String filename) {
		File file = new File(filename);
		try(FileInputStream fin = new FileInputStream(file)) {
			//
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
	}
}
