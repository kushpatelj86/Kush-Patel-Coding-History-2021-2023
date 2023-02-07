#include <string>

class Chirp {

  public:
      Chirp();
      Chirp(std::string message);
      Chirp(std::string message, int numLikes);
      void SetMessage(std::string message);
      std::string GetMessage();
      void AddLike(int numLikes);
      void AddLike();
      int GetLikes();

  private:
      int num_likes_;
      std::string message_;










};







// ======================= YOUR CODE HERE =======================
// Write the Chirp class here, containing two member variables:
// one to store the message and one to track the number of likes.
//
// Then, define the following constructor overloads:
// 1. A default constructor, which initializes the message to the
//    empty string "", and initializes the number of likes to 0.
// 2. A non-default constructor, which accepts a message as input
//    and initializes the message to that input, and sets the
//    number of likes to 0.
// 3. A non-default constructor, which accepts a message as input
//    and initializes the message to that input, and also accepts
//    a like count as input, and initializes the like count to that.
//
// Finally, define the following member functions:
// 1. The accessor (getter) function for the message.
// 2. The mutator (setter) function for the message.
// 3. The two AddLike member function overloads.
// 4. The GetLikes member function.
//
// Note: mark functions that do not modify the member variables
// as const, by writing `const` after the parameter list.
// ===========================