class Exam {
  public int[] myVariable = {3, 4, 5};
  public int setupVar(int... test) {
    return test[0];
  }
}

public class TestVarArgs {
  final public static void main(String... args) {
    Exam myExam = new Exam();
    int[] result;
    result = myExam.setupVar({6, 3, 5, 7});
    //for(int i : result) {
      System.out.print(result);
    //}
  }
}

