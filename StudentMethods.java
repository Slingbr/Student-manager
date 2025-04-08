import java.util.ArrayList;

public class StudentMethods {
    private static ArrayList<StudentManager> studentList = new ArrayList<>();


    public static void addStudent(StudentManager student) {
        studentList.add(student);
        System.out.println("Student added successfully!");
    }


    public static void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (StudentManager student : studentList) {
                student.displayStudentInfo();
            }
        }
    }
    public static int getStudentListSize(){
        return studentList.size();
    }


   
    public static StudentManager searchStudent(int id) {
        for (StudentManager student : studentList) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }


    public static void deleteStudent(int id) {
        studentList.removeIf(student -> student.getStudentId() == id);
        System.out.println("Student deleted if found.");
    }
}
