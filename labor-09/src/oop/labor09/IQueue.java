package oop.labor09;

public interface IQueue {
    boolean isEmpty();
    boolean isFull();
    void enQueue(Object o);
    void deQueue();
    void printQueue();
}
