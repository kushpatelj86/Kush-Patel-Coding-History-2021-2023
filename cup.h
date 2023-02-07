#include <iostream>
using namespace std;
//====================== YOUR CODE HERE ======================
// TODO: Declare the Cup class in this file, with the member
// variables and member functions as described in the README.
//============================================================
class Cup {
  public:
    //================== YOUR CODE HERE ==================
    // TODO: Add the member function declarations here.
    //====================================================
    Cup();
    Cup(const string &drink_type, double fluid_oz);//updates with exisitng copy
    void Drink(double fluid_oz);
    void Refill(double fluid_oz);
    void NewDrink(const string &drink_type,double fluid_oz);
    void Empty();
    double GetFluidOz();
    string GetDrinkType();
 private:
    //================== YOUR CODE HERE ==================
    // TODO: Add the member variable declarations here.
    //====================================================


    string drink_type_;
    double fluid_oz_;

};