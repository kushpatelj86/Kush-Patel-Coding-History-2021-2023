#include <iomanip>
#include "salary.h" //interface

#include <iostream>
using namespace std;
int main() {
  // TODO: accept user input to store the hourly wage and hours worked.
  // Then, include the header file at the top of this file so you can
  // call your function that computes a salary based on these inputs.
  // Don't forget to check for invalid inputs!
  cout << fixed << setprecision(2);

  double hourly_wage;
  double hours_worked;


  cout << "Hourly Wage: ";
  cin >> hourly_wage;
  




  cout << "Hours Worked: ";
   cin >> hours_worked;
  cout << " " << endl;

  double total_salary = 0; 
  if(hours_worked >= 0 && hourly_wage >= 0)
  {
      total_salary = compute_salary(hourly_wage,hours_worked);
      cout << "Total Salary Owed: " << total_salary << endl;

  }
  else
  {
          cout << "Invalid input" << endl;

  }
  










  return 0;
}