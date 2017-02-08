public class HelloExamWithParameters {
  /*
   * String[] args
   * OR
   * String args[]
   *
   *
   * String... args (varargs)
   * BUT NOT
   * String args... -> this won't compile
   */
  public static void main(String args[]) {
    System.out.println(args[0]);
    System.out.println(args[1]);
  }
}
