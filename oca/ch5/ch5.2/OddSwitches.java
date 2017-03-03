public class OddSwitches {
  public static void main(String args[]){
    int i = 10;

    //valid
    switch(i){}
    //valid
    switch(i){
      case 10:
    }

    // invalid duplicate case label
    switch(i){
      case 10:
      // duplicate case label  
      //case 10:
    }
  }
}
