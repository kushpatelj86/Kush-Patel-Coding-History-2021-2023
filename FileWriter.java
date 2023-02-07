import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriter
{

    public static void main(String[] args) {
       
       try
       {
        
        FileWriter w = new FileWriter("poem.txt");

       }
       catch(IOException e)
       {
        e.printStackTrace();
       }
       
       
       
    }



























}
