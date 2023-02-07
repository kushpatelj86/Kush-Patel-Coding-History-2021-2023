#include "minimum.h"
#include <vector>

using namespace std;
int IndexOfMinimumElement(vector<double> input) {
  // ==================== YOUR CODE HERE ====================
  // TODO: Find the index of the smallest element in the input
  // vector, and return it. If the input vector is empty,
  // return -1.
  // ========================================================
  int smallest_index;
  if(input.size() > 0)
  {
    double prev_value = input.at(0);
    double smallest_value = prev_value;
     smallest_index = 0;
  
    for(int i = 1; i < input.size();i++)
    {
      if(input.at(i) < prev_value)
      {
        smallest_index = i;
        smallest_value = input.at(i);
        
      }
      prev_value = input.at(i);
    }
  }
  else
  {
    return -1;
  }
  if(input.size() > 0)
  {
    return smallest_index;

  }
  
  else
  {
    return smallest_index;
  }
}
