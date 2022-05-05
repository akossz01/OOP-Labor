package lab10_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dates = new ArrayList<>();
        for (int i = 0; i<10; ++i){
            MyDate d = new MyDate((int)rand(1000,2000), (int)rand(1,12),(int)rand(1,31));
            dates.add(d);
        }
        System.out.println(dates);

    }

    public static double rand(int a, int b){
        return Math.random()*(b-a)+a;
    }
}
