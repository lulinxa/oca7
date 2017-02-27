public class BSIL{
  public static void main(String args[]) {
    byte b = 10;
    short s = 12;
    int i = 33;
    long l = 123;

    /*
     * b*b yields int so it wan't compile 
     * (trying to assign int to byte)
     */
    // b = b * b; 

    /*
     * this will compile
     * read as b = (byte)(b*b);
     */
    b *= b;
    //b = (byte)(b * b);
    // this doesnt work
    //b = (byte)b*b
    
    // smaller type can go into larger type
    // without explicit cast 
    // no need for (long)(b * b);
    l = b * b;

    ;
    System.out.println(b);
    System.out.println(l);
  }
}

