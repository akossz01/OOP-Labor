package lab12_3;

import lab12_2.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bac {
    private Map<Integer, Student> students = new HashMap<>();

    public Bac(String fileName){
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int identifier =  Integer.parseInt(items[0].trim());
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                students.put(identifier, new Student(identifier, firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
