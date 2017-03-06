class FallInRiverException extends Exception {}
class DropOarException extends Exception {}

class RiverRafting {
  void crossRapid(int degree) throws FallInRiverException {
    System.out.println("Cross Rapid");
    if(degree > 10) throw new FallInRiverException();
  }
  void rowRaft(String state) throws DropOarException {
    System.out.println("Row Raft");
    if(state.equals("nervous")) throw new DropOarException();
  }
}

public class RiverRaftingApp {
  public static void main(String[] args){

    RiverRafting rr = new RiverRafting();

    try {
      rr.crossRapid(7);
      rr.rowRaft("nervous");
      System.out.println("Enjoy River Rafting");
    } catch (FallInRiverException e) {
      System.out.println("Get back in the raft");
    } catch (DropOarException e) {
      System.out.println("Do not panic");
    } finally {
      System.out.println("Pay sport");
    }

    System.out.println("After the try block");

  }

 }
