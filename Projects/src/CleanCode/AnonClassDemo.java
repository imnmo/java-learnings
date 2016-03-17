package CleanCode;

/**
 * Anonymous class and local demo 
 * @author enomoha
 *
 */
public class AnonClassDemo {
    
    
    interface TestAnonClass {
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

        // Now instantiating an the object and creating anon class
        TestAnonClass myAnonObj = new TestAnonClass() {

            @Override
            public void JustAnProcedure() {
                System.out.println("testing Anon class... ");

            }
        };
        //Local class stuff
        localclass myLocalclassObj = new localclass();
        myLocalclassObj.JustAnProcedure();
        //Anon class stuff
        myAnonObj.JustAnProcedure();
    }

    public static void main(String... args)
    {
        AnonClassDemo anonClassObj = new AnonClassDemo();
        anonClassObj.SomeRandomProcedure();
    }
}