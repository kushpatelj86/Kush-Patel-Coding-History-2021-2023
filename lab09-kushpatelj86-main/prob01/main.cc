#include <iostream>

#include "car.h"

int main() {
  // =================== YOUR CODE HERE ===================
  // 1. Create a Car object called `c1` using the default
  //    constructor.
  //    Call its Print member function.
  // 
  Car c1;
  c1.Print();
    std::cout << "\n";


  // =================== YOUR CODE HERE ===================
  // 2. Create a `VehicleId` object with the following info:
  VehicleId idCar2("Honda",3,"7B319X4");
  //    Model: Honda, ID: 3, License plate: 7B319X4
  //    Create a `Car` object `c2` using the constructor that
  Car c2(idCar2);
  //    accepts a `VehicleId` and  pass in the `VehicleId`
  //    object you just made.
  //    Call its Print member function.
  // 
  c2.Print();
    std::cout << "\n";

    

  // =================== YOUR CODE HERE ===================
  // 3. Create a `Date` object with the following info:
  //    Day: 4, Month: 11, Year: 2018
  Date dateCar3(4,11,2018);
  
  
  //    Create a `Car` object `c3` using the constructor that
  Car c3(dateCar3);
  //    accepts a `Date` object and pass in the `Date` object
  //    you just made.
  //    Call its Print member function.
  c3.Print();
  //   std::cout << "\n";
    std::cout << "\n";


  // =================== YOUR CODE HERE ===================
  // 4. Create a `Car` object `c4` using the constructor that
  //    accepts a `VehicleId` and `Date` object and pass in

  Car c4(idCar2, dateCar3);
  c4.Print();
  //    the `VehicleId` and `Date` objects you created in
    std::cout << "\n";

  //    steps 2 and 3 above.
  //    Call its Print member function.
  // ======================================================


  // 5. Create an instance of `VehicleId` using the default constructor.
  VehicleId idCar4;

  // 6. Create an instance of `Date` using the default constructor.
  Date dateCar4;

  // 7. Call the `SetId` member function on `c4` and pass
  //    in the VehicleId you just created.
  c4.SetId(idCar4);
  // 8. Call the `SetReleaseDate` member function on `c4`
  //    and pass in the VehicleId you just created.
  c4.SetReleaseDate(dateCar4);

  // 9. Finally, call the print member function for `c4`.
  c4.Print();
  return 0;
}
