import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private final String name;
    private List<Student> students;

    public Teacher(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addScore(int score) {
        System.out.format("%s's students\n", name);
        for (Student student : students) {
            student.addScore(score);
            System.out.format("%s : %d\n", student.getName(), student.getScore());
        }
    }

    public void addStudent(Student student) {
        if (student != null) {
            this.students.add(student);
        }
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
