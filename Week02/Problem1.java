package Week2;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a= scanner.nextInt();
        System.out.print("Enter first number : ");
        int b= scanner.nextInt();
        System.out.println("SUM : " +(a+b));
        System.out.println("DIFFERENCE :"  +(a-b));
        System.out.println("PRODUCT : " +(a*b));
        if(b!=0){
            double quotient=(double) a/b;
            System.out.println("QUOTIENT : " +quotient);
        } else {
            System.out.println("Division by zero.");
        }
        System.out.println("MAXIMUM : " +Math.max(a,b));
        System.out.println("MINIMUM : " +Math.min(a,b));
    }
}
