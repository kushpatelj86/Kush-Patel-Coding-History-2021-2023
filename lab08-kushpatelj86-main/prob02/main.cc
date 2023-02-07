#include <iostream>
#include <string>
#include <vector>
#include "chirp.h"



using namespace std;
int main() {
  std::string input;
  const std::string prompt =
      "\nYou can \"chirp\" a new message to Chirper, "
      "\"like\" an existing chirp, or \"exit\". What do you want to do? ";
  std::cout << prompt;
  std::getline(std::cin, input);

  // ============= YOUR CODE HERE =============
  // 1. Create a vector to hold your chirps.
  //    Don't forget to #include <vector> and
  //    the header file for the Chirp class.
  // ==========================================
    vector<Chirp> chirps;


  
  while (input != "exit") {
      
    if (input == "chirp") {
      std::string user_message;
      std::cout << "What's your message? ";
      std::getline(std::cin, user_message);

      // =================== YOUR CODE HERE ===================
      // 2. Create a new Chirp object and set the message to
      //    user_message. Add the new chirp to the vector.
      // 
  
        Chirp newChirp(user_message);
        chirps.push_back(newChirp);
      
      
          

    } else if (input == "like") {
      std::string user_index_string;
      std::cout << "Which index do you want to like? ";
      std::getline(std::cin, user_index_string);
      int user_index = std::stoi(user_index_string);

      // =================== YOUR CODE HERE ===================
      // 3. Add a like to the Chirp object at index user_index
      chirps[user_index - 1].AddLike();
      //    in the vector. You will need to offset user_index
      //    to the zero-based indexing that matches your vector.
      // ======================================================
    }

    // ===================== YOUR CODE HERE =====================
    // 4. Print the contents of the chirp vector. You will need
    //    to loop through the entries in the vector.
    //    Check your formatting matches the README:
    //    Show the user indices starting at 1 instead of 0,
    //    and include the number of likes.
    // 
  cout << "Chirper has " << chirps.size() << " chirps:" << endl;
  for(int i = 0; i < chirps.size();i++)
  { 
      cout << i + 1 << ". "<< chirps[i].GetMessage()  << " (" << chirps[i].GetLikes() << " likes)" << endl;
      
  }
    
    std::cout << prompt;
    std::getline(std::cin, input);
  }
  return 0;
}
