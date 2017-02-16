import java.util.ArrayList;
public class TestBank {
  public static void main(String args[]) {
    BankAccount b1 = new BankAccount();
    b1.acctNumber = "02468";
    b1.acctType = 4;
    BankAccount b2 = new BankAccount();
    b2.acctNumber = "02468";
    b2.acctType = 4;

    ArrayList<BankAccount> list = new ArrayList<>();
    list.add(b1);

    System.out.println(list.contains(b2));
  }
}
