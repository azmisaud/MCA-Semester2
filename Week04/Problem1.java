package Week4;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n= scanner.nextInt();
        if(n<=0){
            System.out.println("Invalid input.");
        } else {
            int firstTerm=0;
            int secondTerm=1;
            int nextTerm;
            int i=0;
            System.out.println("First " +n+ " terms of Fibonacci Series are : ");
            do{
                System.out.print(firstTerm+ "  ");
                nextTerm=firstTerm+secondTerm;
                firstTerm=secondTerm;
                secondTerm=nextTerm;
                i++;
            } while(i<n);
        }
    }
}
