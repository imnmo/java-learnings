package com.Imran.learnings.trees;

/**
 * An experimental tree in specific binary search tree class speaking about the
 */


public class BinaryTrees
{
    Node root = null; //the root node

    /**
     * The logic for the insertion of the key into the tree
     *
     * @param pKey
     */

    public void insert(int pKey)
    {
        Node newNode = initializeNode(pKey);
        Node current;
        //No root node is existing then update it to root
        if (root == null)
        {
            root = newNode;
        }
        else
        {
            current = root;
            //Keep inserting
            insertItems(pKey, current, newNode);
        }
    }

    /**
     * Creates and initializes the node
     *
     * @param pKey
     * @return
     */
    private Node initializeNode(int pKey)
    {
        Node parent;
        Node current;
        Node newNode = new Node();
        newNode.data = pKey; //Update the newly created node witn the key or data 
        return newNode;
    }

    /**
     * Insert the elements into the tree
     *
     * @param pKey
     * @param current
     * @param newNode
     */
    private void insertItems(int pKey, Node current, Node newNode)
    {
        Node parent;
        while (true)
        {
            //Update the parent
            parent = current;
            if (pKey < current.data)
            {
                current = current.leftChild;
                if (current == null)
                {
                    parent.leftChild = newNode;
                    return;
                }
            }
            else if (pKey > current.data)
            {
                current = current.rightChild;
                if (current == null)
                {

                    parent.rightChild = newNode;
                    return;
                }
            }
        }
    }

    /**
     * The logic to find the search within the BST
     *
     * @param pKey
     */

    public Node find(int pKey)
    {
        Node current = root;
        while (current.data != pKey)
        {
            if (pKey < current.data)
            {
                current = current.leftChild;
            }
            if (pKey > current.data)
            {
                current = current.rightChild;
            }
            if (current == null)
            {
                return null;
            }
        }
        return current;

    }

    /**
     * The logic to delete the key from the BST
     */

    public void delete(int pKey)
    {
    }

    /**
     * The traverse logic for the tree
     * inorder, preorder and post order
     */
    public static void traverse()
    {
    }

}
