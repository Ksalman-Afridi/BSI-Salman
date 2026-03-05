public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Ali");
        s1.setRollNo(101);
        s1.setAge(20);
        s1.setCourse("Computer Science");

        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Course: " + s1.getCourse());
    }
}
