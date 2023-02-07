#include "cup.h"

#include <iostream>
using namespace std;
//========================== YOUR CODE HERE ==========================
// TODO: Implement the member functions for the Cup class in this
// file.
//
// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//        ...
//     }
// to tell the compiler that each function belongs to the Cup class.
//====================================================================

Cup::Cup()
{
  drink_type_ = "Water";
  fluid_oz_ = 16.0;
}
Cup::Cup(const string &drink_type, double fluid_oz)
{
  drink_type_ = drink_type;
  fluid_oz_ = fluid_oz;
}
void Cup::Drink(double fluid_oz)
{
  if(fluid_oz> fluid_oz_)
  {
    fluid_oz_ = 0;
  }
  else
  {
    fluid_oz_ -= fluid_oz;
  }
}

void Cup::Refill(double fluid_oz)
{
      fluid_oz_ += fluid_oz;

}

void Cup::NewDrink(const string &drink_type,double fluid_oz)
{
  drink_type_ = drink_type;
  fluid_oz_ = fluid_oz;
}
void Cup::Empty()
{
  drink_type_ = "nothing";
  fluid_oz_ = 0;
}
double Cup::GetFluidOz()
{
  return fluid_oz_;
}
string Cup::GetDrinkType()
{
  return drink_type_;
}















