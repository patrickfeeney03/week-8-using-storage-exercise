package ie.atu.week8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {

        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the name of the file that you want to print: ");
            String filename = keyboard.nextLine();
            try{
                Scanner inputFile = new Scanner(new File(filename));
                while (inputFile.hasNextLine()) {
                    System.out.println(inputFile.nextLine());
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
