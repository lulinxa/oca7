import java.util.regex.*;

class UsePredefinedCharacterClass {
	public static void main(String args[]) {
		String targetString = "A b$9;";
		String regex = "\\W";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(targetString);
		String replacedStr = matcher.replaceAll("[]");

		System.out.println(replacedStr);
	}
}
