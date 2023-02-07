#include <string>

#include "breed.h"
using namespace std;

class Pet  {

  public:
      Pet() : name_("Cookie"), weight_(15.6){};
      Pet(const string &name,const Breed &breed, double weight);
      Pet(const string &name,const string &breed_species, const string &breed_name, const string &breed_color, double weight );
      string Name() const;
      void SetName(const string &name);
      Breed GetBreed() const;
      void SetBreed(const Breed &breed);
      void SetBreed(const string &breed_species, const string &breed_name, const string &breed_color);
      double Weight() const;
      void SetWeight(double weight);
      void Print();

  private:
      string name_;
      Breed breed_; 
      double weight_;

};





