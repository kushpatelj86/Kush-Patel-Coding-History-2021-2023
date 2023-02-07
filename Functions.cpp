#include <iostream>



using namespace std;






void sayHi()
{
    cout << "Hello User" << endl;
}
void sayHi(string name, int age) //method overloading
{
    cout << "Hello " << name << endl;
}



int main()
{



    sayHi();
    sayHi("Kush Patel", 16);
    return 0;
}