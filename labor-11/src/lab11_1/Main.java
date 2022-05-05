package lab11_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(readFromConsole());
    }

    public static double readFromConsole(){
        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            if(scanner.hasNextDouble()){
                sum += Double.parseDouble(scanner.next());
            }
            else{
                scanner.next();
            }

        }

        return sum;
    }
}
