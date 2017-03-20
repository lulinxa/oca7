import java.io.Serializable;
public class CastString {
	public static void main(String args[]){
		String name = "MyName";

		/* String is final but it can be
		 * upcast to interfaces which String class implements
		 */
		Serializable s = name;
		Comparable<String> cs = name;
		CharSequence chrS = name;
	}
}
