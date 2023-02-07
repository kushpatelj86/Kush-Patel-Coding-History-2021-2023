public class ConditionsAndBooleans
{
    public static void main(String[] args)
    {
        int x = 6;
        int y = 7;
        int z = 10;
        int w = 10;

        //comparison operators: >(greater than), <(less than), ==(is equal to), <=(less than or equal to), >=(greater than or equal to), !=(not equal to), &&(and operator), ||(or operator), 

        boolean compare1 = (x < y); //will return true since 6 is less than 7
        boolean compare2 = (x != y); //will return true since 6 does not equal 7
        boolean compare3 =(z >= w); //will return true since z is greter than or equal to w , greater than or equal to means one of the conditions have to be met, if one number is greater but not equal it will return true
        boolean compare4 = (z >= w && w < y);//will return false since only one of the conditions is met but nopt the other one, in a && operator both conditions must be true in ordser for it to return true
        boolean compare5 = (z >= w || w > y);//will return true since one of the conditions is met, if it is an or perator || it will return true if one condition is false but the other is true, if both are true, it returns false if both of the conditions are false
        boolean compare6 = (z == w);//will return true since both variables are the same value and they both are equal to one another
        boolean compare7 = !(false);//will return true since not false is true
        boolean compare8 = !(x > 7 && y <= 6); //equivalent to (x <= 7 || y > 6), will return true since both conditons are met !(x > 7) is equivalent to x <= 7, !(||) is && and !(y <= 6 ) ids equivalent to y > 6

        System.out.println(compare1);
        System.out.println(compare2);
        System.out.println(compare3);
        System.out.println(compare4);
        System.out.println(compare5);
        System.out.println(compare6);
        System.out.println(compare7);
        System.out.println(compare8);



    }
}