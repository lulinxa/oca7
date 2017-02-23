public class HelloExam{
  /*
   * varable argument String... args
   * empty space can precede ...
   *
   * String... args
   * String   ... args
   *
   * are valid
   */
  public static void main(String     ...     args){
    String one = args[0];
    String two = args[1];
    System.out.println("Hello exam.");
    System.out.println(one);
    System.out.println(two);
  }
}
