package Algorithms;

/**
 *
 * @author enomoha
 *
 * Basically the sum pairs and the dice rollings are in a way similar
 */

public class SumPairs {


    public void generateSumPairs(int inputArray[], int sumValue)
    {
        //Use the traditional complete control loop
        for(int i = 0; i < inputArray.length ; ++i){
            for(int j = 0; j < inputArray.length ; ++j)
            {

                int summer =0;
                summer = inputArray[i] + inputArray[j];
                if (summer == sumValue)
                {
                    System.out.println("Summer" + summer);
                    System.out.println("Bingo");
                }
                }
            }
        }

    }
