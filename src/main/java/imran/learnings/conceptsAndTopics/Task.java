package imran.learnings.conceptsAndTopics;

public interface Task<P,R>
{
    P getParameters();
    R execute();
}
