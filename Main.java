import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Student Grade Management System");
            System.out.println("1. Add a Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: addStudent();
                break;
                case 2: displayStudents();
                break;
                case 3: System.out.println("Exiting...");
                break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        studentList.add(new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }

    private static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("Student Records");
        for (Student s : studentList) {
            s.displayStudent();
        }
    }
private static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine();
        for (Student s : studentList) {
            if (s.getStudentID().equalsIgnoreCase(id)) {
                System.out.println("Student Found:");
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    private static void calculateAverage() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the system to calculate average.");
            return;
        }
        double total = 0;
        for (Student s : studentList) {
            total += s.getMarks();
        }
        double average = total / studentList.size();
        System.out.println("Total Students: " + studentList.size());
        System.out.println("Average Marks of All Students: " + average);
    }
}
