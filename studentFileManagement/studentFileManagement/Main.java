package com.studentFileManagement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice = 0;

        System.out.println("Welcome to the Student Manager!");

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("What would you like to do? ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        manager.writeStudent(sc);
                        break;
                    case 2:
                        manager.readStudents();
                        break;
                    case 3:
                        System.out.println("Exiting... See ya!");
                        break;
                    default:
                        System.out.println("Invalid choice. Try 1, 2, or 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
            }

        } while (choice != 3);

        sc.close();
    }
}