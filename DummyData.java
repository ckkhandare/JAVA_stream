package Student;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DummyData {

    public static List<Student> PopulateData(){
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("012","chandrakant", LocalDate.parse("1998-02-09"),Subject.JAVA,7.8));
        students.add(new Student("2","ravi", LocalDate.parse("1998-02-09"),Subject.R,5.6));
        students.add(new Student("3","sonu", LocalDate.parse("1998-02-09"),Subject.JAVA,2.7));
        students.add(new Student("4","rohit", LocalDate.parse("1998-02-09"),Subject.ML,4.6));
        students.add(new Student("5","rishi", LocalDate.parse("1998-02-09"),Subject.JAVA,8.4));
        students.add(new Student("6","rahul", LocalDate.parse("1998-02-09"),Subject.CLOUD,6.7));
        return students;
    }
}
