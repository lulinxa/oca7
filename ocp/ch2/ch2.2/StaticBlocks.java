class StaticBlocks {
	static int staticVar = 10;
	static {
		System.out.println("First");
		++staticVar;
	}
	static {
		System.out.println("Second");
		++staticVar;
	}
	static void modifyStaticVar() {
		++staticVar;
	}

	public StaticBlocks() {
		System.out.println("Constructor: " + staticVar);
	}

	public static void main(String... args){
		new StaticBlocks();
		modifyStaticVar();
		new StaticBlocks();
	}
}
