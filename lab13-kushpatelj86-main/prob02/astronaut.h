#include <string>

#include "cpputils/graphics/image.h"

// These header guards are necessary to keep your class from being defined
// multiple times when it is included from multiple files.
#ifndef ASTRONAUT_H
#define ASTRONAUT_H
using namespace std;
using namespace graphics;

class Astronaut{
public:
      Astronaut(const string &name, Color main_color );
      string GetName() const;
      Color GetColor() const;
      string GetIconFilename() const;



      





private:
      string name_;
      Color main_color_;


};





// ========================= YOUR CODE HERE =========================
// Define the Astronaut class here. Refer to the README for instructions.
// ===================================================================

#endif  // ASTRONAUT_H
