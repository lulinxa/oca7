public class BankAccount {
  String acctNumber;
  int acctType;

  public boolean equals(Object anObject) {
    if(anObject instanceof BankAccount) {
      BankAccount b = (BankAccount)anObject;
      return (acctNumber.equals(b.acctNumber) && 
          acctType == b.acctType);
    } 
    else
      return false;
  }
}
