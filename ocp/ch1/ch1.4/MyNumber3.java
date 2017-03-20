import java.util.Map;
import java.util.HashMap;
class MyNumber3 {
	int primary;
	int secondary;
	MyNumber3(int primary, int secondary){
		this.primary = primary;
		this.secondary = secondary;
	}
	public int hashCode() {
		return secondary;
	}
	public boolean equals(Object o){
		if(o != null && o instanceof MyNumber3)
			return (primary == ((MyNumber3)o).primary);
		else
			return false;
	}
	public static void main(String... args) {
		Map<MyNumber3, String> map = new HashMap<>();
		MyNumber3 num1 = new MyNumber3(2500, 100);
		MyNumber3 num2 = new MyNumber3(2500, 200);
		System.out.println(num1.equals(num2));
		map.put(num1, "Shreya");
		System.out.println(map.get(num2));
	}
}

