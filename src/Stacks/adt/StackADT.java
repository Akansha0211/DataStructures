package Stacks.adt;

public interface StackADT<E> {


    /**
     * This method pushes the item onto the Top of Stack and eturns the item pushed(inserted).
     * @param obj  : The object to be inserted
     * @return  The object inserted
     */
    E push(E obj);

    /**
     * This method returns the top of the stack without removing it
     * @post  the stack remains unchanged
     * @return  The object at he top of the Stack
     * @ throws NoSuchElementException if the Stack is Empty
     */
    E peek();
//    E pop();
//    boolean isEmpty();
}
