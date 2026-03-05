public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ali");
        Student s2 = new Student(102, "Sara");

        Student[] studentList = {s1, s2};

        Department csDepartment = new Department("Computer Science", studentList);
        csDepartment.showDepartmentDetails();
    }
}
