package imran.learnings.datastructure.graphs;

import imran.learnings.datastructure.stacks.AbstractStackImpl;

/**
 * A simple graph model to represent the vertices and edges
 */
public class Graph
{
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjacentMatrices[][];
    private int numberOfVertices;
    private AbstractStackImpl stack;

    public Graph()
    {
        vertexList = new Vertex[MAX_VERTS];
        adjacentMatrices = new int[MAX_VERTS][MAX_VERTS];
        numberOfVertices = 0;
        intializeAdjacentMatrices();
        stack = new AbstractStackImpl(50);
    }

    /**
     * Initializes the adajacent matrices
     */
    private void intializeAdjacentMatrices()
    {
        for (int j = 0; j < MAX_VERTS; j++)
            for (int k = 0; k < MAX_VERTS; k++)
                adjacentMatrices[j][k] = 0;
    }

    public void addVertex(char vertex)
    {
        vertexList[numberOfVertices++] = new Vertex(vertex);
    }


    public void addEdge(int start, int end)
    {
        adjacentMatrices[start][end] = 1;
        adjacentMatrices[end][start] = 1;
    }


    public void displayVertex(int v)
    {
        System.out.print(vertexList[v].label);
    }

    public void dpethfirstsearch()
    { // begin at vertex 0
        vertexList[0].wasVisited = true; // mark it
        displayVertex(0); // display it
        stack.pushElements(0); // push it
        while (!stack.isEmpty()) // until stack empty,
        {
// get an unvisited vertex adjacent to stack top
//            int v = getAdjUnvisitedVertex(stack.peekElements());
//            if (v == -1) // if no such vertex,
//                stack.popElements();
//            else // if it exists,
//            {
//                vertexList[v].wasVisited = true; // mark it
//                displayVertex(v); // display it
//                stack.pushElements(v); // push it
//            }
        }
        for (int j = 0; j < numberOfVertices; j++) // reset flags
            vertexList[j].wasVisited = false;
    }

    public int getAdjUnvisitedVertex(int v)
    {
        for (int j = 0; j < numberOfVertices; j++)
            if (adjacentMatrices[v][j] == 1 && vertexList[j].wasVisited == false)
                return j;
        return -1;
    }
}
