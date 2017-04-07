import java.util.*;

class Star implements Comparable<Star> {
	String name;
	double mass;
	Star(String name, double mass) {
		this.name = name;
		this.mass = mass;
	}
	public int compareTo(Star star) {
		return (int)(this.mass - star.mass);
	}
	public String toString() {
		return name + ":" + mass;
	}
}

class SortList {
	public static void main(String args[]) {
		List<Integer> integers = new ArrayList<>();
		integers.add(new Integer(200));
		integers.add(new Integer(87));
		integers.add(new Integer(999));
		for(Integer i : integers)
			System.out.println(i);
		System.out.println("After calling Collections.sort()");
		Collections.sort(integers);
		for(Integer i : integers)
			System.out.println(i);

		System.out.println();

		Star s1 = new Star("Sun", 7777.77);
		Star s2 = new Star("Sirius", 999999.99);
		Star s3 = new Star("Pilatim", 222.22);
		List<Star> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list);
		System.out.println(list);
		list.add(new Star("Limitier", 4444.44));
		System.out.println(list);
		Collections.reverse(list);
		for(Star s : list)
			System.out.println(s);

	}
}
