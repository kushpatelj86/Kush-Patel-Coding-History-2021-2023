#include <iostream>
#include <map>
#include <memory>
#include <string>
#include <vector>

#include "network.h"
#include "phone.h"
using namespace std;
int main() {
  Network csuf_network;
  // =================== YOUR CODE HERE ===================
  // 1. Create 3 objects of type `std::shared_ptr<Phone>`
  Phone Anna("Anna");
  shared_ptr<Phone> phone1 = make_shared<Phone>(Anna);
  //    `phone1`: a pointer to a Phone owned by Anna
  Phone Raf("Raf");
  shared_ptr<Phone> phone2 = make_shared<Phone>(Raf);
  //    `phone2`: a pointer to a Phone owned by Raf
  Phone JC("JC");
  shared_ptr<Phone> phone3 = make_shared<Phone>(JC);
  //    `phone3`: a pointer to a Phone owned by JC
  // ======================================================

  // =================== YOUR CODE HERE ===================
  // 2. Add each phone to the Network, `csuf_network`.
  // ======================================================
  csuf_network.AddPhone(phone1);
  csuf_network.AddPhone(phone2);
  csuf_network.AddPhone(phone3);

  // =================== YOUR CODE HERE ===================
  // 3. Send the message "Sup" to Raf over the network,
  //    authored on Anna's phone.
  // ======================================================
  
  shared_ptr<Message> msg1 = phone2->AuthorMessage("Lol");
  csuf_network.SendMessage(msg1, phone1->GetOwner());
  // =================== YOUR CODE HERE ===================
  // 4. Send the message "Lol" to Anna over the network,
  //    authored on Raf's phone.
  // ======================================================

  shared_ptr<Message> msg2 = phone1->AuthorMessage("Sup");
  csuf_network.SendMessage(msg2, phone2->GetOwner());

  // =================== YOUR CODE HERE ===================
  // 5. Create a vector of strings containing "Anna" and
  //    "Raf" called `jcs_class`. Call the SendMessage
  //     overload to author a message on JC's phone and send
  //     the message "Hi class!" to everyone in `jcs_class`.
  // ======================================================
  vector<string> jcs_class{"Anna", "Raf"};
  shared_ptr<Message> msg3 = phone3->AuthorMessage("Hi class!");
  csuf_network.SendMessage(msg3, jcs_class);
  // =================== YOUR CODE HERE ===================
  // 6. Send the message "Hi Prof!" to JC over the network,
  //    authored on Anna's phone.



  
  csuf_network.SendMessage( phone1->AuthorMessage("Hi Prof!"), phone3->GetOwner());

  // ======================================================

  // =================== YOUR CODE HERE ===================
  // 7. Send the message "help how do C++" to JC over the
  //    network, authored on Raf's phone.
  // ======================================================

  shared_ptr<Message> msg5 = phone2->AuthorMessage("help how do C++");
  csuf_network.SendMessage(msg5, phone3->GetOwner());
  // =================== YOUR CODE HERE ===================
  // 8. Complete the std::cout statements below to display
  //    the messages on Anna's phone, Raf's phone, and JC's
  //    phone in that order. Follow the README for an example.
  // ======================================================
  cout << "Printing messages sent to " << phone1->GetOwner() << ": " << endl;
  phone1->PrintMessages();

  std::cout << "\n";
  cout << "Printing messages sent to " << phone2->GetOwner() << ": " << endl;
  phone2->PrintMessages();

  std::cout << "\n";
  cout << "Printing messages sent to " << phone3->GetOwner() << ": " << endl;
  (*phone3).PrintMessages();






  
}