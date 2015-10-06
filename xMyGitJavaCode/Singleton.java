package xMytrails;

public class Singleton {

    
    private static Singleton _Instance;
    
    private Singleton(){
    }
    
    
    public static Singleton getInstance()
    {
        if(_Instance == null)
        {
            _Instance = new Singleton();
        }
        
        return _Instance;
    }
}
