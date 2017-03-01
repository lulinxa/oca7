class StringTest {
  public static void main(String[] args) {
    String s1 = new String("Vladimir");
    String s2 = "Vladimir";
    String s3 = "Vladimir";
    System.out.println(s1 == s2);
    System.out.println(s3 == s2);

    /* create String with StringBuilder object */
    StringBuilder sb = new StringBuilder("My new String");
    String s = new String(sb);
    System.out.println(s);

    
    /* equals() */
    String a = "Morning";
    String b = new String("Morning");
    System.out.println(a == b);
    System.out.println(a.equals(b));

    /* charAt() */
    String name = new String("Paul");
    char c = name.charAt(0);
    int i = name.charAt(2);
    System.out.println(c);
    System.out.println(i);

    /* indexOf() */
    String letters = new String("ABBAB");
    System.out.println(letters.indexOf('B'));
    System.out.println(letters.indexOf("B", 2));
    System.out.println(letters.indexOf("S"));
    System.out.println(letters.indexOf("BA"));

    /* substring() */
    String exam = "Oracle";
    String sub1 = exam.substring(3);
    System.out.println(sub1);
    String sub2 = exam.substring(1,2);
    System.out.println(sub2);
    String sub3 = exam.substring(1,1);
    System.out.println("$" + sub3 + "#");
    // compiles but StringIndexOutOfBoundsException thrown at Runtime
    //String sub4 = exam.substring(2,0);
    //

    /* replace */
    String let = "ACAB";
    String repl = let.replace('A', '1');
    System.out.println(repl);
    String repl1 = let.replace("B", "2");
    System.out.println(repl1);
    System.out.println(let.replace("AC", "13").substring(0,2));
    System.out.println(let.replace("AB", "12").substring(2,4));

    /* startsWith() endsWith() accept only String */
    System.out.println(let.startsWith("CA", 1));
    System.out.println(let.endsWith("B"));

    String result = "Sunday  ".replace(' ', 'Z').trim().concat("M n");
    System.out.println(result);

    String l = "ABCAB";
    //startsWith("") and endsWith("") accept only string
    System.out.println(l.substring(0,2).startsWith("A"));
   
  }
}
