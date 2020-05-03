package Stacks.definition;

import Stacks.adt.StackADT;

import java.util.NoSuchElementException;

public class MyStack<E> implements StackADT<E>{

    private Node<E> top = null;
    private int size = 0;

    @Override
    public void push(E data) {
        top = new Node<>(data,top); // create a node with data and set the reference to the top node
        size++;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E pop() {
       E response = null;
       if (isEmpty()){
           throw new NoSuchElementException("Stack Underflow");
       }
       else {
           Node<E> tmpNode = top;
           response = tmpNode.getData();
       }
       return response;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;  //returns true if size == 0 i.e Stack is empty
    }

    private static class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data, Node<E>next){
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
