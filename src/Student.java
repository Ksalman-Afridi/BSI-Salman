class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showStudent() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}
