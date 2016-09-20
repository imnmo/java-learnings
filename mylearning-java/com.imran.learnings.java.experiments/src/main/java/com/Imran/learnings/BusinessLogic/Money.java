package com.Imran.learnings.BusinessLogic;

/**
 * Created by enomoha on 05.09.2016.
 */
public class Money
{


    public boolean isPsitive()
    {
        Integer myInteger = Integer.valueOf(7);

        int myINt = 0;


        System.out.println(Math.signum(myINt) > 0);

        return Math.signum(myINt) > 0;

    }

    public static void main(String... args)
    {

        Money myMoney = new Money();
        System.out.println(myMoney.isPsitive());


    }
}
