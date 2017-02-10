class ObjectLife1 {
  public static void main(String args[]) {
    Exam myExam = new Exam();
    myExam.setName("OCA Java Programmer 1");
    myExam = null;
    myExam = new Exam();
    myExam.setName("PHP");
  }
}
