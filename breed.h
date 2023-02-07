#include <string>
using namespace std;
// ======================= YOUR CODE HERE =======================
// Write the Breed class here. Refer to the README for the member
// variables, constructors, and member functions needed.
//




class Breed {

public:
    Breed() : species_("Dog"), breed_name_("Chihuahua"), color_("Fawn") {}
    Breed(const string &species, const string &breed_name, const string &color) : species_(species), breed_name_(breed_name), color_(color) {}
    string Species() const {return species_;}
    void SetSpecies(const string &species) { species_ = species;}
    string BreedName() const {return breed_name_;}
    void SetBreedName(const string &breed_name) { breed_name_ = breed_name;}
    string Color() const {return color_;}
    void SetColor(const string &color) { color_ = color;}



private:
      string species_;
      string breed_name_;
      string color_;
      

};



