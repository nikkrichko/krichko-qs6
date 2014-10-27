package homeworks.homework_04;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class StringWriterHelper {
    public static void fileCleanUp(String filename){
        try {
            FileWriter file = new FileWriter("testfile.txt");
            BufferedWriter reader = new BufferedWriter(file);
            reader.write("");
            reader.close();
        } catch (Exception e)
        {System.err.println("Error in file cleaning: " + e.getMessage());}
    }

    public static void fileWriter(String filename, String sString, String sSubString){
        try {
            FileWriter file = new FileWriter(filename);
            BufferedWriter reader = new BufferedWriter(file);
            reader.write(sString + " has " + sSubString );
            reader.close();
        } catch (Exception e)
        {System.err.println("Error in file cleaning: " + e.getMessage());}
    }

}
