import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListTest {
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<>();

    /*
     * add()
     */
    list.add("one");
    list.add("two");
    list.add(new String("four"));
    for(String s : list)
      System.out.println(s);
    System.out.println("Add \"three\" at second position");
    list.add(2, "three");
    for(String s : list)
      System.out.println(s);

    System.out.println();
    /*
     * set() replaces element at specified postiion
     */
    list.set(0, "zero");
    ListIterator<String> i = list.listIterator();
    while(i.hasNext())
      System.out.println(i.next());

    System.out.println();
    /*
     * remove() int or Object
     */
    list.remove(0);
    list.remove("four");
    for(String s : list)
      System.out.println(s);

    System.out.println();
    /* 
     * digression strings and stringbuilders
     */
    StringBuilder sb = new StringBuilder("The same");
    String s = new String("The same");
    System.out.println(s.equals(sb));
    System.out.println(sb.equals(s));

    System.out.println();
    /*
     * add multiple elements
     * addAll()
     */
    ArrayList<String> myList = new ArrayList<>();
    myList.add("One");
    myList.add("Two");
    ArrayList<String> yourList = new ArrayList<>();
    yourList.add("Three");
    yourList.add("Four");
    myList.addAll(2, yourList);
    for(String a : myList)
      System.out.println(a);

    System.out.println("###############");
    myList.clear();
    for(String b : myList)
      System.out.println(b);
  }
}
