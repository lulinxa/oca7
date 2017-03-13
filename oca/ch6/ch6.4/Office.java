public class Office {
  public static void main(String[] args) {
    Interviewer interviewer = new HRExecutive();
    // compile time error
    // interviewer.specialization = new String[] {"Staffing"};
    ((HRExecutive) interviewer).specialization = new String[]{"Staffing"};

  }
}
