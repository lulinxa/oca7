public class Student {
  private double m1, m2, m3;
  private double maxMark = 100;
  public double getAvarage() {
    double avg = 0;
    avg = ((m1 + m2 + m3) / (maxMark * 3) * 100);
    return avg;
  }
  public void setAverage(double var) {
    /* avg is out of scope */
    avg = var;
  }
}

/*

   EXAM TIP The local variables topic is a favorite of OCA Java SE 7 Programmer
I exam authors. You’re likely to be asked a question that seems to be about a
rather complex topic, such as inheritance or exception handling, but in fact
it’ll be testing your knowledge on the scope of a local variable.


*/

class Phone {
  private boolean tested;
  public void setTested(boolean val) {
    tested = val;
  }
  public void isTested() {
    val = false;
    return tested;
  }
}

class MyPhone {
  static boolean softKeyboard = true;
  boolean softKeyboard = true;
  void myMethod(int weight) {
    int weight = 10;
  }
}
