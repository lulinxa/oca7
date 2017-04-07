import java.util.*;

public class AutoboxingUnboxing {
	public static void main(String args[]) {
		// public int compareTo(Double anotherDouble);
		Double d1 = new Double(12.67);
		System.out.println(d1.compareTo(21.68)); // -1 => 12.67 < 21.68

		ArrayList<Double> list = new ArrayList<Double>();
		// autoboxing
		list.add(12.12);
		list.add(11.24);
		Double total = 0.0;
		for(Double d : list)
			total += d; // unboxing to use + operator
		System.out.println(total);

		ArrayList list2 = new ArrayList();
		list2.add(new Double(12.12D));
		list2.add(new Double(87.98D));
		Double total2 = Double.valueOf(0.0D);
		for(Iterator i = list2.iterator(); i.hasNext(); ) {
			Double d = (Double)i.next();
			total2 += total2.doubleValue() + d.doubleValue();
		}
		System.out.println(total2);
	}
}
