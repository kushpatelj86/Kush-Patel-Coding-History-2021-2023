#include <iostream>

using namespace std;




int main() //eqiuivalent to public static void main(String[] args)
{


    for(int i = 0; i <= 5;i++ )
    {
        cout << i << endl;
    }

    int nums[] = {2,4,6,4,2,4};

    for(int i = 0; i < sizeof(nums) ;i++ )  //len() in python, length in java, Length in c#
    {
        cout << nums[i] << endl;
    }



    return 0;
}