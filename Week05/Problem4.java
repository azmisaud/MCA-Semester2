package Week5;

import java.util.Scanner;

class Commission{
    public double sales;
    public Commission(double s){
        sales=s;
    }
    public double commission(){
        if(sales <500){
            return 0.02*sales;
        } else if (sales>=500 && sales<5000) {
            return 0.05*sales;
        }
        else {
            return 0.08*sales;
        }
    }
}
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the sales : ");
        double sales= scanner.nextDouble();
        if(sales < 0) System.out.println("Invalid input.");
        else {
            Commission commission=new Commission(sales);
            System.out.println("The commission on sales of " +sales+ " is " +commission.commission());
        }
    }
}
