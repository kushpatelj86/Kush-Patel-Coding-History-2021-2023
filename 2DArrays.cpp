#include <iostream>

using namespace std;




int main() //eqiuivalent to public static void main(String[] args)
{

    int numberGrid[][] = {{1,2},{3,4},{5,6}}



    cout << numberGrid[0][1] << endl;



    for (int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 2;j++)
        {
            cout << numberGrid[i][j];

        }
         cout << endl; //skips line

    }

    return 0;
}