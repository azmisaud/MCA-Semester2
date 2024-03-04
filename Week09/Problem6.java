package Week9;

import java.util.Scanner;

class Box{
    private double length;
    private double breadth;
    private double height;
    public Box(){
        this.length=0;
        this.breadth=0;
        this.height=0;
    }
    public void volume(double length, double breadth, double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        System.out.println("Volume : "+(this.length*this.breadth*this.height) + "\n");
    }
}
public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length of first box : ");
        double l1= scanner.nextDouble();
        System.out.print("Enter the breadth of first box : ");
        double b1= scanner.nextDouble();
        System.out.print("Enter the height of first box : ");
        double h1= scanner.nextDouble();
        System.out.println();
        Box box1=new Box();
        box1.volume(l1,b1,h1);
        System.out.print("Enter the length of second box : ");
        double l2= scanner.nextDouble();
        System.out.print("Enter the breadth of second box : ");
        double b2= scanner.nextDouble();
        System.out.print("Enter the height of second box : ");
        double h2= scanner.nextDouble();
        System.out.println();
        Box box2=new Box();
        box2.volume(l2,b2,h2);
    }
}
