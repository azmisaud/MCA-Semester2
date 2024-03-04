package Week4;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a= scanner.nextInt();
        System.out.print("Enter second number : ");
        int b= scanner.nextInt();
        System.out.print("Enter third number : ");
        int c= scanner.nextInt();
        System.out.print("Enter fourth number : ");
        int d= scanner.nextInt();
        System.out.println("Sum : " +Math.addExact(Math.addExact(a,b),Math.addExact(c,d)));
        System.out.println("Product : " +Math.multiplyExact(Math.multiplyExact(a,b),Math.multiplyExact(c,d)));
    }
}

