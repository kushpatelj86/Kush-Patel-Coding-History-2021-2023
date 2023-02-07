#include <string>
using namespace std;
class Plane {
 public:
  // ====================== YOUR CODE HERE ======================
  // Define the following constructors using member initializer
  //  list syntax:
  //
  //   1. A default constructor, which initializes seat count
  Plane(): seat_count_(121),passenger_count_(121),destination_("Fullerton") {}
  //      to 121, passenger count to 121, and the flight
  //      destination to "Fullerton".
  //   2. A constructor overload which accepts the seat count,
Plane(int seat_count, int passenger_count, const string &destination): seat_count_(seat_count),passenger_count_(passenger_count),destination_("Manila") {}
  //      passenger count, and flight destination and initializes
  //      each corresponding member variable appropriately.
  // ============================================================
  int GetPassengerCount() const;
  void SetPassengerCount(int passengers);
  int GetSeatCount() const;
  void SetSeatCount(int seats);
const string &GetDestination() const {
    return destination_;
  }  void SetDestination(const string &dest);

 private:
  int seat_count_;
  int passenger_count_;
  std::string destination_;
};