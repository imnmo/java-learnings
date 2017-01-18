package imran.learnings.datastructure.graphs;

/**
 * The vertex or the node of the class
 */
public class Vertex
{

    public char label; // label (e.g. ‘A’)
    public boolean wasVisited;

    public Vertex(char lab) // constructor
    {
        label = lab;
        wasVisited = false;
    }
}
