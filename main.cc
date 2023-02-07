#include <iomanip>
#include <iostream>

int main() {
  // TODO: Create a program that computes the restaurant bill.
  double subTotal;
  double total;
  std :: cout << "Please input meal cost: ";
  std :: cin >> subTotal;
  total += subTotal;
    double tippercentage;
  std :: cout << "Please enter the tip percentage: ";
  std :: cin >> tippercentage;

  std :: cout << std :: fixed << std :: setprecision(2);


  std :: cout << "Restuarant Bill" << std :: endl;
  std :: cout << "====================" << std :: endl;
  const double tax = subTotal * 0.075;
  double tip = ( tippercentage / 100) * ( subTotal);
  total += tax;
  std :: cout << "Subtotal: $" << subTotal << std :: endl; 
  std :: cout << "Tax: $" << tax << std :: endl; 
  std :: cout << "Tip: $" << tip << std :: endl; 
  std :: cout << "====================" << std :: endl;

  total += tip;
  std :: cout << "Total: $" << total << std :: endl; 

















  return 0;
}
