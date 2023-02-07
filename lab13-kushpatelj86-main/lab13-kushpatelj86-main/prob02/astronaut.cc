#include "astronaut.h"
using namespace std;
using namespace graphics;
// ========================= YOUR CODE HERE =========================
// This implementation file is where you should implement the member
// functions declared in the header, only if you didn't implement
// them inline in the header.
//
// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//        ...
//     }

      Astronaut::Astronaut(const string &name, Color main_color )
      {
        name_ = name;
        main_color_ = main_color;
      }

      string Astronaut::GetName() const
      {
        return name_;
      }

      Color Astronaut::GetColor() const
      {
        return main_color_;
      }

      string Astronaut::GetIconFilename() const
      {
        return "astronaut.bmp";
      }

    





// to tell the compiler that each function belongs to the Astronaut class.
// ===================================================================