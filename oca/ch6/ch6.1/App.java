class App {
  public static void main(String args[]){
    Employee[] emps = new Employee[10];
    emps[0] = new Employee();
    emps[1] = new Programmer();
    emps[2] = new JavaArchitect();

    System.out.println(emps[0].myName());
    System.out.println(emps[1].myName());
    System.out.println(emps[2].myName());

    System.out.println(emps[0].myName());
    ((Programmer)emps[1]).accessBaseClassMembers();
    System.out.println(emps[1].myName());
    ((Programmer)emps[2]).accessBaseClassMembers();
    System.out.println(emps[2].myName());

  }
}

