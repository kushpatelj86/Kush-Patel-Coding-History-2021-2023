#include "rectangle.h"

int Rectangle::Area() {
  // TODO: Compute the area of this rectangle object.
  // Remember that member functions can access the member variables of the
  // class. Hint: look at `rectangle.h` to see the member variables you can
  // access.

  int area = GetLength() * GetWidth();
  //cout << area;
 // cout<< GetLength();
  return area;
}

int Rectangle::Perimeter() 
{
  // TODO: Compute the perimeter of this rectangle object.
  return (2 * GetLength()) + (2 * GetWidth());
}

Rectangle LargestRectangleByArea(Rectangle &r1, Rectangle &r2) {
  // Compare the areas of the two given rectangles, and return
  // the Rectangle whose area is larger.
  
  
  
  Rectangle largest_rectangle;
    if(r1.Area() > r2.Area())
    {
        largest_rectangle = r1;
    }
    else
    {
        largest_rectangle = r2;

    }
    return largest_rectangle;
}
