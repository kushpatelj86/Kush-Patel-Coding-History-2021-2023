/**
*<BR> Name:          Kush Patel
*<BR> Date:          03-17-2022
*<BR> Period:        2
*<BR> Assignment:    ICT Lesson 21
*<BR> Description:   We will conver decimal to base
*<BR> Cite Sources:  https://www.rapidtables.com/convert/number/base-converter.html. mr eliot told me I misundered the video basic code qith java code.https://ap.mreliot.com/LessonA21/files/Any2Dec.vb.zip, https://ap.mreliot.com/LessonA21/files/Dec2Any.vb.zip, Francesco Balena , https://amzn.to/2IZ15b3. 
*<BR> Original Sources:	Jason Quesenberry and Nancy Quesenberry
*<BR> 					Original Visual Basic Code by Francesco Balena
*<BR>					https://www.goodreads.com/author/list/30132.Francesco_Balena
*<BR>					Student Ryan Monroe for this line in constructor:  MyStrValue = "" + value;
*/
public class BaseConverter
{
    private int myBase;
    private int myValue;
    private String myStrBase;

    
    private final String Digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public BaseConverter()
    {
        myBase = 10;
        myValue = 10;
        myStrBase = "10";
    }
    
    public BaseConverter(int value)
    {
        myBase = 10;
        myValue = value;
        myStrBase = "" + value;
    }

    public BaseConverter(String value)
    {
        myBase = 16;
        myValue = Integer.MIN_VALUE;
        myStrBase = "" + value.trim().toUpperCase();

    }


    public BaseConverter(String value, int base)
    {
        myBase = base;
        myValue = Integer.MIN_VALUE;
        myStrBase = value.trim().toUpperCase();

    }

    public String decimalToAnyBase(int newBase)
    {
        int digitValue;
        int copyValue = myValue;
        String Result = ""; 


        if(copyValue < 0)
        {
            return "a value to be converted must be a positive number";
        }
        else if(newBase < 2 || newBase > 36)
        {
            return "a base that must be in the range 2 to 36";
        }
        else
        {
            while (copyValue > 0)
            {
                digitValue = copyValue % newBase;
                Result = Digits.charAt(digitValue) + Result;
                copyValue = copyValue / newBase;
            }
        }
        return Result;

    }

    public int anyBaseToDecimal()
    {
        int i;
        int copyValue = myValue;
        Long digitValue;
        int result = 0;
        int power = 0;
        int length;
        char myChar;

        myStrBase = myStrBase.toUpperCase();
        length = myStrBase.length();

        if(length == 0)
        {
            System.out.println("Error: empty number string");
            return -1;
        }

        if(myBase < 2 || myBase > 36)
        {
            System.out.println("Error: base must be in the  range 2 to 36");
            return -1;
        }

        if(copyValue == 0)
        {
            return 0;
        }

        for(i = length - 1; i >= 0; i--)
        {
            myChar = myStrBase.charAt(i);
            digitValue = (long) Digits.indexOf(myChar);
            if(digitValue < 0)
            {
                System.out.println("Error: invalid character which doesn't fit this base");
                return -1;
            }
            else if(digitValue >= myBase)
            {
                System.out.println("Error: digit beyond the range of the base");
                return -1;
            }
            
            
            result = (int) (result + digitValue * (Math.pow(myBase, power)));
            power += 1;
            
            

        }
        return result;
    }
}



