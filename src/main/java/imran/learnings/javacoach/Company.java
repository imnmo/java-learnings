package imran.learnings.javacoach;

import java.util.ArrayList;
import java.util.List;


public class Company
{
    private List<StaffMember> staffMemberList = new ArrayList<>();
    /**
     *
     * returns the employee
     * @return double
     */
    public double payStaff()
    {
        double payments = 0.0;
        for(StaffMember staffMember: staffMemberList)
        {
            payments = staffMember.pay();
        }
        return payments;
    }
}
