/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-05-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 5.1
 *<BR> Description:   In this assignment we will be calculating the the total amount of money in a piggy bank, along with the total number of pennies, nickels, dimes, quarters, half dollars, and dollars
 *<BR> Cite Sources:  Mr.Elliot taught me what mistakes I made in the past, I didn't use any outside websites besides https://ap.mreliot.com/LessonA05/Lab-A5-1.html
 */

public class PiggyBankTester
{
   public static void main(String[] args)
   {
      //constructors
      PiggyBank Piggy01 = new PiggyBank();
      PiggyBank Piggy02 = new PiggyBank("Ham Swolo ", 2, 5, 7, 9, 11, 1);
      PiggyBank Piggy03 = new PiggyBank("Anapig Hamwalker ", 8, 2, 3, 6, 5, 8);
      PiggyBank Piggy04 = new PiggyBank("Darth Pigder ", 6, 3, 1, 4, 9, 4);
      PiggyBank Piggy05 = new PiggyBank("Emperor Pigpaltine ", 14, 1, 4, 8, 10, 16);
      PiggyBank Piggy06 = new PiggyBank("Pigcho", Piggy01);
      PiggyBank Piggy07 = new PiggyBank("Pigter ", Piggy02);
      PiggyBank Piggy08 = new PiggyBank("Pighair ", Piggy03);
      PiggyBank Piggy09 = new PiggyBank("Pigrecker ", Piggy04);
      PiggyBank Piggy10 = new PiggyBank("PigTech ", Piggy05);


      /// Sample Run 1
      System.out.println("Piggy01 BEFORE CHANGES:");
      Piggy01.printPiggyBank();
      System.out.println();
      

      System.out.println("Testing Piggy01.depositCoins(12, 4, 5, 2, 10, 4);");
      Piggy01.depositCoins(12, 4, 5, 2, 10, 4);
      System.out.println("Testing: Piggy01.depositNickels(25);");
      Piggy01.depositNickels(25);
      System.out.println("Testing: Piggy01.withdrawDimes(4);");
      Piggy01.withdrawDimes(4);
      System.out.println("Testing: Piggy01.depositQuarters(3);");
      Piggy01.depositQuarters(3);
      System.out.println("Testing: Piggy01.depositNickels(7);");
      Piggy01.depositNickels(7);
      System.out.println("Testing: Piggy01.depositCoins(3, 3, 1, 6, 8, 2);");
      Piggy01.depositCoins(3, 3, 1, 6, 8, 2);
      System.out.println("Testing: Piggy01.withdrawCoins(1, 4, 2, 4, 7, 1);");
      Piggy01.withdrawCoins(1, 4, 2, 4, 7, 1);
      System.out.println("Testing: Piggy01.depositDollars(1);");
      Piggy01.depositDollars(1);
      System.out.println("Testing: Piggy01.withdrawPennies(10);");
      Piggy01.withdrawPennies(10);
      System.out.println("Testing: Piggy01.depositHalfDollars(2);");
      Piggy01.depositHalfDollars(2);
      System.out.println();
      

      System.out.println("Piggy01 AFTER CHANGES:");
      Piggy01.printPiggyBank();
      System.out.println();
      System.out.println();
      System.out.println();


      // Sample Run 2

      System.out.println("Piggy02 BEFORE CHANGES:");
      System.out.println("Name: " + Piggy02.getName());
      System.out.println("Current # of Pennies is " + Piggy02.getPennies());
      System.out.println("Current # of Nickels is " + Piggy02.getNickels());
      System.out.println("Current # of Dimes is " +   Piggy02.getDimes());
      System.out.println("Current # of Quarters is " + Piggy02.getQuarters());
      System.out.println("Current # of Half-Dollars is " + Piggy02.getHalfDollars());
      System.out.println("Current # of Dollars is " + Piggy02.getDollars());
      System.out.println("Current Dollar Amount is $" + Piggy02.calculatePiggyBankBalance());
      System.out.println();
      

      System.out.println("Testing: Piggy02.depositCoins(2, 5, 7, 9, 11, 1);");
      Piggy02.depositCoins(2, 5, 7, 9, 11, 1);
      System.out.println("Testing: Piggy02.depositPennies(20);");
      Piggy02.depositPennies(6);
      System.out.println("Testing: Piggy02.withdrawDimes(2);");
      Piggy02.withdrawDimes(2);
      System.out.println("Testing: Piggy02.depositQuarters(6);");
      Piggy02.depositQuarters(6);
      System.out.println("Testing: Piggy02.withdrawHalfDollars(5);");
      Piggy02.withdrawHalfDollars(5);
      System.out.println("Testing: Piggy02.depositNickels(1);");
      Piggy02.depositNickels(1);
      System.out.println("Testing: Piggy02.depositCoins(2, 1, 1, 7, 6, 3);");
      Piggy02.depositCoins(2, 1, 1, 7, 6, 3);
      System.out.println("Testing: Piggy02.withdrawCoins(4, 2, 6, 8, 2, 5);");
      Piggy02.withdrawCoins(4, 2, 6, 8, 2, 5);
      System.out.println("Testing: Piggy02.depositDollars(5);");
      Piggy02.depositDollars(5);
      System.out.println();
      

      System.out.println("Piggy02 AFTER CHANGES:");
      System.out.println("Name: " + Piggy02.getName());
      System.out.println("Current # of Pennies is " + Piggy02.getPennies());
      System.out.println("Current # of Nickels is " + Piggy02.getNickels());
      System.out.println("Current # of Dimes is " +   Piggy02.getDimes());
      System.out.println("Current # of Quarters is " + Piggy02.getQuarters());
      System.out.println("Current # of Half-Dollars is " + Piggy02.getHalfDollars());
      System.out.println("Current # of Dollars is " + Piggy02.getDollars());
      System.out.println("Current Dollar Amount is $" + Piggy02.calculatePiggyBankBalance());
      System.out.println();
      System.out.println();
      System.out.println();

      // Sample Run 3

      System.out.println("Piggy03 BEFORE CHANGES:");
      Piggy03.printPiggyBank();
      System.out.println();
      

      System.out.println("Testing: Piggy03.depositCoins(8, 2, 3, 6, 5, 8);");
      Piggy03.depositCoins(2, 1, 3, 4, 7, 3);
      System.out.println("Testing: Piggy03.depositDimes(12);");
      Piggy03.depositDimes(12);
      System.out.println("Testing: Piggy03.depositQuarters(6);");
      Piggy03.depositQuarters(6);
      System.out.println("Testing: Piggy03.withdrawHalfDollars(3);");
      Piggy03.withdrawHalfDollars(3);
      System.out.println("Testing: Piggy03.depositNickels(3);");
      Piggy03.depositNickels(3);
      System.out.println("Testing: Piggy03.depositDollars(4);");
      Piggy03.depositDollars(4);
      System.out.println("Testing: Piggy03.withdrawCoins(4, 2, 6, 4, 2, 6);");
      Piggy03.withdrawCoins(4, 2, 6, 4, 2, 6);
      System.out.println("Testing: Piggy03.withdrawQuarters(2);");
      Piggy03.withdrawQuarters(2);
      System.out.println("Testing: Piggy03.depositQuarters(4);");
      Piggy03.depositQuarters(4);
      System.out.println("Testing: Piggy03.depositCoins(2, 2, 1, 3, 1, 2);");
      Piggy03.depositCoins(2, 2, 1, 3, 1, 2);
      System.out.println();
      

      System.out.println("Piggy03 AFTER CHANGES:");
      Piggy03.printPiggyBank();
      System.out.println();
      System.out.println();
      System.out.println();

      // Sample Run 4

      System.out.println("Piggy04 BEFORE CHANGES:");
      System.out.println("Name: " + Piggy04.getName());
      System.out.println("Current # of Pennies is " + Piggy04.getPennies());
      System.out.println("Current # of Nickels is " + Piggy04.getNickels());
      System.out.println("Current # of Dimes is " +   Piggy04.getDimes());
      System.out.println("Current # of Quarters is " + Piggy04.getQuarters());
      System.out.println("Current # of Half-Dollars is " + Piggy04.getHalfDollars());
      System.out.println("Current # of Dollars is " + Piggy04.getDollars());
      System.out.println("Current Dollar Amount is $" + Piggy04.calculatePiggyBankBalance());
      System.out.println();
      

      System.out.println("Testing: Piggy04.depositCoins(6, 3, 1, 4, 9, 4);");
      Piggy04.depositCoins(6, 3, 1, 4, 9, 4);
      System.out.println("Testing: Piggy04.depositQuarters(3);");
      Piggy04.depositQuarters(3);
      System.out.println("Testing: Piggy04.depositDimes(2);");
      Piggy04.depositDimes(2);
      System.out.println("Testing: Piggy04.withdrawDollars(2);");
      Piggy04.withdrawDollars(2);
      System.out.println("Testing: Piggy04.withdrawPennies(5);");
      Piggy04.withdrawPennies(5);
      System.out.println("Testing: Piggy04.withdrawDollars(2);");
      Piggy04.withdrawDollars(2);
      System.out.println("Testing: Piggy04.depositHalfDollars(4);");
      Piggy04.depositHalfDollars(4);
      System.out.println("Testing: Piggy04.depositCoins(5, 4, 5, 9, 5, 2);");
      Piggy04.depositCoins(5, 4, 5, 9, 5, 2);
      System.out.println("Testing: Piggy04.depositQuarters(7);");
      Piggy04.depositQuarters(7);
      System.out.println("Testing: Piggy04.depositDimes(1);");
      Piggy04.depositDimes(1);
      System.out.println();
      


      System.out.println("Piggy04 AFTER CHANGES:");
      System.out.println("Name: " + Piggy04.getName());
      System.out.println("Current # of Pennies is " + Piggy04.getPennies());
      System.out.println("Current # of Nickels is " + Piggy04.getNickels());
      System.out.println("Current # of Dimes is " +   Piggy04.getDimes());
      System.out.println("Current # of Quarters is " + Piggy04.getQuarters());
      System.out.println("Current # of Half-Dollars is " + Piggy04.getHalfDollars());
      System.out.println("Current # of Dollars is " + Piggy04.getDollars());
      System.out.println("Current Dollar Amount is $" + Piggy04.calculatePiggyBankBalance());
      System.out.println();
      System.out.println();
      System.out.println();

      // Sample Run 5

      System.out.println("Piggy05 BEFORE CHANGES:");
      Piggy05.printPiggyBank();
      System.out.println();
      

      System.out.println("Testing: Piggy05.depositCoins(2, 1, 3, 5, 4, 3);");
      Piggy05.depositCoins(2, 1, 3, 5, 4, 3);
      System.out.println("Testing: Piggy05.depositHalfDolars(8);");
      Piggy05.depositHalfDollars(8);
      System.out.println("Testing: Piggy05.depositPennies(50);");
      Piggy05.depositPennies(50);
      System.out.println("Testing: Piggy05.withdrawDimes(7);");
      Piggy05.withdrawDimes(7);
      System.out.println("Testing: Piggy05.depositHalfDollars(6);");
      Piggy05.depositHalfDollars(6);
      System.out.println("Testing: Piggy05.depositNickels(7);");
      Piggy05.depositNickels(7);
      System.out.println("Testing: Piggy05.withdrawDollars(2);");
      Piggy05.withdrawDollars(2);
      System.out.println("Testing: Piggy05.withdrawHalfDollars(5);");
      Piggy05.withdrawHalfDollars(5);
      System.out.println("Testing: Piggy05.withdrawPennies(24);");
      Piggy05.withdrawPennies(24);
      System.out.println("Testing: Piggy05.depositHalfDollars(4);");
      Piggy05.depositHalfDollars(4);
      System.out.println();

      System.out.println("Piggy05 AFTER CHANGES:");
      Piggy05.printPiggyBank();
      System.out.println();
      System.out.println();
      System.out.println();

      // Sample Run 6

      System.out.println("Piggy06 BEFORE CHANGES:");
      System.out.println("Name: " + Piggy06.getName());
      System.out.println("Current # of Pennies is " + Piggy06.getPennies());
      System.out.println("Current # of Nickels is " + Piggy06.getNickels());
      System.out.println("Current # of Dimes is " +   Piggy06.getDimes());
      System.out.println("Current # of Quarters is " + Piggy06.getQuarters());
      System.out.println("Current # of Half-Dollars is " + Piggy06.getHalfDollars());
      System.out.println("Current # of Dollars is " + Piggy06.getDollars());
      System.out.println("Current Dollar Amount is $" + Piggy06.calculatePiggyBankBalance());
      System.out.println();
      

      System.out.println("Testing: Piggy06.depositCoins(6, 3, 1, 4, 9, 4);");
      Piggy06.depositCoins(6, 3, 1, 4, 9, 4);
      System.out.println("Testing: Piggy06.depositPennies(20);");
      Piggy06.depositPennies(23);
      System.out.println("Testing: Piggy06.depositNickels(12);");
      Piggy06.depositNickels(12);
      System.out.println("Testing: Piggy06.withdrawDimes(2);");
      Piggy06.withdrawDimes(2);
      System.out.println("Testing: Piggy06.withdrawDollars(5);");
      Piggy06.withdrawDollars(1);
      System.out.println("Testing: Piggy06.depositHalfDollars(5);");
      Piggy06.depositHalfDollars(5);
      System.out.println("Testing: Piggy06.withdrawCoins(1, 2, 1, 3, 1, 1)");
      Piggy06.withdrawCoins(1, 2, 1, 3, 1, 1);
      System.out.println("Testing: Piggy06.withdrawQuarters(2);");
      Piggy06.withdrawQuarters(2);
      System.out.println("Testing: Piggy06.withdrawDimes(10);");
      Piggy06.depositDimes(10);
      System.out.println("Testing: Piggy06.depositQuarters(7);");
      Piggy06.depositQuarters(7);
      System.out.println();
      

      System.out.println("Piggy06 AFTER CHANGES:");
      System.out.println("Name: " + Piggy06.getName());
      System.out.println("Current # of Pennies is " + Piggy06.getPennies());
      System.out.println("Current # of Nickels is " + Piggy06.getNickels());
      System.out.println("Current # of Dimes is " +   Piggy06.getDimes());
      System.out.println("Current # of Quarters is " + Piggy06.getQuarters());
      System.out.println("Current # of Half-Dollars is " + Piggy06.getHalfDollars());
      System.out.println("Current # of Dollars is " + Piggy06.getDollars());
      System.out.println("Current Dollar Amount is $" + Piggy06.calculatePiggyBankBalance());
      System.out.println();
      System.out.println();
      System.out.println();


      /// sample run 7

      System.out.println("Piggy07 BEFORE CHANGES:");
      Piggy07.printPiggyBank();
      System.out.println();
     

      System.out.println("Testing: Piggy07.withdrawCoins(3, 1, 1, 1, 0, 0);");
      Piggy07.withdrawCoins(3, 1, 1, 1, 0, 0);
      System.out.println("Testing: Piggy07.depsitNickels(6);");
      Piggy07.depositNickels(6);
      System.out.println("Testing: Piggy07.depositCoins(13, 2, 5, 7, 4, 3);");
      Piggy07.depositCoins(13, 2, 5, 7, 4, 3);
      System.out.println("Testing: Piggy07.depositHalfDollars(16);");
      Piggy07.depositHalfDollars(16);
      System.out.println("Testing: Piggy07.depositPennies(50);");
      Piggy07.depositPennies(53);
      System.out.println("Testing: Piggy07.withdrawQuarters(1);");
      Piggy07.withdrawQuarters(1);
      System.out.println("Testing: Piggy07.depositHalfDollars(2);");
      Piggy07.depositHalfDollars(2);
      System.out.println("Testing: Piggy07.depositDimes(1);");
      Piggy07.depositDimes(1);
      System.out.println("Testing: Piggy07.withdrawQuarters(2);");
      Piggy07.withdrawQuarters(2);
      System.out.println("Testing: Piggy07.depositHalfDollars(4);");
      Piggy07.depositHalfDollars(4);
      System.out.println();
      

      System.out.println("Piggy07 AFTER CHANGES:");
      Piggy07.printPiggyBank();
      System.out.println();
      System.out.println();
      System.out.println();

      // sample run 8

      System.out.println("Piggy08 BEFORE CHANGES:");
      System.out.println("Name: " + Piggy08.getName());
      System.out.println("Current # of Pennies is " + Piggy08.getPennies());
      System.out.println("Current # of Nickels is " + Piggy08.getNickels());
      System.out.println("Current # of Dimes is " +   Piggy08.getDimes());
      System.out.println("Current # of Quarters is " + Piggy08.getQuarters());
      System.out.println("Current # of Half-Dollars is " + Piggy08.getHalfDollars());
      System.out.println("Current # of Dollars is " + Piggy08.getDollars());
      System.out.println("Current Dollar Amount is $" + Piggy08.calculatePiggyBankBalance());
      System.out.println();
      

      System.out.println("Testing: Piggy08.depositCoins(2, 6, 7, 4, 20, 6);");
      Piggy08.depositCoins(2, 6, 7, 4, 20, 6);
      System.out.println("Testing: Piggy08.withdrawDimes(6);");
      Piggy08.withdrawDimes(6);
      System.out.println("Testing: Piggy08.withdrawCoins(2, 4, 3, 6, 2, 1);");
      Piggy08.withdrawCoins(2, 4, 3, 6, 2, 1);
      System.out.println("Testing: Piggy08.withdrawHalfDollars(9)");
      Piggy08.withdrawHalfDollars(9);
      System.out.println("Testing: Piggy08.depositDimes(10);");
      Piggy08.depositDimes(10);
      System.out.println("Testing: Piggy08.depositPennies(26);");
      Piggy08.depositPennies(26);
      System.out.println("Testing: Piggy08.withdrawDollars(2);");
      Piggy08.withdrawDollars(2);
      System.out.println("Testing: Piggy08.depositQuarters(3);");
      Piggy08.depositQuarters(3);
      System.out.println("Testing: Piggy08.withdrawNickels(7);");
      Piggy08.withdrawNickels(3);
      System.out.println("Testing: Piggy08.depositDimes(4);");
      Piggy08.depositDimes(4);
      System.out.println();
      

      System.out.println("Piggy08 AFTER CHANGES:");
      System.out.println("Name: " + Piggy08.getName());
      System.out.println("Current # of Pennies is " + Piggy08.getPennies());
      System.out.println("Current # of Nickels is " + Piggy08.getNickels());
      System.out.println("Current # of Dimes is " +   Piggy08.getDimes());
      System.out.println("Current # of Quarters is " + Piggy08.getQuarters());
      System.out.println("Current # of Half-Dollars is " + Piggy08.getHalfDollars());
      System.out.println("Current # of Dollars is " + Piggy08.getDollars());
      System.out.println("Current Dollar Amount is $" + Piggy08.calculatePiggyBankBalance());
      System.out.println();
      System.out.println();
      System.out.println();

      // sample run 9

      System.out.println("Piggy09 BEFORE CHANGES:");
      Piggy09.printPiggyBank();
      System.out.println();
      

      System.out.println("Testing: Piggy09.withdrawCoins(4, 3, 3, 1, 5, 2);");
      Piggy09.withdrawCoins(4, 3, 3, 1, 5, 2 );
      System.out.println("Testing: Piggy09.withdrawNickels(2);");
      Piggy09.depositNickels(4);
      System.out.println("Testing: Piggy09.depositCoins(23, 3, 2, 4, 5, 7);");
      Piggy09.depositCoins(23, 3, 2, 4, 5, 7);
      System.out.println("Testing: Piggy09.withdrawDimes(2);");
      Piggy09.withdrawDimes(2);
      System.out.println("Testing: Piggy09.withdrawCoins(1, 1, 1, 1, 1, 2);");
      Piggy09.withdrawCoins(1, 1, 1, 1, 1, 2);
      System.out.println("Testing: Piggy09.depositDollars(2);");
      Piggy09.depositDollars(2);
      System.out.println("Testing: Piggy09.depositDimes(8);");
      Piggy09.depositDimes(8);
      System.out.println("Testing: Piggy09.withdrawQuarters(2);");
      Piggy09.withdrawQuarters(2);
      System.out.println("Testing: Piggy09.depositHalfDollars(6);");
      Piggy09.depositHalfDollars(6);
      System.out.println("Testing: Piggy09.depositNickels(3);");
      Piggy09.depositNickels(3);
      System.out.println();
      

      System.out.println("Piggy09 AFTER CHANGES:");
      Piggy09.printPiggyBank();
      System.out.println();
      System.out.println();
      System.out.println();


      // sample run 10
      System.out.println("Piggy10 BEFORE CHANGES:");
      System.out.println("Name: " + Piggy10.getName());
      System.out.println("Current # of Pennies is " + Piggy10.getPennies());
      System.out.println("Current # of Nickels is " + Piggy10.getNickels());
      System.out.println("Current # of Dimes is " +   Piggy10.getDimes());
      System.out.println("Current # of Quarters is " + Piggy10.getQuarters());
      System.out.println("Current # of Half-Dollars is " + Piggy10.getHalfDollars());
      System.out.println("Current # of Dollars is " + Piggy10.getDollars());
      System.out.println("Current Dollar Amount is $" + Piggy10.calculatePiggyBankBalance());
      System.out.println();
      

      System.out.println("Testing: Piggy10.depositCoins(2, 3, 5, 8, 3, 5);");
      Piggy10.depositCoins(2, 3, 5, 8, 3, 5);
      System.out.println("Testing: Piggy10.depositNickels(2);");
      Piggy10.depositNickels(2);
      System.out.println("Testing: Piggy10.withdrawDollars(6);");
      Piggy10.withdrawDollars(3);
      System.out.println("Testing: Piggy10.withdrawDimes(2);");
      Piggy10.withdrawDimes(2);
      System.out.println("Testing: Piggy10.depositQuarters(5);");
      Piggy10.depositQuarters(5);
      System.out.println("Testing: Piggy10.withdrawNickels(2);");
      Piggy10.withdrawNickels(2);
      System.out.println("Testing: Piggy10.depositDimes(6);");
      Piggy10.depositDimes(6);
      System.out.println("Testing: Piggy10.depositCoins(2, 1, 3, 5, 4, 3);");
      Piggy10.depositCoins(2, 1, 3, 5, 4, 3);
      System.out.println("Testing: Piggy10.depositDollars(2);");
      Piggy10.depositDollars(2);
      System.out.println("Testing: Piggy10.depositPennies(53);");
      Piggy10.depositPennies(53);
      System.out.println();
      

      System.out.println("Piggy10 AFTER CHANGES:");
      System.out.println("Name: " + Piggy10.getName());
      System.out.println("Current # of Pennies is " + Piggy10.getPennies());
      System.out.println("Current # of Nickels is " + Piggy10.getNickels());
      System.out.println("Current # of Dimes is " +   Piggy10.getDimes());
      System.out.println("Current # of Quarters is " + Piggy10.getQuarters());
      System.out.println("Current # of Half-Dollars is " + Piggy10.getHalfDollars());
      System.out.println("Current # of Dollars is " + Piggy10.getDollars());
      System.out.println("Current Dollar Amount is $" + Piggy10.calculatePiggyBankBalance());
      System.out.println();
      System.out.println();
      System.out.println();
   }
}

/*
RUN OUTPUT:

Microsoft Windows [Version 10.0.17763.2114]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\812221>

cd /D "h:\APCompSci_ICT_Lesson05\" && "C:\Program Files\Java\jdk-11.0.8\bin\javac" -classpath .;"C:\JavaStuff\JARfiles\*"; PiggyBankTester.java && "C:\Program Files\Java\jdk-11.0.8\bin\java" -classpath .;"C:\JavaStuff\JARfiles\*"; PiggyBankTester
Piggy01 BEFORE CHANGES:
Name: Obipig Pigoby
Current # of Pennies is 0
Current # of Nickels is 0
Current # of Dimes is 0
Current # of Quarters is 0
Current # of Half-Dollars is 0
Current # of Dollars is 0
Current Dollar Amount is $0.0

Testing Piggy01.depositCoins(12, 4, 5, 2, 10, 4);
Testing: Piggy01.depositNickels(25);
Testing: Piggy01.withdrawDimes(4);
Testing: Piggy01.depositQuarters(3);
Testing: Piggy01.depositNickels(7);
Testing: Piggy01.depositCoins(3, 3, 1, 6, 8, 2); 
Testing: Piggy01.withdrawCoins(1, 4, 2, 4, 7, 1);
Testing: Piggy01.depositDollars(1);
Testing: Piggy01.withdrawPennies(10);
Testing: Piggy01.depositHalfDollars(2);

Piggy01 AFTER CHANGES:
Name: Obipig Pigoby
Current # of Pennies is 4
Current # of Nickels is 35
Current # of Dimes is 0
Current # of Quarters is 7
Current # of Half-Dollars is 13
Current # of Dollars is 6
Current Dollar Amount is $16.04



Piggy02 BEFORE CHANGES:
Name: Ham Swolo
Current # of Pennies is 2
Current # of Nickels is 5
Current # of Dimes is 7
Current # of Quarters is 9
Current # of Half-Dollars is 11
Current # of Dollars is 1
Current Dollar Amount is $9.72

Testing: Piggy02.depositCoins(2, 5, 7, 9, 11, 1);
Testing: Piggy02.depositPennies(20);
Testing: Piggy02.withdrawDimes(2);
Testing: Piggy02.depositQuarters(6);
Testing: Piggy02.withdrawHalfDollars(5);
Testing: Piggy02.depositNickels(1);
Testing: Piggy02.depositCoins(2, 1, 1, 7, 6, 3);
Testing: Piggy02.withdrawCoins(4, 2, 6, 8, 2, 5);
Testing: Piggy02.depositDollars(5);

Piggy02 AFTER CHANGES:
Name: Ham Swolo
Current # of Pennies is 8
Current # of Nickels is 10
Current # of Dimes is 7
Current # of Quarters is 23
Current # of Half-Dollars is 21
Current # of Dollars is 5
Current Dollar Amount is $22.53



Piggy03 BEFORE CHANGES:
Name: Anapig Hamwalker
Current # of Pennies is 8
Current # of Nickels is 2
Current # of Dimes is 3
Current # of Quarters is 6
Current # of Half-Dollars is 5
Current # of Dollars is 8
Current Dollar Amount is $12.48

Testing: Piggy03.depositCoins(8, 2, 3, 6, 5, 8);
Testing: Piggy03.depositDimes(12);
Testing: Piggy03.depositQuarters(6);
Testing: Piggy03.withdrawHalfDollars(3);
Testing: Piggy03.depositNickels(3);
Testing: Piggy03.depositDollars(4);
Testing: Piggy03.withdrawCoins(4, 2, 6, 4, 2, 6);
Testing: Piggy03.withdrawQuarters(2);
Testing: Piggy03.depositQuarters(4);
Testing: Piggy03.depositCoins(2, 2, 1, 3, 1, 2);

Piggy03 AFTER CHANGES:
Name: Anapig Hamwalker 
Current # of Pennies is 8
Current # of Nickels is 6
Current # of Dimes is 13
Current # of Quarters is 17
Current # of Half-Dollars is 8
Current # of Dollars is 11
Current Dollar Amount is $20.93



Piggy04 BEFORE CHANGES:
Name: Darth Pigder
Current # of Pennies is 6
Current # of Nickels is 3
Current # of Dimes is 1
Current # of Quarters is 4
Current # of Half-Dollars is 9
Current # of Dollars is 4
Current Dollar Amount is $9.81

Testing: Piggy04.depositCoins(6, 3, 1, 4, 9, 4);
Testing: Piggy04.depositQuarters(3);
Testing: Piggy04.depositDimes(2);
Testing: Piggy04.withdrawDollars(2);
Testing: Piggy04.withdrawPennies(5);
Testing: Piggy04.withdrawDollars(2);
Testing: Piggy04.depositHalfDollars(4);
Testing: Piggy04.depositCoins(5, 4, 5, 9, 5, 2);
Testing: Piggy04.depositQuarters(7);
Testing: Piggy04.depositDimes(1);

Piggy04 AFTER CHANGES:
Name: Darth Pigder
Current # of Pennies is 12
Current # of Nickels is 10
Current # of Dimes is 10
Current # of Quarters is 27
Current # of Half-Dollars is 27
Current # of Dollars is 6
Current Dollar Amount is $27.87



Piggy05 BEFORE CHANGES:
Name: Emperor Pigpaltine
Current # of Pennies is 14
Current # of Nickels is 1
Current # of Dimes is 4
Current # of Quarters is 8
Current # of Half-Dollars is 10
Current # of Dollars is 16
Current Dollar Amount is $23.59

Testing: Piggy05.depositCoins(2, 1, 3, 5, 4, 3);
Testing: Piggy05.depositHalfDolars(8);
Testing: Piggy05.depositPennies(50);
Testing: Piggy05.withdrawDimes(7);
Testing: Piggy05.depositHalfDollars(6);
Testing: Piggy05.depositNickels(7);
Testing: Piggy05.withdrawDollars(2);
Testing: Piggy05.withdrawHalfDollars(5);
Testing: Piggy05.withdrawPennies(24);
Testing: Piggy05.depositHalfDollars(4);

Piggy05 AFTER CHANGES:
Name: Emperor Pigpaltine
Current # of Pennies is 42
Current # of Nickels is 9
Current # of Dimes is 0
Current # of Quarters is 13
Current # of Half-Dollars is 27
Current # of Dollars is 17
Current Dollar Amount is $34.62



Piggy06 BEFORE CHANGES:
Name: Obipig Pigoby
Current # of Pennies is 0
Current # of Nickels is 0
Current # of Dimes is 0
Current # of Quarters is 0
Current # of Half-Dollars is 0
Current # of Dollars is 0
Current Dollar Amount is $0.0

Testing: Piggy06.depositCoins(6, 3, 1, 4, 9, 4);
Testing: Piggy06.depositPennies(20);
Testing: Piggy06.depositNickels(12);
Testing: Piggy06.withdrawDimes(2);
Testing: Piggy06.withdrawDollars(5);
Testing: Piggy06.depositHalfDollars(5);
Testing: Piggy06.withdrawCoins(1, 2, 1, 3, 1, 1)
Testing: Piggy06.withdrawQuarters(2);
Testing: Piggy06.withdrawDimes(10);
Testing: Piggy06.depositQuarters(7);

Piggy06 AFTER CHANGES:
Name: Obipig Pigoby
Current # of Pennies is 28
Current # of Nickels is 13
Current # of Dimes is 8
Current # of Quarters is 6
Current # of Half-Dollars is 13
Current # of Dollars is 2
Current Dollar Amount is $11.73



Piggy07 BEFORE CHANGES:
Name: Ham Swolo
Current # of Pennies is 2
Current # of Nickels is 5
Current # of Dimes is 7
Current # of Quarters is 9
Current # of Half-Dollars is 11
Current # of Dollars is 1
Current Dollar Amount is $9.72

Testing: Piggy07.withdrawCoins(3, 1, 1, 1, 0, 0);
Testing: Piggy07.depsitNickels(6);
Testing: Piggy07.depositCoins(13, 2, 5, 7, 4, 3);
Testing: Piggy07.depositHalfDollars(16);
Testing: Piggy07.depositPennies(50);
Testing: Piggy07.withdrawQuarters(1);
Testing: Piggy07.depositHalfDollars(2);
Testing: Piggy07.depositDimes(1);
Testing: Piggy07.withdrawQuarters(2);
Testing: Piggy07.depositHalfDollars(4);

Piggy07 AFTER CHANGES:
Name: Ham Swolo 
Current # of Pennies is 65
Current # of Nickels is 12
Current # of Dimes is 12
Current # of Quarters is 12
Current # of Half-Dollars is 37
Current # of Dollars is 4
Current Dollar Amount is $27.95



Piggy08 BEFORE CHANGES:
Name: Anapig Hamwalker
Current # of Pennies is 8
Current # of Nickels is 2
Current # of Dimes is 3
Current # of Quarters is 6
Current # of Half-Dollars is 5
Current # of Dollars is 8
Current Dollar Amount is $12.48

Testing: Piggy08.depositCoins(2, 6, 7, 4, 20, 6);
Testing: Piggy08.withdrawDimes(6);
Testing: Piggy08.withdrawCoins(2, 4, 3, 6, 2, 1);
Testing: Piggy08.withdrawHalfDollars(9)
Testing: Piggy08.depositDimes(10);
Testing: Piggy08.depositPennies(26);
Testing: Piggy08.withdrawDollars(2);
Testing: Piggy08.depositQuarters(3);
Testing: Piggy08.withdrawNickels(7);
Testing: Piggy08.depositDimes(4);

Piggy08 AFTER CHANGES:
Name: Anapig Hamwalker
Current # of Pennies is 34
Current # of Nickels is 1
Current # of Dimes is 15
Current # of Quarters is 7
Current # of Half-Dollars is 14
Current # of Dollars is 11
Current Dollar Amount is $21.64



Piggy09 BEFORE CHANGES:
Name: Darth Pigder
Current # of Pennies is 6
Current # of Nickels is 3
Current # of Dimes is 1
Current # of Quarters is 4
Current # of Half-Dollars is 9
Current # of Dollars is 4
Current Dollar Amount is $9.81

Testing: Piggy09.withdrawCoins(4, 3, 3, 1, 5, 2);
Testing: Piggy09.withdrawNickels(2);
Testing: Piggy09.depositCoins(23, 3, 2, 4, 5, 7);
Testing: Piggy09.withdrawDimes(2);
Testing: Piggy09.withdrawCoins(1, 1, 1, 1, 1, 2);
Testing: Piggy09.depositDollars(2);
Testing: Piggy09.depositDimes(8);
Testing: Piggy09.withdrawQuarters(2);
Testing: Piggy09.depositHalfDollars(6);
Testing: Piggy09.depositNickels(3);

Piggy09 AFTER CHANGES:
Name: Darth Pigder
Current # of Pennies is 24
Current # of Nickels is 9
Current # of Dimes is 5
Current # of Quarters is 4
Current # of Half-Dollars is 14
Current # of Dollars is 9
Current Dollar Amount is $18.19



Piggy10 BEFORE CHANGES:
Name: Emperor Pigpaltine
Current # of Pennies is 14
Current # of Nickels is 1
Current # of Dimes is 4
Current # of Quarters is 8
Current # of Half-Dollars is 10
Current # of Dollars is 16
Current Dollar Amount is $23.59

Testing: Piggy10.depositCoins(2, 3, 5, 8, 3, 5);
Testing: Piggy10.depositNickels(2);
Testing: Piggy10.withdrawDollars(6);
Testing: Piggy10.withdrawDimes(2);
Testing: Piggy10.depositQuarters(5);
Testing: Piggy10.withdrawNickels(2);
Testing: Piggy10.depositDimes(6);
Testing: Piggy10.depositCoins(2, 1, 3, 5, 4, 3);
Testing: Piggy10.depositDollars(2);
Testing: Piggy10.depositPennies(53);

Piggy10 AFTER CHANGES:
Name: Emperor Pigpaltine
Current # of Pennies is 71
Current # of Nickels is 5
Current # of Dimes is 16
Current # of Quarters is 26
Current # of Half-Dollars is 17
Current # of Dollars is 23
Current Dollar Amount is $40.56




h:\APCompSci_ICT_Lesson05>

*/