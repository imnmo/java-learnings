package imran.learnings.conceptsAndTopics;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by enomoha on 18.04.2017.
 */
public class FlightSearchTask implements Task<SearchCriteria, SearchResult> {

    public FlightSearchTask(){


    }



    @Override
    public SearchCriteria getParameters() {
        return null;
    }

    @Override
    public SearchResult execute() {


        List<? super Integer> foo3 = new ArrayList<Number>();
        foo3.add(new Integer(3));
        return null;
    }
}
