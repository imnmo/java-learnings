import java.math.BigDecimal;
import java.util.Scanner;

/**This program will generate PI for a given number,
 * upto many decimal places.
 *
 * @author enomoha
 *
 */
public class piFinder {

    private double _inputValue=0d;
    private static final double PI = Math.PI;
    Scanner input = new Scanner(System.in);
    private double _outputValue = 0d;

    /**
     *
     * This method expects an input user integer input,
     * else error message  is thrown
     */
    public void getInput(){

        try{
        System.out.println("Please Enter a value:");
        _inputValue = input.nextDouble();
        }
        catch(Exception ex){
            System.out.println("NO OR WRONG USER INPUT");
        }
        finally {
            input.close();
        }

        generatePI(_inputValue);
        }

    /** Calls enterprise or Scientific
     *  version
     * @param pInputValue
     */
    public void generatePI(double pInputValue){

        generatePIEnterprise(pInputValue);
        generatePIScientific(pInputValue);

    }

    /** Enterprise version with BigDecimal
     * where BigDecimal is used for
     * precise and accurate results
     * @param pInputValue
     * @return BigDecimal
     */
    public BigDecimal generatePIEnterprise(double pInputValue){

        int __output = 0;
        //Generate PI value for the number
        __output = (int) (pInputValue * PI) ;
        BigDecimal oValue = new BigDecimal(__output);
        System.out.println("Your Value Rounded off: " + oValue);
        return oValue;
    }

    /** Scientific version with double or float
     *  where more number of digits be present
     * @param pInputValue
     * @return double
     */
    public double generatePIScientific(double pInputValue){

        //Generate PI value for the number
        _outputValue = (pInputValue * PI) ;
        System.out.println("Your Value Precisly: " + _outputValue);
        return _outputValue;
    }
}

