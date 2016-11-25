package com.Imran.learnings.cleancode;

/**
 * Anonymous class and local demo
 *
 * @author enomoha
 */
public class AnonClassDemo
{


    interface TestAnonClass
    {
        void JustAnProcedure();
    }

    private void SomeRandomProcedure()
    {

        //Define a local class
        class localclass implements TestAnonClass
        {

            @Override
            public void JustAnProcedure()
            {
                System.out.println("I am a local class");
            }
        }

        //Local class stuff
        localclass myLocalclassObj = new localclass();
        myLocalclassObj.JustAnProcedure();
    }
}
