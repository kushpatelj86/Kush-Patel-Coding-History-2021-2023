#include <iostream>

using namespace std;





    int getMax(int num1, int num2)
    {
        int result;

        if(num1 > num2)
        {
            result = num1;
        }
        else if(num2 > num1)
        {
            result = num2;
        }
        else
        {
            result = num1;
            result = num2;
        }
    }

int getMax(int num1, int num2, int num3)
{
    int result;
    if(num1 >= num2 && num1 >= num3)
    {
        result = num1;
    }
    else if(num2 >= num1 && num2 >= num3)
    {
        result = num2;
    }
    else
    {
        result = num3;
    }
    return result;


}



int main() //eqiuivalent to public static void main(String[] args)
{

    bool isMale = true;
    bool isTall = true;


    if(isMale && isTall) //&& and operator both conditioons need to be met || operator one of them have to be false
    {
        cout << "You are a tall male" << endl;
    }
    else if(isMale && !isTall)
    {
        cout << "You are a short male" << endl;

    }

    else if(!isMale && isTall) // ! operator returns the oposite of true
    {
        cout << "You are a tall female" << endl;

    }
    else
    {
        cout << "You are a short female" << endl;
    }




    return 0;
}