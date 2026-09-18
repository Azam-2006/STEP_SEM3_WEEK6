public class Student {

    // Instance fields
    String name;
    double attendance;

    // Static fields
    static String collegeName =
            "SRM Institute of Science and Technology";

    static int studentCount = 0;

    // Constructor
    Student(String name, double attendance) {

        this.name = name;
        this.attendance = attendance;

        studentCount++;
    }

    // Static method
    static void printCollegeInfo() {

        System.out.println(collegeName);
        System.out.println(
            "Student count: " + studentCount
        );
    }

    public static void main(String[] args) {

        // Create two Student objects
        Student student1 =
                new Student("Ravi", 85.5);

        Student student2 =
                new Student("Anitha", 90.0);

        // Call static method using class name
        Student.printCollegeInfo();
    }
}
