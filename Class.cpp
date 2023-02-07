
#include <iostream>

using namespace std;

class Book{
    public:
        string title;
        string author;
        int pages;
        Book(string aTitle, string aAuthor, int aPages)
        {
            title = aTitle;
            author = aAuthor;
            pages = aPages;
        }
};

int main() //eqiuivalent to public static void main(String[] args)
{

    Book book1("Harry Potter", "JK Rowling",500);
    book1.title = "Harry Potter";
    book1.author = "JK Rowling";
    book1.pages = 500;

    cout << book1.title << endl;


    Book book2("The Lord of the Rings","Tolkien", 700);
    book2.title = "Lord of the Rings";
    book2.author = "Tolkien";
    book2.pages = 700;




    cout << book2.title;
    return 0;



}