public class WhileLoop{
  public static void main(String args[]){
    boolean b = false;
    // this works, placeing ';' in new line is OK
    do {
      System.out.println("; in new line in do while loop");
    } while(b)
    ;

    do
      System.out.println("YeeeHaaw");
    //System.out.println("NO COMPILE");
    while(false)
    ;


    boolean a = true;
    System.out.println("GO into while loop");
    while(a)
      if(a)
        a = false; 
        System.out.println("Out of the while loop");
    

    /*
     * below code doesn't compile
     *
     * statements are unreachable
     */
    /*
    while(false){
      System.out.println("not reachable");
    }

    for(;false;){
      System.out.println("not reachable");
    }
    */
    if(false){
      System.out.println("false");
    } else {
      //break; -> break outside switch or loop :D
      System.out.println("true");
    }

    String[] p = {"Outer", "Inner"};
    for (String outer : p)
      for (String inner : p){
        if( inner.equals("Inner"))
          break;
        //System.out.print(inner + ":");
        System.out.print(outer + ":");
      }
  }
}
