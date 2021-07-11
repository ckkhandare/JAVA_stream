package Student;

import java.time.LocalDate;

public class Student {
    //rollNo(string),name,dob(LocalDate),subject(enum),gpa(double)
    private String rollNo;
    private String name;
    private LocalDate DOB;
    private Subject sub;
    private double gpa;

    public Student(String rollNo, String name, LocalDate DOB, Subject sub, double gpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.DOB = DOB;
        this.sub = sub;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                ", sub=" + sub +
                ", gpa=" + gpa +
                '}';
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public Subject getSub() {
        return sub;
    }

    public double getGpa() {
        return gpa;
    }
}
