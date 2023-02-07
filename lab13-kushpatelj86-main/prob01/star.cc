#include "star.h"

#include <iomanip>
#include <iostream>
#include <string>
using namespace std;

      Star::Star(const string &name, double radius)
      {
        name_ = name;
        radius_ = radius;
        cout << "The star "<< name_ <<" was born." << endl;
      }

      Star::~Star()
      {
        
        std::cout << std::fixed << std::setprecision(2);\
        double volume = radius_ * radius_;
        cout << "The star "<< name_ <<" has gone supernova. It was " << volume << " times the volume of our sun." << endl;

        

      }

      string Star::GetName() const
      {
        return name_;
      }





// ========================= YOUR CODE HERE =========================
// This implementation file (star.cc) is where you should implement
// the member functions declared in the header (star.h), only
// if you didn't' implement them inline within star.h.
//
// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//        ...
//     }
// to tell the compiler that each function belongs to the Star class.
// ===================================================================

