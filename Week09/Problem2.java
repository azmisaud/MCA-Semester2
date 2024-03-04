package Week9;

import java.util.Scanner;

class Fruit{
    private String name;
    private String type;
    public Fruit(){}
    public Fruit(String name, String type){
        this.name=name;
        this.type=type;
    }
    public void display(){
        System.out.println("\n"+ "Name of fruit : " +name);
        System.out.println("Type of fruit : " +type+ "\n");
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the name of the fruit 1 : ");
        String name1= scanner.next();
        System.out.print("Enter the type of the fruit 1 : ");
        String type1=scanner.next();
        if(type1.equalsIgnoreCase("single") || type1.equalsIgnoreCase("bunch")){
            Fruit fruit1=new Fruit(name1, type1);
            fruit1.display();
        } else {
            System.out.println("Invalid input for type. Enter 'single' or 'bunch'.");
        }
        System.out.print("Enter the name of the fruit 2 : ");
        String name2= scanner.next();
        System.out.print("Enter the type of the fruit 2 : ");
        String type2=scanner.next();
        if(type2.equalsIgnoreCase("single") || type2.equalsIgnoreCase("bunch")){
            Fruit fruit2=new Fruit(name2, type2);
            fruit2.display();
        } else {
            System.out.println("Invalid input for type. Enter 'single' or 'bunch'.");
        }
    }
}

