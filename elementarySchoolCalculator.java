public class elementarySchoolCalculator
{
    private double value1;
    private double value2;
   
    public elementarySchoolCalculator(double first, double second)
    {
        value1 = first;
        value2 = second;
    }


    public double multiply()
    {
         double value = value1 * value2;
        return value;
    }



    public double add()
    {
        double value = value1  + value2;
        return value;

    }


    public double subtract()
    {
        double value = value1 - value2;
        return value;

    }

    public double devide()
    {
        double value = value1 / value2;
        return value;

    }


    public double remainder()
    {
        double value = value1 % value2;
        return value;

    }

    public static void main(String[] args) 
    {
        
    }
}