#include <iostream>
#include <memory>

#include "train.h"
using namespace std;
int main() {
  // Creates a train, with the locomotive at the front of the train.
  // LinkedList diagram:
  //   Locomotive -> First Class -> Business Class -> Cafe Car -> Carriage 1 ->
  //   Carriage 2
  shared_ptr<Train> carriage2 = make_shared<Train>(100, 100, nullptr);
  shared_ptr<Train> carriage1 =
      make_shared<Train>(220, 220, carriage2);
  shared_ptr<Train> cafe_car =
      make_shared<Train>(250, 250, carriage1);
  shared_ptr<Train> business_class =
      make_shared<Train>(50, 50, cafe_car);
  shared_ptr<Train> first_class =
      make_shared<Train>(20, 20, business_class);
  shared_ptr<Train> locomotive =
      make_shared<Train>(1, 1, first_class);

  cout << "Total passengers in the train: ";
  // =================== YOUR CODE HERE ===================
  // 1. Print out the total number of passengers in the
  //    train by invoking TotalTrainPassengers on the
  //    first carriage in the train (the locomotive).
  cout << locomotive->TotalTrainPassengers();
  // ======================================================
  cout << endl;

  cout << "Max passengers in a carriage: ";
  // =================== YOUR CODE HERE ===================
  // 2. Print out the maximum number of passengers in a
  //    single carriage in the train by invoking
  //    MaxCarriagePassengers.
  cout << locomotive->MaxCarriagePassengers();
  // ======================================================
  cout << endl;

  // =================== YOUR CODE HERE ===================
  // 3. Using IsTrainFull, check if the locomotive is full.
  //    If IsTrainFull returns true, print
  //          "The train is full."
  //    If IsTrainFull returns false, print
  //          "The train has available seats."
  bool capacity1 = locomotive->IsTrainFull();
  if(capacity1 == true)
  {
    cout << "The train is full.";

  }
  else{
        cout << "The train now has available seats.";

  }
  // ======================================================
  cout << endl;

  // =================== YOUR CODE HERE ===================
  // 4. Create a new shared_ptr<Train>. You may name
  //    it the `caboose`, which refers to the carriage at
  //    the end of a train.
  //    Set its passenger count to 40, seat count to
  //    75, and next carriage to `nullptr`.

      shared_ptr<Train> caboose = make_shared<Train>(40, 75, nullptr);
  // ======================================================

  cout << "Adding a new carriage to the train!" << endl;
  // =================== YOUR CODE HERE ===================
  // 5. Using `AddCarriageToEnd`, add the new Train you've
  //    created in #4 to the end of the `locomotive`.
  // ======================================================
locomotive->AddCarriageToEnd(caboose);
  // =================== YOUR CODE HERE ===================
  // 6. Using IsTrainFull, check if the locomotive is full.
  //    If IsTrainFull returns true, print
  //          "The train is now full."
  //    If IsTrainFull returns false, print
  //          "The train now has available seats."
  // ======================================================
bool capacity2 = locomotive->IsTrainFull();
  if(capacity2 == true)
  {
    cout << "The train is full.";

  }
  else{
        cout << "The train now has available seats.";

  }  cout << endl;
  return 0;
}
