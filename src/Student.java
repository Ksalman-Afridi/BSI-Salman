class Student extends Person {
    private int rollNo;
    private String course;

    public Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    public void showStudentInfo() {
        showPersonInfo();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
