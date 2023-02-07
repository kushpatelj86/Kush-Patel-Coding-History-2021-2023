#include "bank.h"

#include <algorithm>
#include <vector>
// ========================= YOUR CODE HERE =========================
// This implementation file (bank.cc) is where you should implement
// the member functions declared in the header (bank.h), only
// if you didn't implement them inline within bank.h.
//
// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//
Bank::Bank(const string &bank_name) {
  bank_name_ = bank_name;
}
int Bank::CreateAccount(const string account_holder, double initial_balance) {
  Account acc(account_holder, initial_balance);
  int id = GenerateAccountId();
  accounts_.insert({id, acc});
  return id;
}

int Bank::TotalAccounts() const {
  return accounts_.size();
}

void Bank::DisplayBalances() {
  for (map<int, Account>::iterator it = accounts_.begin();
       it != accounts_.end(); it++) {
    cout << it->second.GetAccountHolder() << ": $" << it->second.GetBalance()
         << endl;
  }
}

void Bank::DeactivateAccount(int id_num)
{
  
  if(accounts_.count(id_num) > 0)
  {
    map<int, Account>::iterator it2 =   
  accounts_.find(id_num);
    accounts_.erase(it2);
  accounts_.erase(id_num);
  }


  
  
  
}

// Remember to specify the name of the class with :: in this format:
//     }
// to tell the compiler that each function belongs to the Bank class.
// ===================================================================
