import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        
    boolean App = true;
    Scanner input = new Scanner(System.in);
    while (App) {

        System.out.println(" Welcome to the student management app");
        System.out.println(" press 1 to Add Student");
        System.out.println(" press 2 to View Students");
        System.out.println(" press 3 to Search Students");
        System.out.println(" press 4 to Update Student Info");
        System.out.println(" press 5 to Delete Student");
        System.out.println(" press 6 to Save and Load Data");

        String choice = input.nextLine();

        if (choice.equals("1")){
        System.out.println("Please input name");
        String name = input.nextLine();
        System.out.println("Please input Year Group");
        int YearGrp = input.nextInt();
        System.out.println("Please input studentId");
        int StdntId = input.nextInt();


        }


    }



}
}