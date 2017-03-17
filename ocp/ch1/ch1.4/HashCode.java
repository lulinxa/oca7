import java.util.Map;
import java.util.HashMap;
class MyNumber {
	long number;
	MyNumber(long number){
		this.number = number;
	}
	public int hashCode() {
		int sum = 0;
		long num = number;
		do {
			sum += num % 10;
			num /= 10;
		} while (num!=0);
		return sum;
	}
}
public class HashCode {
	public static void main(String... args){
		Map<MyNumber, String> m = new HashMap<>();
		MyNumber n1 = new MyNumber(1200);  // 3
		MyNumber n2 = new MyNumber(2500);  // 7
		MyNumber n3 = new MyNumber(57123); // 18
		m.put(n1, "John");
		m.put(n2, "Mary");
		m.put(n3, "Sam");
		MyNumber n4 = new MyNumber(57123); // 18
		m.put(n4, "Kim");

		//MyNumber n = new MyNumber(12357); // 18
		
		System.out.println(n3.equals(n4));
		System.out.println(m.get(n4));

	}
}
