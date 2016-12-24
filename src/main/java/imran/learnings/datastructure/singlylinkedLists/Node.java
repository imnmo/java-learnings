package imran.learnings.datastructure.singlylinkedLists;

/**
 * Created by ${User} on 28.10.2016.
 */
public class Node
{

    public int data; // data item (key)
    public Node next; // next link in list
    
    public Node(int id) // constructor
    {
        data = id; // initialize data
    }

    public void displayLink() // display ourself
    {
        System.out.print(data);
    }
}
