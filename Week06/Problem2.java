package Week6;

import java.util.Scanner;

class Student{
    private String name;
    private double totalScore;
    private int numberOfQuizzes;
    public Student(String name, double score){
        this.name=name;
        totalScore=score;
    }
    public Student(double score, String name){
        totalScore=score;
        this.name=name;
    }
    public Student(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public double getAverage(){
        if(numberOfQuizzes==0) return 0;
        else return totalScore/numberOfQuizzes;
    }
    public double getTotalScore(){
        return totalScore;
    }
    public void addQuiz(double score){
        numberOfQuizzes+=1;
        totalScore+=score;
    }
    public void printStudent(){
        System.out.println("Name : " +getName());
        System.out.println("Average Score : " +getAverage());
    }
    public String toString(){
        return "Total Score : " +getTotalScore()+ "\n" + "Number of Quizzes : " +numberOfQuizzes;
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter student's name : ");
        String name=scanner.next();
        Student student=new Student(name);
        for(int i=1;i<=3;i++){
            System.out.print("Enter score of Quiz " +i+ " for " +student.getName()+ " : ");
            double score= scanner.nextDouble();
            student.addQuiz(score);
        }
        System.out.println();
        student.printStudent();
        System.out.println(student);
    }
}
