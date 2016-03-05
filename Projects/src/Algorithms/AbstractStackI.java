package Algorithms;

public interface AbstractStackI
/**
 * This is an Fixed stack interface
 * basically the Stack contains following things:
 *
 *  A)PUSH
 *  B)POP
 *  C)PEEK
 *  D)ISEMPTY
 */
{
    /**
     * push  the elements into the stack
     * @param pitem
     */
    void pushElements(String pitem);

    /**
     * pops the top element from the stack
     */
    String popElements();

    /**
     * checks whether the stack empty or not
     */
    Boolean isEmpty();
    
    /**
     * Checks whether the Stack is full or not
     */
    Boolean isFull();

    /**
     * print the elements of the Stack 
     */

    void displayElements();

    /**
     *Seek and tells the top most element in the stack
     */
    String peekElements();
}
