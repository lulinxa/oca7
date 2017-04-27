import java.io.*;
public class DefineCauseOfAssertionError {
	public static void main(String args[]) {
		assert (false) : new FileNotFoundException("java.txt missing");
	}
}
