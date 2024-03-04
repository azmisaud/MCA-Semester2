package Week9;

import arithmetic.ArithmeticOperations;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a= scanner.nextInt();
        System.out.print("Enter second number : ");
        int b= scanner.nextInt();
        System.out.println();
        System.out.println("Sum : "+ArithmeticOperations.add(a,b));
        System.out.println("Difference : " + ArithmeticOperations.difference(a,b));
        System.out.println("Product : " + ArithmeticOperations.product(a,b));
        ArithmeticOperations.quotient(a,b);
    }
}
