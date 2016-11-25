package imran.learnings.designpatterns.constructors;

import java.util.ArrayList;


public class PrimaryConstructor
{


    public PrimaryConstructor()
    {
        this(new ArrayList<>());
    }


    PrimaryConstructor(ArrayList arrayList)
    {

    }
}
