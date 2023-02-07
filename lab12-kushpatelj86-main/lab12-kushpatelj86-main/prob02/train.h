#include <memory>
#include <string>
using namespace std;
class Train {
 public:
  Train(int passenger_count, int seat_count,
        shared_ptr<Train> next_carriage)
      : passenger_count_(passenger_count),
        seat_count_(seat_count),
        next_carriage_(next_carriage) {}

  int GetPassengerCount() const {
    return passenger_count_;
  }
  int GetSeatCount() const {
    return seat_count_;
  }
  shared_ptr<Train> GetNextCarriage() const {
    return next_carriage_;
  }
  // ====================== YOUR CODE HERE ======================
  // Define the following recursive member functions, according
  // to the instructions in the README:
  //
  //   1. TotalTrainPassengers
  //   2. MaxCarriagePassengers
  //   3. IsTrainFull
  //   4. AddCarriageToEnd


  int TotalTrainPassengers();
  int MaxCarriagePassengers();
  bool IsTrainFull();
  void AddCarriageToEnd(shared_ptr<Train> nextCarriage);
  // ============================================================

 private:
  int passenger_count_;
  int seat_count_;
  shared_ptr<Train> next_carriage_;
};
