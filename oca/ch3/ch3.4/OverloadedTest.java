class Test {
  public void print(String s){
    System.out.println(s);
  }
  public String print(String s, int i) {
    return s;
  }
}

public class OverloadedTest {
  public static void main(String   ... args){
    Test t = new Test();
    t.print("First method");
    String s = t.print("Second method", 10);
    System.out.println(s);
  }
}

