#include <iostream>

using namespace std;

//ram is random acess memory is used by every computer whne running programs
//point is a type of memory adress

int main() //eqiuivalent to public static void main(String[] args)
{

    int age = 19;
    int *pAge = &age;
    double gpa = 2.7;
    double *pGpa = &gpa; //& gets memory adress
    string name = "Mike";  //* gets the actual lettering
    string *pName = &name;


    cout << pAge; //*pAge gets the act
    cout << "Age: " << &age << endl;

    cout << "GPA: " << &gpa << endl;

    cout << "Name: " << &name << endl;







    return 0;
}