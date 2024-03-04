package Week9;

import java.util.Scanner;

class Account{
    private String customerName;
    private int accNo;
    private String accType;
    private double balance;
    public Account(){}
    public Account(String customerName, int accNo, String accType, double balance){
        this.customerName=customerName;
        this.accNo=accNo;
        this.accType=accType;
        this.balance=balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccType() {
        return accType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Amount " +amount+ " deposited.");
        System.out.println("New Balance : " +getBalance() + "\n");
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Amount " +amount+ " debited.");
            System.out.println("Current Balance : " +getBalance()+"\n");
        }
    }
    public String toString(){
        return "Name : " +getCustomerName()+ "\n" + "Account Number : " +getAccNo()+"\n"+ "Type : " +getAccType()+ "\n" +"Balance : " +getBalance();
    }
}
class SavingAccount extends Account{
    private double interestRate=0.05;
    public SavingAccount(){}
    public SavingAccount(String customerName, int accNo, String accType, double balance){
        super(customerName,accNo,accType,balance);
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void interestCalculate(int days){
        double x=(double) days/365;
        double A=getBalance()*Math.pow(1+interestRate,x);
        System.out.println("Interest " +(A-getBalance())+ " deposited.");
        setBalance(A);
        System.out.println("New Balance : " +getBalance()+"\n");
    }
}
class CurrentAccount extends Account{
    private double minimumBalance=10000;
    private double penalty=70;
    public CurrentAccount(){}
    public CurrentAccount(String customerName, int accNo, String accType, double balance){
        super(customerName,accNo,accType,balance);
    }

    public double getPenalty() {
        return penalty;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void penaltyApplied(){
        if(getBalance()<=minimumBalance){
            double m=getBalance()-penalty;
            setBalance(m);
            System.out.println("Penalty imposed, New balance : " +getBalance()+"\n");
        } else {
            System.out.println("Minimum balance maintained." +"\n");
        }
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String customerName=scanner.next();
        System.out.print("Enter your account no. : " );
        int accNo= scanner.nextInt();
        System.out.print("Enter account type (S for saving, C for current) :");
        String accType=scanner.next();
        if(accType.equalsIgnoreCase("S")){
            System.out.print("Enter the balance : ");
            double balance= scanner.nextDouble();
            SavingAccount s1=new SavingAccount(customerName,accNo,accType,balance);
            System.out.println();
            System.out.print("Enter the amount you want to deposit : ");
            double amount=scanner.nextDouble();
            s1.deposit(amount);
            System.out.print("Enter the amount you want to withdraw : ");
            double withDrawAmount=scanner.nextDouble();
            s1.withdraw(withDrawAmount);
            System.out.println();
            System.out.print("Enter the number of days for which you want to calculate interest : ");
            int days= scanner.nextInt();
            s1.interestCalculate(days);
        } else if (accType.equalsIgnoreCase("C")) {
            System.out.print("Enter the balance : ");
            double balance=scanner.nextDouble();
            CurrentAccount c1=new CurrentAccount(customerName,accNo,accType,balance);
            System.out.println();
            System.out.print("Enter the amount you want to deposit : ");
            double amount=scanner.nextDouble();
            c1.deposit(amount);
            System.out.print("Enter the amount you want to withdraw : ");
            double withDrawAmount=scanner.nextDouble();
            c1.withdraw(withDrawAmount);
            c1.penaltyApplied();
            System.out.println(c1);
        } else {
            System.out.println("Invalid input for account type.");
        }
    }
}

