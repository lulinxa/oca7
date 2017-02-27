import java.util.ArrayList;
public class ArrayListPrimitive {
  public static void main(String args[]){
    ArrayList<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(2);
    for(int i : a){
      System.out.println(i);
    }
  }
}
