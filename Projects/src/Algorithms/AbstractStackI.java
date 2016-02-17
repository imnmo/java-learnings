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
    void pushElements(Object pitem);

    /**
     * pops the top element from the stack
     */
    void popElements();

    /**
     * checks whether the stack empty or not
     */
    Boolean isEmpty();

    /**
     *
     */

    void displayElements();

    /**
     *Seek and tells the top most element in the stack
     */
    void peekElements();
}
