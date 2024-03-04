package Week10;

import java.io.*;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String filePath="EmployeeRecord.txt";
        while(true) {
            System.out.println();
            System.out.println("MENU : ");
            System.out.println("1)Create a file of employee data with following  information : Employee No, Name, Sex, Gross Salary.");
            System.out.println("2)Append the data of a new employee joining the firm.");
            System.out.println("3)If a given employee leaves, delete his record.");
            System.out.println("4)If gross salary of a given employee increases, update the gross salary.");
            System.out.println("5)Display the record of the given employees.");
            System.out.println("6)Display the record of all employees.");
            System.out.println("7)Exit the program.");
            System.out.print("Enter your choice : ");
            int choice=scanner.nextInt();
            System.out.println();
            if(choice==7){
                break;
            }
            else {
                switch (choice){
                    case 1 :
                        System.out.print("Enter the number of employees you have : ");
                        int n=scanner.nextInt();
                        createFile(filePath,n);
                        break;
                    case 2 :
                        addNewEmployee(filePath);
                        break;
                    case 3 :
                        System.out.print("Enter the employeeNo of employee who left : ");
                        int left=scanner.nextInt();
                        deleteEmployeeRecord(filePath,left);
                        break;
                    case 4 :
                        System.out.print("Enter the employeeNo of employee whose gross salary is updated : ");
                        int update=scanner.nextInt();
                        System.out.print("Enter the new gross salary : ");
                        int newSalary=scanner.nextInt();
                        updateGrossSalary(filePath,update,newSalary);
                        break;
                    case 5 :
                        System.out.print("Enter the employeeNo of employee for the records : ");
                        int employeeNo=scanner.nextInt();
                        displayParticularEmployee(filePath,employeeNo);
                        break;
                    case 6 :
                        System.out.println("Displaying the record of all employees : ");
                        System.out.println();
                        displayAllEmployees(filePath);
                        break;
                    default:
                        System.out.println("Invalid Input. Please enter again. Enter 7 to break the program.");
                        break;
                }
            }
        }
    }
    private static int count=0;
    private static String empData(String name, String sex, int salary){
        count++;
        return count+","+name+","+sex+","+salary;
    }
    private static void createFile(String filePath, int employeeNo){
        Scanner scanner=new Scanner(System.in);
        try{
            try(FileOutputStream fos=new FileOutputStream(filePath)){
                try(BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(fos))){
                    for(int i=1;i<=employeeNo;i++){
                        System.out.print("Enter the name of employee " +i+ " : ");
                        String name=scanner.next();
                        System.out.print("Enter sex : ");
                        String sex=scanner.next();
                        System.out.print("Enter gross salary : ");
                        int salary= scanner.nextInt();
                        bw.write(empData(name,sex,salary)+"\n");
                        bw.flush();
                    }
                }
            }
        } catch (IOException e){
            System.err.println("Error creating the file.");
        }
    }
    private static void addNewEmployee(String filePath){
        Scanner scanner=new Scanner(System.in);
        try {
            try (FileOutputStream fos = new FileOutputStream(filePath, true)) {
                try(BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(fos))){
                    System.out.print("Enter the name of new employee : ");
                    String name=scanner.next();
                    System.out.print("Enter sex : ");
                    String sex=scanner.next();
                    System.out.print("Enter gross salary : ");
                    int salary= scanner.nextInt();
                    bw.write(empData(name,sex,salary)+"\n");
                    bw.flush();
                    System.out.println("Data Added Successfully.");
                    System.out.println();
                }
            }
        } catch (IOException e){
            System.err.println("Error appending the data of new employee.");
        }
    }
    private static void deleteEmployeeRecord(String filePath, int employeeNo){
        File f1=new File(filePath);
        File f2=new File("newEmployeeRecord.txt");
        try{
            try(BufferedReader br=new BufferedReader(new FileReader(f1))){
                try(BufferedWriter bw=new BufferedWriter(new FileWriter(f2))){
                    String line;
                    while ((line=br.readLine())!=null){
                        if(!(line.startsWith(String.valueOf(employeeNo)))){
                            bw.write(line+"\n");
                            bw.flush();
                        }
                    }
                }
            }
        } catch (IOException e){
            System.err.println("Error deleting the employee record.");
        }
        if(f1.delete() && f2.renameTo(f1)){
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Some error occured.");
        }
    }
    private static void updateGrossSalary(String filePath, int employeeNo, int newSalary){
        File f1=new File(filePath);
        File f2=new File("newEmployeeRecord.txt");
        try{
            try(BufferedReader br=new BufferedReader(new FileReader(f1))){
                try(BufferedWriter bw=new BufferedWriter(new FileWriter(f2))){
                    String line;
                    while((line=br.readLine())!=null){
                        if(line.startsWith(String.valueOf(employeeNo))){
                            System.out.println("Employee found, gross salary will be updated.");
                            String[] str=line.split(",");
                            str[3]=String.valueOf(newSalary);
                            bw.write(str[0]+","+str[1]+","+str[2]+","+str[3]+"\n");
                        }else{
                            bw.write(line+"\n");
                        }
                    }
                }
            }
        } catch(IOException e){
            System.err.println("Error updating the gross salary.");
        }
        if(f1.delete() && f2.renameTo(f1)){
            System.out.println("Process Completed");
        } else {
            System.err.println("There is some error.");
        }
    }
    private static void displayParticularEmployee(String filePath, int employeeNo){
        try{
            try(FileReader f1=new FileReader(filePath)){
                try(BufferedReader br=new BufferedReader(f1)){
                    String line;
                    while((line=br.readLine())!=null){
                        if(line.startsWith(String.valueOf(employeeNo))){
                            System.out.println(line);
                        }
                    }
                }
            }
        } catch (IOException e){
            System.err.println("Some error occured while displaying the record.");
        }
    }
    private static void displayAllEmployees(String filePath){
        try{
            try(FileReader f1=new FileReader(filePath)){
                try(BufferedReader br=new BufferedReader(f1)){
                    String line;
                    while ((line=br.readLine())!=null){
                        System.out.println(line);
                    }
                }
            }
        } catch(IOException e){
            System.err.println("Error occured displaying the record.");
        }
    }
}