package Week6;

import java.util.Scanner;

class BankAccount{
    private String name;
    private String accNo;
    private String accType;
    private double balance;

    public void setName(String name) {
        this.name = name;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getAccType() {
        return accType;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println(amount + "/- deposited.");
        System.out.println("New Balance : " +getBalance());
    }
    public void withDraw(double amount){
        if(amount>balance) System.out.println("Insufficient balance.");
        else {
            balance-=amount;
            System.out.println(amount+ "/- debited.");
            System.out.println("Remaining Balance : " +getBalance());
        }
    }
    public void display(){
        System.out.println("Name : " +getName());
        System.out.println("Balance : " +getBalance());
    }

}
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name= scanner.next();
        System.out.print("Enter the account number : ");
        String accNo= scanner.next();
        System.out.print("Enter the account type : ");
        String accType=scanner.next();
        System.out.print("Enter initial balance : ");
        double initialBalance= scanner.nextInt();
        BankAccount bankAccount=new BankAccount();
        bankAccount.setName(name);
        bankAccount.setAccNo(accNo);
        bankAccount.setAccType(accType);
        bankAccount.setBalance(initialBalance);
        System.out.println();
        System.out.print("Enter the amount you want to deposit : ");
        double amountD= scanner.nextDouble();
        bankAccount.deposit(amountD);
        System.out.println();
        System.out.print("Enter the amount you want to withdraw : ");
        double amountW= scanner.nextDouble();
        bankAccount.withDraw(amountW);
        System.out.println();
        bankAccount.display();
    }
}

