package LM;

import java.util.Scanner;

public class Menudemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Student management");
            System.out.println("--------------------------");
            System.out.println("1. Show student list.");
            System.out.println("2. Add new student.");
            System.out.println("3. Update sutdent information.");
            System.out.println("4. Delete student by rollnumber.");
            System.out.println("5. Search student by keyword.");
            System.out.println("0. Exits program");
            System.out.println("--------------------------");
            System.out.println("Please enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Display sutdent list!");
                    break;
                case 2:
                    System.out.println("Add student information!");
                    break;
                case 3:
                    System.out.println("Update student information!");
                    break;
                case 4:
                    System.out.println("Delete student!");
                    break;
                case 5:
                    System.out.println("Search student!");
                    break;
                case 0:
                    System.out.println("See you later!");
                default:
                    System.out.println("Invalid choice. Please enter number from 0 to 5.");
                    break;
            }
            if (choice == 0) {
                return;
            }
            System.out.println("Press c to continue");
            scanner.next();
        }
    }
}
