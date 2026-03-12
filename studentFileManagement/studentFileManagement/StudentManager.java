package com.studentFileManagement;

import java.io.*;
import java.util.*;

public class StudentManager {

    public void writeStudent(Scanner sc) {
        try (FileWriter fw = new FileWriter("students.txt", true)) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name (Full Name): ");
            String name = sc.nextLine();

            System.out.print("Enter Student Marks: ");
            double marks = sc.nextDouble();

            Student s = new Student(id, name, marks);
            fw.write(s.toString() + "\n");

            System.out.println("-> Student saved successfully!");

        } catch (InputMismatchException e) {
            System.out.println("Oops! Invalid input. Please make sure you enter numbers for ID/Marks.");
            sc.nextLine();
        } catch (IOException e) {
            System.out.println("Something went wrong while saving the file.");
        }
    }

    public void readStudents() {
        File file = new File("students.txt");

        if (!file.exists()) {
            System.out.println("No students found yet. Try adding one first!");
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) {
            System.out.println("\n--- Student Records ---");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");

                if(data.length == 3) {
                    System.out.println("ID: " + data[0] + " | Name: " + data[1] + " | Marks: " + data[2]);
                }
            }
        } catch (IOException e) {
            System.out.println("Couldn't read the file.");
        }
    }
}