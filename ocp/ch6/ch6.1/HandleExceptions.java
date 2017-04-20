import java.io.*;

class HandleExceptions {
	void method6() {
		try {}
		catch (Error e) {}
	}
	void method7() {
		try {}
		catch (Exception e) {}
	}
	void method8() {
		try {}
		catch (Throwable e) {}
	}
	void method9() {
		try {}
		catch (RuntimeException e) {}
	}
	void method10() {
		try {}
		catch (FileNotFoundException e) {} // doesn't compile 
		/*
		 * this is checked exception other than Exception 
		 */
	}
}
