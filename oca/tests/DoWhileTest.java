public class DoWhileTest {
  public static void main(String args[]){
    String[] table = {"aa", "bb", "cc"};
    int ii = 0;
    do
      while(ii < table.length)
        System.out.println(ii++);
    while(ii<table.length);
  }
}
