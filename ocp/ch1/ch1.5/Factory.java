interface Printable {}
final class Engineer {}
class Factory {
	public static void main(String[] args){
		Engineer engineer = new Engineer();
		/* This line will NOT compile 'cause class 
		 * Engineer is marked as final so it can't be
		 * extended (so extended classes can't implement
		 * Printable)
		 */
		Printable printable = (Printable) engineer;
	}
}
