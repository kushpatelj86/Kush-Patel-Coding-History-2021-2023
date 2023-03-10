/**  
 *<BR> Name:          Kush Patel
 *<BR> Date:          2-22-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICY Lesson 17, 18, 25, 26
 *<BR> Description:   We will be ciounting the steps for each sort
 *<BR> Cite Sources:  Mr.Elliot explained where we had to count steps
 *<BR> Sort Code by:  Jason Quesenberry, Nancy Quesenberry, Mr. Eliot
 */
 
public class SortTester
{
	public static void main(String args[])
	{
		SortStep MySorter = new SortStep();
		MySorter.sortMenu();
	}
}

/*
RUN OUTPUT:

Sorting algorithm menu

(1) Bubble sort
(2) Selection sort
(3) Insertion sort
(4) Recursive MergeSort
(5) Recursive QuickSort
(Q) Quit

Choice ---> 1

NOTE: For sample runs, please sort 500 numbers or less.
NOTE: For sample runs, please make the highest number 100.

How MANY numbers would you like to generate? 500
What is the LARGEST number you would like to generate? 100

ArrayList reset to:
      92

      91       8      23      65      57      64      58      31      94      20
      13       2       7      63      51      70      91      74      65      70
      32      33      71      40      54      81      44      86      59       7
      87      87       1      92      56      77      79      10      76      63
      37      39      77      67       9      40      50      62      64      71
      41      71      52      76      90      25      80      48      21      24
     100      85      14      53      20      90      61      85      27      37
      71      74       8      93      46      92      81      57      32      61
      31      53       2      69      70      67      15       2      53      64
      74      98      90      87      74      65      22      85      28       9

      52      17      37       9      39      86      66      64       2      12
      71      38       4      17      47      26      39      10       3      85
      49      68      68      32      80      96      36      97      12       7
      43      35      22      95      40      39      43      13      62      58
      94      31      91      35      14      50      54      89      26     100
       2      40      83      40      63      19      40      48      68      78
      50      28      12      70      64      33      14      15      88      67
      25       1      28      25      21      35      37      40      20      70
      66      84      66      51       2      12       2      92      72      98
       6      67      96      81       9      24      46      80      90      57

     100      55       6      59      49      65      76      50      56      99
      16      30      55      40      89      27      96       8      28      30
      56       8      46      60      77     100      48      16      68      73
      43      65      92      55      51      54      38      86      66      42
      44      26      71       4      55      90      71      16      35     100
      27      79      16      64      67      16      88      90      77       9
      88      52      70      51      10      83      51      96      84      10
      23      59      71      82      84      45      33      31       5      59
      38       1      90       6      11      17      71      17       7      21
       6      64      73      11      87       1      17     100      19      53

      97       5      60       6      37      98      60      94      23      96
      88      60      61      73       6      76      54      45      54      39
      45      45      47      23      70      66      56      61      88      29
      99      34      31      58      56      35      30       6      64      73
       8      35      61      84       6      65      76      48      56      43
      99      62      13      37      90      20       2      55      37      45
      42      10      87       9      41      77      53      61       8      94
       9       7      37      26      68      79      70      75      57       7
      88      41      95      97      19      66       1       5     100      54
      58      75      89      70      89      38      64      23      96       3

       8      86      67      65      54       7      48      26      98      35
      24      10      78      42      80      40      88      88      38      10
      41      28      19      33      11      26      99      42      23      57
      86      53      80      48       1      33      67      37      43      11
      80      26      63      64      26      87      12      51       7      63
       8      25      30      99      17      56      58       6      97      91
      57      21      61      66      43      19      22       8      26      77
      42      20      63      12      85      25      47      43      62      56
      98      97      28       7      93      45      94      38      83       2
      87      12      73      39       2      75      68      66      81

ArrayList sorted to:
       1

       1       1       1       1       1       2       2       2       2       2
       2       2       2       2       2       3       3       4       4       5
       5       5       6       6       6       6       6       6       6       6
       6       7       7       7       7       7       7       7       7       7
       8       8       8       8       8       8       8       8       8       9
       9       9       9       9       9       9      10      10      10      10
      10      10      10      11      11      11      11      12      12      12
      12      12      12      12      13      13      13      14      14      14
      15      15      16      16      16      16      16      17      17      17
      17      17      17      19      19      19      19      19      20      20

      20      20      20      21      21      21      21      22      22      22
      23      23      23      23      23      23      24      24      24      25
      25      25      25      25      26      26      26      26      26      26
      26      26      26      27      27      27      28      28      28      28
      28      28      29      30      30      30      30      31      31      31
      31      31      32      32      32      33      33      33      33      33
      34      35      35      35      35      35      35      35      36      37
      37      37      37      37      37      37      37      37      38      38
      38      38      38      38      39      39      39      39      39      39
      40      40      40      40      40      40      40      40      40      41

      41      41      41      42      42      42      42      42      43      43
      43      43      43      43      43      44      44      45      45      45
      45      45      45      46      46      46      47      47      47      48
      48      48      48      48      48      49      49      50      50      50
      50      51      51      51      51      51      51      52      52      52
      53      53      53      53      53      53      54      54      54      54
      54      54      54      55      55      55      55      55      56      56
      56      56      56      56      56      56      57      57      57      57
      57      57      58      58      58      58      58      59      59      59
      59      60      60      60      60      61      61      61      61      61

      61      61      62      62      62      62      63      63      63      63
      63      63      64      64      64      64      64      64      64      64
      64      64      65      65      65      65      65      65      65      66
      66      66      66      66      66      66      66      67      67      67
      67      67      67      67      68      68      68      68      68      68
      69      70      70      70      70      70      70      70      70      70
      71      71      71      71      71      71      71      71      71      72
      73      73      73      73      73      74      74      74      74      75
      75      75      76      76      76      76      76      77      77      77
      77      77      77      78      78      79      79      79      80      80

      80      80      80      80      81      81      81      81      82      83
      83      83      84      84      84      84      85      85      85      85
      85      86      86      86      86      86      87      87      87      87
      87      87      87      88      88      88      88      88      88      88
      88      89      89      89      89      90      90      90      90      90
      90      90      90      91      91      91      91      92      92      92
      92      92      93      93      94      94      94      94      94      95
      95      96      96      96      96      96      96      97      97      97
      97      97      98      98      98      98      98      99      99      99
      99      99     100     100     100     100     100     100     100

Number of steps = 624,886

Sorting algorithm menu

(1) Bubble sort
(2) Selection sort
(3) Insertion sort
(4) Recursive MergeSort
(5) Recursive QuickSort
(Q) Quit

Choice ---> 2

NOTE: For sample runs, please sort 500 numbers or less.
NOTE: For sample runs, please make the highest number 100.

How MANY numbers would you like to generate? 500
What is the LARGEST number you would like to generate? 100

ArrayList reset to:
      63

      24      14      82      52      95      63      26      43      96      54
      42      77      42      30      45      76      76       7      65      34
      25      58      42      75      22      55      92      86      63      67
       2      24       7       9      69      97      65      17      36      61
      90      92      75      28      85      88      78      70      52      42
      27      43       9      37      52      68      93      66      77      12
       2       1       9       3      27      32      28      31      35      12
      84      86      14      63      28      11      67      34      49      32
      16      71      26       8      71      51      46      75      67      62
      88      89       6      56      22      89      81      81      15      57

      82      21      16      34      66      84      13      83      78      57
      61      89      97      56      99      16       3      75      93      63
      60      24      49      70       9      27      96      90      98       7
      21      11      93      87      17      42      92      28       4      85
      63      78      26      19      68      70      88      69      38      83
      10       6      30      48      44      31       5      78      33      99
      25      32      61      36      76      83      81      42      24      44
      81      28      91      23      92      33      56      17      36      77
      73      26      43      74      29      72      71      68      41      21
      16      96      45      82      91      85      11      12       4      71

      57       1       5      99      59      18      96      85      58      84
      23      68      33      32      68      50      93      34      26      17
      20      28      76      70      13      50      50      46       8      11
       3      94      41      52      16      92      11      11      32      10
       3      17      11      27      42      36      29      71      41      53
      19      95      41      59      74      66      21      83      22      93
       8     100      62      62       2      30      48      65      92      18
      57      81      21      19      31      61      32      31      90      95
      15      32       3      73      58      26      19      57      88      95
      32      61      92      39      97      89      86      67      85      26

      14      93      16      96      48      71      79      85      73      44
      18      94      37      90      32      70      70      77       1      44
      76      99      55      49      32      25      51      56      34      33
      28      34      61      26      87      90      53      87      47      36
      27      44      90      67      88      17      51      72      26       1
      58      77      22      77      64      44      50       2      17      42
      73       9      92      39      11      64      63      66      87      86
      77      14      26      62      22      85      20      57       3      76
      67      62      60       5      12      59      91      71      15       4
      75      77      35      76      29      29      80      56      45      58

      64      87      38      40      80      49      27      55      86      10
      61      62      83      61      24      43      62      38      17      72
      60      17      67      18      10      38      75      21       4      25
      75      17      59      43      32      51       6      51      98      13
     100      65      92      85       1      17      51      78      36       8
      93       6      24      73      85      59       7      57      22      65
      30      63      77      19      35      79      15       7      80      12
      10      42      19      54      36      96      95      79      85      87
      86      23      74      71      17      61      97      54      57      30
      14      74      42      56      41       1      96      75      60

ArrayList sorted to:
       1

       1       1       1       1       1       2       2       2       2       3
       3       3       3       3       3       4       4       4       4       5
       5       5       6       6       6       6       7       7       7       7
       7       8       8       8       8       9       9       9       9       9
      10      10      10      10      10      11      11      11      11      11
      11      11      11      12      12      12      12      12      13      13
      13      14      14      14      14      14      15      15      15      15
      16      16      16      16      16      16      17      17      17      17
      17      17      17      17      17      17      17      17      18      18
      18      18      19      19      19      19      19      19      20      20

      21      21      21      21      21      21      22      22      22      22
      22      22      23      23      23      24      24      24      24      24
      24      25      25      25      25      26      26      26      26      26
      26      26      26      26      26      27      27      27      27      27
      27      28      28      28      28      28      28      28      29      29
      29      29      30      30      30      30      30      31      31      31
      31      32      32      32      32      32      32      32      32      32
      32      32      33      33      33      33      34      34      34      34
      34      34      35      35      35      36      36      36      36      36
      36      36      37      37      38      38      38      38      39      39

      40      41      41      41      41      41      42      42      42      42
      42      42      42      42      42      42      43      43      43      43
      43      44      44      44      44      44      44      45      45      45
      46      46      47      48      48      48      49      49      49      49
      50      50      50      50      51      51      51      51      51      51
      52      52      52      52      53      53      54      54      54      55
      55      55      56      56      56      56      56      56      57      57
      57      57      57      57      57      57      58      58      58      58
      58      59      59      59      59      59      60      60      60      60
      61      61      61      61      61      61      61      61      61      62

      62      62      62      62      62      62      63      63      63      63
      63      63      63      63      64      64      64      65      65      65
      65      65      66      66      66      66      67      67      67      67
      67      67      67      68      68      68      68      68      69      69
      70      70      70      70      70      70      71      71      71      71
      71      71      71      71      72      72      72      73      73      73
      73      73      74      74      74      74      75      75      75      75
      75      75      75      75      76      76      76      76      76      76
      76      77      77      77      77      77      77      77      77      77
      78      78      78      78      78      79      79      79      80      80

      80      81      81      81      81      81      82      82      82      83
      83      83      83      83      84      84      84      85      85      85
      85      85      85      85      85      85      85      86      86      86
      86      86      86      87      87      87      87      87      87      88
      88      88      88      88      89      89      89      89      90      90
      90      90      90      90      91      91      91      92      92      92
      92      92      92      92      92      92      93      93      93      93
      93      93      93      94      94      95      95      95      95      95
      96      96      96      96      96      96      96      97      97      97
      97      98      98      99      99      99      99     100     100

Number of steps = 376,246

Sorting algorithm menu

(1) Bubble sort
(2) Selection sort
(3) Insertion sort
(4) Recursive MergeSort
(5) Recursive QuickSort
(Q) Quit

Choice ---> 3

NOTE: For sample runs, please sort 500 numbers or less.
NOTE: For sample runs, please make the highest number 100.

How MANY numbers would you like to generate? 500
What is the LARGEST number you would like to generate? 100

ArrayList reset to:
      20

      94      12      89      18      45      45      33      62       5      70
      29      82      81      66      78      23      12      69      81      37
      20      81      81      95      67      55      43      14      29      69
      67      30      56      13      50      94      44      52      36      40
      98      21       3      73      41       3      91      63      77      67
      66     100      92      22      92      18      61      21      85      62
      70      62      90      58      98      92      31      85      13      81
      81      78       2      33      82      72      65      62      79      33
      66      53      90       2      57       3      98      96      69      59
       8      62      81      93      88      26      57      53      55      91

      85       4      69      63      21      18      57      38      91      87
      61      47      97       4      97      90      99      34      91      22
      68      90      43      99      47      49      50       5      37      64
      54      23      35      52      99      93      99      70      81      76
      29      92      72      56      42       3       3      17      96      48
      16      47      41      57      70      47      55      50      61       8
      37      44      52       1      37      45      25      69       6      56
       2      35      75      89      79      59      66      29      92      44
      88      42      32      76      72      26      73      85      21      93
      28      96       6      61      72      65      45      48      40      12

      48      23      30      31      51      54      17      19      96      70
      34      76      75      45      18       8      73       6      10      29
      39      29      34      26      23      59      68      16       6      52
      88      13       3      28      22      94      68      12      62      23
      15      65      30       5      32      12      92      91      29      94
      16      94      61      62      17       5       1      11      79      88
      89      80      95      96      83       2      96      45      17      51
      16      50      75      67      78       1      59      40      56       2
      76      49      26      77      94      72      73      85      20      98
      11      34      43      17      34      19      21      28      69      87

      83      58      25      76      45      34      69       7      53      17
      71      59      94      84      27      69      33      67      82      75
      77      11      46      45      83      66       4      90      77      57
      16      33      79      79      18      99      70      45       7      72
      97      80      52      46      36      91      32      92       7      54
      66      75      68      76      69      92      93      27      40      13
      82      33      63      51      20       7      76      92      74      38
      50       4      86      19      90      76      73      86      82      54
      57      41      63      45      93       8      29      91      64       4
      52      54      92      60      95      37       1      97      20      75

      68      75      80      49      69      86       2      73      68      78
      67      39      41      61      29      93      87      90      16      94
      48      37      80      44      77      79      97      16      22      96
      26      18      97      35      98      98      24      45      98      75
      77      70      80      16      56      19      72      83      73      74
      69       9      44      54      80      89      32      82      14      59
      18      11      71      66       6      25      42       8      47      35
      81      70      69      75      91      73      94      69       1      79
      41       9      11      37       2      54      33      20      15      42
      40      37      28      92      91      91      33      22      28

ArrayList sorted to:
       1

       1       1       1       1       2       2       2       2       2       2
       2       3       3       3       3       3       3       4       4       4
       4       4       5       5       5       5       6       6       6       6
       6       7       7       7       7       8       8       8       8       8
       9       9      10      11      11      11      11      11      12      12
      12      12      12      13      13      13      13      14      14      15
      15      16      16      16      16      16      16      16      16      17
      17      17      17      17      17      18      18      18      18      18
      18      18      19      19      19      19      20      20      20      20
      20      20      21      21      21      21      21      22      22      22

      22      22      23      23      23      23      23      24      25      25
      25      26      26      26      26      26      27      27      28      28
      28      28      28      29      29      29      29      29      29      29
      29      29      30      30      30      31      31      32      32      32
      32      33      33      33      33      33      33      33      33      34
      34      34      34      34      34      35      35      35      35      36
      36      37      37      37      37      37      37      37      37      38
      38      39      39      40      40      40      40      40      41      41
      41      41      41      42      42      42      42      43      43      43
      44      44      44      44      44      45      45      45      45      45

      45      45      45      45      45      45      46      46      47      47
      47      47      47      48      48      48      48      49      49      49
      50      50      50      50      50      51      51      51      52      52
      52      52      52      52      53      53      53      54      54      54
      54      54      54      54      55      55      55      56      56      56
      56      56      57      57      57      57      57      57      58      58
      59      59      59      59      59      59      60      61      61      61
      61      61      61      62      62      62      62      62      62      62
      63      63      63      63      64      64      65      65      65      66
      66      66      66      66      66      66      67      67      67      67

      67      67      68      68      68      68      68      68      69      69
      69      69      69      69      69      69      69      69      69      69
      69      70      70      70      70      70      70      70      70      71
      71      72      72      72      72      72      72      72      73      73
      73      73      73      73      73      73      74      74      75      75
      75      75      75      75      75      75      75      76      76      76
      76      76      76      76      76      77      77      77      77      77
      77      78      78      78      78      79      79      79      79      79
      79      79      80      80      80      80      80      80      81      81
      81      81      81      81      81      81      81      82      82      82

      82      82      82      83      83      83      83      84      85      85
      85      85      85      86      86      86      87      87      87      88
      88      88      88      89      89      89      89      90      90      90
      90      90      90      90      91      91      91      91      91      91
      91      91      91      91      92      92      92      92      92      92
      92      92      92      92      92      93      93      93      93      93
      93      94      94      94      94      94      94      94      94      94
      95      95      95      96      96      96      96      96      96      96
      97      97      97      97      97      97      98      98      98      98
      98      98      98      99      99      99      99      99     100

Number of steps = 250,292

Sorting algorithm menu

(1) Bubble sort
(2) Selection sort
(3) Insertion sort
(4) Recursive MergeSort
(5) Recursive QuickSort
(Q) Quit

Choice ---> 4

NOTE: For sample runs, please sort 500 numbers or less.
NOTE: For sample runs, please make the highest number 100.

How MANY numbers would you like to generate? 100
What is the LARGEST number you would like to generate? 100

ArrayList reset to:
      71

      86      57       7      19      86      73      38      59      98      84
      23      27      82      29      48      15       9      17      26      82
      69      51      42      55      69      24      41      52      97       1
      55       3       4      94      18      24      91      26      75      48
      85      69       7       9       9      43      98      89      70      22
      83      13       5      82       3      14      54      90      42      32
      54       8       1      13      76      13      14      68      73      49
       8       3      27      11      67      81      31      33      39       9
      89      13      21      10      57       2      31      55      95      25
      66      49      69      46      37      35      66      86      69

ArrayList sorted to:
       1

       1       2       3       3       3       4       5       7       7       8
       8       9       9       9       9      10      11      13      13      13
      13      14      14      15      17      18      19      21      22      23
      24      24      25      26      26      27      27      29      31      31
      32      33      35      37      38      39      41      42      42      43
      46      48      48      49      49      51      52      54      54      55
      55      55      57      57      59      66      66      67      68      69
      69      69      69      69      70      71      73      73      75      76
      81      82      82      82      83      84      85      86      86      86
      89      89      90      91      94      95      97      98      98

Number of steps = 4,138


Sorting algorithm menu

(1) Bubble sort
(2) Selection sort
(3) Insertion sort
(4) Recursive MergeSort
(5) Recursive QuickSort
(Q) Quit

Choice ---> 5

NOTE: For sample runs, please sort 500 numbers or less.
NOTE: For sample runs, please make the highest number 100.

How MANY numbers would you like to generate? 100
What is the LARGEST number you would like to generate? 100

ArrayList reset to:
      44

      68      28      86      15      60       5      22      48      37      54
      81      42      25      49      50      43      16      55      66      21
      38      21      56      80      21      10      60      59       3      88
      60      79       9      27      44      46      14      27      57      36
      20      59      56      67      35      30      50      16      93      32
      77      12      10      87      22      34      19      20      76      54
       3      96      74      32      83      32      74      50      23      69
      71      76      34      95      68      88      85      58      70      54
      56      70       4      67      92       7      11      33      49      15
     100      94      69       4       8       7      40      83      59

ArrayList sorted to:
       3

       3       4       4       5       7       7       8       9      10      10
      11      12      14      15      15      16      16      19      20      20
      21      21      21      22      22      23      25      27      27      28
      30      32      32      32      33      34      34      35      36      37
      38      40      42      43      44      44      46      48      49      49
      50      50      50      54      54      54      55      56      56      56
      57      58      59      59      59      60      60      60      66      67
      67      68      68      69      69      70      70      71      74      74
      76      76      77      79      80      81      83      83      85      86
      87      88      88      92      93      94      95      96     100

Number of steps = 2,678



*/