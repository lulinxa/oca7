public class UseIceCream2 {
	public static void main(String args[]){
		System.out.println(IceCream2.VANILLA);
		System.out.println(IceCream2.WALNUT);
		// doesn't compile:
		//System.out.println(IceCream2.WALNUT.flavor());
	}
}
