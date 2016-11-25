package imran.learnings.designpatterns.simulation;


/**
 * This is class models the different types of person visits the
 * Deutsche Bahn
 * e.g
 * A.Traveller -> whos os the prime guy
 * B. Deustche Bahn Sicherheit -> who ensures the safety in the system
 * C. DB staff-> they assist the whole things(tickets, ticket check, cleaning et al)
 * //TODO Will add more as I experinece the journey
 *
 * @author enomoha
 */
public interface Person
{
    public Boolean needTicket();

}
