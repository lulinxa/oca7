public class WrapperClasses {
	public static void main(String args[]) {

		/*
		 * Autoboxing
		 */
		Boolean bool1 = true;
		Character char1 = 'a';
		Byte byte1 = 10;
		Double double1 = 10.98;

		/* Constructors that accepts primitive values */
		Boolean bool2 = new Boolean(true);
		Character char2 = new Character('a');
		Byte byte2 = new Byte((byte)10);
		Double double2 = new Double(10.98);

		/*
		 * Constructors that accepts String
		 */
		Boolean bool3 = new Boolean("true");
		//Character char3 = new Character("a");
		Byte byte3 = new Byte("10");
		Double double3 = new Double("10.98");

		/*
		 * Static methods vaklueOf();
		 */
		Boolean bool4 = Boolean.valueOf(true);
		Boolean bool5 = Boolean.valueOf("true");
		Boolean bool6 = Boolean.valueOf("TRuE");
		Double double4 = Double.valueOf(10);
		/*
		 * Short, Integer, Long, Float...
		 */

		
		boolean bool7 = bool4.booleanValue();
		System.out.println(bool7);

		//System.out.println(Long.parseLong("12.34")); // NFE exception 12.34 is not long
		//System.out.println(Byte.parseByte("1234")); // NFE exception 1234 out of range for byte
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("TrUe"));


		/*
		 * Character, Byte, Short, Integer, Long
		 * [-128, 127] caching values
		 */
		Long var1 = Long.valueOf(123);
		Long var2 = Long.valueOf("123");
		System.out.println(var1 == var2);

		Long var3 = Long.valueOf(223);
		Long var4 = Long.valueOf("223");
		System.out.println(var3 == var4);

		
	}
}
