import java.util.regex.*;

class UseRegexExercise {
	public static void print(Matcher m, String s) {
		System.out.println(s);
		System.out.println("++++++++++++");
		while(m.find())
		System.out.println(m.group() + " starts at " + 
			m.start() + ", ends at " +
			m.end()
		);
		System.out.println();
	}

	public static void main(String args[]) {
		String target = "A5C7M%";
		String regex = "\\d";

		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(target);
		print(mat, target);

		regex = "\\D";
		pat = Pattern.compile(regex);
		mat = pat.matcher(target);
		print(mat, target);

		target = "A B   $8990";
		regex = "\\s";
		pat = Pattern.compile(regex);
		mat = pat.matcher(target);
		print(mat, target);

		regex = "\\S";
		pat = Pattern.compile(regex);
		mat = pat.matcher(target);
		print(mat, target);
	
		target = "A b$0";
		regex = "\\w";
		pat = Pattern.compile(regex);
		mat = pat.matcher(target);
		print(mat, target);

		regex = "\\W";
		pat = Pattern.compile(regex);
		mat = pat.matcher(target);
		print(mat, target);
		
	
	}
}
