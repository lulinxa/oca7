public class Emp {
  String name;
  int age;
  Emp() {
    age = 22;
  }
  public void setName(String n){
    name = n;
  }
  public void printEmp(){
    System.out.println("Emp: " + name + " age: " + age);
  }
  public int daysOffWork(int... days) {
    int daysOff = 0;
    for (int i = 0; i < days.length; i++)
      daysOff += days[i];
    return daysOff;
  }

}
