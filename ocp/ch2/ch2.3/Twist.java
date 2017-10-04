enum Twist {
	BEGINNER;
	static {
		System.out.println("static init block");
	}
	Twist() {
		System.out.println("constructor");
	}
	public static void main(String args[]) {
		System.out.println(Twist.BEGINNER);
	}
}
