class Department {
    private String departmentName;
    private Student[] students;

    // Aggregation: Department uses Student objects created outside this class.
    public Department(String departmentName, Student[] students) {
        this.departmentName = departmentName;
        this.students = students;
    }

    public void showDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Students in Department:");
        for (Student student : students) {
            student.showStudent();
        }
    }
}
