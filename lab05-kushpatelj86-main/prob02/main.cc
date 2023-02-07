#include <iomanip>
#include <iostream>
#include <vector>
#include "calculate_avg.h"
using namespace std;
int main() {
  int num_students;
  cout << "How many students are in your class? ";
  cin >> num_students;

  if (num_students <= 0) {
    cout << "You have no students!\n";
  } else {

    // ===================== YOUR CODE HERE =====================
    // TODO: Construct a vector whose size is the same as the
    // given number of students in the class, based on the
    // `num_students` variable. Don't forget to #include <vector>.
    // ==========================================================
    vector<double> student_grades(num_students);
    cout << "Enter the GPA for the students in your class (0.0 - 4.0)\n";
    double gpa;
    for (int i = 0; i < num_students; i++) {
      // ============ YOUR CODE HERE ============
      // TODO: Store the input GPA from cin into
      // the corresponding index in the vector.
      // ========================================
      cout << "Enter the GPA for student #" << i + 1 << ": ";
      cin >> gpa;
      student_grades[i] = gpa;

    }
    // cout << student_grades.size();
    double average = CalculateAverage(student_grades);

    // ===================== YOUR CODE HERE =====================
    // TODO: Call your CalculateAverage function and provide any
    // necessary parameters. Then, store the results in the average
    // variable. Make sure to #include "calculate_avg.h" before you
    // use the CalculateAverage function.
    // ==========================================================

    cout << "Class average: " << setprecision(2) << fixed
              << average << "\n";
  }

  return 0;
}
