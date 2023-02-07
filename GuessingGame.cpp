#include <iostream>

using namespace std;















int main() //eqiuivalent to public static void main(String[] args)
{

    int secretNum = 7;
    int guess;
    int guessCount = 0;
    int guessLimit = 3;
    bool outOfGuesses = false;

    while(secretNum != guess && outOfGuesses = false)
    {
        
        if(guessCount < guessLimit)
        {
            cout <<"Enter guess: ";
            cin >> guess;
            guessCount++;
        }
        else
        {
            outOfGuesses = true;
        }
        
        
    }
    if(outOfGuesses == true)
    {
            cout << "You Lose!";

    }
    else
    {
             cout << "You Win!";
    }

    return 0;
}