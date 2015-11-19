package Collections;


import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class MultiMap {


    public SortedMap<Long,SortedMap<String,String>> setValues()
    {
        System.out.println("Welcom");
        SortedMap<String, String> StringMap = new TreeMap<>();

        StringMap.put("Family", "Imran");
        StringMap.put("Student", "Irfan");
        StringMap.put("Apple", "SteveJobs");
        StringMap.put("Principal", "Ramesh");

        SortedMap<Long, SortedMap<String, String>> completeMap = new TreeMap<>();

        completeMap.put(1L, StringMap);
        completeMap.put(100L, StringMap);
        completeMap.put(400L, StringMap);
        completeMap.put(500L, StringMap);
        completeMap.put(100L, StringMap);

        return completeMap;
    }

    public void getValues()
    {

         for(Entry<Long, SortedMap<String, String>> iter: setValues().entrySet())
         {
             long keyItem = iter.getKey();
             System.out.println("keyValues are " + keyItem);
             System.out.println(iter.getValue());
         }

    }

}
