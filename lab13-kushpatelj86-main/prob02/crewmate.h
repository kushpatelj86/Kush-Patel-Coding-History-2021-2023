#include "astronaut.h"

// These header guards are necessary to keep your class from being defined
// multiple times when it is included from multiple files.
#ifndef CREWMATE_H
#define CREWMATE_H
using namespace std;
using namespace graphics;  // ========================= YOUR CODE HERE
                           // =========================
// Define the Crewmate class here, which inherits from the Astronaut
// base class. Refer to the README for instructions.
// ===================================================================
class Crewmate : public Astronaut {
 public:
  Crewmate(const string &name, Color main_color): Astronaut(name, main_color) {}
  Crewmate() : Astronaut("no name", Color(0, 0, 0)) {}
  bool GetIsAlive() const;
  void SetIsAlive(bool is_alive);
  int GetTaskCount() const;
  void DoTask(const string &task);
  Color GetColor() const;
  string GetIconFilename() const;

 private:
  bool is_alive_ = true;
  int task_count_ = 0;
};
#endif  // CREWMATE_H
