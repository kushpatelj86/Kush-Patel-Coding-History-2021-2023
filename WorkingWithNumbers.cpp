#include <iostream> //importing files
#include <cmath> //equivalent to from math import floor, ceil

using namespace std;


int main()
{



    cout << 50 << endl; //int

    cout << 50.42454343 << endl; //double can store up to 4 places




    cout << 50 + 70 << endl; //addition

    cout << 50 - 20 << endl; //substraction

    cout << 50 / 20 << endl; //devision

    cout << 50 * 20 << endl; //multiplaction
    
    
    
    cout << 50 % 20 << endl; //multiplaction

     cout << (50 + 20) * 2 << endl; ///parenthesis then multiplication the  addition


    int wnum = 5;
    double dnum = 5.5;

    wnum++;
    wnum += 80;

    cout << wnum << endl;


    cout << wnum + dnum << endl;


    cout << pow(2,5) << endl; //2^5 = 32 equialent to Math.pow() in java

    cout << sqrt(36) << endl; //2^5 = 32 equialent to Math.sqrt() in java

    cout << floor(36.7) << endl; // 36 equialent to floor(in python) in python

    cout << round(36.7) << endl; // 36 equialent to ceil(in python) and round() in python

    cout << fmax(2,7) << endl; //  returns largets number equivalent to max in python



    cout << fmin(2,7) << endl; // returns smallest number eqivalent to min() in python

    return 0;
}