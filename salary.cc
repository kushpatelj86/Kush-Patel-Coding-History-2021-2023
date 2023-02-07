#include <iomanip>
#include <iostream>
using namespace std;
  
  
  double compute_salary(double hourly_wage,double hours_worked)
  {
  
  double total_salary;
  
  
  if(hours_worked < 0)
  {
      cout << "Invalid input" << endl;

  }
  else if(hours_worked >= 0 && hours_worked <= 40)
  {
          
          total_salary = hourly_wage * hours_worked;

  }
  else if(hours_worked >= 41 && hours_worked <= 65)
  {
    
       total_salary = (hourly_wage * 40) + (hours_worked - 40) * (hourly_wage * 1.5);


  } 
  else
  {

          total_salary = (hourly_wage * 40) + (hourly_wage * 1.5) * 25 + (hours_worked - 65) * hourly_wage * 2;

  }
  
  
  return total_salary;
  
  }