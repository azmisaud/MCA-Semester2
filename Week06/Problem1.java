package Week6;

import java.util.Scanner;

class Grader{
    int score;
    public Grader(int s){
        score=s;
    }
    public String letterGrade(){
        if(score>=90) return "A+";
        else if (score>=85) return "A";
        else if (score >=80) return "B+";
        else if (score>=75) return "B";
        else if (score>=65) return "C+";
        else if (score>=60) return "C";
        else if (score>=55) return "D+";
        else if (score>=50) return "D";
        else return "F";
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the score of the student : ");
        int score=scanner.nextInt();
        if(score<0 || score>100) System.out.println("Invalid Input.");
        else {
            Grader grader=new Grader(score);
            System.out.println("Grade : " +grader.letterGrade());
        }
    }
}
