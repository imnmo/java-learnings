package imran.learnings.datastructures.doublylinkedlists;

/**
 * Created by ${User} on 17.11.2016.
 */
public class Node
{
    public long data; // data item
    public Node next; // next link in list
    public Node previous; // previous link in list

    // -------------------------------------------------------------
    public Node(int pData) // constructor
    {
        data = pData;
    }

    // -------------------------------------------------------------
    public void displayLink() // display this link
    {
        System.out.print(data + "");
    }
}
