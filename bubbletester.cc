#include <iostream>

#include "bubble.h"
#include "cpputils/graphics/image.h"
using namespace std;
int main() {
  // Prompts the user for input to create the Bubble image.
  cout << "Tell me about your bubble.\n"
            << "Valid x, y and size are between 0 and 500.\n"
            << "Valid colors are red, orange, yellow, green, "
            << "teal, blue, and purple." << endl;

  string color;
  cout << "What color? ";
  cin >> color;

  int size;
  cout << "What size? ";
  cin >> size;

  int x;
  cout << "What x? ";
  cin >> x;

  int y;
  cout << "What y? ";
  cin >> y;

  // ========================== YOUR CODE HERE =============================
  // TODO: Instantiate a `Bubble` object into a variable called `my_bubble`.
  Bubble my_bubble;
  // Then, use the member functions to set color, size, and x, y coordinates
  my_bubble.SetX(x);
  my_bubble.SetY(y);
  my_bubble.SetSize(size);
  my_bubble.SetColor(color);

  // based on the user provided input retrieved above.
  // =======================================================================

  // Don't delete this!
  // This prints out your bubble to the terminal and also
  // draws it into an image you can view in "bubble.bmp".
  const int kImageSize = 500;
  graphics::Image image(kImageSize, kImageSize);
  if (image.DrawCircle(my_bubble.GetX(), my_bubble.GetY(), my_bubble.GetSize(),
                       my_bubble.GetColor()) &&
      image.SaveImageBmp("bubble.bmp")) {
    cout << my_bubble.ToString() << endl;
    cout << "Your bubble was saved to bubble.bmp" << endl;
  }
  return 0;
}