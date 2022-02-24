package oop.labor12;

public class Car {
    private String color = "WHITE";
    private int speed = 0;

    public Car() {

    }

    public Car(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        this.speed += 10;
    }

    public String toString(){
        return color+" "+speed;
    }
}
