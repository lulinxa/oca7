/*
 * ArrayDeque()
 * ArrayDeque(Collection<? extends E> c)
 * ArrayDeque(int numElements)
 */

import java.util.*;

class TestArrayDeque {
	public static void main(String args[]) {
		String strArray[] = {"A1", "B2", "C3"};

		ArrayDeque<String> arrDeque = new ArrayDeque<String>(Arrays.asList(strArray));

		arrDeque.push("D4");
		arrDeque.offer("E5");

		//arrDeque.push(null) -> NullPointerException
		
		System.out.println(arrDeque.pop());
		System.out.println(arrDeque.remove());

		arrDeque.add("F6");

		System.out.println(arrDeque.peek());

		System.out.println(arrDeque);
	}
}

/*
 * All insertion methods
 * add(), addFirst(), addLast(), offer(), offerFirst(), offerLast(), push()
 * throw NullPointerException if you try to insert null element into ArrayDeque
 */
