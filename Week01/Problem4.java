package Week1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of temperatures you have to convert : ");
        int a=scanner.nextInt();
        double[] fahrenheit=new double[a];
        double[] celsius=new double[a];
        System.out.println("Enter the " +a+ " temperatures : ");
        for(int i=0; i<a;i++){
            fahrenheit[i]= scanner.nextDouble();
            celsius[i]=(fahrenheit[i]-32)*(5.0/9.0);
        }
        System.out.printf("%10s %12s\n", "Fahrenheit", "Celsius");
        System.out.printf("%22s\n", "- - - - - - - - - - -");
        for(int i=0;i<a;i++){
            System.out.printf("%10.2f %11.2f\n", fahrenheit[i], celsius[i]);
        }
    }
}
