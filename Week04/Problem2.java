package Week4;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number between 0-9 : ");
        int a=scanner.nextInt();
        System.out.print("Enter second number between 0-9 : ");
        int b=scanner.nextInt();
        System.out.print("Enter third number between 0-9 : ");
        int c=scanner.nextInt();
        if(a>=0 && a<=9 && b>=0 && b<=9 && c>=0 && c<=9) {
            int A[] = {a, b, c};
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (i != j && j != k && k != i) {
                            int d = A[i] * 100 + A[j] * 10 + A[k] * 1;
                            System.out.println(d);
                        }
                    }
                }
            }
        } else {
            System.out.println("Invalid Input.");
        }
    }
}

