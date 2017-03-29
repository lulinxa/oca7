abstract class Animal {
	String currentPosition;
	public void move(String newPosition){
		currentPosition = newPosition;
		System.out.println("New position: " + newPosition);
	}
}
class Lion extends Animal {
	void changePosition(String newPosition){
		super.move(newPosition);
		System.out.println("New position: " + newPosition);
	}
}
class Test {
	public static void main(String args[]){
		new Lion().changePosition("Forest");
	}
}
