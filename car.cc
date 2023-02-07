#include "car.h"

#include <iostream>
using namespace std;
// ========================= YOUR CODE HERE =========================
// This implementation file (car.cc) is where you should implement

Car::Car(const VehicleId &id)
{
  id_ = id;
}
Car::Car(const Date &release_date)
{
  release_date_ = release_date;
}


Car::Car(const VehicleId &id, const Date &release_date)
{
  id_ = id;
  release_date_ = release_date;
}
VehicleId Car::Id() const{
  return id_;
}
Date Car::ReleaseDate() const {
  return release_date_;
}
void Car::SetId(const VehicleId &id){
  id_ = id;
}

void Car::SetReleaseDate(const Date &release_date) {
  release_date_ = release_date;
}

void Car::Print() const{
  cout << "The model of the car is: " << id_.Model() << endl;
  cout << "The VIN of the car is: " << id_.Vin() << endl;
  cout << "The license plate of the car is: " << id_.LicensePlate() << endl;
  cout << "The release date of the car is: " << release_date_.Month() << "/"<<release_date_.Day() << "/" <<release_date_.Year() << "\n";
}

// the member functions declared in the header (car.h), only
// if you didn't implement them inline within car.h.
// 
// Remember to specify the name of the class with :: in this format:
//     <return type> MyC