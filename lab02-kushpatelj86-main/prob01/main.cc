#include <iostream>
using namespace std;
int main()
{
  cout << "You must be at least 55 inches to safely ride the TuffyTwister" << endl;
  int height_person;
  cout  << "Please enter your height in inches: ";
  cin >> height_person;


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


 
