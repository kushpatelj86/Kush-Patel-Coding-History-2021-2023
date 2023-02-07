#include "crewmate.h"

#include <iostream>

// ========================= YOUR CODE HERE =========================
// This implementation file is where you should implement the member
// functions declared in the header, only if you didn't implement
// them inline in the header.
//
// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//        ...
//     }
// to tell the compiler that each function belongs to the Crewmate class.
//

bool Crewmate::GetIsAlive() const {
  return is_alive_;
}

void Crewmate::SetIsAlive(bool is_alive) {
  is_alive_ = is_alive;
}

int Crewmate::GetTaskCount() const {
  return task_count_;
}

void Crewmate::DoTask(const string &task) {
  task_count_++;
  cout << Astronaut::GetName() << " is doing " << task << endl;
}

Color Crewmate::GetColor() const {
  Color color = Astronaut::GetColor();

  if (is_alive_ == true) {
    return color;
  } else {
    Color shifted((color.Red() + 256) / 2, (color.Green() + 256) / 2,
                  (color.Blue() + 256) / 2);
    return shifted;
  }
}

string Crewmate::GetIconFilename() const {
  if (is_alive_ == true) {
    return Astronaut::GetIconFilename();
  } else {
    return "ghost.bmp";
  }
}
