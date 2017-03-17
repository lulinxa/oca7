class Instrument{
	{
		System.out.println("Instrument:initializer block");
	}
	Instrument(){
		System.out.println("Instrument:constructor");
	}
	static {
		System.out.println("INSTRUMENT:STATIC initializer");
	}
}

public class Pencil extends Instrument {
	public Pencil(){
		System.out.println("Pencil:constructor");
	}
	static {
		System.out.println("PENCIL:STATIC instance initializer");
	}
	{
		System.out.println("Pencil:instance initilizer");
	}
	public Pencil(String s){
		System.out.println("Pencil:String consutrctor");
	}
	public static void main(String... args){
		new Pencil();
		System.out.println();
		new Pencil("test");
	}
}
