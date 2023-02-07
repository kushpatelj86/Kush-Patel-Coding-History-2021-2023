
#include <iostream>

using namespace std;










/*monthConversions = { //equivealent to switch cases
    "Jan" : "January",
    "Feb" : "February",
    "Mar" : "March",
    "Apr" : "April",
    "May" : "May",
    "Jun" : "June",
    "Jul" : "July",
    "Aug" : "August",
    "Sep" : "September",
    "Oct" : "October",
    "Nov" : "November",
    "Dec" : "December",


} */


/// creating dictionary



string getDayOfWeek(int dayNum)
{
    string dayName;

    switch(dayNum)
    {
        case 0:
            dayName = "Sunday";
            break; //without this it would continue

        case 1:
            dayName = "Monday";
            break;

        case 2:
            dayName = "Tuesday";
            break;



        case 3:
            dayName = "Wednesday";
            break;


        case 4:
            dayName = "Thursday";
            break;   

        case 5:
            dayName = "Friday";
            break; 

        case 6:
            dayName = "Saturday";
            break; //quits the condition

        default: //quits the switch statement if no cases/conditiona re met
            dayName = "Invalid Number";


        


        return dayName;

    }



    return dayName;
}
//swiitch satemetns are used for comparing and convert  number to day
int main() //eqiuivalent to public static void main(String[] args)
{



    cout << getDayOfWeek(3) << endl;
    return 0;
}