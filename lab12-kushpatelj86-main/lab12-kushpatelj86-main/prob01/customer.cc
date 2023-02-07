#include "customer.h"
using namespace std;

// ========================= YOUR CODE HERE =========================
// This implementation file (customer.cc) is where you should implement
// the member functions declared in the header (customer.h), only
// if you didn't implement them inline within customer.h.
//
// Remember to specify the name of the class with :: in this format:
int Customer::TotalCustomersInLine() {
  int numCustomers = 1;
  if (next_customer_ == nullptr) {
    return numCustomers;
  } else {
    return numCustomers + next_customer_->TotalCustomersInLine();
  }
}




int Customer::TotalProductsInLine() {

  
  if (next_customer_ == nullptr) {
    return product_count_;
  }
  else
  {
    return product_count_ + next_customer_ ->TotalProductsInLine();
  }




  }









string Customer::FirstAlphabeticalCustomerInLine() {
  if (next_customer_ == nullptr) {
    return name_;
  } else {

        if (name_ < next_customer_->FirstAlphabeticalCustomerInLine()) {
      return name_;
    }
    else {
      return next_customer_->FirstAlphabeticalCustomerInLine();
     }
  //  return name_ < other_name ? name_ : other_name; ternary operator
  }
}
//     <return type> MyClassName::MyFunction() {
//        ...
//     }
// to tell the compiler that each function belongs to the Customer class.
// ===================================================================