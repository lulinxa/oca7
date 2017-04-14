import java.io.FileNotFoundException;

class DemoThrowException {
	public void readFile(String file) throws FileNotFoundException {
		boolean found = findFile(file);
		if(!found)
			throw new FileNotFoundException("Missing file");
		else {
			// code to read file
		}
	}
	boolean findFile(String file) {
		// code to return true if file can be located
		return true;
	}
}
