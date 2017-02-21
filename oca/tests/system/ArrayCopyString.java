public class ArrayCopyString {
  public static void main(String args[]){
    long startTime = System.nanoTime();
    String[] a = {"a", "b", "c", "d", "e", "f"};
    String[] b = new String[]{"aa", "bb", "cc", "dd", "ee", "ff"};
    System.arraycopy(a, 2, b, 2, 2);
    System.out.print("[ ");
    for(String s : b)
      System.out.print(s + " ");
    System.out.print("]");
    System.out.println();
    System.out.println((System.nanoTime() - startTime) / 1000000.0 + "ms");
  }
}
