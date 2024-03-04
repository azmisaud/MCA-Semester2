package Week5;

import java.util.Scanner;

class Circle{
    double radius;
    double X;
    double Y;
    public Circle(double r, double xCoOrdinate, double yCoOrdinate){
        radius=r;
        X=xCoOrdinate;
        Y=yCoOrdinate;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public boolean checkInside(double x, double y){
        return Math.sqrt(Math.pow(X - x, 2) + Math.pow(Y - y, 2)) <= radius;
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.print("Enter the radius of the circle : ");
            double r = scanner.nextDouble();
            if(r<0) break;
            System.out.print("Enter x co-ordinate of center : ");
            double x = scanner.nextDouble();
            System.out.print("Enter y co-ordinate of center : ");
            double y = scanner.nextDouble();
            Circle c1 = new Circle(r, x, y);
            System.out.println();
            System.out.println("Area : " + c1.area());
            System.out.println("Perimeter : " + c1.perimeter());
            System.out.println();
            System.out.print("Enter x co-ordinate of the point to check : ");
            double xCheck = scanner.nextDouble();
            System.out.print("Enter y co-ordinate of the point to check : ");
            double yCheck = scanner.nextDouble();
            System.out.println();
            if (c1.checkInside(xCheck, yCheck)) System.out.println("Point Inside.");
            else System.out.println("Point Outside.");
            System.out.println();
        }
    }
}

