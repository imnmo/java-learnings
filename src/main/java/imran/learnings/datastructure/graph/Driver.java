package imran.learnings.datastructure.graph;

import java.util.List;

/**
 * Our main driver class which instantiates some example nodes
 * and then performs the breadth first search upon these newly created
 * nodes.
 */
public class Driver
{

    public static void main(String args[])
    {
        Node node1 = new Node("A", null, null);
        Node node2 = new Node("B", node1, null);
        Node node3 = new Node("C", node2, node1);


        BreadthFirstSearch bfs = new BreadthFirstSearch(node2, node1);

        List<Node> myBfs = bfs.compute();
        for (Node node : myBfs)
        {
            if (node.leftChild.stationName.equals("Westminster"))
                System.out.println(node.leftChild.stationName);
        }
    }

}
