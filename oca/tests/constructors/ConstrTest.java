public class ConstrTest {
  public static void main(String args[]){
    //TestClass tc = new TestClass();
    //doens't work no defulat constructor
    //if there is user defined
    TestClass tc = new TestClass(1);
  }
}

class TestClass {
  TestClass(int i){
    System.out.println("Test");
  }
}
