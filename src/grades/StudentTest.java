package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("bob", new ArrayList<>(Arrays.asList(95.34,85.34,55.34)));
        Student student2 = new Student("Sally", new ArrayList<>(Arrays.asList(95.34,85.34,55.34)));
        Student student3 = new Student("Johnny", new ArrayList<>(Arrays.asList(95.34,85.34,55.34)));

        student1.addGrade(99.59);
        System.out.println(student1.getGrades());

//        System.out.println(student1.getGradeAverage());

    }
}
