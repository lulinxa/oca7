import java.util.regex.*;

class UseQuantifier {
	public static void main(String args[]) {
		String targetString = "bday";
		String regex = "d?";

		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(targetString);

		while(mat.find()) {
			System.out.printf("Found :%s: starts at %d, ends at %d", 
				mat.group(),
				mat.start(),
				mat.end());
			System.out.println();
		}
	}
}
