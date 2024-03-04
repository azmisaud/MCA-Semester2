package Week3;

public class Problem3 {
    public static void main(String[] args) {
        double sum=0.0;
        for(double i=1;i<=10;i++){
            sum+=(1/i);
        }
        System.out.println("Sum of the series is : " +sum);
    }
}
