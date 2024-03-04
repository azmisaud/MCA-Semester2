package Week3;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of integers you want to enter : ");
        int n=scanner.nextInt();
        System.out.println("Enter " +n+ " integers : ");
        int m, evenCount=0, oddCount=0;
        for(int i=0;i<n;i++){
            m=scanner.nextInt();
            if(m%2==0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Odd Integers : " +oddCount);
        System.out.println("Even Integers : " +evenCount);
    }
}