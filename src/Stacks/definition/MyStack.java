package Stacks.definition;

import Stacks.adt.StackADT;

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
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
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
