package imran.learnings.datastructure.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * The Node class
 */
public class Node
{

    public String stationName;
    Node leftChild;
    Node rightChild;

    public Node(String stationName, Node firstChild, Node secondChild)
    {
        this.stationName = stationName;
        this.leftChild = firstChild;
        this.rightChild = secondChild;
    }

    public List<Node> getChildren()
    {
        List<Node> childNodes = new ArrayList<>();
        if (this.leftChild != null)
        {
            childNodes.add(leftChild);
        }
        if (this.rightChild != null)
        {
            childNodes.add(rightChild);
        }
        return childNodes;
    }
}

