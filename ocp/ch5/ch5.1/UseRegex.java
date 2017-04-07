import java.util.regex.*;

class UseRegex {
	public static void main(String args[]) {
		String targetString = "I am fine to dine at nine";
		String regex = "[fdn]ine";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(targetString);
		while(matcher.find()) {
			System.out.println(
				matcher.group() + " starts at " + 
				matcher.start() + ", ends at " +
				matcher.end()
			);
		}	
	}

	/*
		fine starts at 5, ends at 9
		dine starts at 13, ends at 17
		nine starts at 21, ends at 25
	*/
}
