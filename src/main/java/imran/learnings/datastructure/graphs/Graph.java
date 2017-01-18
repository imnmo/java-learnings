package imran.learnings.datastructure.graphs;

/**
 * A simple graph model to represent the vertices and edges
 */
public class Graph
{
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjacentMatrices[][];
    private int numberOfVertices;

    public Graph()
    {
        vertexList = new Vertex[MAX_VERTS];
        adjacentMatrices = new int[MAX_VERTS][MAX_VERTS];
        numberOfVertices = 0;
        intializeAdjacentMatrices();
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

}
