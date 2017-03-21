class DemoMultipleStatiBlock {
	static {
		//++staticVar;
		staticVar = 10;
	}
	// static int staticVar;
	static int staticVar = 0;
	static {
		++staticVar;
	}

	public DemoMultipleStatiBlock() {
		System.out.println("Constructor: " + staticVar);
	}
	
	public static void main (String... args){
		new DemoMultipleStatiBlock();
	}
}
