package ie.atu.week8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        {
            File myFile = new File("MyFile.txt");
            System.out.println("My file is located at " + myFile.getAbsolutePath());
            try{
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write("This text gets appended to the file every time I run the code. ");
                myWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            } // If I run this again, the file
        }

    }
}
