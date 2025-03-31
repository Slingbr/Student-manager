public class StudentManager {
    private String name;
    private int yearGroup;
    private int studentId;
    private String grade;

    public StudentManager(String name, int yearGroup, int studentId, String grade) {
        this.name = name;
        this.yearGroup = yearGroup;
        this.studentId = studentId;
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Year Group: " + yearGroup);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
    }

    public int getStudentId() {
        return studentId;
    }
    
    public String getName() {
        return name;
    }
}
