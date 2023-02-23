package grades;

import java.util.List;

public class Student {

    private String name;

   private List <Double> grades;
    //Constructer
    public Student(String name, List<Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    //Getters
    public List<Double> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
    //Add method
    public void addGrade(double grade){
        grades.add(grade);
    }
    //Average
    public double getGradeAverage() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total/grades.size();
    };


}
