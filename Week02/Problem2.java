package Week2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        double num= scanner.nextDouble();
        double numRound=Math.round(num);
        double numCeil=Math.ceil(num);
        double numFloor=Math.floor(num);
        int numInteger=(int) num;
        System.out.println("Original Number : " +num);
        System.out.println("Round Value : " +numRound);
        System.out.println("Ceil Value : " +numCeil);
        System.out.println("Floor Value : " +numFloor);
        System.out.println("After Casting to int : " +numInteger);
    }
}

