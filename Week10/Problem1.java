package Week10;

import java.util.Random;
import java.util.Scanner;

public class Problem1 {
    static void loopException(int iterations) throws ArithmeticException{
        Random random=new Random();
        for(int i=1;i<=iterations;i++){
            int result= random.nextInt(iterations);
            if(result==iterations/2){
                throw new ArithmeticException("It is an exception at iteration " +i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of iterations : ");
        int iterations=scanner.nextInt();
        try{
            loopException(iterations);
            System.out.println("No Exception occurred.");
        } catch (ArithmeticException e){
            System.err.println(e);
        }
    }
}
