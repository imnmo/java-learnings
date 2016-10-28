
package com.Imran.learnings.realworldproblems;

/**
 * This class applies to the type of the person who visits the
 * DB and wish to travel not just stay
 *
 * @author enomoha
 */
public class Traveller implements Person

{

    /**
     * Basic check to say if traveller needs a ticket or not
     * Default all who visit station may not need ticket
     */
    @Override
    public Boolean needTicket()
    {
        return false;
    }
}
