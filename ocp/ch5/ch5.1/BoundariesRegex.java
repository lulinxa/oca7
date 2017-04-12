import java.util.regex.*;

class BoundariesRegex {
	public static void main(String args[]) {
		String targetString = "the leather in their coat made her seethe";
		String regex = "\\bthe";

		System.out.println(targetString + " \\bthe");
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
		
		System.out.println();
		System.out.println(targetString + " \\Bthe");
		System.out.println("+++++++++++++++++++++++");

		regex = "\\Bthe";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(targetString);
		while(matcher.find()) {
			System.out.println(
				matcher.group() + " starts at " + 
				matcher.start() + ", ends at " +
				matcher.end()
			);
		}


		System.out.println();
		System.out.println(targetString + " \\Bthe\\B");
		System.out.println("+++++++++++++++++++++++");

		regex = "\\Bthe\\B";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(targetString);
		while(matcher.find()) {
			System.out.println(
				matcher.group() + " starts at " + 
				matcher.start() + ", ends at " +
				matcher.end()
			);
		}

		System.out.println();
		System.out.println(targetString + " \\bthe\\B");
		System.out.println("+++++++++++++++++++++++");

		regex = "\\bthe\\B";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(targetString);
		while(matcher.find()) {
			System.out.println(
				matcher.group() + " starts at " + 
				matcher.start() + ", ends at " +
				matcher.end()
			);
		}

		System.out.println();
		System.out.println(targetString + " \\Bthe\\b");
		System.out.println("+++++++++++++++++++++++");

		regex = "\\Bthe\\b";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(targetString);
		while(matcher.find()) {
			System.out.println(
				matcher.group() + " starts at " + 
				matcher.start() + ", ends at " +
				matcher.end()
			);
		}


		System.out.println();
		System.out.println(targetString + " \\bthe|the\\b");
		System.out.println("+++++++++++++++++++++++");

		regex = "\\bthe|the\\b";
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
