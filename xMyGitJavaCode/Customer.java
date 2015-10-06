package xMytrails;

public class Customer {
    
    private String firstName;
    private String lastName;
    private Wallet myWallet= new Wallet();
    
    
    public String getFirstName(){
        
        return firstName;
    }
    public String getLastName(){
        
        return lastName;
    }
    
    public Wallet getWallet(){
        
        return myWallet;
        
    }
    }


