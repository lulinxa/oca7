package titt;
class Phone {
  String phoneNumber = "123456789";
  void setNumber() {
    String phoneNumber;
    this.phoneNumber = "987654321";
  }
}
class TestPhone {
  public static void main(String[] args) {
    Phone p = new Phone();
    p.setNumber();
    System.out.println(p.phoneNumber);
  }
}
