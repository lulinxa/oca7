class Test {
  static int s;
  int i;
  Test(int i) {
    System.out.println("Constructor: " + i);
    this.i = i;
  }
  {
    System.out.println("Initializer");
  }
  static {
    s = 10;
    System.out.println("Static initializer");
  }
}

public class InitializerBlocks {
  public static void main(String args[]){
    Test t = new Test(01);
    System.out.println(t.s);
    System.out.println(Test.s);
    System.out.println(t.i);
  }
}

