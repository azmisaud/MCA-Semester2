package Week1;

import java.util.Scanner;

public class Problem3 {
    static int add(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=scanner.nextInt();
        System.out.print("Enter second number : ");
        int b=scanner.nextInt();
        System.out.println(a+ " + " +b+ " = " +add(a,b));
    }
}
