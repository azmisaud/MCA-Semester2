package Week7;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String sentence=scanner.nextLine();
        String[] m=sentence.split("\\b");
        System.out.println();
        System.out.println("Sentence with words reversed : ");
        for(String x:m){
            if(x.matches("\\W+")){
                System.out.print(x);
            } else {
                StringBuilder str=new StringBuilder(x);
                System.out.print(str.reverse());
            }
        }
    }
}

