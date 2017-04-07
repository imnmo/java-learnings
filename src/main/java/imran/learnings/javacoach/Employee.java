package imran.learnings.javacoach;

/**
 * Created by enomoha on 06.04.2017.
 */
public class Employee extends StaffMember
{

    private double payRate;
    @Override
    public double pay()
    {
        return payRate;
    }
}
