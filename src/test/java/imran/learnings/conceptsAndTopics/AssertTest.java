package imran.learnings.conceptsAndTopics;
/**
 * Created by enomoha on 11.05.2017.
 */

import org.assertj.core.api.Assertions;

public class AssertTest
{
    public void testStringArray()
    {
        String myString = "10,2";
        String[] mysplit = myString.split(",");
        Assertions.assertThat(mysplit).contains("2");

    }

    public static void main(String[] args)
    {
        AssertTest myTest = new AssertTest();
        myTest.testStringArray();
    }
}
