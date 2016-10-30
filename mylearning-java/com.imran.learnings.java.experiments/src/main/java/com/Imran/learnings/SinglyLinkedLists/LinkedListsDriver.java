package com.Imran.learnings.singlylinkedLists;

/**
 * Created by ${User} on 28.10.2016.
 */
public class LinkedListsDriver
{

    public static void main(String[] args)
    {
        LinkedLists theList = new LinkedLists(); // make new list
        theList.insertFirst(22); // insert four items
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.displayList(); // display list

        Node foundNode = theList.find(44); // find item
        if (foundNode != null)
            System.out.println("The node you want to find:" + foundNode.data);
//        Node d = theList.delete(22); // delete item


        //insert at the last
        theList.insertLast(11); // insert at rear
        theList.insertLast(33);
        theList.insertLast(55);


        theList.deleteFirst();
        theList.displayList();
    }
}
