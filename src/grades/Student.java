package grades;

import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> grades;
    private String studentName;

    public static void main(String[] args) {
        Student bob = new Student("Bob");
        System.out.println(bob.getName());
        bob.addGrade(90);
        bob.addGrade(80);
        bob.addGrade(100);
        System.out.println(bob.getGradeAverage());
    }

    public Student(String name){
        studentName = name;
        grades = new ArrayList<>();
    }

    public String getName(){
        return this.studentName;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int gradeAverage = 0;
        for(int grade: grades){
            gradeAverage += grade;
        }
        int average = gradeAverage / grades.size();
        return average;
    }



}
