public class ArrayCopy {
  public static void main(String args[]){
    int[] a = {1, 2, 3, 4, 5, 6};
    int[] b = new int[10];
    System.arraycopy(a, 1, b, 2, 5);
    System.out.print("[ ");
    for(int i : b)
      System.out.print("" + i + " ");
    System.out.print("]");
  }
}
