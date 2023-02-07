#include "bubble.h"
// ========================= YOUR CODE HERE =========================
// This implementation file (bubble.cc) is where you should implement
// the member functions declared in the header (bubble.h), only
// if you didn't implement them inline within bubble.h:
//   1. GetRadius
//   2. SetRadius
//   3. CalculateVolume
//
// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//        ...
//     }
    
    double Bubble::GetRadius() const
    {
      return radius_;
    }
    void Bubble::SetRadius(double radius) 
    {
      radius_ = radius; 
    } 
    double Bubble::CalculateVolume() const
    {
      double volume = (double) (4.0 / 3.0) * (3.1415) * (radius_ * radius_ * radius_);
      return volume;
    }




// to tell the compiler that each function belongs to the Bubble class.
// ===================================================================


// ========================= YOUR CODE HERE =========================
// Implement the CombineBubbles function you declared in bubble.h
Bubble CombineBubbles(const Bubble &bubble1, const Bubble &bubble2)
{
  Bubble CombinedBubble;
  CombinedBubble.SetRadius(bubble1.GetRadius() +             bubble2.GetRadius()); 
  return CombinedBubble;
}
//
// Since CombineBubbles is NOT in the Bubble class, you should not
// specify the name of the class with the :: format.
// ===================================================================
