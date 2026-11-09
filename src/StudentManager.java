import java.util.ArrayList;

public class StudentManager {

    // ArrayList to store student objects
    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {

        // Check for duplicate ID
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View All Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
        }
    }

    // Search Student
    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                System.out.println("Student Found!");
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found!");
    }

    // Delete Student
    public void deleteStudent(int id) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId() == id) {

                students.remove(i);

                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    // Update Student
    public void updateStudent(int id, String newName,
                              int newAge, String newCourse,
                              double newMarks) {

        for (Student student : students) {

            if (student.getId() == id) {

                student.setName(newName);
                student.setAge(newAge);
                student.setCourse(newCourse);
                student.setMarks(newMarks);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }
}