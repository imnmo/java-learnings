package xMytrails;

public class PaperBoy {
    
    
   private final static float myPay= 9; // “I want my two dollars!”
    
    public  static void main(String args[]){
        // code from some method inside the Paperboy class...
        Customer myCustomer = new Customer();
        Wallet theWallet = myCustomer.getWallet();
        
        if (theWallet.getTotalMoney() > myPay) {
        theWallet.subtractMoney(myPay);
        System.out.println("You goz it");
        } else {
            System.out.println("come back later it"); // come back later and get my money
        }

        
    }

}
