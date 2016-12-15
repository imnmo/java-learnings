package imran.learnings.math;

/**
 * Created by enomoha on 05.09.2016.
 */
public class Money
{
    public boolean isPositive()
    {
        Integer myInteger = Integer.valueOf(7);
        int myInt = 0;
        System.out.println(Math.signum(myInt) > 0);
        return Math.signum(myInt) > 0;
    }

    public static void main(String... args)
    {
        Money myMoney = new Money();
        System.out.println(myMoney.isPositive());
    }
}
