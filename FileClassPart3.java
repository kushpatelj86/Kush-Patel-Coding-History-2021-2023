import java.io.File;

public class FileClassPart3
{
    public static void main(String[] args) 
    {
        
        //file = an abstract representation of file and directory pathnames

        File file = new File("C:/Users/Kush/Downloads/C:/Users/Kush/Downloads/use-prototype-properties-to-reduce-duplicate-code.txt"); //checks to see if file exists outside the folder but in our computer



        if(file.exists())
        {
            System.out.println("File exists!");
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is File: " + file.isFile());
           // file.delete();

        }
        else
        {
            System.out.println("File doesn't exists!");
        }





        




























    }
}