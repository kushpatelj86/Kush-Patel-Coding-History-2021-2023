#include <iostream>

using namespace std;


double exponentFunction(double base, double expo)
{
    double result = 1;
    for(int i = 0; i < expo;i++)
    {
        result = result * base;
    }
    return result;
}

int main() //eqiuivalent to public static void main(String[] args)
{

    cout << exponentFunction(2,3) << endl;


    return 0;
}