package Algorithms;
import java.util.Iterator;

/**
 * Generic stack implementation of the stack
 * 
 * -- For test now its with the String based implementation
 *  kind of bare bone with no JavaDocs
 * This class has implements Iterable interface 
 */
public class AbstractStackImpl<Item> implements AbstractStackI, Iterable<Item>{

    protected String myStackArray[]; //Stack holding the array
    protected int positionOfElementinStack; //Holds the position  of elements to be added in stack

    //A default constructor taking the intial capacity for stack allocation  
    public AbstractStackImpl(int stackCapacity) {
        myStackArray = new String[stackCapacity];
    }

    //basically move the position and add the element
    @Override
    public void pushElements(String Item) {
        myStackArray[positionOfElementinStack++] = Item;
    }

    //basically move the position of the array holding
    @Override
    public String popElements() {
        return myStackArray[positionOfElementinStack--];
    }

    @Override
    public Boolean isEmpty() {
        if (positionOfElementinStack == 0)
            return true;
        return false;
    }

    @Override
    public void displayElements() {
    }

    
    //Peeks into the top elements of the Stack
    @Override
    public String peekElements() {
        int maximumStackValue = myStackArray.length;
        return myStackArray[maximumStackValue];
    }
    
    //TO DO 
    public Iterator<Item> iterator(){
        return null;
        
    }
    //just takes the length and checks whether is full or not
    @Override
    public Boolean isFull() {
        if (myStackArray.length ==  positionOfElementinStack)
            return true;
        return false;
    }

    /**
     * returns the size of the stack
     */
    
    @Override
    public int sizeOfStack() {
        return positionOfElementinStack;
    }
}
