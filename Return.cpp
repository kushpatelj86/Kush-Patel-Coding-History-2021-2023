#include <iostream>

using namespace std;





double cube(double num) //equivalent to public double cube(double num)
{
    double result = num * num * num;

    return result;
}









int main() //eqiuivalent to public static void main(String[] args)
{


    cout << cube(5.0) << endl;



    return 0;
}