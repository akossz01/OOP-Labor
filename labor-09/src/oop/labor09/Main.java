package oop.labor09;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IQueue queue = new ArrayListQueue(5){};
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.deQueue();
        queue.enQueue("Akos");
        queue.enQueue(5.12);
        queue.printQueue();
    }
}
