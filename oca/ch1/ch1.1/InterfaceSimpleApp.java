class SimpleImpl implements InterfaceSimple{
  public void changeChannel(int i){
    System.out.println("Channel: " + i);
  }
  public void increaseVolume(){
    System.out.println("Volume increased");
  }
  public void decreaseVolume(){
    System.out.println("Volume decreased");
  }

}

public class InterfaceSimpleApp {
  public static void main(String args[]){
    InterfaceSimple is = new SimpleImpl();
    System.out.println(is.name);
    // can't use is reference
    // must use InterfaceSimple
    InterfaceSimple.staticMethod();
    is.changeChannel(2);
    is.increaseVolume();
    is.decreaseVolume();
  }
}
