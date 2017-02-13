package imran.learnings.datastructure.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * basic breadth first search in java
 */
public class BreadthFirstSearch
{
    Node startNode;
    Node goalNode;

    public BreadthFirstSearch(Node start, Node goalNode)
    {
        this.startNode = start;
        this.goalNode = goalNode;
    }

    public List<Node> compute()
    {
        if (this.startNode.equals(goalNode))
        {
            System.out.println("Goal Node Found!");
            System.out.println(startNode.stationName);
        }

        Queue<Node> queue = new LinkedList<>();
        List<Node> explored = new ArrayList<>();
        queue.add(this.startNode);
        explored.add(startNode);

        while (!queue.isEmpty())
        {
            Node current = queue.remove();
            if (current.equals(this.goalNode))
            {
  
                return explored;
            }
            else
            {
                if (current.getChildren().isEmpty())
                    return Collections.emptyList();
                else
                    queue.addAll(current.getChildren());
            }
            explored.add(current);
        }

        return Collections.emptyList();
    }

}
