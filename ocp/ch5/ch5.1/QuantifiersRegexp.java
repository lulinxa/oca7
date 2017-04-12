import java.util.regex.*;

public class QuantifiersRegexp {
	public static void main(String args[]) {
		
		String targetString = "I am colour in UK and color in US";
		String regex = "colou?r";

		System.out.println(targetString + " => " + regex);
		System.out.println("+++++++++++++++++++++++");

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(targetString);
		while(matcher.find()) {
			System.out.println(
				matcher.group() + " starts at " + 
				matcher.start() + ", ends at " +
				matcher.end()
			);
		}

		targetString = "It can be written as August or as Aug, no metter dog :D";
		regex = "Aug(ust)?";
		System.out.println();
		System.out.println(targetString + " => " + regex);
		System.out.println("+++++++++++++++++++++++");

		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(targetString);
		while(matcher.find()) {
			System.out.println(
				matcher.group() + " starts at " + 
				matcher.start() + ", ends at " +
				matcher.end()
			);
		}

		targetString = "A ball can fall in a mall with all";
		regex = "[bfm]?all";
		System.out.println();
		System.out.println(targetString + " => " + regex);
		System.out.println("+++++++++++++++++++++++");

		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(targetString);
		while(matcher.find()) {
			System.out.println(
				matcher.group() + " starts at " + 
				matcher.start() + ", ends at " +
				matcher.end()
			);
		}

	}
}
