package imran.learnings.datastructure.graph;

class Graph
{
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Queue theQueue;

    public Graph()
    {
        vertexList = new Vertex[MAX_VERTS];

        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int j = 0; j < MAX_VERTS; j++)
            for (int k = 0; k < MAX_VERTS; k++)
                adjMat[j][k] = 0;
        theQueue = new Queue();
    }

    public void addVertex(char lab)
    {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end)
    {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v)
    {
        System.out.print(vertexList[v].label);
    }

    public void bfs()
    { // begin at vertex 0
        vertexList[0].wasVisited = true; // mark it
        displayVertex(0); // display it
        theQueue.insert(0); // insert at tail
        int v2;
        while (!theQueue.isEmpty()) // until queue empty,
        {
            int v1 = theQueue.remove(); // remove vertex at head
// until it has no unvisited neighbors
            while ((v2 = getAdjUnvisitedVertex(v1)) != -1)
            { // get one,
                vertexList[v2].wasVisited = true; // mark it
                displayVertex(v2); // display it
                theQueue.insert(v2); // insert it
            } // end while
        } // end while(queue not empty)
// queue is empty, so we’re done
        for (int j = 0; j < nVerts; j++) // reset flags
            vertexList[j].wasVisited = false;
    }

    public int getAdjUnvisitedVertex(int v)
    {
        for (int j = 0; j < nVerts; j++)
            if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false)
                return j;
        return -1;
    }

    public static void main(String[] args)
    {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); // 0 (start for dfs)
        theGraph.addVertex('B');// 1
        theGraph.addVertex('C');// 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(0, 3); // AD
        theGraph.addEdge(3, 4); // DE
        System.out.print("Visits");
        theGraph.bfs(); // breadth-first search
        System.out.println();
    } // end main()
} // end class BFSApp
