#include <iostream>
#include <memory>

#include "customer.h"
using namespace std;
int main() {
  // Creates a line of customers with Adele at the front.
  // LinkedList diagram:
  //   Adele -> Kehlani -> Giveon -> Drake -> Ruel
  shared_ptr<Customer> ruel = make_shared<Customer>("Ruel", 5, nullptr);
  shared_ptr<Customer> drake = make_shared<Customer>("Drake", 8, ruel);
  shared_ptr<Customer> giveon = make_shared<Customer>("Giveon", 2, drake);
  shared_ptr<Customer> kehlani = make_shared<Customer>("Kehlani", 15, giveon);
  shared_ptr<Customer> adele = make_shared<Customer>("Adele", 4, kehlani);

  cout << "Total customers waiting: ";
  // =================== YOUR CODE HERE ===================
  // 1. Print out the total number of customers waiting
  //    in line by invoking TotalCustomersInLine.

  cout << adele->TotalCustomersInLine();

  
  // ======================================================
  cout << endl;

  cout << "Total products to be purchased: ";
  // =================== YOUR CODE HERE ===================
  // 2. Print out the total number of products held by
  //    customers in line by invoking TotalProductsInLine.
  // ======================================================
    cout << adele->TotalProductsInLine();

  cout << endl;

  cout << "First customer name alphabetically: ";
  // =================== YOUR CODE HERE ===================
  // 3. Print out the name of the customer in line whose
  //    name comes first alphabetically by invoking
  //    FirstAlphabeticalCustomerInLine.
  
  
      cout << adele->FirstAlphabeticalCustomerInLine();

  
  // ======================================================
  cout << endl;
  return 0;
}
