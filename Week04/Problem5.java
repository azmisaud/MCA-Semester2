package Week4;

import java.awt.*;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the x co-ordinate of top left corner of first rectangle : ");
        int x1= scanner.nextInt();
        System.out.print("Enter the y co-ordinate of top left corner of first rectangle : ");
        int y1= scanner.nextInt();
        System.out.print("Enter the width of the first rectangle : ");
        int w1= scanner.nextInt();
        System.out.print("Enter the height of the first rectangle : ");
        int h1= scanner.nextInt();
        Rectangle r1=new Rectangle(x1,y1,w1,h1);
        System.out.print("Enter the x co-ordinate of top left corner of second rectangle : ");
        int x2= scanner.nextInt();
        System.out.print("Enter the y co-ordinate of top left corner of second rectangle : ");
        int y2= scanner.nextInt();
        System.out.print("Enter the width of the second rectangle : ");
        int w2= scanner.nextInt();
        System.out.print("Enter the height of the second rectangle : ");
        int h2= scanner.nextInt();
        Rectangle r2=new Rectangle(x2,y2,w2,h2);
        System.out.println();
        System.out.println("First Rectangle : " +r1);
        System.out.println("Second Rectangle : " +r2);
        System.out.println();
        Rectangle r3=r1.intersection(r2);
        if(r3.isEmpty()){
            System.out.println("The rectangles do not overlap.");
        } else {
            System.out.println("Intersection Rectangle : " + r3);
        }
    }
}

