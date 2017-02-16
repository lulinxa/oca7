class SimpleStiwch {
  public static void main(String args[]) {
    int marks = 10;
    switch (marks) {
      case 10: System.out.println(10);
        break;
      case 20: System.out.println(20);
        break;
      case 30: System.out.println(30);
        break;
      default: System.out.println("default");
        break;
    }

    String day = "BLA";
    switch (day) {
      case "MON":
      case "TUE":
      case "WED":
      case "THU": System.out.println("Time to work");
                  break;
      case "FRI": System.out.println("Nearing weekend");
                  break;
      case "SAT":
      case "SUN": System.out.println("Weekend!");
                  break;
      default: System.out.println("Invalid day?");
    }
    
    String day1 = new String("THU");
    switch (day1) {
      case "MON":
      case "TUE":
      case "WED":
      case "THU": System.out.println("Time to work");
                  break;
      case "FRI": System.out.println("Nearing weekend");
                  break;
      case "SAT":
      case "SUN": System.out.println("Weekend!");
                  break;
      default: System.out.println("Invalid day?");
    }

  }
}

/*

The if-else-if-else construct evaluates all of the conditions until
it finds a match. A switch construct compares the argument passed to it with
its labels.


switch uses equals to compare strings!!!!!!!

Watch out for questions in the exam that try to pass a primitive
decimal type such as float or double to a switch statement. Code that tries
to do so will not compile.

*/


