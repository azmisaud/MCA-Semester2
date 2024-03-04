package Week7;

import java.util.Scanner;

interface ArithmeticOperations{
    int sum();
    int difference();
    int product();
    void quotient();
}
interface OtherMathOperations{
    int max();
    int min();
    void gcd();
    void lcm();

}
class W07Q02P01 implements ArithmeticOperations, OtherMathOperations{
    private int num1;
    private int num2;
    public W07Q02P01(){
        setNum1(0);
        setNum2(0);
    }
    public W07Q02P01(int num1,int num2){
        setNum1(num1);
        setNum2(num2);
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    @Override
    public int sum() {
        return num1+num2;
    }

    @Override
    public int difference() {
        return num1-num2;
    }

    @Override
    public int product() {
        return num1*num2;
    }

    @Override
    public void quotient() {
        if(num2!=0){
            System.out.println("Quotient : " +(double) num1/num2);
        }
        else {
            System.out.println("Division by zero is not possible.");
        }
    }

    @Override
    public int max() {
        return Math.max(num1,num2);
    }

    @Override
    public int min() {
        return Math.min(num1,num2);
    }

    @Override
    public void gcd() {
        System.out.println("The GCD of two integers is same as the GCD of their absolute values.");
        int n1=Math.abs(num1);
        int n2=Math.abs(num2);
        int GCD=1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                GCD=i;
            }
        }
        System.out.println("The GCD of " +num1+ " and " +num2+ " is : " +GCD);
    }

    @Override
    public void lcm() {
        System.out.println("The LCM of two integers is same as the LCM of their absolute values.");
        int n1=Math.abs(num1);
        int n2=Math.abs(num2);
        int LCM=n1*n2;
        for(int i=n1*n2; i>=Math.max(n1,n2);i--){
            if(i%n1==0 && i%n2==0){
                LCM=i;
            }
        }
        System.out.println("The LCM of " +num1+ " and " +num2+ " is : " +LCM);
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.print("Enter first number : ");
        a= scanner.nextInt();
        System.out.print("Enter second number : ");
        b= scanner.nextInt();
        W07Q02P01 obj1=new W07Q02P01(a,b);
        System.out.println("First Number : " +obj1.getNum1());
        System.out.println("Second Number : " +obj1.getNum2());
        System.out.println();
        System.out.println("Sum : " +obj1.sum());
        System.out.println("Difference : " +obj1.difference());
        System.out.println("Product : " +obj1.product());
        obj1.quotient();
        System.out.println();
        System.out.println("Maximum : " +obj1.max());
        System.out.println("Minimum : " +obj1.min());
        System.out.println();
        obj1.gcd();
        System.out.println();
        obj1.lcm();
    }
}
