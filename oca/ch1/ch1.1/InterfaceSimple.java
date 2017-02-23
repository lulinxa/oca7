interface InterfaceSimple {
  /*
   * can define constants and methods
   */
  static String name = "reciever";
  static void staticMethod(){
    System.out.println("TEST");
  }
  void changeChannel(int i);
  void increaseVolume();
  void decreaseVolume();
}
