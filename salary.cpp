#include <iomanip>
#include <iostream>
  void compute_salary()
  {
  
  double hourly_wage;
  double hours_worked;
  double total_salary = 0;
  cout << "Hourly Wage: " << hourly_wage;
  cin >> hourly_wage;
  cout << "Hours Worked: " << hours_worked;
  cin >> hours_worked;
  if(hours_worked < 0)
  {
      cout << "Invalid input" << endl;

  }
  else if(hours_worked >= 0 && hours_worked <= 40)
  {
          
          total_salary = hourly_wage * hours_worked;
          cout << "Total Salary Owed: " <<total_salary <<  endl;

  }
  else if(hours_worked >= 41 && hours_worked <= 65)
  {
    
       total_salary = (hourly_wage * 40) + (hours_worked - 40) * (hourly_wage * 1.5)

       cout << "Total Salary Owed: " <<total_salary <<  endl;

  } 
  else
  {

          total_salary = (hourly_wage * 40) + (hourly_wage * 1.5) * 25 + (hours_worked - 65) * hourly_wage * 2;

           cout << "Total Salary Owed: " <<total_salary <<  endl;

  }
  
  
  
  
  }
