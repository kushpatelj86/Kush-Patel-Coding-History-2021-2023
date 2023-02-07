import java.io.File;

public class FileClassPart1
{
    public static void main(String[] args) 
    {
        
        //file = an abstract representation of file and directory pathnames

        File file = new File("1.txt");




        if(file.exists())
        {
            System.out.println("File exists!");
        }
        else
        {
            System.out.println("File doesn't exists!");
        }





        




























    }
}