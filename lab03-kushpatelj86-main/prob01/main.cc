#include "time_converter.h" //interface
#include <iostream>
using namespace std;
int main() {
  int military_time;
  cout << "Please enter the time in military time: ";
  cin >> military_time;

  // and assign its result to regular_time.
  string regular_time = MilitaryToRegularTime(military_time);

  cout << "The equivalent regular time is: " << regular_time << endl;
  return 0;
}
