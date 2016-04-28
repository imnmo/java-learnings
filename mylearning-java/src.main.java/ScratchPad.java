
/**
 * This class is basically a scratch pad for fuzzy things which need to tested sytactically in Java
 * @author enomoha
 *
 */
public class ScratchPad
{

    /**
     * just an smaple method
     */
    private void sampleMethod()
    {
        System.out.println("here we go...");
    }
    
    
    //Add some static blocks and it acts a driver to load the stuff
    static
    {
        System.out.println("just try some static blocks");
        ScratchPad myScratchPad = new ScratchPad();
        myScratchPad.sampleMethod();
    }
    
    public static void main(String[] args) {

//        String myString = null ; //What happens if the string is assigned null
//        System.out.printf("myString: %s", myString);
//        myString.equals(myString);


    }

}
