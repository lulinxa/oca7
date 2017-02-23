package certification138;
/*
 * if uncomment bellow line for definnig not public class
 * then university.StartApp class can't be compiled 'cause 
 * import static statment can't see ExamQuestion class
 */
//class ExamQuestion {
public class ExamQuestion {
  public static int marks = 10;
  public static void print() {
    System.out.println(marks);
  }
}
