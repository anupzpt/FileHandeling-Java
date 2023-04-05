import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException  {
        System.out.println("<-- NotePad --> ");
        System.out.println("-----------------");

        Scanner scannerObj =new Scanner(System.in);
        String note = scannerObj.nextLine();


        File file=new File("Text.txt");
        file.createNewFile();

        FileWriter fileWriter =new FileWriter(file);
        fileWriter.write(note);
        fileWriter.close();

    }
}