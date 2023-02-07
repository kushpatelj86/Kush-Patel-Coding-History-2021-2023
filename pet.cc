#include "pet.h"
#include <iomanip>
#include <iostream>

using namespace std;
// ========================= YOUR CODE HERE =========================
// This implementation file (pet.cc) is where you should implement
// the member functions declared in the header (pet.h), only
// if you didn't implement them inline within pet.h.
//

Pet::Pet(const string &name,const Breed &breed, double weight)
{
  name_ = name;
  breed_ = breed;
  weight_ = weight;
}
Pet::Pet(const string &name,const string &breed_species, const string &breed_name, const string &breed_color, double weight)
{
    name_ = name;
    breed_.SetSpecies(breed_species);
    breed_.SetBreedName(breed_name);
    breed_.SetColor(breed_color);
    weight_ = weight;
  

}
string Pet::Name() const
{
  return name_;
}


void Pet::SetName(const string &name) 
{
   name_ = name;
}

Breed Pet::GetBreed() const
{
  return breed_;
}

void Pet::SetBreed(const Breed &breed)
{
  breed_ = breed;
}

void Pet::SetBreed(const string &breed_species, const string &breed_name, const string &breed_color)
{
    breed_.SetSpecies(breed_species);
    breed_.SetBreedName(breed_name);
    breed_.SetColor(breed_color);
}

double Pet::Weight() const
{
  return weight_;
}

void Pet::SetWeight(double weight)
{
  weight_ = weight;
}

void Pet::Print()
{
    cout << "Name: " << name_ << endl;
    cout << "Species: " << breed_.Species() << endl;
    cout << "Breed: " << breed_.BreedName() << endl;
    cout << "Color: " << breed_.Color() << endl;
    cout << "Weight: " << weight_ << endl;

}




// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//        ...