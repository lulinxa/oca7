import java.util.Formatter;
import java.io.File;

class FormattedString {
	public static void main(String args[]) throws Exception{
		String name = "Shreya";

		Formatter formatter = new Formatter(new File("data.txt"));
		formatter.format("My name is %s", name);
		formatter.flush();

		System.out.printf("My name is %s\n", name);

		Integer age = null;
		boolean isShort = false;

		System.out.println();
		System.out.println("%b");

		System.out.format("Name %b, age %b, isShort %b\n", name, age, isShort);

		System.out.format("\nName defined %10b.", name);
		System.out.format("\nName defined %.1b.", name);
		System.out.format("\nName defined %-10b.", name);

		System.out.println();
		System.out.println("%c");
		System.out.printf("\nChar %c", new Character('\u007b'));
		System.out.printf("\nChar %c", '\u6124');
		//System.out.printf("\nChar %c", new Boolean(true)); // runtimeexception
		//System.out.printf("\nChar %c", '\affff');
	
		System.out.println();
		System.out.println("%f");
		System.out.printf("[%f]", 12.12345);
		System.out.printf("\n[%010f]", 12.12345);
		System.out.printf("\n[%-10f]", 12.12345);
		System.out.printf("\n[%10.2f]", 12.98765);
		System.out.printf("\n[%,f]", 123456789.12345);

		System.out.println();
		System.out.println("%d");
		System.out.printf("[%d]", 12345);
		System.out.printf("\n[%010d]", 12345);
		System.out.printf("\n[%(,d]", -123456789);
		//System.out.printf("\n[%-10.2d]", 12345); runtime exception illegalformatprecisionexception

		System.out.println();
		System.out.println("%s");
		String[] skills = {"Java", "Android"};
		System.out.printf("Name is %s, age is %s, skills are %s\n", name, age, skills);
	}
}
