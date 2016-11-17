package com.Imran.learnings.doublylinkedlists;

/**
 * Created by ${User} on 17.11.2016.
 */
public class DoublyLinkedLists
{
    private Node first; // ref to first item
    private Node last; // ref to last item

    public DoublyLinkedLists() // constructor
    {
        first = null; // no items on list yet
        last = null;
    }

    public boolean isEmpty() // true if no links
    {
        return first == null;
    }

    public void insertFirst(int dd) // insert at front of list
    {
        Node newLink = new Node(dd); // make new link
        if (isEmpty())
        {
            last = newLink; // newLink <-- last 
        }
        else
        {
            first.previous = newLink; // newLink <-- old first
        }
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }
}
