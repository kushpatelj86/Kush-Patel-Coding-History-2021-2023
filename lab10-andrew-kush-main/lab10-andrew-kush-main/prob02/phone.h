#pragma once

#include <iostream>
#include <memory>
#include <vector>

#include "message.h"
using namespace std;
class Phone {
  // ======================= YOUR CODE HERE =======================
  // Write the Phone class here. Refer to the README for the member

  public:
        Phone(const string &owner);
        string GetOwner() const;
        shared_ptr<Message> AuthorMessage(const string &message);
        void AcceptMessage(shared_ptr<Message> message);
        void PrintMessages();

  // variables, constructors, and member functions needed.
  //
  // Select one among you and your lab partner to be the "driver"
  // and the other to be the "navigator". The driver should write
  // the code, while the navigator reviews the code. Both of you

  private:
        string owner_;
        vector<shared_ptr<Message>> messages_;

  // should communicate and share thoughts as you go along.
  // ===============================================================
};