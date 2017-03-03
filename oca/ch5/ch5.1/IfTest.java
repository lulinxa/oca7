class IfTest {
  public static void main(String[] args) {
    boolean isIt = true;
    if(isIt = false)
      System.out.println("It si true that assignin false in if statemen yields true");
    else
      System.out.println("It is FALSE to assume that assigning false in if statement yields TRUE");

    System.out.println("It first assigns value to boolean variable and then it evaluates it");



    int i = 10;
    if(i++ == 11)
      System.out.println("First adds and then comapres");
    else
      System.out.println("First comapre and then add");
      System.out.println("i = :" + i );

    if(++i == 12)
      System.out.println("unary prefix first then evaluates");
    
    //DOESN'T COMPILE
    /*
      if((++(i = 15)) == 16)
      System.out.println(i);
     */

    boolean itIs = true;
    if(itIs = false)
      System.out.println("This shouldn't print");
    else
      System.out.println("This should print");
  }
}
