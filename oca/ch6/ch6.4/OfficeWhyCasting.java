public class OfficeWhyCasting {
  public static void main(String args[]) {
    Interviewer[] interviewers = new Interviewer[2];
    interviewers[0] = new Manager();
    interviewers[1] = new HRExecutive();
    for(Interviewer i : interviewers) {
      if(i instanceof Manager) {
        int teamSize = ((Manager) i).teamSize;
        if(teamSize > 10) {
          i.conductInterview();
        } else {
          System.out.println("Mgr can't interview with team size less than 10");
        }
      } else if (i instanceof HRExecutive) {
        i.conductInterview();
      }
    }

  }
}
