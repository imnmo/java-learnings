package com.Imran.learnings.Numbers;

/**
 * This class generates the fibonacci numbers
 * for the given sequence
 *
 * @author enomoha
 */


public class FibonacciGenerator
{
    public int fibonacci(int n)
    {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String args[])
    {
        FibonacciGenerator myFibonacciGenerator = new FibonacciGenerator();
        int myfibo = myFibonacciGenerator.fibonacci(8);
        System.out.println(myfibo);
    }

}
