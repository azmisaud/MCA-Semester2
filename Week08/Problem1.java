package Week8;

import java.util.Scanner;

class Person{
    private String name;
    private int yearOfBirth;
    public Person(String name, int yearOfBirth){
        this.name=name;
        this.yearOfBirth=yearOfBirth;
    }
    public String toString() {
        return "Name : " +name+ "\n" + "Year of Birth : " +yearOfBirth+ "\n";
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
class Student8 extends Person{
    String major;
    public Student8(String name, int yearOfBirth, String major){
        super(name, yearOfBirth);
        this.major=major;
    }

    @Override
    public String toString(){
        return super.toString()+"Major : " +major;
    }

    public String getMajor() {
        return major;
    }
}
class Instructor extends Person{
    double salary;
    public Instructor(String name, int yearOfBirth, double salary){
        super(name, yearOfBirth);
        this.salary=salary;
    }
    public String toString(){
        return super.toString()+"Salary : " +salary;
    }

    public double getSalary() {
        return salary;
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Student8 s1=new Student8("Saud", 1999, "Java");
        System.out.println(s1);
        System.out.println();
        Instructor i1=new Instructor("Abdullah", 1986, 24000);
        System.out.println(i1);
    }
}
