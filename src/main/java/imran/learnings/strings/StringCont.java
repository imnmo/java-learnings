package imran.learnings.strings;

/**
 * This class does the string performance on concatanation
 *
 * @author enomoha
 */
public class StringCont
{
    /**
     * this method does the String concatnation using '+' with perf analysis
     * <p>
     * The complexity goes to O(n2) -- pretty much quadratic
     */
    protected void StringConcatnate()
    {
        //String result;// Pretty much wrong way to do-- DONT DO THAT
        String result = "";
        int numOfItems = 1000;


        long startTime = System.nanoTime();
        for (int i = 0; i < numOfItems; i++)
        {
            result += "add";
        }
        long endTime = System.nanoTime();
        System.out.println("Your time at end concat: " + (endTime - startTime));
    }

    /**
     * This is one is with the String builder uses
     * is far better than the above
     * O(1)
     */
    protected void StringConcatnateWithBuilder()
    {
        int numOfItems = 1000;

        StringBuilder result = new StringBuilder();

        long startTime = System.nanoTime();
        for (int i = 0; i < numOfItems; i++)
        {
            result.append("add");
        }
        long endTime = System.nanoTime();
        System.out.println("Your time at end bulder: " + (endTime - startTime));
    }
}
