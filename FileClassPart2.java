import java.io.File;

public class FileClassPart2
{
    public static void main(String[] args) 
    {
        
        //file = an abstract representation of file and directory pathnames

        File file = new File("15.txt"); //checks to see if file doesnt exist




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