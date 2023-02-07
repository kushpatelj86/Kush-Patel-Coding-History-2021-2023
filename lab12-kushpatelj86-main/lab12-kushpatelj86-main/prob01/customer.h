#include <memory>
#include <string>
using namespace std;
class Customer {
 public:
  // ====================== YOUR CODE HERE ======================
  // 1. Define a constructor using member initializer list syntax
    Customer(string name, int count,shared_ptr<Customer> next_customer ) : name_(name), product_count_(count), next_customer_(next_customer) {}
  //    according to the README.
  // 2. Define the accessor functions (i.e. the getter functions)
  //    `GetName`, `GetProductCount`, and `GetNextCustomer`.
    string GetName() const {return name_;}
    int GetProductCount() const {return product_count_;}
    shared_ptr<Customer> GetNextCustomer() const { return next_customer_;}

  int TotalCustomersInLine();
  int TotalProductsInLine();
  string FirstAlphabeticalCustomerInLine();
  //    You do not need to create mutator functions (setters).
  // 3. Define the recursive functions specified in the README.
  // ============================================================


 private:
  string name_;
  int product_count_;
  shared_ptr<Customer> next_customer_;
};
