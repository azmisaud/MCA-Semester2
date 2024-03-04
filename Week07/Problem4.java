package Week7;

import java.util.Scanner;

interface CommonMethods{
    double perimeter();
    double area();
}
class Shape implements CommonMethods{
    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(){
        this.radius=0;
    }
    public Circle(double radius){
        setRadius(radius);
    }
    public void setRadius(double radius){
        if(radius<0){
            this.radius=0;
        }
        else {
            this.radius=radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double perimeter() {
        return Math.PI*diameter();
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
    public double diameter(){
        return 2*radius;
    }

    @Override
    public String toString() {
        return "Radius : " +getRadius()+ "\n" +"Diameter : " +diameter()+ "\n" +"Area : " +area()+ "\n" + "Perimeter : " +perimeter();
    }
}
class Rectangle extends Shape{
    private double length;
    private double breadth;

    public void setLength(double length) {
        if(length<0){
            this.length=0;
        } else{
            this.length=length;
        }
    }

    public void setBreadth(double breadth) {
        if(breadth<0){
            this.breadth=0;
        } else {
            this.breadth = breadth;
        }
    }
    public Rectangle(){
        this.length=0;
        this.breadth=0;
    }
    public Rectangle(double length,double breadth){
        setLength(length);
        setBreadth(breadth);
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    @Override
    public double perimeter() {
        return 2*(length+breadth);
    }

    @Override
    public double area() {
        return length*breadth;
    }

    @Override
    public String toString() {
        return "Length : " +getLength()+ "\n" +"Breadth : " +getBreadth()+ "\n" + "Perimeter : " +perimeter()+ "\n" + "Area : " +area();
    }
}
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double r= scanner.nextDouble();
        Circle c1=new Circle(r);
        System.out.println();
        System.out.println(c1);
        System.out.println();
        System.out.print("Enter the length of the rectangle : ");
        double l= scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle : ");
        double b= scanner.nextDouble();
        Rectangle r1=new Rectangle(l,b);
        System.out.println();
        System.out.println(r1);
    }
}
