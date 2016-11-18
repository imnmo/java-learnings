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

    public void insertLast(int dd) // insert at end of list
    {
        Node newLink = new Node(dd); // make new link
        if (isEmpty()) // if empty list,
            first = newLink; // first --> newLink
        else
        {
            last.next = newLink; // old last --> newLink
            newLink.previous = last; // old last <-- newLink
        }
        last = newLink; // newLink <-- last
    }

    public void displayForward()
    {
        Node current = first; // start at beginning
        while (current != null) // until end of list,
        {
            current.displayLink(); // display data
            current = current.next; // move to next link
        }
    }

    // -------------------------------------------------------------
    public void displayBackward()
    {
        Node current = last; // start at end
        while (current != null) // until start of list,
        {
            current.displayLink(); // display data
            current = current.previous;
        }
    }

    public Node deleteFirst() // delete first link
    { // (assumes non-empty list)
        Node temp = first;
        if (first.next == null) // if only one item
            last = null; // null <-- last
        else
            first.next.previous = null; // null <-- old next
        first = first.next; // first --> old next
        return temp;
    }

    public Node deleteLast() // delete last link
    { // (assumes non-empty list)
        Node temp = last;
        if (first.next == null) // if only one item
            first = null; // first --> null
        else
            last.previous.next = null; // old previous --> null
        last = last.previous; // old previous <-- last
        return temp;
    }
}
