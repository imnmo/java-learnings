package Strings;

/**
 *
 * This class does the string performance on concattanation
 * @author enomoha
 *
 */
public class StringCont

{
    /**
     *
     * this method does the String concatnation and perf analysis
     */
    protected void StringConcatnate()
    {
        //String result = new String ("l");// Pretty much wrong way to do
        String result = " ";
        int numOfItems=100;

        for (int i = 0; i < numOfItems ; i ++)
        {
            long startTime = System.nanoTime();
            System.out.println("Your time : " + startTime);
            result += "add";
            System.out.println(result);
            long endTime = System.nanoTime();
            System.out.println("Your time at end: " +( endTime - startTime));
        }



    }




}
