class Person {
  int i;
  short j;
  Person(int i, short j) {
    this.i = i;
    this.j = j;
  }
  public byte getWeight(){
    return this.weight;
  }
  public void setWeight(byte b){
    this.weight = b;
  }
  byte weight = 0;
  public String toString(){
    return "Person " + i + " " + j + " " + weight;
  }
}

public class VariablesAfterMethods {
  public static void main(String args[]){
    Person p = new Person(4, (short)2);
    System.out.println(p);
    p.setWeight((byte)2);
    System.out.println(p);
    p.i = 10;
    p.j = 11;
    System.out.println(p);
  }
}
