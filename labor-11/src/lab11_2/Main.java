package lab11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        processStudents("students.csv", "warning.csv");
    }

    public static void processStudents(String inputFileName, String outputFileName) {
        File output = new File(outputFileName);
        output.delete(); //torli, mivel minden program futtataskor osszegyul benne az eredmeny

        //FileWriter writer = new FileWriter(new File(outputFileName));

        try (Scanner scanner = new Scanner(new File(inputFileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");

                int id = Integer.parseInt(items[0].trim());
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                int credits = Integer.parseInt(items[3].trim());
                int birthYear = Integer.parseInt(items[4].trim());
                int birthMonth = Integer.parseInt(items[5].trim());
                int birthDay = Integer.parseInt(items[6].trim());

                if (credits < 30){
                    try (FileWriter myWriter = new FileWriter(output, true)){ //append - nem overwriteolja a filet, hanem a vegere irja
                        myWriter.write(id + " " + firstName + " " + lastName + " " + credits + " " + birthYear + " " + birthMonth + " " + birthDay + "\n");
                        myWriter.close();
                    } catch(IOException e){
                        e.printStackTrace();
                    }
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
