package Student;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static Student.DummyData.*;
public class StudentTester{
    public static void main(String[] args) {

        List<Student> list= PopulateData();
        System.out.println("Dummy Data");
        list.forEach(System.out::println);

        System.out.println("\n4.2)Avg gpa of students opted for subject JAVA " + list.stream()
                .filter(i -> i.getSub().equals(Subject.JAVA))
                .mapToDouble(Student::getGpa).average().getAsDouble());

//        System.out.println("max " + list.stream()
//                .filter(i -> i.getSub().equals(Subject.JAVA))
//                .max((x,y) -> Double.compare(x.getGpa(), y.getGpa())).get());
//
        System.out.println("\n4.3)Name of topper in javaa " + list.stream()
                .filter(i -> i.getSub().equals(Subject.JAVA))
                .max((x,y) -> Double.compare(x.getGpa(), y.getGpa())).get().getName());


        Scanner sc= new Scanner(System.in);
        System.out.println("\nEnter subj");
        Subject subj= Subject.valueOf(sc.next().toUpperCase());
        System.out.println("\n4.4)presence of failed stds= " + list.stream()
                .anyMatch(i -> i.getSub().equals(subj) && i.getGpa()<5));

        System.out.println("4.5)failed in java " + Objects.requireNonNull(list.stream()
                .filter(i -> i.getSub().equals(Subject.JAVA) && i.getGpa() < 5).findAny().orElse(null)).getName());

        
        System.out.println("\nEnter subj");
        Subject subj1= Subject.valueOf(sc.next().toUpperCase());
        System.out.println("4.6)Distinction " + list.stream()
                .filter(i -> i.getSub().equals(subj1) && i.getGpa()>7.5).count());
        sc.close();
    }
}