package oop.labor09;

public interface IQueue {
    public boolean isEmpty();
    public boolean isFull();
    public void enQueue(Object o);
    public void deQueue();
    public void printQueue();
}
