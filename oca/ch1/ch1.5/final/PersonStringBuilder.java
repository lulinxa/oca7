public class PersonStringBuilder {
  final StringBuilder name = new StringBuilder("MyName ");
  public static void main(String args[]){
    PersonStringBuilder psb = new PersonStringBuilder();
    /*
     * It’s easy to confuse reassigning a value to a final variable 
     * with calling a method on a final variable. 
     * If a reference variable is defined as a final variable, 
     * you can’t reassign another object to it, 
     * but you can call methods on this variable:
     */
    System.out.println(psb.name);
    psb.name.append("Surname.");
    System.out.println(psb.name);
  }
}
