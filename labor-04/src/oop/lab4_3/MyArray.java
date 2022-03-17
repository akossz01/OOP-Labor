package oop.lab4_3;

import java.util.Random;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;
    }

    public MyArray(double[] elements) {
        this.elements = elements;
    }

    Random randNum = new Random();

    public void fillRandom(double a, double b) {
        for (int i = 0; i < length; ++i) {
            elements[i] = randNum.nextDouble(a + b) + a;
        }
    }

    public double mean(double[] elements) {
        int sum = 0;
        for (int i = 0; i < length; ++i) {
            sum += elements[i];
        }
        return sum / length;
    }

    public double stddev(double[] elements) {
        double sum = 0.0, standardDeviation = 0.0;

        for (double num : elements) {
            sum += num;
        }

        double mean = sum / length;

        for (double num : elements) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation / length);
    }

    public void sort() {
        double temp;
        for (int i = 0; i < length; ++i) {
            for (int j = i + 1; j < length; ++j) {
                if (elements[i] > elements[j]) {
                    temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < length; ++ i){
            System.out.println(elements[i]);
        }
    }
}
