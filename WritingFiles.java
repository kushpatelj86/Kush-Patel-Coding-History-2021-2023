import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WritingFiles
{

    public static void main(String[] args) {
       
       try
       {
        
        FileWriter w = new FileWriter("1's.txt");
        w.write("1\n");
        w.write("\n11");
        w.close();

       }
       catch(IOException e)
       {
        e.printStackTrace();
       }
       
       
       
    }



























}
