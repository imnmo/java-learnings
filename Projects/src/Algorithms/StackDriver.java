package Algorithms;

/**
 * Main driver for the Stack implemenetation
 * @author enomoha
 *
 */
public class StackDriver {

    public static void main(String... args) {
        int max = Integer.parseInt(args[0]);
        AbstractStackImpl<String> myStack = new AbstractStackImpl<>(max);
        //To do the common driver for all classes

    }

}
