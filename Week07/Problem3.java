package Week7;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first String : ");
        String str1= scanner.nextLine();
        System.out.println("Enter second String : ");
        String str2= scanner.nextLine();
        System.out.println("Enter third String : ");
        String str3= scanner.nextLine();
        String[] arr={str1,str2,str3};
        System.out.println();
        System.out.println("The three strings entered are : ");
        for(int i=0;i< arr.length;i++){
            System.out.println((i+1)+ ". " +arr[i]);
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("The three strings ordered lexicographically are : ");
        for(int i=0;i< arr.length;i++){
            System.out.println((i+1)+ ". " +arr[i]);
        }
    }
}
