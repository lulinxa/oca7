import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorTest {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("2");
    list.add("3");
    list.add("4");

    for(String s : list) {
      System.out.println(s);
    }

    for(int i = 0; i < list.size(); i++) {
      String s = list.get(i);
      if(s.equals("2"))
        list.remove(i);
    }

    for(String s : list) {
      System.out.println(s);
    }

    list = new ArrayList<>();
    list.add("2");
    list.add("3");
    list.add("4");

    for(String s : list) {
      System.out.println(s);
    }

    ListIterator<String> i = list.listIterator();

    while(i.hasNext()){
      if(i.next().equals("2"))
        i.remove();
    }

    for(String s : list) {
      System.out.println(s);
    }
  }
}
