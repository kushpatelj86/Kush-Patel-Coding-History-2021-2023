#include <iostream>

using namespace std;


int main()
{
    string phrase = "Giraffe Academt";
    cout <<"Girrafe Academy\n"  << endl; //skips line
    cout << "Hello" << endl; //cout << " Hello"<< endl
    cout << phrase << endl;
    cout << phrase.length()<< endl;//equivalent to phrase.length() in java and len(phrase) in python
    cout << phrase[0]<< endl; //equivalent to phrase.charAt() in java
    phrase[0] = 'B'; //changing cxharacxters

    cout << phrase.find("Academy", 0) << endl; //equivalet to indexOf() in java and .index() in pytohn , 0 is where the starting index to search 
    cout << phrase.substr(1, 3); //like the .substirng method in java excepty the second parameter tells how many characters to grab ratahr than the last position

    return 0;

}