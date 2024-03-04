package Week10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Problem2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\reala\\Desktop\\MCA\\Semester 2\\LAB\\demo.txt");
            int count=0;
            try {
                while (fis.read() != -1) {
                    count++;
                }
            } catch (IOException e) {
                System.out.println("Error reading the file.");
            }
            System.out.println("Number of characters in the file is : " +count);
        } catch (FileNotFoundException f){
            System.out.println("File not found.");
        }

    }
}
