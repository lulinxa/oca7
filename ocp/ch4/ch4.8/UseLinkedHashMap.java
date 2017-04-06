import java.util.*;

public class UseLinkedHashMap {
	public static void main(String args[]) {
		Map<String, Integer> colorMap = new HashMap<>();
		colorMap.put("Red", 1);
		colorMap.put("Blue", 2);
		colorMap.put("Yellow", 3);
		colorMap.put("Purple", 4);
		colorMap.put("Orange", 5);

		for(Integer i : colorMap.values())
			System.out.print(i);

		System.out.println();

		Map<String, Integer> linkedColorMap = new LinkedHashMap<>();
		linkedColorMap.put("Red", 1);
		linkedColorMap.put("Blue", 2);
		linkedColorMap.put("Yellow", 3);
		linkedColorMap.put("Purple", 4);
		linkedColorMap.put("Orange", 5);

		for(Integer i : linkedColorMap.values())
			System.out.print(i);
	}
}
