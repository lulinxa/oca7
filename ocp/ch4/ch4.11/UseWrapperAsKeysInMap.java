import java.util.*;

class UseWrapperAsKeysInMap {
	public static void main(String args[]) {

		Map<Double, String> map = new HashMap<>();
		map.put(6.6, "OCA");
		map.put(7.7, "OCP");

		System.out.println(map.get(6.6));
		System.out.println(map.get(new Double(7.7)));

		System.out.println(map.get(new Float((float)7.7)));
	}
}
