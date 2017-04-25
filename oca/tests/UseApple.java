import food.Fruit;
class UseApple {
	public static void main(String[] args) {
		Apple f = new Apple();
		System.out.println(f.isEatable());
		f.setEatable(true);
		System.out.println(f.isEatable());
	}
}

