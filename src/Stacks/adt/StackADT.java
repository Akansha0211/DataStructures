package Stacks.adt;

public interface StackADT<E> {


    /**
     * This method pushes the item onto the Top of Stack and eturns the item pushed(inserted).
     * @param data  : The data to be inserted
     * @return  The object inserted
     */
    E push(E data);

    /**
     * This method returns the top of the stack without removing it
     * @post  the stack remains unchanged
     * @return  The object at he top of the Stack
     * @ throws NoSuchElementException if the Stack is Empty
     */
    E peek();

    /**
     * This method returns the Top of the Stack and removes it
     * @post The Stack is one item smaller
     * @return The item at the top of the Stack
     * @ throws NoSuchElementException if Stack is Empty
     */
    E pop();

    /**
     * This method returns true if the Stack is Empty otherwise returns false
     * @return boolean value
     */
    boolean isEmpty();
}
