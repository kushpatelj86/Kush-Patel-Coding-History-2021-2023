#include "astronaut.h"
#include "crewmate.h"

// These header guards are necessary to keep your class from being defined
// multiple times when it is included from multiple files.
#ifndef IMPOSTOR_H
#define IMPOSTOR_H



using namespace std;

// ========================= YOUR CODE HERE =========================
// Define the Impostor class here, which inherits from the Astronaut
// base class. Refer to the README for instructions.
// ===================================================================

class Impostor : public Astronaut{

public:
      Impostor(const string &name, Color main_color): Astronaut(name, main_color) {}
      Impostor() : Astronaut("no name", Color(0, 0, 0)) {}
      void Kill(Crewmate &crewmate);





private:














};






#endif  // IMPOSTOR_H





