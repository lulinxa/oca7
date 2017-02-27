public class IntAssignedToFloat {
  public static void main(String args[]){
    float f = -123;
    /*
     * you cant -123.0 assign to float
     * -123.0 is double
     */
    //float f = -123.0;
    float ff = -123.0f; // or -123.0F
    float fff = (float)-123.0;
    System.out.println(f);
    System.out.println(ff);
    System.out.println(fff);
  }
}
