#include <iomanip>
#include <iostream>
#include <string>
using namespace std;
class Star {
 public:
  // ====================== YOUR CODE HERE ======================
  

      Star(const string &name, double radius);
      ~Star();
      string GetName() const;



  
  //   2. A constructor, which initializes the name of the star,
  //      and the radius of the star. The constructor should
  //      print that the star was born to the terminal.
  //   3. A destructor that prints to the terminal that the star
  //      was destroyed (i.e. went supernova), and print how many
  //      times the volume of the sun that the star was.
  //   4. An accessor function, `GetName` for the star's name.
  // ============================================================
private:
      string name_;
      double radius_;





};
