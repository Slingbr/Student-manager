import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean appRunning = true;

        while (appRunning) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Name: ");
                    String name = input.nextLine();
                    System.out.print("Enter Year Group: ");
                    int yearGroup = input.nextInt();
                    System.out.print("Enter Student ID: ");
                    int studentId = input.nextInt();
                    input.nextLine();  // Consume newline
                    System.out.print("Enter Grade: ");
                    String grade = input.nextLine();

                    StudentManager newStudent = new StudentManager(name, yearGroup, studentId, grade);
                    StudentMethods.addStudent(newStudent);
                    break;

                case "2":
                    StudentMethods.displayAllStudents();
                    break;

                case "3":
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = input.nextInt();
                    input.nextLine();
                    StudentManager foundStudent = StudentMethods.searchStudent(searchId);
                    if (foundStudent != null) {
                        foundStudent.displayStudentInfo();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case "4":
                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = input.nextInt();
                    input.nextLine();
                    StudentMethods.deleteStudent(deleteId);
                    break;

                case "5":
                    appRunning = false;
                    System.out.println("Exiting Student Management System...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        input.close();
    }
}
