package ie.atu.week8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void main(String[] args) {

        {
            File myFile = new File("MyFile.txt");
            System.out.println("My file is located at " + myFile.getAbsolutePath());

            try{
                PrintWriter myFilePrinter = new PrintWriter(
                        new FileWriter(myFile, true));

                myFilePrinter.println("My teacher is Paul Lenon.");
                myFilePrinter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
