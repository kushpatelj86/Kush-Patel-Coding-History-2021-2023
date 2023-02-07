#include <iostream>
using namespace std;
int main() 
{
  // TODO: Recommend a credit card to a customer based on their credit score.

  int credit_score;
  cout << "Thank you for applying for the Tuffy Credit card. Please enter your credit score." << endl;
  cout << "Credit Score: ";
  cin >> credit_score;
  cout << "" << endl;

  if(credit_score < 0 || credit_score > 850)
  {
    cout << "That is an invalid credit score. Please run the program again and provide a valid credit score."<< endl;                  
  }


  else if(credit_score >= 0 && credit_score <= 579)
  {
        cout << "Unfortunately, you are ineligible for Tuffy credit cards at the moment. Please try again at a later date."<<endl;                  

  }
  else if(credit_score >= 580 && credit_score <= 669)
  {
            cout << "You are eligible for the Silver Tuffy Card."<<endl;                  

  }
  else if(credit_score >= 670 && credit_score <= 799)
  {
                cout << "You are eligible for the Gold Tuffy Card."<<endl;                  

  }
  else
  {
            cout << "You are eligible for the Platinum Tuffy Card."<<endl;                  

  }
  cout << "" << endl;
  cout << "Thank you for using our program, please come again!" << endl;





  return 0;
}