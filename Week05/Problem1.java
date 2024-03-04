package Week5;

import java.util.Scanner;

class OddAndEven{
    int countOfOdd;
    int countOfEven;
    public void addNumber(int number){
        if (number%2==0) countOfEven++;
        else countOfOdd++;
    }
    public String toString(){
        return "Number of Odd : " +countOfOdd+ "\n" + "Number of Even : " +countOfEven;
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OddAndEven oddAndEven = new OddAndEven();
        System.out.println("Enter numbers or type Q to quit : ");
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                oddAndEven.addNumber(number);
            } else {
                String input = scanner.next();
                if (input.equals("Q")) {
                    break;
                } else {
                    System.out.println("Invalid Input.");
                }
            }
        }
        System.out.println();
        System.out.println(oddAndEven);
    }
}

