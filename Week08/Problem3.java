package Week8;

import java.util.Scanner;

class Vehicle{
    String Company;
    double price;
    public Vehicle(){}
    public Vehicle(String Company, double price){
        this.Company=Company;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Company : " +Company+ "\n" + "Price : " +price;
    }
}
class LightMotorVehicle extends Vehicle{
    double mileage;
    public LightMotorVehicle(){}
    public LightMotorVehicle(String Company, double price, double mileage){
        super(Company,price);
        this.mileage=mileage;
    }
    public String toString(){
        return super.toString() +"\n"+ "Type : Light Motor Vehicle" +"\n"+ "Mileage : " +mileage;
    }
}
class HeavyMotorVehicle extends Vehicle{
    double capacityInTons;
    public HeavyMotorVehicle(){}
    public HeavyMotorVehicle(String Company,double price, double capacityInTons){
        super(Company,price);
        this.capacityInTons=capacityInTons;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+ "Type : Heavy Motor Vehicle" +"\n"+ "Capacity in Tons : " +capacityInTons;
    }
}
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of Vehicle : ");
        int n= scanner.nextInt();
        Vehicle[] vehicles=new Vehicle[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of Vehicle " +(i+1));
            System.out.print("Enter the Price : ");
            double price= scanner.nextDouble();
            System.out.print("Enter the Company : ");
            String Company= scanner.next();
            System.out.print("Enter the type (L for light, H for Heavy) : ");
            String Type=scanner.next();
            if(Type.equals("L")){
                System.out.print("Enter Mileage : ");
                double mileage= scanner.nextDouble();
                vehicles[i]=new LightMotorVehicle(Company,price,mileage);
            } else if (Type.equals("H")) {
                System.out.print("Enter capacity in tons : ");
                double capacityInTons= scanner.nextDouble();
                vehicles[i]=new HeavyMotorVehicle(Company,price,capacityInTons);
            } else {
                System.out.println("Invalid Input.Please enter again.");
                i--;
            }
            System.out.println();
        }
        for(Vehicle x: vehicles){
            System.out.println();
            System.out.println(x);
        }
    }
}
