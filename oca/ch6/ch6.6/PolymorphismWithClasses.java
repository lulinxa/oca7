class PolymorphismWithClasses {
  public static void main(String[] args){

    Employee e1 = new Programmer();
    Employee e2 = new Manager();
    e1.reachOffice();
    e2.reachOffice();

    e1.startProjectWork();
    e2.startProjectWork();
  }
}
