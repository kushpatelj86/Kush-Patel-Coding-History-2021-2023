#include <iostream>
using namespace std;
int main2()
{
  cout << "You must be at least 55 inches to safely ride the TuffyTwister" << endl;
  int height_person;
  cin  >> "Please enter your height in inches: ";


  if(height_person >= 55)
  {
    cout << "Congratulations! You are tall enough to ride!" << endl;

  }
  else
  {
    cout << "Safety is our first priority. Unfortunately, we can't let you ride yet."<< endl;

  }


  return 0;
}
