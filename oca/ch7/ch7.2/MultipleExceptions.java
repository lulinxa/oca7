import java.io.*;
public class MultipleExceptions {
  public static void main(String args[]) {
    FileInputStream fis = null;
    try{
      fis = new FileInputStream("file.txt.backup");
      System.out.println("File opened");
      fis.read();
      System.out.println("Read file");
    } catch (FileNotFoundException fnfe) {
      System.out.println("File not found");
    } catch (IOException ioe) {
      System.out.println("File closing exception");
    } finally {
      System.out.println("finally");
    }

    System.out.println("Next task...");
  }
}
