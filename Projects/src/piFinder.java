import java.math.BigDecimal;
import java.util.Scanner;

/*
 * This program will generate PI for a given number,
 * upto many decimal places.
 *
 * @author: mohamedi
 *
 */

public class piFinder {

    private double inputValue=0;
    private static final double PI = Math.PI;
    Scanner input = new Scanner(System.in);
    private double outputValue = 0d;
    private BigDecimal piValue=new BigDecimal(0);
    /**
     *
     * This method expects an input user integer input,
     * else error message  is thrown
     */
    public void getInput(){

        try{
        System.out.println("Please Enter a value:");
        inputValue = input.nextDouble();
        }
        catch(Exception ex){
            System.out.println("NO OR WRONG USER INPUT");
        }
        finally {
            input.close();
        }
        //Generate PI value for the number
        outputValue = (inputValue * PI) ;
        System.out.print(outputValue);
//        piValue = new BigDecimal(outputValue);
//        System.out.print(piValue);

    }

}
