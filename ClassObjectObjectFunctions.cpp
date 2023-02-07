#include <iostream>


using namespace std;


class Student  
{

    public:
        string name;  //in java string is capitalized like this String
        string major;
        double gpa;
        Student(string aName, string aMajor,double aGPA)
        {
        
            name = aName;
            major = aMajor;
            gpa = aGPA;

        }


        bool hasHonors()
        {
            if(gpa >= 3.5)
            {
                return true;
            }
            else
            {
                return false;
            }
        }






};


int main()
{
    Student student1("Jim", "Business", 2.4);
    Student student2("Pam", "Aerospace Engineering",3.7);
    student2.hasHonors();

    return 0;
}