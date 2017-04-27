import java.io.*;

class MyAutoCloseable implements AutoCloseable {
	MyAutoCloseable() {
		System.out.println("Constructor called");
	}
	public void close() {
		System.out.println("Close called");
	}
}

class AutoClose2 {
	void useCustomResources() {
		try (MyAutoCloseable re = new MyAutoCloseable()) {
			System.out.println("within try-with-resources");
		}
		finally {
			System.out.println("finally");
		}
	}
}

class Test {
	public static void main(String args[]) {
		new AutoClose2().useCustomResources();
	}
}
