public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Ali");
        Course course = new Course("CS101", "Object Oriented Programming");

        // Association: Student and Course exist independently and are linked by usage.
        System.out.println(student.getName() + " (ID: " + student.getId() + ") is enrolled in ");
        System.out.println(course.getTitle() + " [" + course.getCourseCode() + "]");
    }
}
