public class ArraysTest {
  public static void main(String args[]){
    int[][] array2D = {{0,1,2,4},{4,6}};
    for(int[] a : array2D)
      for(int i : a)
        System.out.print(i);
    /*
     * illegal instatiation
     * 
     */
    //int[][] array2D1 = new int[][2];
    /*
     * wrong size on right side, 
     * javac => int cann't be converted to array
     */
    //int[][][] array3D = {{0,1},{2,3},{4,5}};
    //int[][] array2D2 = {0,1};
    int[] array = {0,1};
    int[][][] array3D = new int[2][2][2];
    array3D[0][0] = array;
    array3D[0][1] = array;
    array3D[1][0] = array;
    array3D[1][1] = array;
    for(int[][] a : array3D)
      for(int b[] : a)
        for(int i : b)
          System.out.println(i);
  }
}
