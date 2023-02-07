#include "train.h"
using namespace std;
// ========================= YOUR CODE HERE =========================
// This implementation file (train.cc) is where you should implement
// the member functions declared in the header (train.h), only
// if you didn't implement them inline within train.h.
//
// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//        ...
//     }


  int Train::MaxCarriagePassengers()
{
  if(next_carriage_ == nullptr)
  {
    return seat_count_;
  }
  else
  {
    int new_count = next_carriage_->MaxCarriagePassengers();
    if(seat_count_ > new_count)
    {
      return seat_count_;
    }
    else
    {
      return new_count;
    }
  }
}




  int Train::TotalTrainPassengers()
{
  if(next_carriage_ == nullptr)
  {
    return passenger_count_;
  }
  else
  {
    return passenger_count_ + next_carriage_->TotalTrainPassengers();
  }
}



  bool Train::IsTrainFull()
  {
    if(next_carriage_ == nullptr)
    {
      if(seat_count_ == passenger_count_)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    else
    {
      if(seat_count_ == passenger_count_)
      {
        return next_carriage_->IsTrainFull();
        }
      // return seat_count_ == passenger_count_ && next_carriage_->IsTrainFull();
      return false;
    }
  }


  void Train::AddCarriageToEnd(shared_ptr<Train> nextCarriage)
{
  if(next_carriage_ == nullptr)
  {
    next_carriage_ = nextCarriage;
  }
  else
  {
    next_carriage_->AddCarriageToEnd(nextCarriage);
  }
}




// to tell the compiler that each function belongs to the Train class.
// ===================================================================