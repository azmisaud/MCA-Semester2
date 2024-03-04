package Week2;

public class Problem3 {
    public static void main(String[] args) {
        double sum = Math.addExact(11,7);
        System.out.println("The sum of 11 and 7 is " +sum);
        double difference = Math.subtractExact(19,10);
        System.out.println("The difference of 19 and 10 is " +difference);
        double product = Math.multiplyExact(10,5);
        System.out.println("The product of 10 and 5 is " +product);
        double quotient = Math.floorDiv(20,4);
        System.out.println("The quotient when 20 divided by 4 is " +quotient);
        double remainder = Math.floorMod(10,3);
        System.out.println("The remainder when 10 is divided by 3 is " +remainder);
        double power = Math.pow(4,2);
        System.out.println(" 4 raised to power 2 is " +power);
        double sqrt = Math.sqrt(49);
        System.out.println("The square root of 49 is " +sqrt);
        double e = Math.E;
        System.out.println("The value of e is " +e);
        double logarithm = Math.log(e);
        System.out.println("log of e with base e is " +logarithm);
        double logBase10 = Math.log10(100);
        System.out.println("log of 100 with base 10 is " +logBase10);
        double sine = Math.sin(Math.toRadians(30));
        System.out.println("sin 30 = " +sine);
        double cosine = Math.cos(Math.toRadians(60));
        System.out.println("cos 60 = " +cosine);
        double tan = Math.tan(Math.toRadians(45));
        System.out.println("tan 45 = " +tan);
        double pi = Math.PI;
        System.out.println("The value of PI is " +pi);
        double roundValue = Math.round(6.567);
        System.out.println("The rounded value of 6.567 is " +roundValue);
        double ceilValue = Math.ceil(6.567);
        System.out.println("The ceil value of 6.567 is " +ceilValue);
        double floorValue = Math.floor(6.567);
        System.out.println("The floor value of 6.567 is " +floorValue);
        double randomValue = Math.random();
        System.out.println("Random value generated is " +randomValue);
        double absValue = Math.abs(-100.56);
        System.out.println("The absolute value of -100.56 is " +absValue);
    }
}
