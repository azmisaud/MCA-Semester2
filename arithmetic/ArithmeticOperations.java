package arithmetic;

public class ArithmeticOperations {
    public static int add(int a, int b){
        return a+b;
    }
    public static int difference(int a, int b){
        return a-b;
    }
    public static int product(int a, int b){
        return a*b;
    }
    public static void quotient(int a, int b){
        if(b!=0){
            double quotient=(double) a/b;
            System.out.println("Quotient : " +quotient);
        } else {
            System.out.println("Warning : Division by Zero.");
        }
    }
}
