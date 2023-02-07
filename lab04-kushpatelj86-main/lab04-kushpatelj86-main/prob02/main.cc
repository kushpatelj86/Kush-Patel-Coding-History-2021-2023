#include <iostream>

#include "rectangle.h"
using namespace std;
int main() {
  int length, width;
  cout << "====== Rectangle 1 ======" << endl;
  cout << "Please enter the length: ";
  cin >> length;
  cout << "Please enter the width: ";
  cin >> width;
    Rectangle r1;
  r1.SetLength(length);
  r1.SetWidth(width);
  cout << "Rectangle 1 is created with length " << length << " and width " << width << endl;
  cout << "The area of Rectangle 1 is: " << r1.Area() << endl;
  cout << "The perimeter of Rectangle 1 is: " << r1.Perimeter() << endl;
  cout << "" << endl;

  // TODO: accept user input for the length and width of rectangle 1,

  // and instantiate a new Rectangle object with these inputs.
// TODO: accept user input for the length and width of rectangle 2,
  // and instantiate a new Rectangle object with these inputs.
  cout << "====== Rectangle 2 ======" << endl;
  cout << "Please enter the length: ";
  cin >> length;
  cout << "Please enter the width: ";
  cin >> width;
    Rectangle r2;
r2.SetLength(length);
  r2.SetWidth(width);
  cout << "Rectangle 2 is created with length " << length << " and width " << width << endl;
  cout << "The area of Rectangle 2 is: " << r2.Area() << endl;
  cout << "The perimeter of Rectangle 2 is: " << r2.Perimeter() << endl;
  cout << "" << endl;
  Rectangle largest_rect = LargestRectangleByArea(r1, r2);
  cout << "The largest rectangle has a length of " << largest_rect.GetLength() << ", a width of " << largest_rect.GetWidth()  <<", and an area of " << largest_rect.Area() << "." << endl;

  // TODO: call LargestRectangleByArea to determine which rectangle
  // is larger, and print out its length, width, and area.
  // Follow the README for formatting.
  return 0;
}
