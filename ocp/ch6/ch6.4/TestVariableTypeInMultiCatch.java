import java.io.*;

class Exception1 extends IOException {
	public String info() {
		return "I'm Base Exception";
	}
}
class Exception2 extends Exception {
	public String info() {
		return "I'm Derived Exception";
	}
}

class TestVariableTypeInMultiCatch {
	public static void main(String[] args) {
		try {
			int a = 10;

			if(a < 10) throw new Exception1();
			else throw new Exception2();
		} catch (Exception1 | Exception2 ex) { // type of ex is Exception common superclass of Ex1 and Ex2
			System.out.pritln(ex.info()); // wont compile; class Exception doesn't define info();
		}
	}
}
