class Test {
  int i;
  Test(int j) {
    int i = 10;
    i = j; // different from this.i = j :D
  }
}

public class ScopeConstructorTest {
  public static void main(String args[]){
    Test t = new Test(2);
    System.out.println(t.i);
  }
}
