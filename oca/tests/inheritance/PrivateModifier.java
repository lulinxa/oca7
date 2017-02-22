class X {
  X() {}
  private void one() {} // change from private to protected class will compile
}

public class PrivateModifier extends X {
  PrivateModifier() {}
  private void two() { one(); }
  public static void main(String args[]){
    new PrivateModifier().two();
  }
}
