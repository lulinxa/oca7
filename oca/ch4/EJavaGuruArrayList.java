import java.util.*; // line 1
public class EJavaGuruArrayList { // line 2
  public static void main(String args[]) { // line 3
    ArrayList<String> ejg = new ArrayList<>(); // line 4
    ejg.add("One"); // line 5
    ejg.add("Two"); // line 6
    System.out.println(ejg);
    System.out.println(ejg.contains(new String("One"))); // line 7
    System.out.println(ejg.indexOf("Two")); // line 8
    ejg.clear(); // line 9
    System.out.println(ejg); // line 10
    System.out.println(ejg.get(1)); // line 11
  } // line 12
}
