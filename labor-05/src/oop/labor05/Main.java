package oop.labor05;

import oop.labor05.models.Course;
import oop.labor05.models.Student;
import oop.labor05.models.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(readCourses("C:\\Users\\akoss\\Documents\\GitHub\\OOP-Labor\\labor-05\\courses.csv"));
        System.out.println(readStudents("C:\\Users\\akoss\\Documents\\GitHub\\OOP-Labor\\labor-05\\students.csv"));

    }

    private static ArrayList<Course> readCourses(String fileName){
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String name = items[0].trim();
                String description = items[1].trim();
                int hours = Integer.parseInt(items[2].trim());
                courses.add(new Course(name, description, hours));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }

    private static ArrayList<Student> readStudents(String fileName){
        ArrayList<Student> students = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(fileName))) {
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items = line.split(",");
                String ID = items[0].trim();
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                students.add(new Student(ID, firstName, lastName));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return students;
    }
}
