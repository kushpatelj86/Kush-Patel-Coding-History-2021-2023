#include <iostream>
#include <cmath>


using namespace std;

int main()
{


    int age;
    cout << "Enter your age: "; //System.out.pritnln("Enter your age: ")" 
    cin >> age; //equivalent to input() in python and Scanner MyInput = new Scanner() MyInput.nextInt()

    cout << "";
    cout << "You are " << age << "years old";


//string input
    string name;
    cout << "Enter your name: "; //System.out.pritnln("Enter your age: ")" 
    getline(cin, name); //equivalent to input() in python and Scanner MyInput = new Scanner() MyInput.nextInt()

    cout <<"";

    cout << "Hello " << name;




    return 0;
}