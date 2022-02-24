package oop.labor12;

public class Main {
    public static void main(String[] args) {
        Car blueCar = new Car("BLUE");
        System.out.println(blueCar);
        for (int i = 0; i < 12; ++i)
            blueCar.increaseSpeed();
        Car yellowCar = new Car("YELLOW");
        for (int i = 0; i < 6; ++i)
            yellowCar.increaseSpeed();
        System.out.println(yellowCar);
    }
}
