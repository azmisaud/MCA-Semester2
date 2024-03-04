package Week5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str=scanner.nextLine();
        StringTokenizer str1=new StringTokenizer(str, " .");
        System.out.println("The number of words are : " +str1.countTokens());
        StringTokenizer str2=new StringTokenizer(str,".");
        System.out.println("The number of sentences are : " +str2.countTokens());
        int countOfe=0, countOfz=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e') countOfe++;
            if(str.charAt(i)=='z') countOfz++;
        }
        System.out.println("Number of times the letter “e” occurs in the text : " +countOfe);
        System.out.println("Number of times the letter “z” occurs in the text : " +countOfz);
    }
}
