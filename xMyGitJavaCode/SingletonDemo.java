package xMytrails;

public class SingletonDemo {
    
    public static void main(String args[])
    {
        
        Singleton DummyObj = Singleton.getInstance();
        if (DummyObj instanceof Singleton )
        {
            System.out.println("You made Singleton Sucessfully");
            
        }
    }


}
