enum IceCream2 {
	VANILLA("white"),
	STRAWBERRY("pink"),
	WALNUT("brown") {
		public String toString(){
			return "WALNUT is Brown in color";
		}
		public String flavor(){
			return "great!";
		}
	},
	CHOCOLATE("dark brown");

	private String color;
	IceCream2(String color){
		this.color = color;
	}
	public String toString() {
		return "MyColor: " + color;
	}
}
