package imran.learnings.datastructure.singlylinkedLists;

/**
 * Created by ${User} on 28.10.2016.
 */
public class LinkedLists
{

    private Node first; // ref to first link on list
    private Node last; // ref to last link

    // -------------------------------------------------------------
    public LinkedLists() // constructor
    {
        first = null; // no items on list yet
        last = null;
    }

    // -------------------------------------------------------------
    public boolean isEmpty() // true if list is empty
    {
        return (first == null);
    }

    public void insertFirst(int id)
    { // make new lin
        Node newLink = new Node(id);
        if (isEmpty())
            last = newLink;  //update last link

        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }

    public void insertLast(int dd) // insert at end of list
    {
        Node newLink = new Node(dd);
        if (isEmpty())
        {// if empty list,
            first = newLink; // first --> newLink
        }
        else
        {
            last.next = newLink; // old last --> newLink
            last = newLink; // newLink <-- last
        }
    }

    public Node deleteFirst() // delete first item
    { // (assumes list not empty)
        Node temp = first; // save reference to link
        first = first.next; // delete it: first-->old next
        return temp; // return deleted link
    }

    public Node delete(int key) // delete first item
    {
        if (isEmpty())
            throw new IllegalStateException();


        Node current = first; // algorithms for link
        Node previous = first;
        while (current.data != key)
        {
            if (current.next == null)
                return null; // didn’t find it
            else
            {
                previous = current; // go to next link
                current = current.next;
            }
        }
        if (current == first) // if first link,
            first = first.next; // change first
        else // otherwise,
            previous.next = current.next; // bypass it
        return current;
    }

    public Node find(int key) // find link with given key
    { // (assumes non-empty list)
        Node current = first; // start at ‘first’
        while (current.data != key) // while no match,
        {
            if (current.next == null) // if end of list,
                return null; // didn’t find it
            else // not end of list,
                current = current.next; // go to next link
        }
        return current; // found it
    }
// -------------------------------------------------------------

    public void displayList()
    {
        Node temp = first;
        while (temp != null) // until end of list,
        {
            temp.displayLink(); // print data
            temp = temp.next; // move to next link
        }
    }
}




