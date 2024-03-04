package Week4;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=scanner.nextInt();
        String str=String.valueOf(n);
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}