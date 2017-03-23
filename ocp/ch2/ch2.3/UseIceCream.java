enum IceCream {
	VANILLA,
	STRAWBERRY,
	WALNUT,
	chocolate;

	private String color;

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "COLOR: " + color;
	}
}
public class UseIceCream {
	public static void main(String args[]){
		IceCream.VANILLA.setColor("white");
		IceCream.chocolate.setColor("black");
		System.out.println(IceCream.chocolate.getColor());
		System.out.println(IceCream.chocolate);
		System.out.println(IceCream.VANILLA.getColor());
		System.out.println(IceCream.VANILLA);
	}
}

/*
 * OUTPUT;
 * black
 * COLOR: black
 * white
 * COLOR: white
 */
