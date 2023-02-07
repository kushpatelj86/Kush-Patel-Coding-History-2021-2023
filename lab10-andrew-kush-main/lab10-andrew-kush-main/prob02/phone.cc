// ========================= YOUR CODE HERE =========================

#include "phone.h"
#include <vector>
#include <string>
#include <iostream>
#include <iomanip>



// This implementation file (phone.cc) is where you should implement
// the member functions declared in the header (phone.h), only
// if you didn't implement them inline within phone.h.
//

Phone::Phone(const string &owner)
{
  owner_ = owner;
}


string Phone::GetOwner() const
{
  return owner_;
}

shared_ptr<Message> Phone::AuthorMessage(const string &message)
{
  Message messg(message, owner_);

shared_ptr<Message> ptr = make_shared<Message>(messg);
  return ptr;
}

void Phone::AcceptMessage(shared_ptr<Message> message)
{
  messages_.push_back(message);
}


void Phone::PrintMessages()
{
  for(shared_ptr<Message> m : messages_) 
  {
      cout << m->GetSender() << ": " << m->GetMessage() << "\n";
  }
}






// Remember to specify the name of the class with :: in this format:
//     <return type> MyClassName::MyFunction() {
//        ...
//     }
// to tell the compiler that each function belongs to the Phone class.
// ===================================================================