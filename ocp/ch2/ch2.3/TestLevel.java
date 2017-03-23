enum TestLevel {
	BEGINNER;
	static{
		System.out.println("static");
	}
	TestLevel(){
		System.out.println("constructor");
	}
	public static void main(String args[]){
		System.out.println(TestLevel.BEGINNER);
	}
}
