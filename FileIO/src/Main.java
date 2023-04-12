import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file =new File("Anu.txt");

        //this will create a new file called Anu
        file.createNewFile();

        //write in the file
        FileWriter fileWriter= new FileWriter(file);
        fileWriter.write("This is java code.\n");
        fileWriter.write("This is java code.\n");
        fileWriter.write("This is java code.\n");
        fileWriter.write("This is java code.\n");
        fileWriter.write("This is java code.\n");
        fileWriter.close();

        //Read from the file
        try{
            FileReader fileReader =new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String reader= bufferedReader.readLine();
            while(reader != null){
                System.out.println(reader);
                reader=bufferedReader.readLine();
            }
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        //reads character ASCII value
//        System.out.println(fileReader.read());

        //character reads
//        int character =fileReader.read();
//        while(character != -1){
//            System.out.print((char)character);
//            character=fileReader.read();
//        }

//        int newChar;
//        while ((newChar=fileReader.read())!=-1){
//            System.out.print((char)newChar);
//        }
//        fileReader.close();


    }
}