package utils;

import Node.Node;

public class Stack {
    private Node top;

    int count = 0;

    public void push(char next){
        Node newStackQueue = new Node(next);
        newStackQueue.setNext(top);
        top = newStackQueue;

        count++;
    }

    public char pop(){
        if(isEmpty()){
            throw new Error("Pilha vazia.");

        }

        char newNode = top.getValue();
        top = top.getNext();
        
        count--;

        return newNode;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
