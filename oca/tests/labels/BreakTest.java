public class BreakTest{
  public static void main(String[] args){
    int i = 0, j = 5;
    lbl: for(;;i++) {
      for(;;--j) if(i>j) break lbl;
    }
    System.out.println("i=" + i + ", j=" + j);
  }
}
