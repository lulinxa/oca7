class OfficeInter {
  public static void main(String args[]){
    Interviewer inter = new HRExecutive();

    inter.specialization = new String[] {"Staffing"};
    System.out.println(inter.specialization[0]);

    inter.name = "NAME";
    System.out.println(inter.name);

    inter.conductInterview();
  }
}
