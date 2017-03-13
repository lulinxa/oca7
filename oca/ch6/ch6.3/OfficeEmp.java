class OfficeEmp {
  public static void main(String args[]){
    Employee emp = new HRExecutive();

    emp.specialization = new String[] {"Staffing"};
    System.out.println(emp.specialization[0]);

    emp.name = "NAME";
    System.out.println(emp.name);

    emp.conductInterview();
  }
}
