package oop.labor09;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue{
    private ArrayList<Object> items = new ArrayList<>();
    private int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    public boolean isEmpty(){
        if (items.isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if(items.size() == CAPACITY){
            return true;
        }
        return false;
    }

    @Override
    public void enQueue(Object o) {
        if(!isFull()){
            items.add(o);
        }
    }

    @Override
    public void deQueue() {
        if(!isEmpty()){
            items.remove(0);
        }
    }

    @Override
    public void printQueue() {
        for (Object o:items){
            System.out.print(o + " ");
        }
        System.out.println("\n");
    }
}
