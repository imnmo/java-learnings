package com.Imran.learnings.hackerrank;
// This is a "method-only" submission. 
// You only need to complete this method. 

import com.Imran.learnings.singlylinkedLists.Node;

class PrintNode
{
    void Print(Node head)
    {
        while (head != null)
        {
            if (head.next == null)
            {
                return;
            }
            System.out.println("the data is " + head.data);
            head = head.next;
        }
    }
}

  
