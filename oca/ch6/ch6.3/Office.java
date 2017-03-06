class Office {
  public static void main(String[] args){
    HRExecutive hr = new HRExecutive();

    hr.specialization = new String[] {"Staffing"};
    System.out.println(hr.specialization[0]);

    hr.name = "NAME";
    System.out.println(hr.name);

    hr.conductInterview();
  }
}
