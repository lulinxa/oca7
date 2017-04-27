class Foo3 {
	private String name = "Outer";
	private int sameName = 20;
	class InnerFoo3 {
		String publicInner = name;
		int sameName = Foo3.this.sameName + 1;
		static final int VAR = 10;
		void printOuterData() {
			System.out.println(Foo3.this.sameName+":"+Foo3.this.name);
			System.out.println(sameName+":"+publicInner);
		}
	}
	public void printInner() {
		InnerFoo3 f = new InnerFoo3();
		System.out.println(f.VAR+":"+f.publicInner);
	}
	public static void main(String[] args) {
		Foo3 f = new Foo3();
		Foo3.InnerFoo3 fi = f.new InnerFoo3();
		System.out.println(fi.sameName);
		fi.printOuterData();
		f.printInner();
	}
}
