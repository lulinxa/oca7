package glagolitic;
import java.util.Scanner;
public class Glagolitic {
  public static void main(String[] args) {
    char g = '\u2C00';
    System.out.println("A: " + g);
    char g1 = 11264;
    System.out.println("A: " + g1);
    char g2 = '\u0247';
    System.out.println("\\u0122: " + g2);
    char g3 = (char) -92;
    System.out.println("(cast)-122: " + g3);
    char g4 = 121;
    char g5 = 102;
    System.out.println(g4);
    System.out.println(g5);

    Scanner sc = new Scanner(System.in);
    System.out.print("Unesi osnovni tip podatka: ");
    int i = sc.nextInt();
    System.out.println("int: " + i);
    char c = (char)i;
    System.out.println("char: " + c);
  }
}


/*

 EXAM TIP Watch out for questions that use incorrect names for the primitive
data types. For example, there isn�t any *bool* primitive data type in Java. The
correct data type is *boolean*. If you�ve worked with other programming languages,
you might get confused trying to remember the exact names of all the
primitive data types used in Java. Remember that just two of the primitive data
types�int and char�are shortened; the rest of the primitive data types
(byte, short, long, float, and double) are not.

*/
