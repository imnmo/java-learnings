package com.Imran.learnings.numbers;


/**
 * This program calculates the GCD for
 * a given numbers
 * <p>
 * a recursive Euclid way for solving
 */

public class GCDCalculator
{
    public int GCDCalculatorValue(int a, int b)
    {
        if (b == 0)
            return a;
        int remainder = a % b;
        return (GCDCalculatorValue(b, remainder));
    }
}
