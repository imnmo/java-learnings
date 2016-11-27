package imran.learnings.datastructure.stacks;

/**
 * Main driver for the Stack implemenetation
 *
 * @author enomoha
 */
public class StackDriver
{

    public static void main(String... args)
    {
        AbstractStackImpl myStack = new AbstractStackImpl<String>(1);
        myStack.pushElements("apple");
        myStack.pushElements("banana");
        myStack.pushElements("banana");
        myStack.pushElements("apple");
        myStack.pushElements("banana");
        myStack.pushElements("apple");
        myStack.pushElements("ornge");
        myStack.pushElements(new Integer(1));
        myStack.pushElements("choclate");

        while (!myStack.isEmpty())
        {
            System.out.println(myStack.popElements());
        }

    }

}
