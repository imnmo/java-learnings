package xMytrails;

public class CheckObjects {
    
    ObjectPumper localString = new ObjectPumper();

    private void setObj()
    {
        
        localString.lstring = "Mutate";
    }
    
    private void getObj(){
        System.out.println(localString.lstring);
        
    }
    
    public static void main(String[] args) {
        
        CheckObjects lCheckObj = new CheckObjects();
        lCheckObj.setObj();
        lCheckObj.getObj();
    }

}
