public class DemonstrateFor {
  public static void main(String args[]) {
    int ctr = 12;
    for ( int j=10, k=14;
          j <= k;
          ++j, k=k-1, ctr--)
    {
      System.out.println(j+":"+k+":"+ctr);
    }

    // valid definition of for loop
    for(;;){
      System.out.println("Infinite loop");
      break;
    }
    System.out.println("Out of oo loop");

    for(int hrs = 0; hrs <= 23; hrs++)
      for(int min = 1; min <= 60; min++)
        System.out.println(hrs + ":" + min);
    
    System.out.println("Infinite loop ;) for(;;){}");
    //valid 
    // for(;;);
    //valid but unreachable NOT COMPILED if upper statment uncommented
    for(;;){}
  }
}
