class Singleton {
	/* 2. define private static variable to refer to only instance */
	private static Singleton anInstance = null;
	/* 3 private static method for access to only instance */
	public static Singleton getInstance() {
		if(anInstance == null)
			anInstance = new Singleton();
		return anInstance;
	}
	/* 1. create private constructor */
	private Singleton() {
		System.out.println("Private Constructor");
	}
}
/*
 * two concurent threads can create two instances so there should be a fix.
 */

/*
 * 2. -> private static Singleton anInstance = new Singleton(); 
 * eager initialization
 * in above example class is innitialized as soon as class is loaded
 */

/*
 * 2. -> 
 * private static Singleton anInstance;
 * synchronized public static Singleton getInstance() { ...
 * method is defined as synchronized so only one thread at the time can access
 * multiple threads can execute this method concurently
 */

/*
 * 2. ->
 * public static Singleton getInstance() {
 * 		if(anInstance == null) {
 * 			synchronized (Singleton.class) {
 * 				if(anInstance == null)
 * 					anInstance = new Singleton();
 * 			}
 * 		}
 * 		return anInstance;
 * 	}
