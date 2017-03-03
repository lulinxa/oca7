class SwitchWOBreak {
  public static void main(String args[]) {
    int score = 50;
    int result = 10;
    
    switch (score) {
      case 100: result = 0;
      case 50: result = 1;
      case 10: result = 2;
      case 5: result = 4;
      //default: result = 3;
    }
    System.out.println(result);

    score = 49;
    switch (score) {
      case 100: result = 0;
                break;
      case 50: result = 1;
               break;
      case 10: result = 2;
               break;
      default: result = 3;
    }
    System.out.println(result);
  }
}
