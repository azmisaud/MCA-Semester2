package Week8;

import java.util.Scanner;

class Employee{
    private int ID;
    private String name;
    private String department;
    double salary;
    public Employee(){
    }
    public Employee(int ID, String name, String department, double salary){
        this.ID=ID;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void accept(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter ID : ");
        int ID=scanner.nextInt();
        setID(ID);
        scanner.nextLine();
        System.out.println("Enter name : ");
        String name=scanner.nextLine();
        setName(name);
        System.out.println("Enter department : ");
        String department= scanner.nextLine();
        setDepartment(department);
        System.out.print("Enter Salary : ");
        double salary= scanner.nextDouble();
        setSalary(salary);
    }
    public void display(){
        System.out.println("Name : " +getName());
        System.out.println("ID : " +ID);
        System.out.println("Department : " +department);
        System.out.println("Salary : " +salary);
    }
}
class Manager extends Employee{
    private double bonus;
    public Manager(){}
    public Manager(int ID, String name, String department, double salary, double bonus){
        super(ID,name,department,salary);
        this.bonus=bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void accept() {
        super.accept();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter bonus : ");
        double bonus= scanner.nextDouble();
        setBonus(bonus);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Bonus : " +bonus);
        System.out.println("Total Salary : " +totalSalary());
    }
    public double totalSalary(){
        return getSalary()+bonus;
    }

}
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of Managers : ");
        int n=scanner.nextInt();
        Manager[] managers=new Manager[n];
        for(int i=0;i<n;i++){
            System.out.println("Manager " +(i+1));
            managers[i]=new Manager();
            managers[i].accept();
        }
        double max=managers[0].totalSalary();
        int m=0;
        for(int i=1;i<n;i++){
            if(managers[i].totalSalary()>max){
                max=managers[i].totalSalary();
                m=i;
            }
        }
        System.out.println();
        System.out.println("Details of the Manager having Maximum Salary : ");
        System.out.println();
        managers[m].display();
    }
}
