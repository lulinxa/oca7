import java.util.*;

class UseTreeSetWithWrapperClasses {
	public static void main(String args[]) {
		TreeSet<Boolean> set = new TreeSet<>();
		set.add(new Boolean(true));
		set.add(new Boolean("FaLsE"));
		set.add(Boolean.valueOf("TrUe"));
		for(Boolean b : set)
			System.out.println(b);
	}

}
