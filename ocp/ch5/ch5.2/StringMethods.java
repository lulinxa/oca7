//import java.util.regex.*;
import java.util.Scanner;

class StringMethods {
	public static void main(String args[]) {
		String sentence = "paint the cup and thee plate";

		System.out.println(sentence.indexOf('p'));
		System.out.println(sentence.indexOf('t'));
		System.out.println(sentence.lastIndexOf('t', 15));

		System.out.println(sentence.indexOf("the"));
		System.out.println(sentence.indexOf('t', 15));

		System.out.println(sentence.lastIndexOf("the"));
		System.out.println(sentence.lastIndexOf('t'));

		
		// ->
		System.out.println(sentence.indexOf('a')); // 1
		System.out.println(sentence.indexOf('a', 0)); // 1
		System.out.println(sentence.indexOf('a', -100)); // 1
		System.out.println(sentence.indexOf('a', 100)); // -1

		// <-
		System.out.println(sentence.lastIndexOf('a')); // 25
		System.out.println(sentence.lastIndexOf('a', 0)); // -1
		System.out.println(sentence.lastIndexOf('a', -100)); // -1
		System.out.println(sentence.lastIndexOf('a', 100)); // 25


		StringBuilder db = new StringBuilder("the");
		String str = "the";
		System.out.println(sentence.contains(db));
		System.out.println(sentence.contains(str));

		// paint the cup and thee plate
		System.out.println(sentence.subSequence(2, 7)); // "int t"
		System.out.println(sentence.substring(20)); // "ee plate"

		// paint-the-cup-and-thee-plate
		// split()
		/*
		 * split(String regex, int limit);
		 * If limit is nonpositive, then the regex pattern will be applied as many times as
		 * possible and the array tokens can have any length. If limit is passed 0, the regex
		 * pattern will be applied as many times as possible, but tokens won't include trailing
		 * empty strings. 
		 */
		String test[] = new String[10];
		String testSplit = " - -   A-B";
		test = testSplit.split("-", -1);
		System.out.println("##");
		for(String s : test)
			System.out.println(s);
		test = testSplit.split("-", 0);
		System.out.println("##");
		for(String s : test)
			System.out.println(s);

		
		str = "RENT-TENT";
		String newString = str.replace(
			str.substring(2,5), 
			str.subSequence(
				str.indexOf("T"), 
				str.lastIndexOf('N')
			)
		);
		System.out.println(newString);

		str = "cat kcupk copp";
		newString = str.replaceAll("\\bc.p\\B", "()");
		System.out.println(newString);
		newString = str.replaceAll("\\Bc.p\\b", "()");
		System.out.println(newString);

		String str1 = "Start startup, time to start";
		int k = -1;
		System.out.println(str1.startsWith("Start"));
		System.out.println(str1.startsWith("Start", 0));
		System.out.println(str1.startsWith("Start", k));
		System.out.println(str1.startsWith("Start", 1));

		String a = "a";
		String b = "A";
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));

		System.out.println(str1.substring(0,1).compareTo(str1.substring(6,7)));
		
		/*
		 * Scanner(File source)
		 * Scanner(Readable source)
		 * Scanner(String source)
		 */

		Scanner scn = new Scanner("The \tnew \nProgrammer exam");
		while(scn.hasNext())
			System.out.println(scn.next());

		scn = new Scanner("The1new22Programmer exam6");
		// to reverse and print number(s) instead of digits to be delimiter use [\\sA-Za-z]+
		scn.useDelimiter("[\\d]+");		
		while(scn.hasNext())
			System.out.println(scn.next());

		scn = new Scanner("1 2 4 The new 55 Programmer 44 exam");
		scn.useDelimiter("[\\sA-Za-z]+");
		int total = 0;
		while(scn.hasNext())
			total += scn.nextInt();
			//total = total + scn.nextInt();
		System.out.println(total);


	}
}
