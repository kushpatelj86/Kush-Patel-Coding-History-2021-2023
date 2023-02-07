import java.util.ArrayList;
import java.awt.*;
import java.awt.image.*;
import javax.lang.model.util.ElementScanner6;
import javax.print.attribute.standard.MediaSize.Other;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class RecursionTester
{
    private int[][] matrix = null;
    private String secret;
    public static void main(String[] args) 
    {
        String Str1 = new String("first string");
        String Str2 = "first string";
        String Str3 = Str1;
        
        System.out.println(Str2.substring(20));

       
//5
///"val is any integr number 10 to 1";


    }



    public double myPower(double base, int exponent)
    {
        double answer;
        if(exponent == 0)
        {
            answer = 1;
        }
        else if(exponent < 0)
        {
            answer = (1 / base) * myPower(base, exponent + 1);
        }
        
        else
        {
            answer = base * myPower(base, exponent - 1);
        }
        return answer;
    }


    private static String mystery(String Test)
    {
        int length;
        String Result = "";
        String First;
        String Middle;
        String Last;

        

        length = Test.length();
        if(length > 1)
        {
            First = Test.substring(0, 1);
            Middle = Test.substring(1, length - 1);
            Last = "" + Test.charAt(length - 1);
            Result = Last + First + mystery(Middle);
        }
        return Result;
    }

    public int mystery(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n % 2 == 1)
        {
            return n;
        }
        else 
        {
            return n + mystery(n - 1);
        }
    }

    public String moveLastCharactertoTheFront(String Sentence)
    {
        String Result;
        Sentence = Sentence.trim();
        String lastCharacter;
        String otherCharacters;
        int length = Sentence.length();

        if(length > 0)
        {
            lastCharacter = Sentence.substring(length - 1);
            otherCharacters = Sentence.substring(0, length - 1);
            Result = lastCharacter + otherCharacters;
        }

        else
        {
            Result = Sentence;
        }
        return Result;
    }

    public String reverse(String Sentence)
    {
        String Result;
        String LastCharacter;
        String OtherCharacters;
        int Length;
        Length = Sentence.length();
        
        if(Length > 0)
        {
            LastCharacter = Sentence.substring(Length - 1);
            OtherCharacters = Sentence.substring(0, Length - 1);
            Result = LastCharacter + reverse(OtherCharacters);

        }
        else
        {
            Result = Sentence;
        }
        return Result;

    }
    public int someMethod(int val)
    {
        for(int i = 2; i < 7; i++)
        {
            if((val + i) % 2 == 0)
            {
                val += 3;
            }
        }
        return val;
    }

    public int loopy(int n)
    {
        if( n % 7 == 0)
        {
            return n;
        }
        return loopy(n + 3) + 2;
    }

       

   /* public int numberOfLeapYears(int year1, int year2)
    {
        int numLeapYears = 0;
        for(int yr = year1; year1 <= year2; yr++)
        {
            if(isLeapYear(yr))
            {
                numLeapYears++;
            }
            
        }
        return numLeapYears;
    }*/

  /* public int dayOfWeek(int month, int day, int year)
    {
        int firstDay = firstDay(year);
        int nthDay = dayOfYear(month, day, year);.
        int weekDay = (firstDay + nthDay - 1) % 7;
        return weekDay;
    }*/

    public void ptinyData()
    {
        for(int i = 10; i >= 1; i--)
        {
            for(int n = i; n >= 1; n--)
            {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
    
    public void printStars1(int n)
    {
        if(n == 0)
        {
            System.out.println("");
        }
        else
        {
            for(int i = 1; i <= n; i++)
            {
                System.out.print("*");
            }
            System.out.println();
            printStars1(n - 1);
        }
    }

 
    public void printPuzzle1()
    {
        for(int i = 1; i <= 10; i++)
        {
            for(int k = 1; k <= 10; k++)
            {
                if(k == i)
                {
                    System.out.print(2 * k);
                }
                else
                {
                    System.out.print("-");
                }

            }
            System.out.println();
        }
    }
    public void printSequence()  
    {
        for(int i = 50; i >= 10; i--)
        {
            for(int k = i; k >= 10; k--)
            {
                System.out.println((2 * k) - 1);
            }
            System.out.println();
        }
       
    }  

    

    public void getNumbers()
    {
        ArrayList <Integer> numbers = new ArrayList<Integer>(20);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        numbers.set(2, 4);
        
        numbers.remove(3);
        numbers.add(1, 0);
        for(int i = 0  ; i < numbers.size(); i++)
        {
            System.out.println(i + ": " + numbers.get(i));
        }



    }
    /*int count = 0;
    int number = 20;
    while(number > 0)
    {
    number  = number/ 2
    count++*/
        public void printLines(int n)
        {
            if( n == 0)
            {
                System.out.println();
            }
            else
            {
                for(int i = 0; i < n; i++)
                {
                    System.out.print("-");
                }
                System.out.println();
                printLines(n - 1);
            }
        }
        public void printColor()
        {
            for (int col = 0; col < 400; col++ )
            {
                for (int row = 0; row < 300; row++ )
                {
                    if ( 3*col + 4*row <= 1200 )
                    {
                    }
                }
                
            }
   	    
        }
        public void getChar()
        {
            ArrayList <Character> chars = new ArrayList<Character>(5);
            chars.add('2');
            chars.add('!');
            chars.add('r');
            chars.add('-');
            chars.add(2,'S');
            chars.add('&');
            chars.remove(3);
            chars.set(0, 'a');

            for(int i = 0; i < chars.size(); i++)
            {
                System.out.println(i + ": " + chars.get(i));
            }




        }
        private void getPresidents()
        {
            ArrayList <String> presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie  = new ArrayList<String>();
            presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.add("P:Raegan and VP:Bush Sr");
            presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.add("P:Bush Sr and VP:Quayle");
            presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.add("P:Clinton and VP:Gore");
            presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.add("P:Bush Jr and VP:Cheney");
            presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.add("P:Obama and VP:Biden");
            presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.add("P:Trump and VP:Pence");
            presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.add("P:Biden and VP:Harris");
            presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.set(4, "P:Gore and VP:Biden");
            presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.remove(5);
            presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.add("P:Biden and VP:Warren");

            for(int i = 0; i <= presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.size() - 1; i++)
            {
                System.out.println(presidentsAndVicePresidentsIfGoreRanagainandBeaudidntdie.get(i));
            }

            

        }

        private void getAvengers()
        {
            ArrayList<String> avengers = new ArrayList<String>();
            avengers.add("Iron Man");
            avengers.add("Captain America");
            avengers.add("Thor");
            avengers.add("Hulk");
            avengers.add("Black Widow");
            avengers.add("Hawkeye");
            avengers.add("Spider Man");
            avengers.add("Falcon");
            avengers.add("The Winter Soldier");
            avengers.add("War Machine");
            avengers.add("Captain Marvel");

            for(int i = 0; i < avengers.size(); i++)
            {
                String leader = avengers.get(i);
                if(leader.equals("Captain America"))
                {
                    System.out.println("The leader is " + leader);

                }
            }
        }

        private void getMAX()
        {
           ArrayList<Integer> numbers  = new ArrayList<>();
           numbers.add(12);
           numbers.add(27);
           numbers.add(34);
           numbers.add(49);
           numbers.add(51);
           numbers.add(65);
           numbers.add(73);
           numbers.add(81);
           numbers.add(96);
           int max = numbers.get(3);
           for(int i = 0; i < numbers.size(); i++)
           {
               int number = numbers.get(i);
               if(number > max)
               {
                   max = number;
               }
           }
           System.out.println("Max is " + max);

        }

        private void getLeaderOfJusticLeague()
        {
            ArrayList<String> justicleague = new ArrayList<String>();
            justicleague.add("Superman");
            justicleague.add("Batman");
            justicleague.add("Robin");
            justicleague.add("Cyborg");
            justicleague.add("Wonderwoman");
            justicleague.add("The Flash");
            justicleague.add("Aquaman");
            justicleague.add("Green Lantern");
            justicleague.add("Martian Manhunter");

            for(int i = 0; i <= justicleague.size() - 1; i++)
            {
                String leader = justicleague.get(i);
                if(leader.equals("Martian Manhunter"))
                {
                    System.out.println(leader + " is the leader and founder of the justice league"  );
                }
            }
        }


public int getCount(int number)   //// non for loop version
  {
    int count = 0;
    for(int row = 0; row < matrix.length; row++)
    {
      for(int col = 0; col < matrix[0].length; col++)
      {
        if(matrix[row][col] == number)
        {
          count++;
        }
      }
    }
    return count;
  }

        private void numbers()
        {
            ArrayList<Integer> scores = new ArrayList<Integer>();
            scores.add(64);
            scores.add(75);
            scores.add(67);
            scores.add(78);
            scores.add(73);
            scores.add(85);
            scores.add(97);
            scores.add(79);
            scores.add(67);
            int max = scores.get(2);
            for(int i = 0; i < scores.size(); i++)
            {
                int number = scores.get(i);
                if(number > max)
                {
                    max = number;
                }
            }
            System.out.println("Max is " + max);

        }
        private void getTum()
        {
            ArrayList<Integer> nums = new ArrayList<Integer>();
            for(int i = 0; i < nums.size(); i++)
            {
                if(nums.get(i) % 2 == 0)
                {
                    nums.add(99);
                }
                System.out.println(nums.size());
            }
            
        }

        private void getBattlesOfWorldWar2()
        {
            ArrayList<String> battles = new ArrayList<String>();
            battles.add("Invasion of Poland");
            battles.add("Battle of Somme");
            battles.add("Battle of Midway");
            battles.add("Battle of Stalingrand");
            battles.add("Treaty of Versailes");
            battles.set(1, "Attack on pearl Harbor");
            battles.add(2, "Battle of Britain");
            battles.remove(5);
            battles.add("Atomic Bombing of Hiroshima and Nagasaki");
            for(int i = 0; i < battles.size(); i++)
            {
                System.out.println(battles.get(i));
            }

            // Invasion of Poland // Attack on pearl Harbor // Battle of Britain // Battle of Midway // Battle of Stalingrand // Atomic Bombing of Hiroshima and Nagasaki
        }

        public int substract()
        {
            int finalResult = 0;
            int substractNum = 0;
            try
            {
                File MyFile = new File("200.txt");
                Scanner FileReader = new Scanner(MyFile);
                while(FileReader.hasNext())
                {
                    substractNum = FileReader.nextInt();
                    finalResult -= substractNum;
                    
                    
                }
                FileReader.close();
                if(finalResult < 0)
                {
                        System.out.println("Sorry you can't have a negative");
                }
                else
                {
                    System.out.println(finalResult);
                }
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());

            }
            return finalResult;
        }

        public void printNums()
        {
            int i = 0;
            while(i < 6)
            {
                i++;
                System.out.println(i);

            }
        }
        public void printClassRoom()
        {
            for(int i = 0; i <=8; i++)
            {
                for(int k = 0; k <= 4; k++)
                {
                    System.out.print("*");
                }
                
                System.out.println();
            }
        }

        public void getAnser()
        {
            for(int i = 0; i < 10; i++)
            {
                for(int j = 0; j < 10; j++)
                {
                    System.out.println(i * j);
                }
            }
        }

        public void getResult()
        {
            for(int i = 0; i < 10; i++)
            {
                for(int k = 0; k < 10; k++)
                {
                    if(k == i)
                    {
                        System.out.print(k);
                    }
                    else
                    {
                        System.out.print("&");
                    }
                }
                System.out.println();
            }
        }

        public void getResult(int n)
        {
            for(int i = 0; i <= n; i++)
            {
                for(int k = 0; k < 10; k++)
                {
                    if(k == i)
                    {
                        System.out.print(k);
                    }
                    else
                    {
                        System.out.print("&");
                    }
                }
                System.out.println();
                getResult(n - 1);
            }
        }

        public void printData()
        {
            for(int i = 1; i <= 20; i++)
            {
                for(int k = i; k <= 20; k++)
                {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }

        public void printLn()
        {
            for(int i = 1; i <= 20; i++)
            {
                for(int k = 1; k <= i; k++)
                {

                    if(k == i)
                    {
                        System.out.print(2 * k + " ");
                    }
                    else
                    {
                        System.out.print("*" + " ");
                    }

                }
                System.out.println();
            }
        }

        public void printTr()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = 1; k <= i; k++)
                {
                    if(k == i)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
        }

        public void printY()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int n = 1; n <= 10; n++)
                {
                    if(n == i)
                    {
                        System.out.print(2 * n + " ");
                    }
                    else
                    {
                        System.out.print("-" + " ");
                    }
                }
                System.out.println();
            }
        }

        public void printg()
        {
            for(int i = 10; i <= 1; i--)
            {
                for(int k = 10; k <= i; k--)
                {
                    if(k == i)
                    {
                        System.out.print(2 * k);
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }

        public void printL()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = i; k <= 10; k++)
                {
                    if(k == i)
                    {
                        System.out.print(2 * k);
                    }
                    else
                    {
                        System.out.print("*");
                    }
                    
                }
                System.out.println();
            }
        }
    

        public void devide()
        {
            int devideNum;
            int total;
            try
            {
                File MyFile = new File("devide.txt");
                Scanner FileReader = new Scanner(MyFile);
                
                    devideNum = FileReader.nextInt();
                
                
                
                System.out.println(devideNum);
               

                
            }

            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }

        }

        public void gIGO()
        {
            for(int i = 10; i >= 1;i--)
            {
                for(int k = i; k >= 1; k--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public void gIHO()
        {
            for(int i = 10; i >= 1; i--)
            {
                for(int k = 10; k >= i; k--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public void gHLO()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = i; k <= 10;k++)
                {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
        
        public void gHHO()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = 1; k <= i; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public void printEmotes()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = 1; k <= 10; k++)
                {
                    if(k == i)
                    {
                        System.out.print(" :) ");
                    }
                    else
                    {
                        System.out.print(" :( ");
                    }
                }
                System.out.println();
            }
        }

        public void addNum()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = 1; k <= 10; k++)
                {
                    if(k == i)
                    {
                        System.out.print(" " + 5 * k + " ");
                    }
                    else
                    {
                        System.out.print(" & ");
                    }
                }
                System.out.println();
            }
        }

        public void readNum()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = i; k <= 10; k++)
                {
                    if(k == i)
                    {
                        System.out.print(" * ");
                    }
                    else
                    {
                        System.out.print(" - ");
                    }
                   
                }
                System.out.println();
            }
        }

        public void rNum()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = 1; k <= i; k++)
                {
                    if(k == i)
                    {
                        System.out.print(" * ");
                    }
                    else
                    {
                        System.out.print(" + ");
                    }
                   
                }
                System.out.println();
            }
        }

        public void sNum()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = i; k <= 10; k++)
                {
                    System.out.print(" % ");
                }
                System.out.println();
            }
        }

        public void tNum()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = 1; k <= i; k++)
                {
                    System.out.print(" $ ");
                }
                System.out.println();

            }
        }

        public void rettro()
        {
            for(int i = 1; i <= 10 ; i++)
            {
                for(int k = i; k <= 10; k++)
                {
                    if(k == i)
                    {
                        System.out.print(" " + 2 * k + " ");
                    }
                    else
                    {
                        System.out.print(" * ");
                    }
                }
                System.out.println();
            }

           
        }
        public void dum()
        {
            for(int i = 10; i >= 1; i--)
            {
                for(int k = i; k >= 1; k--)
                {
                    System.out.print(" " + 2 * k + " ");
                }
                System.out.println();
            }
        }
        
        public void dsf()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = 1; k <= 10; k++)
                {
                    if(k == i)
                    {
                        System.out.print(" " + 5 * k + " ");
                    }
                    else
                    {
                        System.out.print(" * ");
                    }
                }
                System.out.println();
            }
        }

        public void rdf()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = 1; k <= i; k++)
                {
                    if(k == i)
                    {
                        System.out.print(" " + 2 * k + " ");
                    }
                    else
                    {
                        System.out.print(" * ");
                    }
                }
                System.out.println();
            }
        }

        public void rgh()
        {
            int x = 10;
            int y = 0;
            while(x > 0)
            {
                y = 3;
                while(y < x)
                {
                    y *= 2;
                }
                x -= 3;

            }
            System.out.println(x + "    " + y);
        }

        public void er()
        {
            for(int i = 1; i <= 5; i++)
            {
                for(int k = 1; k <= 5; k++)
                {
                    if(k == i)
                    {
                        System.out.print(" " + 2 * k + " ");
                    }
                    else
                    {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }

        public void will()
        {
            int i = 10;
            while(i > 0)
            {
                i--;
                System.out.println(i);
            }
        }

        public int findNumGreaterThan5(String File)
        {
            int number;
            int count = 0; 
            try
            {
                File MyFile = new File(File);
                Scanner FileReader = new Scanner(MyFile);
                while(FileReader.hasNext())
                {
                    number = FileReader.nextInt();
                    if(number > 5)
                    {
                        count++;
                    }
                }
                FileReader.close();
            }
            catch(IOException Error)
            {
                System.out.println(Error.getMessage());
            }
            return count;
        }

        public void swe()
        {
            for(int i = 5; i >= 0; i--)
            {
                for(int k = i; k >= 0; k--)
                {
                    System.out.print(" " + k + " ");
                }
                System.out.println();
            }
        }
        public void dse()
        {
            for(int i = 5; i >= 0; i--)
            {
                for(int k = 5; k >= i; k-- )
                {
                    System.out.print(" " + (2 * k - 1 )+ " ");
                }
                System.out.println();
            }
        }

        public int countStringGreaterThan5(String FileName)
        {
            String line;
            int count = 0;
            try
            {
                File MyFile = new File(FileName);
                Scanner FileReader = new Scanner(MyFile);
                while(FileReader.hasNext())
                {
                    line = FileReader.nextLine();
                    if(line.length() > 5)
                    {
                        count++;
                    }
                }
                FileReader.close();
            }
            catch(IOException exception)
            {
                System.out.println(exception.getMessage());
            }
            return count;
        }

        public int readFile(String FileName)
        {
            double value;
            int count = 0;
            try
            {
                File MyFile = new File(FileName);
                Scanner FileReader = new Scanner(MyFile);
                while(FileReader.hasNext())
                {
                    value = FileReader.nextDouble();
                    if(value < 1.0 && value > 0.0)
                    {
                        count++;
                    }
                }
                FileReader.close();
            }
            catch(IOException Error)
            {
                System.out.println(Error.getMessage());
            }
            return count;
        }

        public void asd()
        {
            for(int i = 1; i <= 5; i++)
            {
                for(int k = 1; k <= i; k++ )
                {
                    if( k== i)
                    {
                        System.out.print(" " + (6 * k) + " ");
                    }
                    else
                    {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }

        public void printas()
        {
            for(int i = 1; i <= 5; i++)
            {
                for(int k = i; k <= 5; k++)
                {
                    System.out.print(" a ");
                }
                System.out.println();

            }
        }

        public void printplus()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = 1; k <= i; k++)
                {
                    System.out.print("+");
                }
                System.out.println();
            }
        }

        public void printReversePlus()
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int k = i; k <= 10; k++)
                {
                    System.out.print("+");
                }
                System.out.println();
            }
        }

        public void printTattern()
        {
            for(int i = 0; i <= 10; i++)
            {
                for(int k = i; k <= 10; k++)
                {
                   
                    System.out.print(" * ");
                   
                }
                System.out.println();
            }
        }
        public void recursion()
        {
            for(int i = 10; i >= 1; i--)
            {
                for(int k = i; k >= 1; k--)
                {
                    System.out.print(" " + (2 * k - 1) + " ");
                }
                System.out.println();
            }
        }

        public void troy()
        {
            for(int i = 1; i <= 5; i++)
            {
                for(int k = 1; k <= i; k++)
                {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
        public void pcr()
        {
            for(int i = 1; i <= 5; i++)
            {
                for(int k = i; k <= 5; k++)
                {
                    System.out.print(2 * k + " ");
                }
                System.out.println();
            }
        }
        public int CountMultipleOf10(String FileName)
        {
            int count = 0;
            int value;
            int multiple;
            try
            {
                File MyFile = new File(FileName);
                Scanner FileReader = new Scanner(MyFile);
                while(FileReader.hasNext())
                {
                    value = FileReader.nextInt();
                    multiple = value % 10;
                    if(multiple == 0)
                    {
                        count++;
                    }
                }
                FileReader.close();
            }
            catch(IOException Error)
            {
                System.out.println(Error.getMessage());
            }
            return count;
        }
        public void printtictac()
        {
            for(int i = 6; i >= 1; i--)
            {
                for(int k = 1; k <= i; k++)
                {
                    System.out.print(" x ");
                }
                for(int n = 1; n <= 9 - i; n++)
                {
                    System.out.print(" 0 ");

                }
                
                
                System.out.println();
            }
        }
        public void rty()
        {
            for(int i = 1; i <= 5; i++)
            {
                for(int k = 5; k >= i; k--)
                {
                    System.out.print(" "+ ((2 * k) - 1 )+ " ");
                }
                System.out.println();
            }

        }

        public void wsgf()
        {
            int x = 11;
            int y = 0;
            while(x > 10)
            {
                y = 3;
                while(y < x)
                {
                    y *= 2;
                }
                x -= 4;
            }
            System.out.println(x + "          " + y);

        }

        

        public void printEvenMultipleB(int value, int howMany)
        {
            int numTimes = 0;

            while(numTimes < howMany)
            {
                int sum = value;
                int evenMult = value % 2;

                
                numTimes++;
                sum += value;
                if(evenMult == 0)
                {
                    System.out.println("The even multiple of " + value + " is " + sum);
    
                }
                
                

            }
        }

        public void lmx()
        {
            for(int i = 1; i <= 5; i++)
            {
                for(int k = 1; k <= i; k++)
                {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
        public void bmc()
        {
            for(int i = 1; i <= 7; i++)
            {
                for(int k = 7; k >= i; k--)
                {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }

        public void printStatement()
        {
            ArrayList<String> statements = new ArrayList<String>();
            statements.add("I hate my dad");
            statements.add("My dad is a terrible father");

            for(int i = 0; i <= statements.size() - 1; i++)
            {
                System.out.println(i);
            }
        }
        public void southParkCharacters()
        {
            ArrayList<String> southParkGang = new ArrayList<String>();
            southParkGang.add("Stan Marsh");            
            southParkGang.add("Kyle Brofloski");
            southParkGang.add("Kenny Mccormick");
            southParkGang.add("Eric Cartman");
            System.out.println(southParkGang.get(2) + " died");
            southParkGang.remove(2);
            southParkGang.add(2, "Buuters Stoch");
            southParkGang.set(2, "Tweak Tweek");
            for(int i = 0; i < southParkGang.size(); i++)
            {
                System.out.println("Member " + i + " is " + southParkGang.get(i));
                String replacemnt = southParkGang.get(i);
                if(replacemnt.equals("Tweak Tweek"))
                {
                    System.out.println(replacemnt + " is the new kenny");
                }
            }

        }
                ///for(int[] rowArray : matrix)
                ///{
                     /// for(int item : rowArray)
                     //{
                            
                    /// }
                ////}
  
        /** set the matrix to the passed one
          * @param theMatrix the one to use
          */
        public void setMatrix(int[][] theMatrix)
        {
          matrix = theMatrix;
        }
        
        /**
         * Method to return the total 
         * @return the total of the values in the array
         */
        public int getTotal()
        {
          int total = 0;
          for (int row = 0; row < matrix.length; row++)
          {
            for (int col = 0; col < matrix[0].length; col++)
            {
              total = total + matrix[row][col];
            }
          }
          return total;
        }
        
        /**
         * Method to return the total using a nested for-each loop
         * @return the total of the values in the array
         */
        public int getTotalNested()
        {
          int total = 0;
          for (int[] rowArray : matrix)
          {
            for (int item : rowArray)
            {
              total = total + item;
            }
          }
          return total;
        }
        
        /**
         * Method to fill with an increasing count
         */
        public void fillCount()
        {
          int numCols = matrix[0].length;
          int count = 1;
          for (int row = 0; row < matrix.length; row++)
          {
            for (int col = 0; col < numCols; col++)
            {
              matrix[row][col] = count;
              count++;
            }
          }
        }
        /*public void fixUnderwater()
        {
        Pixel[][] pixels = this.getPixels2D();
        for(int row = 0; row < pixels.length; row++)
        {
        for(int col = 0; col < pixels[0].length; col++)
        {
            pixels[row][col].setRed(pixels[row][col].getRed() * 3);
        }
        }
        }
        /**
         * print the values in the array in rows and columns
         */
        public void print()
        {
          for (int row = 0; row < matrix.length; row++)
          {
            for (int col = 0; col < matrix[0].length; col++)
            {
              System.out.print( matrix[row][col] + " " );
            }
            System.out.println();
          }
          System.out.println();
        }
        
        
        /** 
         * fill the array with a pattern
         */
        public void fillPattern1()
        {
          for (int row = 0; row < matrix.length; row++)
          {
            for (int col = 0; col < matrix[0].length; 
                 col++)
            {
              if (row < col)
                matrix[row][col] = 1;
              else if (row == col)
                matrix[row][col] = 2;
              else
                matrix[row][col] = 3;
            }
          }
        }
public int getLargest()
  {
    int largestValue = Integer.MIN_VALUE;
    for(int row = 0; row < matrix.length; row++)
    {
      for(int col = 0; col < matrix[0].length; col++)
      {
        if(matrix[row][col] > largestValue)
        {
          largestValue = matrix[row][col];
        }
      }
    }
    return largestValue;
  }


  public int getColTotal(int col)
  {
    int total = 0;
    for(int row = 0; row < matrix.length; row++)
    {
      total += matrix[row][col];
    }
    return total;
  }
        public void detentionList(String date)
        {

            ArrayList<String> students = new ArrayList<String>();
            students.add(4,"#812221");
            students.add("#245335");
            students.add("#225535");
            students.add("#725535");

            for(int i = 0; i <= students.size() - 1; i++)
            {
                System.out.println(students.get(i));
            }


        }

        public void getNames()
        {
        ArrayList <String> names = new ArrayList <String> (10);
        names.add("Carry");
        names.add("Chris");
        names.add("Sandy");
        names.add("William");

        names.add("Elaine");
        names.set(1, "Ethan");     ///carry edward ethan ward thomas  elaine
        names.set(2, "Thomas");

        names.remove(3);
        names.add(2, "Ward");
        names.add(1, "Edward");


        for(int i = 0; i < names.size(); i++)
        {
            System.out.println(i + ": " + names.get(i));
        }

        }

        public void printArray()
        {
            int[] A = new int[7];
            A[0] =  1;
            A[1] =  2;
            A[2] =  3;

            for(int i = 0; i < A.length;i++)
            {
                A[i] = i * i;
            }

            for(int i = 0; i < A.length;i++)
            {
                System.out.print(" " + A[i]);
            }
        }

        public void printArray2()
        {
            String[] boyfriendAndGirlFriend = {"Kush Patel and Grace Kennard", "Adam Godfrey and Paige Woodside", "Troy Provenzano and Kelsey Campbell","John Ward and Bri Jones","Austin Bae and Kate Lee", "Toring Stanley and Tori Portillo", "Reese Jenican and Ruby Bitnner"};

            

            for(int i = 0; i < boyfriendAndGirlFriend.length;i++)
            {
                System.out.print(", " + boyfriendAndGirlFriend[i]);
            }
        }

        public void printArray3()
        {
            int[] arg ={5, 2, 2, 0};
            int i = 1;
            for(int item : arg)
            {
                System.out.println(item + " " + i++);
            }
        }

        public void print2DArray(int numRow, int numCol)
        {
            boolean[][] lights = new boolean[numRow][numCol];
            for(int numRows = 0; numRows < lights.length;numRows++)
            {
                for(int numCols = 0; numCols < lights.length; numCols++)
                {
                    double prob = Math.random();
                    lights[numRows][numCols] = prob < 0.4;
                }
                System.out.println();
            }
        }

        public void reverserow()
        {
            int[][] list = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
            for(int row = 0; row < list.length; row++)
            {
                for(int col = list.length ; col >= 0; col--)
                {
                    System.out.print(" " + list[row][col]);
                }
                System.out.println();
            }
        }

        public void reverseMatreix()
        {
            int[][] list = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
            for(int row = 0; row < list.length; row++)
            {
                for(int col = 0 ; col < list[row].length; col++)
                {
                    int temp = list[row][col];
                    list[row][col] = list[list.length - row - 1][col];
                    list[list.length - row - 1][col] = temp;
                }
                System.out.println();
            }
        }

        public boolean isNotZeroRow(int[][] array2D, int r)
        {
            boolean isNotZero = true;
            for(int col = 0; col < array2D.length; col++)
            {
                if(array2D[r][col] == 0)
                {
                    isNotZero = false;
                }
            }
            return isNotZero;
        }
       

        public boolean isDifficult()
        {        
            int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
            boolean difficult;
            int count = 0;

            for(int i = 0; i < markers.length - 1; i++)
            {
                if(markers[i++] - markers[i] >= 30 || markers[i++] - markers[i] <= -30)
                {
                    count++;
                }
            }
            if(count >= 3)
            {
                difficult = true;
            }
            else
            {
                difficult = false;
            }
            return difficult;
        }

        public static int arraySum(int[] arr)
        {
            int sum = 0;
            for(int i = 0; i < arr.length; i++)
            {
                sum += arr[i];
            }
            return sum;
        }

        public static int[] rowSums(int[][] arr2D)
        {
            int[] sum = new int[arr2D.length];
            for(int i = 0; i < arr2D.length; i++)
            {
                sum[i] += arraySum(arr2D[i]);
            }
            return sum;
        }

        public static boolean isDiverse(int[][] arr2D)
        {
            boolean diverse = true;
            int[] sum = rowSums(arr2D);
            for(int row = 0; row < arr2D.length; row++)
            {
                for(int col = 0; col < arr2D[0].length; col++)
                {
                    if(sum[row] == sum[col] && row != col)
                    {
                        diverse = false;
                    }
                }
            }
            return diverse;
        }

        public String[][] isEvenorOdd(int[][] arr2D)
        {
            String[][] evenOrOdd = new String[arr2D.length][arr2D[0].length];
             for(int row  = 0; row < arr2D.length; row++)
             {
                 for(int col = 0; col < arr2D.length; col++)
                 {
                     if(arr2D[row][col] % 2 == 0)
                     {
                        evenOrOdd[row][col] = " Even ";
                     }
                     else
                     {
                        evenOrOdd[row][col] = " Odd ";
                     }
                 }
             }
             return evenOrOdd;
        }

        public int[][] flipMatrix(int[][] arr2D)
        {
            int[][] newArr = new int[arr2D.length][arr2D[0].length];
            for(int row = 0; row < arr2D.length; row++)
            {
                for(int col = 0; col < arr2D[0].length; col++)
                {
                    int temp = newArr[row][col];
                     newArr[row][col] = newArr[arr2D.length - 1 - row][col];
                    newArr[arr2D.length - 1 - row][col] = temp;
                }
            }
            return newArr;
        }

        public int scoreGuess(String guess)
        {
            int count = 0;
            for(int i = 0; i < secret.length() - guess.length(); i++)
            {
                if(secret.substring(i, i + guess.length()).equals(guess))
                {
                    count++;
                }
            }
            return count * guess.length() * guess.length();

        }

        public int sumArray(int[] sum, int r)
        {
            if(r >= sum.length)
            {
                return 0;
            }
            else
            {
                return sum[r] + sumArray(sum, r - 1);
            }
        }

        public int sumArray(int[] total)
        {
            int sum = 0;
            for(int i =0; i < total.length ;i++)
            {
                sum += total[i];
            }
            return sum;
        }

        public void recursionMrEliot(int r)
        {
            if(r == 0)
            {
                System.out.println();
            }
            else
            {
                recursionMrEliot(r -1);
                System.out.print("*");
            }
        }

        public String trim(String Word)
        {
            String Result = "";
            for(int i = 0; i < Word.length();i++)
            {
                if(!Word.substring(i, i + 1).equals(" "))
                {
                    Result += Word.substring(i, i + 1);
                }
            }
            return Result;
        }

        public int findLastOccurence(String w, String Word)
        {
            int index = -1;
            for(int i = 0; i < Word.length();i++)
            {
                if(Word.substring(i, i + 1).equals(w))
                {
                    index = i;
                }
            }
            return index;

        }

       /* public int findLastOccurence(String str)
        {
            int index = -1;
            for(int i = 0; i < curentPhrase.length(); i++)
            {
                if(curentPhrase.substring(i, i + 1).equals(str))
                {
                    index = findNthOccurence(str, i);
                }
            }
            return index;
        }*/
        public boolean isVarying(int[][] arr)
        {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0;j<arr[0].length;j++)
            {
                if(arr[i] == arr[j] && i != j)
                {
                    return false;
                }
            }
        }
        return true;
        }

        public void printEvenMultiple(int value, int howMany)
        {
            int result = value;

            int numTimes = 1;
            while(numTimes <= howMany)
            {
                if(result % 2 == 0)
                {
                    System.out.println("The even multiple of " + value + " is " + result);

                }
                
                
                
                result += value;
                numTimes++;
            }



            
        }
       
}