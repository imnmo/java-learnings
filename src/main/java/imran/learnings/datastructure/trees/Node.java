package imran.learnings.datastructure.trees;

/**
 * Created by enomoha on 20.09.2016.
 */

/**
 * This is the node for the tree
 */
public class Node
{
    public int data;
    public Node leftChild;
    public Node rightChild;

    /**
     * This is a plain method just to print the contents of the Node i.e data
     */
    public void printNodes()
    {
        System.out.println("The node contains the following item" + data);
    }
}
