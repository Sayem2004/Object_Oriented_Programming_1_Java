public class Mobile {

  String mobileOwnerName;
  String mobileNumber;
  String mobileBalance;
  String mobileOSName;
  boolean lock;

  Mobile(){}

  Mobile(String mobileOwnerName, String mobileNumber,
  String mobileBalance, String mobileOSName, boolean lock) {
    this.mobileOwnerName = mobileOwnerName;
    this.mobileNumber = mobileNumber;
    this.mobileBalance = mobileBalance;
    this.mobileOSName = mobileOSName;
    this.lock = lock;
  }

  public void showInfo() {
    if(lock == false) {
      System.out.println("Mobile Owner: " + this.mobileOwnerName);
      System.out.println("Mobile Number: " + this.mobileNumber);
      System.out.println("Mobile Balance: " + this.mobileBalance);
      System.out.println("Mobile OS: " + this.mobileOSName);
    }
  }

  public void callSomeone(int timeDuration) {
    if(lock == false){
      System.out.println("Total Cost of the call: " + timeDuration /  60 * 1);
    }
  }

  public static void main(String args[]) {
    Mobile MB = new Mobile("Alvarez", "0187466296", "15.60", "Android", false);
    MB.showInfo();
    MB.callSomeone(769);
	}
}