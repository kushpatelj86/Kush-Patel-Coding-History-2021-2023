// ========================= YOUR CODE HERE =========================

#pragma once

#include "network.h"

#include <iomanip>
#include <iostream>
#include <map>
#include <memory>
#include <string>
#include <vector>

// This implementation file (network.cc) is where you should implement
// the member functions declared in the header (network.h), only
// if you didn't implement them inline within network.h.
//
// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//        ...
//     }
// to tell the compiler that each function belongs to the Network class.
// ===================================================================
void Network::AddPhone(shared_ptr<Phone> phone) {
  phonebook_.insert({phone->GetOwner(), phone});
}

void Network::SendMessage(shared_ptr<Message> message, const string &owner) {
  
    if (phonebook_.count(owner) > 0) {
      phonebook_.at(owner)->AcceptMessage(message);
    
  }
}

void Network::SendMessage(shared_ptr<Message> message,
                          const vector<string> &list) {
  for (string s : list) {
    if (phonebook_.count(s) > 0) {

      phonebook_.at(s)->AcceptMessage(message);
    }
  }
}

