public class Office {
  public static void main(String[] args) {
    Employee e = new Employee("name");
    System.out.println(e.name);
    Employee em = new Manager("manager", 5);
    System.out.println(em.name);
  }
}
