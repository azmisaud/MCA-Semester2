package Week3;

import java.util.Scanner;

public class Problem4 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int n= scanner.nextInt();
            int sum=0;
            for(int i=2;i<=2*n;i+=2){
                sum+=i;
            }
            System.out.println("Sum of the series is : " +sum);
        }
    }
