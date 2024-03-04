package Week10;

import java.io.*;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        File f=new File("ProductDetails.txt");
        Scanner scanner=new Scanner(System.in);
        try{
            try(BufferedWriter br=new BufferedWriter(new FileWriter(f))){
                br.write("Details are stored in the form : S.No,Code,Cost,ItemsAvailable"+"\n");
                for(int i=1;i<=5;i++){
                    System.out.print("Enter code of product "+i+ " : ");
                    String code=scanner.next();
                    System.out.print("Enter cost of product "+i+ " : ");
                    double cost=scanner.nextDouble();
                    System.out.print("Enter number of items available : ");
                    int itemsAvailable=scanner.nextInt();
                    br.write(i+","+code+","+cost+","+itemsAvailable+"\n");
                    br.flush();
                    System.out.println();
                    System.out.println("Product "+i+ " details added to the file.");
                    System.out.println();
                }
            }
        } catch (IOException e){
            System.err.println("Some error occured.");
        }
    }
}
