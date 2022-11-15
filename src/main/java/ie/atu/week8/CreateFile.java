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
                FileWriter myWriter = new FileWriter(myFile);
                myWriter.write("This is some text that I aasdasda dASDASDADm writing.");
                myWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
