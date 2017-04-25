import java.io.*;
import java.sql.*;

class MultiCatch {
	void myMethod(Connection con, String filename) {
		try {
			File file = new File(filename);
			FileInputStream fin = new FileInputStream(file);

			Statement stmt = con.createStatement();
		} catch (FileNotFoundException | SQLException e) { // catches all or their subclasses
			System.out.println(e.toString());
		} finally {
			System.out.println("finally");
		}
	}
}

/*
 * catch (IOException | FileNotFouncException .... fails to compile
 * catch (FileNotFouncException | IOException .... fails to compile
 *
 * solution:
 * 1.
 * catch (IOException | .... 
 * 
 * 2.
 * catch (FileNotFoundException) {}
 * catch (IOException | ....
 *
 * there can't be parrent and child exception in multi-catch block
 */
