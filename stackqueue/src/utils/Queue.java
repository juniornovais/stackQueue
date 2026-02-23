package utils;

import Node.Node;

public class Queue {
    private Node before;
    private Node after;

    int count = 0;


    public void finalQueue(char value){
        Node newNode = new Node(value);

        if(isEmpty()){
            before = newNode;
            after = newNode;
        } else{
            after.setNext(newNode);
            after = newNode;
        }

        count++;
    }


    public char initQueue(){
        if(isEmpty()){
            throw new Error("Fila vazia.");
        }

        char value = before.getValue();
        before = before.getNext();
        
        if (before == null) {
            after = null;
        }

        count--;
        return value;
    }

    public boolean isEmpty() {
        return before == null;
    }

    public int size() {
        return count;
    }
}
