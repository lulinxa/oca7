public class Speak {
  public static void main(String args[]){
    Speak s = new Tell();
    Tell t = new Tell();

    //s.tellIt();
    //(Truth)s.tellIt();
    ((Truth)s).tellIt();

    t.tellIt();
    //(Truth)t.tellIt();
    ((Truth)t).tellIt();

  }
}
class Tell extends Speak implements Truth {
  public void tellIt() {
    System.out.println("Right on!");
  }
}
interface Truth { public void tellIt(); }
