#include <iostream>

using namespace std;


int main()
{
    string phrase = "Giraffe Academt";
    cout <<"Girrafe Academy\n"  << endl; //skips line
    cout << "Hello" << endl; //cout << " Hello"<< endl
    cout << phrase << endl;
    cout << phrase.length()<< endl;//equivalent to phrase.length() in java and len(phrase) in python
    cout << phrase[0]<< endl; //equivalent to phrase.substring(0,1) in java
    phrase[0] = 'B'; //changing cxharacxters

    cout << phrase.find("Academy", 0) << endl; //equivalet to indexOf() in java and .index() in pytohn , 0 is where the starting index to search 


    return 0;

}