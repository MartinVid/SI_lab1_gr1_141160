import Student;
class Course{
    List<Student> students = new ArrayList<Student>();

    public Course(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void removeStudent(Student student){
        this.students.add(student);
    }
}
