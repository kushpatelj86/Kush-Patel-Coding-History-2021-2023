#include <vector>
using namespace std;
#include <iostream>

double CalculateAverage(const std::vector<double> &student_grades) {
  // ================= YOUR CODE HERE =================
  // TODO: Compute and return the average grade
  // based on the input vector containing student GPAs.
  // Hint: you may want to use a range based loop!
  // ==================================================
  if(student_grades.size() <= 0)
  {
      return 0.0;

  }
  else
  {
    // cout << student_grades.size();
    double sum = 0;
    int count = 0;
    for(double grade: student_grades)
    {
      sum += grade;
      count++;
    }

    double average = sum / student_grades.size();
    // cout << sum << endl;
    return average;

  }
}
