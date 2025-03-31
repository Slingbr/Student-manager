import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StudentMethodsTest {

    @Test
    public void testAddStudent() {
        StudentManager student = new StudentManager("Alice", 10, 123, "A");
        StudentMethods.addStudent(student);

        // Check if student was added
        assertEquals(1, StudentMethods.getStudentListSize());
    }

    @Test
    public void testSearchStudent() {
        StudentManager student = new StudentManager("Bob", 11, 456, "B");
        StudentMethods.addStudent(student);

        StudentManager found = StudentMethods.searchStudent(456);
        assertNotNull(found);
        assertEquals("Bob", found.getName());
    }

    @Test
    public void testDeleteStudent() {
        StudentManager student = new StudentManager("Charlie", 12, 789, "C");
        StudentMethods.addStudent(student);

        StudentMethods.deleteStudent(789);
        assertNull(StudentMethods.searchStudent(789));
    }
}
