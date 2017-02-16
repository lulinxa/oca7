public class DemonstrateFor {
  public static void main(String args[]) {
    int ctr = 12;
    for ( int j=10, k=14;
          j <= k;
          ++j, k=k-1, ctr--)
    {
      System.out.println(j+":"+k+":"+ctr);
    }
  }
}
