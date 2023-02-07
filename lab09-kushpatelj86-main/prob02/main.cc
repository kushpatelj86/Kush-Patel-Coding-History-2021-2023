#include <iostream>
#include <vector>
#include <string>
#include "pet.h"
using namespace std;

int main() {
  // =================== YOUR CODE HERE ===================
  // 1. Create a vector Pet objects called `pets`.

  vector<Pet> list;
  //    Don't forget to #include <vector> and "pet.h"
  // ======================================================
  std::string name;
  std::string breed_name;
  std::string species;
  std::string color;
  double weight;

  do {
    std::cout << "Please enter the pet's name (q to quit): ";
    std::getline(std::cin, name);
    if (name != "q") {
      std::cout << "Please enter the pet's species: ";
      std::getline(std::cin, species);
      std::cout << "Please enter the pet's breed: ";
      std::getline(std::cin, breed_name);
      std::cout << "Please enter the pet's color: ";
      std::getline(std::cin, color);
      std::cout << "Please enter the pet's weight (lbs): ";
      std::cin >> weight;
      std::cin.ignore();

      // =================== YOUR CODE HERE ===================
      // 2. Create a Pet object using the input from the user
      //    Store the newly-created Pet object into the vector.
      // ======================================================
      Pet pet(name,species, breed_name, color,  weight);
      list.push_back(pet);
    }
  } while (name != "q");

  std::cout << "Printing Pets:\n";
  // =================== YOUR CODE HERE ===================
  // 3.  Print information about each pet in the `pets`
  //     vector by writing a loop to access each Pet object.

    for(int i = 0; i < list.size();i++)
    {
      cout << "Pet " << i + 1 << endl;
      list[i].Print();
    }
  
  // ======================================================
  return 0;
}