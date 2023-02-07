#include <iostream>
#include <map>
#include <vector>

#include "bank.h"

int main() {
  // =================== YOUR CODE HERE ===================
  // 1. Create a Bank object, name it anything you'd like :)
  // =======================================================
  Bank BankOfAmerica("Bank of America");
  // =================== YOUR CODE HERE ===================
  // 2. Create 3 new accounts in your bank.
  //    * The 1st account should belong to "Tuffy", with
  //      a balance of $121.00
  
  int Tuffy = BankOfAmerica.CreateAccount("Tuffy", 121.00);
  //    * The 2nd account should belong to "Frank", with
  //      a balance of $1234.56
  int Frank = BankOfAmerica.CreateAccount("Frank", 1234.56);

  //    * The 3nd accout should belong to "Oreo", with
  int Oreo = BankOfAmerica.CreateAccount("Oreo", 140.12);
  //      a balance of $140.12
  // =======================================================

  // =================== YOUR CODE HERE ===================
  // 3. Deactivate Tuffy's account.
  // =======================================================

  BankOfAmerica.DeactivateAccount(Tuffy);

  // =================== YOUR CODE HERE ===================
  // 4. Call DisplayBalances to print out all *active*
  //    account balances.
  // =======================================================

  BankOfAmerica.DisplayBalances();
}
