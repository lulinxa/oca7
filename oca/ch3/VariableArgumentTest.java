class Test {
  private int age;
  private int[] a;
  public Test(int age, int... a) {
    this.age = age;
    this.a = a;
  }
  static void printMe(int i, int... me){
    for(int k : me)
      System.out.print(k + " ");
    System.out.println("i: " + i);
  }
  public void printMe(){
    for(int k : a)
      System.out.print(k + " ");
    System.out.println("age: " + age);
  }
  public int[] getMe(){
    return this.a;
  }
}

public class VariableArgumentTest {
  public static void main(String args[]){
    Test t = new Test(1, 2, 3, 4);
    Test.printMe(1, 2, 3, 4);
    t.printMe();
    t.printMe(1, 2, 3, 4);
    int[] x = t.getMe();
    System.out.println();
    for(int i : x)
      System.out.println(i);
  }
}
