/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          03-03-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 19
 *<BR> Description:   We will sort everything and check how much inventory it is
 *<BR> Cite Sources:  Mr.Eliot taught me how to search binary and format properly
 */

public class StoreTester
{
  public static void main(String[] args)
  {
    Store MyStore = new Store("file60.txt");

    System.out.println("BEFORE SORT:");
    MyStore.displayStore();
    System.out.println();

    //Quicksort Store
    MyStore.doSort();

    System.out.println("AFTER SORT:");
    MyStore.displayStore();
    System.out.println();
    
    System.out.println("TEST BINARY SEARCH:");
    MyStore.testSearch();
    System.out.println();

    System.out.println("Test Recursive BINARY SEARCH:");
    MyStore.testSearch2();
    System.out.println();
    }
}

/*
RUN OUTPUT:  
BEFORE SORT:
Store:
   #       Id     Inv
   1:    3679      87
   2:     196      60
   3:   12490      12
   4:   18618      14
   5:    2370      65
   6:      12      99
   7:   18524      34
   8:   12024       5
   9:    6992      76
  10:   18410      22

  11:    9267      68
  12:       7     590
  13:   18995      22
  14:    6265      58
  15:   92886    3141
  16:    6835      94
  17:   14151      82
  18:   11485      39
  19:   19967      45
  20:   13520      38

  21:    5529      11
  22:    3433       5
  23:   17911      96
  24:   18181      60
  25:   11549      88
  26:   14896      81
  27:      41       1
  28:     184      14
  29:    4329      64
  30:   18871      69

  31:   15141      87
  32:   92835    1348
  33:   11584      32
  34:   14088      92
  35:   18061       3
  36:     206      31
  37:   13066       8
  38:   19625      54
  39:   12705      14
  40:    9351       8

  41:   17753      70
  42:   15917      51
  43:     768      85
  44:   15814      60
  45:   15320      82
  46:    8303      90
  47:    7282      73
  48:   14092      48
  49:   10629      19
  50:   77001      23

  51:   15006      53
  52:   12328      63
  53:   31415      26
  54:     405      45
  55:      99     100
  56:     755       3
  57:      17      25
  58:   88877    5446
  59:   19623      88
  60:      10       4


AFTER SORT:
Store:
   #       Id     Inv
   1:       7     590
   2:      10       4
   3:      12      99
   4:      17      25
   5:      41       1
   6:      99     100
   7:     184      14
   8:     196      60
   9:     206      31
  10:     405      45

  11:     755       3
  12:     768      85
  13:    2370      65
  14:    3433       5
  15:    3679      87
  16:    4329      64
  17:    5529      11
  18:    6265      58
  19:    6835      94
  20:    6992      76

  21:    7282      73
  22:    8303      90
  23:    9267      68
  24:    9351       8
  25:   10629      19
  26:   11485      39
  27:   11549      88
  28:   11584      32
  29:   12024       5
  30:   12328      63

  31:   12490      12
  32:   12705      14
  33:   13066       8
  34:   13520      38
  35:   14088      92
  36:   14092      48
  37:   14151      82
  38:   14896      81
  39:   15006      53
  40:   15141      87

  41:   15320      82
  42:   15814      60
  43:   15917      51
  44:   17753      70
  45:   17911      96
  46:   18061       3
  47:   18181      60
  48:   18410      22
  49:   18524      34
  50:   18618      14

  51:   18871      69
  52:   18995      22
  53:   19623      88
  54:   19625      54
  55:   19967      45
  56:   31415      26
  57:   77001      23
  58:   88877    5446
  59:   92835    1348
  60:   92886    3141


TEST BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 92886
Id #92886:  Inventory = 3141

Enter ID value to search for (-1 to quit) ---> 77001
Id #77001:  Inventory = 23

Enter ID value to search for (-1 to quit) ---> 31415
Id #31415:  Inventory = 26

Enter ID value to search for (-1 to quit) ---> 15006
Id #15006:  Inventory = 53

Enter ID value to search for (-1 to quit) ---> 6992
Id #6992:  Inventory = 76

Enter ID value to search for (-1 to quit) ---> 41
Id #41:  Inventory = 1

Enter ID value to search for (-1 to quit) ---> 405
Id #405:  Inventory = 45

Enter ID value to search for (-1 to quit) ---> 755
Id #755:  Inventory = 3

Enter ID value to search for (-1 to quit) ---> 34
Id #34:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 36
Id #36:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 2454
Id #2454:  No such part in stock

Enter ID value to search for (-1 to quit) ---> -1

Test Recursive BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 7
Id #7:  Inventory = 590

Enter ID value to search for (-1 to quit) ---> 18871
Id #18871:  Inventory = 69

Enter ID value to search for (-1 to quit) ---> 7282
Id #7282:  Inventory = 73

Enter ID value to search for (-1 to quit) ---> 184
Id #184:  Inventory = 14

Enter ID value to search for (-1 to quit) ---> 9351
Id #9351:  Inventory = 8

Enter ID value to search for (-1 to quit) ---> 5
Id #5:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 4
Id #4:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 653
Id #653:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 5765
Id #5765:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 643
Id #643:  No such part in stock

Enter ID value to search for (-1 to quit) ---> -1



BEFORE SORT:
Store:
   #       Id     Inv
   1:    3679      87
   2:     196      60
   3:   12490      12
   4:   18618      14
   5:    2370      65
   6:      12      99
   7:   18524      34
   8:   12024       5
   9:    6992      76
  10:   18410      22

  11:    9267      68
  12:       7     590
  13:   18995      22
  14:    6265      58
  15:   92886    3141
  16:    6835      94
  17:   14151      82
  18:   11485      39
  19:   19967      45
  20:   13520      38

  21:    5529      11
  22:    3433       5
  23:   17911      96
  24:   18181      60
  25:   11549      88
  26:   14896      81
  27:      41       1
  28:     184      14
  29:    4329      64
  30:   18871      69

  31:   15141      87
  32:   92835    1348
  33:   11584      32
  34:   14088      92
  35:   18061       3
  36:     206      31
  37:   13066       8
  38:   19625      54
  39:   12705      14
  40:    9351       8

  41:   17753      70
  42:   15917      51
  43:     768      85
  44:   15814      60
  45:   15320      82
  46:    8303      90
  47:    7282      73
  48:   14092      48
  49:   10629      19
  50:   77001      23

  51:   15006      53
  52:   12328      63
  53:   31415      26
  54:     405      45
  55:      99     100
  56:     755       3
  57:      17      25
  58:   88877    5446
  59:   19623      88
  60:      10       4


AFTER SORT:
Store:
   #       Id     Inv
   1:       7     590
   2:      10       4
   3:      12      99
   4:      17      25
   5:      41       1
   6:      99     100
   7:     184      14
   8:     196      60
   9:     206      31
  10:     405      45

  11:     755       3
  12:     768      85
  13:    2370      65
  14:    3433       5
  15:    3679      87
  16:    4329      64
  17:    5529      11
  18:    6265      58
  19:    6835      94
  20:    6992      76

  21:    7282      73
  22:    8303      90
  23:    9267      68
  24:    9351       8
  25:   10629      19
  26:   11485      39
  27:   11549      88
  28:   11584      32
  29:   12024       5
  30:   12328      63

  31:   12490      12
  32:   12705      14
  33:   13066       8
  34:   13520      38
  35:   14088      92
  36:   14092      48
  37:   14151      82
  38:   14896      81
  39:   15006      53
  40:   15141      87

  41:   15320      82
  42:   15814      60
  43:   15917      51
  44:   17753      70
  45:   17911      96
  46:   18061       3
  47:   18181      60
  48:   18410      22
  49:   18524      34
  50:   18618      14

  51:   18871      69
  52:   18995      22
  53:   19623      88
  54:   19625      54
  55:   19967      45
  56:   31415      26
  57:   77001      23
  58:   88877    5446
  59:   92835    1348
  60:   92886    3141


TEST BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> -1

Test Recursive BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 6992
Id #6992:  Inventory = 76

Enter ID value to search for (-1 to quit) ---> 6835
Id #6835:  Inventory = 94

Enter ID value to search for (-1 to quit) ---> 41
Id #41:  Inventory = 1

Enter ID value to search for (-1 to quit) ---> 2370
Id #2370:  Inventory = 65

Enter ID value to search for (-1 to quit) ---> 3679
Id #3679:  Inventory = 87

Enter ID value to search for (-1 to quit) ---> 13520
Id #13520:  Inventory = 38

Enter ID value to search for (-1 to quit) ---> 15814
Id #15814:  Inventory = 60

Enter ID value to search for (-1 to quit) ---> 7
Id #7:  Inventory = 590

Enter ID value to search for (-1 to quit) ---> 77001
Id #77001:  Inventory = 23

Enter ID value to search for (-1 to quit) ---> 31415
Id #31415:  Inventory = 26

Enter ID value to search for (-1 to quit) ---> 19625
Id #19625:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 19623
Id #19623:  Inventory = 88

Enter ID value to search for (-1 to quit) ---> 18995
Id #18995:  Inventory = 22

Enter ID value to search for (-1 to quit) ---> 92886
Id #92886:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 18871
Id #18871:  Inventory = 69

Enter ID value to search for (-1 to quit) ---> 18618
Id #18618:  Inventory = 14

Enter ID value to search for (-1 to quit) ---> 15320
Id #15320:  Inventory = 82

Enter ID value to search for (-1 to quit) ---> 206
Id #206:  Inventory = 31

Enter ID value to search for (-1 to quit) ---> 405
Id #405:  Inventory = 45

Enter ID value to search for (-1 to quit) ---> 77001
Id #77001:  Inventory = 23

Enter ID value to search for (-1 to quit) ---> 18871
Id #18871:  Inventory = 69

Enter ID value to search for (-1 to quit) ---> 17753
Id #17753:  Inventory = 70

Enter ID value to search for (-1 to quit) ---> 14896
Id #14896:  Inventory = 81

Enter ID value to search for (-1 to quit) ---> 17753
Id #17753:  Inventory = 70

Enter ID value to search for (-1 to quit) ---> -1




BEFORE SORT:
Store: 
   #       Id     Inv
   1:    3679      87
   2:     196      60
   3:   12490      12
   4:   18618      14
   5:    2370      65
   6:      12      99
   7:   18524      34
   8:   12024       5
   9:    6992      76
  10:   18410      22

  11:    9267      68
  12:       7     590
  13:   18995      22
  14:    6265      58
  15:   92886    3141
  16:    6835      94
  17:   14151      82
  18:   11485      39
  19:   19967      45
  20:   13520      38

  21:    5529      11
  22:    3433       5
  23:   17911      96
  24:   18181      60
  25:   11549      88
  26:   14896      81
  27:      41       1
  28:     184      14
  29:    4329      64
  30:   18871      69

  31:   15141      87
  32:   92835    1348
  33:   11584      32
  34:   14088      92
  35:   18061       3
  36:     206      31
  37:   13066       8
  38:   19625      54
  39:   12705      14
  40:    9351       8

  41:   17753      70
  42:   15917      51
  43:     768      85
  44:   15814      60
  45:   15320      82
  46:    8303      90
  47:    7282      73
  48:   14092      48
  49:   10629      19
  50:   77001      23

  51:   15006      53
  52:   12328      63
  53:   31415      26
  54:     405      45
  55:      99     100
  56:     755       3
  57:      17      25
  58:   88877    5446
  59:   19623      88
  60:      10       4


AFTER SORT:
Store:
   #       Id     Inv
   1:       7     590
   2:      10       4
   3:      12      99
   4:      17      25
   5:      41       1
   6:      99     100
   7:     184      14
   8:     196      60
   9:     206      31
  10:     405      45

  11:     755       3
  12:     768      85
  13:    2370      65
  14:    3433       5
  15:    3679      87
  16:    4329      64
  17:    5529      11
  18:    6265      58
  19:    6835      94
  20:    6992      76

  21:    7282      73
  22:    8303      90
  23:    9267      68
  24:    9351       8
  25:   10629      19
  26:   11485      39
  27:   11549      88
  28:   11584      32
  29:   12024       5
  30:   12328      63

  31:   12490      12
  32:   12705      14
  33:   13066       8
  34:   13520      38
  35:   14088      92
  36:   14092      48
  37:   14151      82
  38:   14896      81
  39:   15006      53
  40:   15141      87

  41:   15320      82
  42:   15814      60
  43:   15917      51
  44:   17753      70
  45:   17911      96
  46:   18061       3
  47:   18181      60
  48:   18410      22
  49:   18524      34
  50:   18618      14

  51:   18871      69
  52:   18995      22
  53:   19623      88
  54:   19625      54
  55:   19967      45
  56:   31415      26
  57:   77001      23
  58:   88877    5446
  59:   92835    1348
  60:   92886    3141


TEST BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 2
Id #2:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 15320
Id #15320:  Inventory = 82

Enter ID value to search for (-1 to quit) ---> 196
Id #196:  Inventory = 60

Enter ID value to search for (-1 to quit) ---> 19967
Id #19967:  Inventory = 45

Enter ID value to search for (-1 to quit) ---> 20000
Id #20000:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 42714
Id #42714:  No such part in stock

BEFORE SORT:
Store: 
   #       Id     Inv
   1:    3679      87
   2:     196      60
   3:   12490      12
   4:   18618      14
   5:    2370      65
   6:      12      99
   7:   18524      34
   8:   12024       5
   9:    6992      76
  10:   18410      22

  11:    9267      68
  12:       7     590
  13:   18995      22
  14:    6265      58
  15:   92886    3141
  16:    6835      94
  17:   14151      82
  18:   11485      39
  19:   19967      45
  20:   13520      38

  21:    5529      11
  22:    3433       5
  23:   17911      96
  24:   18181      60
  25:   11549      88
  26:   14896      81
  27:      41       1
  28:     184      14
  29:    4329      64
  30:   18871      69

  31:   15141      87
  32:   92835    1348
  33:   11584      32
  34:   14088      92
  35:   18061       3
  36:     206      31
  37:   13066       8
  38:   19625      54
  39:   12705      14
  40:    9351       8

  41:   17753      70
  42:   15917      51
  43:     768      85
  44:   15814      60
  45:   15320      82
  46:    8303      90
  47:    7282      73
  48:   14092      48
  49:   10629      19
  50:   77001      23

  51:   15006      53
  52:   12328      63
  53:   31415      26
  54:     405      45
  55:      99     100
  56:     755       3
  57:      17      25
  58:   88877    5446
  59:   19623      88
  60:      10       4


AFTER SORT:
Store:
   #       Id     Inv
   1:       7     590
   2:      10       4
   3:      12      99
   4:      17      25
   5:      41       1
   6:      99     100
   7:     184      14
   8:     196      60
   9:     206      31
  10:     405      45

  11:     755       3
  12:     768      85
  13:    2370      65
  14:    3433       5
  15:    3679      87
  16:    4329      64
  17:    5529      11
  18:    6265      58
  19:    6835      94
  20:    6992      76

  21:    7282      73
  22:    8303      90
  23:    9267      68
  24:    9351       8
  25:   10629      19
  26:   11485      39
  27:   11549      88
  28:   11584      32
  29:   12024       5
  30:   12328      63

  31:   12490      12
  32:   12705      14
  33:   13066       8
  34:   13520      38
  35:   14088      92
  36:   14092      48
  37:   14151      82
  38:   14896      81
  39:   15006      53
  40:   15141      87

  41:   15320      82
  42:   15814      60
  43:   15917      51
  44:   17753      70
  45:   17911      96
  46:   18061       3
  47:   18181      60
  48:   18410      22
  49:   18524      34
  50:   18618      14

  51:   18871      69
  52:   18995      22
  53:   19623      88
  54:   19625      54
  55:   19967      45
  56:   31415      26
  57:   77001      23
  58:   88877    5446
  59:   92835    1348
  60:   92886    3141


TEST BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> -1

Test Recursive BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 2
Id #2:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 0
Id #0:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 755
Id #755:  Inventory = 3

Enter ID value to search for (-1 to quit) ---> 7
Id #7:  Inventory = 590

Enter ID value to search for (-1 to quit) ---> 92835  
Id #92835:  Inventory = 1348

Enter ID value to search for (-1 to quit) ---> -1





BEFORE SORT:
Store: 
   #       Id     Inv
   1:    3679      87
   2:     196      60
   3:   12490      12
   4:   18618      14
   5:    2370      65
   6:      12      99
   7:   18524      34
   8:   12024       5
   9:    6992      76
  10:   18410      22

  11:    9267      68
  12:       7     590
  13:   18995      22
  14:    6265      58
  15:   92886    3141
  16:    6835      94
  17:   14151      82
  18:   11485      39
  19:   19967      45
  20:   13520      38

  21:    5529      11
  22:    3433       5
  23:   17911      96
  24:   18181      60
  25:   11549      88
  26:   14896      81
  27:      41       1
  28:     184      14
  29:    4329      64
  30:   18871      69

  31:   15141      87
  32:   92835    1348
  33:   11584      32
  34:   14088      92
  35:   18061       3
  36:     206      31
  37:   13066       8
  38:   19625      54
  39:   12705      14
  40:    9351       8

  41:   17753      70
  42:   15917      51
  43:     768      85
  44:   15814      60
  45:   15320      82
  46:    8303      90
  47:    7282      73
  48:   14092      48
  49:   10629      19
  50:   77001      23

  51:   15006      53
  52:   12328      63
  53:   31415      26
  54:     405      45
  55:      99     100
  56:     755       3
  57:      17      25
  58:   88877    5446
  59:   19623      88
  60:      10       4


AFTER SORT:
Store:
   #       Id     Inv
   1:       7     590
   2:      10       4
   3:      12      99
   4:      17      25
   5:      41       1
   6:      99     100
   7:     184      14
   8:     196      60
   9:     206      31
  10:     405      45

  11:     755       3
  12:     768      85
  13:    2370      65
  14:    3433       5
  15:    3679      87
  16:    4329      64
  17:    5529      11
  18:    6265      58
  19:    6835      94
  20:    6992      76

  21:    7282      73
  22:    8303      90
  23:    9267      68
  24:    9351       8
  25:   10629      19
  26:   11485      39
  27:   11549      88
  28:   11584      32
  29:   12024       5
  30:   12328      63

  31:   12490      12
  32:   12705      14
  33:   13066       8
  34:   13520      38
  35:   14088      92
  36:   14092      48
  37:   14151      82
  38:   14896      81
  39:   15006      53
  40:   15141      87

  41:   15320      82
  42:   15814      60
  43:   15917      51
  44:   17753      70
  45:   17911      96
  46:   18061       3
  47:   18181      60
  48:   18410      22
  49:   18524      34
  50:   18618      14

  51:   18871      69
  52:   18995      22
  53:   19623      88
  54:   19625      54
  55:   19967      45
  56:   31415      26
  57:   77001      23
  58:   88877    5446
  59:   92835    1348
  60:   92886    3141


TEST BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 206
Id #206:  Inventory = 31

Enter ID value to search for (-1 to quit) ---> 768
Id #768:  Inventory = 85

Enter ID value to search for (-1 to quit) ---> 17
Id #17:  Inventory = 25

Enter ID value to search for (-1 to quit) ---> 18524
Id #18524:  Inventory = 34

Enter ID value to search for (-1 to quit) ---> 9351
Id #9351:  Inventory = 8

Enter ID value to search for (-1 to quit) ---> 77001
Id #77001:  Inventory = 23

Enter ID value to search for (-1 to quit) ---> -1

Test Recursive BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 7
Id #7:  Inventory = 590

Enter ID value to search for (-1 to quit) ---> 6265
Id #6265:  Inventory = 58

Enter ID value to search for (-1 to quit) ---> 15006
Id #15006:  Inventory = 53

Enter ID value to search for (-1 to quit) ---> 17911
Id #17911:  Inventory = 96

Enter ID value to search for (-1 to quit) ---> 92835
Id #92835:  Inventory = 1348

Enter ID value to search for (-1 to quit) ---> 9
Id #9:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 8765
Id #8765:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 5489
Id #5489:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 468
Id #468:  No such part in stock

Enter ID value to search for (-1 to quit) ---> -1


BEFORE SORT:
Store: 
   #       Id     Inv
   1:    3679      87
   2:     196      60
   3:   12490      12
   4:   18618      14
   5:    2370      65
   6:      12      99
   7:   18524      34
   8:   12024       5
   9:    6992      76
  10:   18410      22

  11:    9267      68
  12:       7     590
  13:   18995      22
  14:    6265      58
  15:   92886    3141
  16:    6835      94
  17:   14151      82
  18:   11485      39
  19:   19967      45
  20:   13520      38

  21:    5529      11
  22:    3433       5
  23:   17911      96
  24:   18181      60
  25:   11549      88
  26:   14896      81
  27:      41       1
  28:     184      14
  29:    4329      64
  30:   18871      69

  31:   15141      87
  32:   92835    1348
  33:   11584      32
  34:   14088      92
  35:   18061       3
  36:     206      31
  37:   13066       8
  38:   19625      54
  39:   12705      14
  40:    9351       8

  41:   17753      70
  42:   15917      51
  43:     768      85
  44:   15814      60
  45:   15320      82
  46:    8303      90
  47:    7282      73
  48:   14092      48
  49:   10629      19
  50:   77001      23

  51:   15006      53
  52:   12328      63
  53:   31415      26
  54:     405      45
  55:      99     100
  56:     755       3
  57:      17      25
  58:   88877    5446
  59:   19623      88
  60:      10       4


AFTER SORT:
Store:
   #       Id     Inv
   1:       7     590
   2:      10       4
   3:      12      99
   4:      17      25
   5:      41       1
   6:      99     100
   7:     184      14
   8:     196      60
   9:     206      31
  10:     405      45

  11:     755       3
  12:     768      85
  13:    2370      65
  14:    3433       5
  15:    3679      87
  16:    4329      64
  17:    5529      11
  18:    6265      58
  19:    6835      94
  20:    6992      76

  21:    7282      73
  22:    8303      90
  23:    9267      68
  24:    9351       8
  25:   10629      19
  26:   11485      39
  27:   11549      88
  28:   11584      32
  29:   12024       5
  30:   12328      63

  31:   12490      12
  32:   12705      14
  33:   13066       8
  34:   13520      38
  35:   14088      92
  36:   14092      48
  37:   14151      82
  38:   14896      81
  39:   15006      53
  40:   15141      87

  41:   15320      82
  42:   15814      60
  43:   15917      51
  44:   17753      70
  45:   17911      96
  46:   18061       3
  47:   18181      60
  48:   18410      22
  49:   18524      34
  50:   18618      14

  51:   18871      69
  52:   18995      22
  53:   19623      88
  54:   19625      54
  55:   19967      45
  56:   31415      26
  57:   77001      23
  58:   88877    5446
  59:   92835    1348
  60:   92886    3141


TEST BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 11584
Id #11584:  Inventory = 32

Enter ID value to search for (-1 to quit) ---> 8303
Id #8303:  Inventory = 90

Enter ID value to search for (-1 to quit) ---> 7
Id #7:  Inventory = 590

Enter ID value to search for (-1 to quit) ---> 92886
Id #92886:  Inventory = 3141

Enter ID value to search for (-1 to quit) ---> 75
Id #75:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 47
Id #47:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 74
Id #74:  No such part in stock

Enter ID value to search for (-1 to quit) ---> -1

Test Recursive BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 10
Id #10:  Inventory = 4

Enter ID value to search for (-1 to quit) ---> 6835
Id #6835:  Inventory = 94

Enter ID value to search for (-1 to quit) ---> 11584
Id #11584:  Inventory = 32

Enter ID value to search for (-1 to quit) ---> 15141  
Id #15141:  Inventory = 87

Enter ID value to search for (-1 to quit) ---> 8
Id #8:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 4
Id #4:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 3456
Id #3456:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 7654
Id #7654:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 98765 
Id #98765:  No such part in stock

Enter ID value to search for (-1 to quit) ---> -1


BEFORE SORT:
Store: 
   #       Id     Inv
   1:    3679      87
   2:     196      60
   3:   12490      12
   4:   18618      14
   5:    2370      65
   6:      12      99
   7:   18524      34
   8:   12024       5
   9:    6992      76
  10:   18410      22

  11:    9267      68
  12:       7     590
  13:   18995      22
  14:    6265      58
  15:   92886    3141
  16:    6835      94
  17:   14151      82
  18:   11485      39
  19:   19967      45
  20:   13520      38

  21:    5529      11
  22:    3433       5
  23:   17911      96
  24:   18181      60
  25:   11549      88
  26:   14896      81
  27:      41       1
  28:     184      14
  29:    4329      64
  30:   18871      69

  31:   15141      87
  32:   92835    1348
  33:   11584      32
  34:   14088      92
  35:   18061       3
  36:     206      31
  37:   13066       8
  38:   19625      54
  39:   12705      14
  40:    9351       8

  41:   17753      70
  42:   15917      51
  43:     768      85
  44:   15814      60
  45:   15320      82
  46:    8303      90
  47:    7282      73
  48:   14092      48
  49:   10629      19
  50:   77001      23

  51:   15006      53
  52:   12328      63
  53:   31415      26
  54:     405      45
  55:      99     100
  56:     755       3
  57:      17      25
  58:   88877    5446
  59:   19623      88
  60:      10       4


AFTER SORT:
Store:
   #       Id     Inv
   1:       7     590
   2:      10       4
   3:      12      99
   4:      17      25
   5:      41       1
   6:      99     100
   7:     184      14
   8:     196      60
   9:     206      31
  10:     405      45

  11:     755       3
  12:     768      85
  13:    2370      65
  14:    3433       5
  15:    3679      87
  16:    4329      64
  17:    5529      11
  18:    6265      58
  19:    6835      94
  20:    6992      76

  21:    7282      73
  22:    8303      90
  23:    9267      68
  24:    9351       8
  25:   10629      19
  26:   11485      39
  27:   11549      88
  28:   11584      32
  29:   12024       5
  30:   12328      63

  31:   12490      12
  32:   12705      14
  33:   13066       8
  34:   13520      38
  35:   14088      92
  36:   14092      48
  37:   14151      82
  38:   14896      81
  39:   15006      53
  40:   15141      87

  41:   15320      82
  42:   15814      60
  43:   15917      51
  44:   17753      70
  45:   17911      96
  46:   18061       3
  47:   18181      60
  48:   18410      22
  49:   18524      34
  50:   18618      14

  51:   18871      69
  52:   18995      22
  53:   19623      88
  54:   19625      54
  55:   19967      45
  56:   31415      26
  57:   77001      23
  58:   88877    5446
  59:   92835    1348
  60:   92886    3141


TEST BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 19623
Id #19623:  Inventory = 88

Enter ID value to search for (-1 to quit) ---> -1

Test Recursive BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 19623
Id #19623:  Inventory = 88

Enter ID value to search for (-1 to quit) ---> 15006
Id #15006:  Inventory = 53

Enter ID value to search for (-1 to quit) ---> 15814
Id #15814:  Inventory = 60

Enter ID value to search for (-1 to quit) ---> 2370
Id #2370:  Inventory = 65

Enter ID value to search for (-1 to quit) ---> 6265
Id #6265:  Inventory = 58

Enter ID value to search for (-1 to quit) ---> -1



BEFORE SORT:
Store: 
   #       Id     Inv
   1:    3679      87
   2:     196      60
   3:   12490      12
   4:   18618      14
   5:    2370      65
   6:      12      99
   7:   18524      34
   8:   12024       5
   9:    6992      76
  10:   18410      22

  11:    9267      68
  12:       7     590
  13:   18995      22
  14:    6265      58
  15:   92886    3141
  16:    6835      94
  17:   14151      82
  18:   11485      39
  19:   19967      45
  20:   13520      38

  21:    5529      11
  22:    3433       5
  23:   17911      96
  24:   18181      60
  25:   11549      88
  26:   14896      81
  27:      41       1
  28:     184      14
  29:    4329      64
  30:   18871      69

  31:   15141      87
  32:   92835    1348
  33:   11584      32
  34:   14088      92
  35:   18061       3
  36:     206      31
  37:   13066       8
  38:   19625      54
  39:   12705      14
  40:    9351       8

  41:   17753      70
  42:   15917      51
  43:     768      85
  44:   15814      60
  45:   15320      82
  46:    8303      90
  47:    7282      73
  48:   14092      48
  49:   10629      19
  50:   77001      23

  51:   15006      53
  52:   12328      63
  53:   31415      26
  54:     405      45
  55:      99     100
  56:     755       3
  57:      17      25
  58:   88877    5446
  59:   19623      88
  60:      10       4


AFTER SORT:
Store:
   #       Id     Inv
   1:       7     590
   2:      10       4
   3:      12      99
   4:      17      25
   5:      41       1
   6:      99     100
   7:     184      14
   8:     196      60
   9:     206      31
  10:     405      45

  11:     755       3
  12:     768      85
  13:    2370      65
  14:    3433       5
  15:    3679      87
  16:    4329      64
  17:    5529      11
  18:    6265      58
  19:    6835      94
  20:    6992      76

  21:    7282      73
  22:    8303      90
  23:    9267      68
  24:    9351       8
  25:   10629      19
  26:   11485      39
  27:   11549      88
  28:   11584      32
  29:   12024       5
  30:   12328      63

  31:   12490      12
  32:   12705      14
  33:   13066       8
  34:   13520      38
  35:   14088      92
  36:   14092      48
  37:   14151      82
  38:   14896      81
  39:   15006      53
  40:   15141      87

  41:   15320      82
  42:   15814      60
  43:   15917      51
  44:   17753      70
  45:   17911      96
  46:   18061       3
  47:   18181      60
  48:   18410      22
  49:   18524      34
  50:   18618      14

  51:   18871      69
  52:   18995      22
  53:   19623      88
  54:   19625      54
  55:   19967      45
  56:   31415      26
  57:   77001      23
  58:   88877    5446
  59:   92835    1348
  60:   92886    3141


TEST BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 7
Id #7:  Inventory = 590

Enter ID value to search for (-1 to quit) ---> 92886
Id #92886:  Inventory = 3141

Enter ID value to search for (-1 to quit) ---> 12328
Id #12328:  Inventory = 63

Enter ID value to search for (-1 to quit) ---> 4
Id #4:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 5
Id #5:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 743
Id #743:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 76543
Id #76543:  No such part in stock

Enter ID value to search for (-1 to quit) ---> -1

Test Recursive BINARY SEARCH:

Enter ID value to search for (-1 to quit) ---> 7
Id #7:  Inventory = 590

Enter ID value to search for (-1 to quit) ---> 755 
Id #755:  Inventory = 3

Enter ID value to search for (-1 to quit) ---> 18061
Id #18061:  Inventory = 3

Enter ID value to search for (-1 to quit) ---> 92835
Id #92835:  Inventory = 1348

Enter ID value to search for (-1 to quit) ---> 75432
Id #75432:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 54
Id #54:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 543
Id #543:  No such part in stock

Enter ID value to search for (-1 to quit) ---> 7654
Id #7654:  No such part in stock

Enter ID value to search for (-1 to quit) ---> -1
*/