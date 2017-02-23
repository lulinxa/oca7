package two;
import one.First;
public class Second {
  public Second(){
    First f = new First();
    f.setInt(20);
    System.out.println(f.getInt());
  }
}
