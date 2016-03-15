package Algorithms;
import java.util.Iterator;

/**
 * Generic stack implementation of the stack
 * 
 *  For test now its with the String based implementation
 *  kind of bare bone with no JavaDocs
 * This class has implements Iterable interface 
 */
//TODO the pop with loitering and GC stuff na
public class AbstractStackImpl<Item> implements AbstractStackI, Iterable<String>{

    protected String myStackArray[]; //Stack holding the array
    protected int positionOfElementinStack; //Holds the position  of elements to be added in stack

    //A default constructor taking the intial capacity for stack allocation  
    public AbstractStackImpl(int stackCapacity) {
        myStackArray = new String[stackCapacity];
    }

    //basically move the position and add the element
    @Override
    public void pushElements(String Item) {
        
        if(isFull())
        {
            //do stack resizing
            resize(4 * myStackArray.length);
        }
        myStackArray[positionOfElementinStack++] = Item;
    }

    //basically move the position of the array holding
    @Override
    public String popElements() {
        if(isEmpty()){
            throw new RuntimeException("Stack underflow dude!! ");
        }
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

    /**
     * Resizes the Array to use for extended length 
     */
    @Override
    public void resize(int maximumReSizeValue) {
        //Allocate a new array and copy the contents to new temp
        //array
        String[] temp = new String[maximumReSizeValue];
        for(int i=0; i < positionOfElementinStack; i++){
            temp[i] = myStackArray[i];
        }
        //now just copy the contents
        myStackArray = temp;
    }
    
    
    /**
     * Helper non-static class to implement the iteration of this collection
     */
    private class ReverseArrayIterator implements Iterator<String>{
        
        private int i = positionOfElementinStack - 1;
        /**
         * check for some item and return true if exists
         * @return
         */
        @Override
        public boolean hasNext() {
            return (!isEmpty());
        }

        /**
         * move along the stack and move the position of the stack pointer
         * @return
         */
        @Override
        public String next() {
            return myStackArray[positionOfElementinStack--];
        }

        /**
         * Not a supported operation
         */
        @Override
        public void remove() {
            throw new  UnsupportedOperationException();
            
        }
        
        
    }


    @Override
    public Iterator<String> iterator() {
        return new ReverseArrayIterator();
    }
}
