#pragma once

#include <map>
#include <vector>

#include <memory>

#include "message.h"
#include "phone.h"
using namespace std;
class Network {
  // ======================= YOUR CODE HERE =======================
  // Write the Network class here. Refer to the README for the member
  // variables, constructors, and member functions needed.
  //
  // If you were the "driver" for the Phone class, then switch roles
  // with your lab partner and act as the "navigator" for this class.


  public:

  void AddPhone(shared_ptr<Phone> phone);
  void SendMessage(shared_ptr<Message> message,const string &owner);
  void SendMessage(shared_ptr<Message> message, const vector<string> &list);


  private:
        map<string, shared_ptr<Phone>> phonebook_;



};