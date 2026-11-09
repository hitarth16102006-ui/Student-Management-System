import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice=0;

        do {

            System.out.println("\n======================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("======================================");

            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.println("======================================");

            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter a number.");
                continue;
            }

            switch (choice) {

                case 1:

                    System.out.println("\n--- ADD STUDENT ---");

                    System.out.print("Enter Student ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = Double.parseDouble(sc.nextLine());

                    Student student = new Student(id, name, age, course, marks);

                    manager.addStudent(student);

                    break;

                case 2:

                    System.out.println("\n--- ALL STUDENTS ---");

                    manager.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID to search: ");

                    int searchId = Integer.parseInt(sc.nextLine());

                    manager.searchStudent(searchId);

                    break;

                case 4:

                    System.out.println("\n--- UPDATE STUDENT ---");

                    System.out.print("Enter Student ID: ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double newMarks = Double.parseDouble(sc.nextLine());

                    manager.updateStudent(
                        updateId,
                        newName,
                        newAge,
                        newCourse,
                        newMarks
                    );

                    break;

                case 5:

                    System.out.print("Enter Student ID to delete: ");

                    int deleteId = Integer.parseInt(sc.nextLine());

                    manager.deleteStudent(deleteId);

                    break;

                case 6:

                    System.out.println("Thank you for using Student Management System!");

                    break;

                default:

                    System.out.println("Invalid choice! Please try again.");

            }

        } while (choice != 6);

        sc.close();
    }
}