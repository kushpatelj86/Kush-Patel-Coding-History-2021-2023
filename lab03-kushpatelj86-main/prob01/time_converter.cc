#include <iostream>
#include <string> 

using namespace std;
string MilitaryToRegularTime(int military_time) {
  // TODO: convert military_time to regular time in string format.
  // Hint: to_string() converts a given integer to a string. 

  
    int regular_time = military_time % 1200;
  
  
  

  int part1 = regular_time  / 100;

  int part2 = regular_time  % 100;

  string hour = to_string(part1);
  string minutes = to_string(part2);

  string result = "";
  if(military_time < 1200)
  {
     if(part2 >= 0 && part2 <= 9)
     {
        result = hour + ":0" + minutes + " am";

     }
     else
     {
     result = hour + ":" + minutes + " am";
     }
  }
  else
  {
    if(part2 >= 0 && part2 <= 9)
     {
        result += hour + ":0" + minutes + " pm";

     }
     else
     {
     result += hour + ":" + minutes + " pm";

     }

  }


  


  return result;
}
