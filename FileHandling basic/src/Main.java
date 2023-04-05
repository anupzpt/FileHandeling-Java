import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       File file =new File("Text.txt");

        //this will create a new file called Text
       file.createNewFile();

       //write in the file
       FileWriter fileWriter=new FileWriter(file);
       fileWriter.write(" Learning file handling in Java. ");

       //until and unless we close it doesn't show in text file as it indicates sth is still written
       fileWriter.close();

    }
}