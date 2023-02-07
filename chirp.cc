#include "chirp.h"
// ========================= YOUR CODE HERE =========================
// This implementation file (chirp.cc) is where you should implement
Chirp::Chirp()
{
  message_ = "";
  num_likes_ = 0;
}



Chirp::Chirp(std::string message)
{
  message_ = message;
  num_likes_ = 0;
}

Chirp::Chirp(std::string message,int numLikes)
{
  message_ = message;
  num_likes_ = numLikes;
}

void Chirp::SetMessage(std::string message)
{
  message_ = message;
}

std::string Chirp::GetMessage()
{
  return message_;
}

void Chirp::AddLike()
{
  num_likes_++;
}

int Chirp::GetLikes()
{
  return num_likes_;
}


void Chirp::AddLike(int numLikes)
{
  num_likes_ += numLikes;
}


// the member functions declared in the header (chirp.h), only
// if you didn't implement them inline within chirp.h:
//   1. SetMessage
//   2. GetMessage
//   3. The two AddLike member function overloads.
//   4. GetLikes
//   5. The three Chirp constructor overloads.
//
// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//        ...
//     }
// to tell the compiler that each function belongs to the Chirp class.
// ===================================================================