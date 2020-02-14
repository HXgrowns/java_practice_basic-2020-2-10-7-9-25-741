import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Student cindy = new Student("Cindy", 80);
        Student mary = new Student("Mary", 95);

        Teacher solider = new Teacher("Solider");
        solider.addStudent(mary);
        solider.addScore(5);

        Teacher bob = new Teacher("Bob");
        bob.addStudent(cindy);
        bob.addScore(5);
    }

}
