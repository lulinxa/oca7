import java.io.*;
public class TwistInTaleNestedTryCatch {
  static FileInputStream players, coach;
  public static void main(String[] args){
    try {
      players = new FileInputStream("players.txt");
      System.out.println("players.txt found");
      try {
        coach.close();
      } catch (IOException e) {
        System.out.println("coach.txt not found");
      } finally {
        System.out.println("Hi from inner finnaly block");
      }
    } catch (FileNotFoundException fnfe) {
      System.out.println("players.txt not found");
    } catch (NullPointerException ne) {
      System.out.println("Null pointer exception");
    } finally {
      System.out.println("Hi from outer finnaly block");
    }
  }
}
