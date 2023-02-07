#include "plane.h"

// ========================= YOUR CODE HERE =========================
// This implementation file (plane.cc) is where you should implement
// the member functions declared in the header (plane.h), only
int Plane::GetPassengerCount() const {
    return passenger_count_;
  }
  void Plane::SetPassengerCount(int passengers) {
    passenger_count_ = passengers;
  }
  int Plane::GetSeatCount() const {
    return seat_count_;
  }
  void Plane::SetSeatCount(int seats) {
    seat_count_ = seats;
  }
  
  void Plane::SetDestination(const string &dest) {
    destination_ = dest;
  }
// if you didn't implement them inline within plane.h.
//
// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//        ...
//     }
// to tell the compiler that each function belongs to the Plane class.
// ===================================================================