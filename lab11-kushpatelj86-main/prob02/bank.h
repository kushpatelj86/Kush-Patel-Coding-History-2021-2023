#include <algorithm>
#include <cstdlib>
#include <iostream>
#include <map>
#include <memory>
#include <string>
#include "account.h"
using namespace std;
class Bank {
 public:
  // ======================= YOUR CODE HERE =======================
  // Write the Bank class here. Refer to the README for the member
  // variables, constructors, and member functions needed.
  //
  Bank(const string &bank_name);
  const string &GetBankName() const { return bank_name_; }
  const map<int, Account> &GetAccounts() const{ return accounts_;}
  int CreateAccount(const string account_holder, double initial_balance );
  int TotalAccounts() const;
  void DisplayBalances();
  void DeactivateAccount(int id_num);

  // Note: mark functions that do not modify the member variables
  // as const, by writing `const` after the parameter list.
  // Pass objects by const reference when appropriate.
  // Remember that std::string is an object!
  // ===============================================================

 private:

  // We provided this helper function to you to randomly generate
  // a new Bank Account ID to be used in CreateAccount.
  string bank_name_;
  map<int, Account> accounts_;
  int GenerateAccountId() const {
    return rand() % 9000 + 1000;  // [1000, 9999]
  }
};