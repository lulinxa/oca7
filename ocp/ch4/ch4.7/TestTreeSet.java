/*
 * TreeSet()
 * TreeSet(Collection<? extends E> c)
 * TreeSet(Comparator<? super E> comparator)
 * TreeSet(SortedSet<E> s)
 */

import java.util.*;

class TestTreeSet {
	public static void main(String args[]) {
		String[] myNames = {"Shreya", "Harry", "Paul", "Shreya", "Selvan"};
		TreeSet<String> treeSetNames = new TreeSet<String>(Arrays.asList(myNames));
		Iterator it = treeSetNames.descendingIterator();
		while(it.hasNext())
			System.out.println(it.next());

		System.out.println();

		it = treeSetNames.iterator();
		while(it.hasNext())
			System.out.println(it.next());

		System.out.println();

		System.out.println(treeSetNames);
	}
}
