/**
/**
*<BR> Name:          Kush Patel
*<BR> Date:          03-17-2022
*<BR> Period:        2
*<BR> Assignment:    ICT Lesson 21
*<BR> Description:   We will convert decimal to base
*<BR> Cite Sources:  https://www.rapidtables.com/convert/number/base-converter.html. mr eliot told me I misundered the video basic code qith java code.https://ap.mreliot.com/LessonA21/files/Any2Dec.vb.zip, https://ap.mreliot.com/LessonA21/files/Dec2Any.vb.zip, Francesco Balena , https://amzn.to/2IZ15b3. 
*<BR> Original Sources:	Jason Quesenberry and Nancy Quesenberry
*<BR> 					Original Visual Basic Code by Francesco Balena
*<BR>					https://www.goodreads.com/author/list/30132.Francesco_Balena
*<BR>					Student Ryan Monroe for this line in constructor:  MyStrValue = "" + value;
*/

public class BaseConverterTester
{
    public static void main(String[] args)
    {
		//various tests for conversions that should work
		BaseConverter Tester00 = new BaseConverter();
		BaseConverter Tester01 = new BaseConverter(8765351);
		BaseConverter Tester02 = new BaseConverter("0111111111111111100", 2);
		BaseConverter Tester03 = new BaseConverter("13A63", 34);
		BaseConverter Tester04 = new BaseConverter("5ed24B24");
		BaseConverter Tester05 = new BaseConverter("F9BF3F5", 22);
		BaseConverter Tester06 = new BaseConverter("176O784", 26);
		BaseConverter Tester07 = new BaseConverter("H9CL3Q5", 34);
		BaseConverter Tester08 = new BaseConverter(1122);
		BaseConverter Tester09 = new BaseConverter("IJ4LSA", 16);			//error
		BaseConverter Tester10 = new BaseConverter("02468", 1);			//error
		BaseConverter Tester11 = new BaseConverter("", 24);				   //error	
		BaseConverter Tester12 = new BaseConverter("  AV T?/- 1A2B  ", -1);	//error
		System.out.println();
		BaseConverter Tester13 = new BaseConverter("111111", 16);			//error
		BaseConverter Tester14 = new BaseConverter("3HE215", 3);			//error
		BaseConverter Tester15 = new BaseConverter("ABCDEF", 4);					//error
		BaseConverter Tester16 = new BaseConverter("FSGSG", 67);	//error
		BaseConverter Tester17 = new BaseConverter("ABCDEFG1234567");	//error
		BaseConverter Tester18 = new BaseConverter(46986576);	//error
		BaseConverter Tester19 = new BaseConverter(6544);	
		BaseConverter Tester20 = new BaseConverter(742);
		BaseConverter Tester21 = new BaseConverter("FHfgd", 16);			//error
		BaseConverter Tester22 = new BaseConverter("4AHE63S5Z", 1);			//error
		BaseConverter Tester23 = new BaseConverter("180Z6A4", 34);				   //error	
		BaseConverter Tester24 = new BaseConverter("w876", 67);				   //error	
		BaseConverter Tester25 = new BaseConverter("76HGFD", 7);				   //error	
		BaseConverter Tester26 = new BaseConverter("0", 7);				   //error	


		
		//decimalToAnyBase()
		System.out.println("decimalToAnyBase() tests:");
		System.out.println("(default constructor) 10 to base 7 is " + Tester00.decimalToAnyBase(7));
		System.out.println("(int value) 8765351 to base 4 is " + Tester01.decimalToAnyBase(4));
		System.out.println("(int value) 8765351 to base 36 is " + Tester01.decimalToAnyBase(36));
		System.out.println("(int value) 1122 to base 2 is " + Tester08.decimalToAnyBase(2));
		System.out.println("(default constructor) 10 to base 10 is " + Tester00.decimalToAnyBase(10));
		System.out.println("(int value) 8765351 to base 20 is " + Tester01.decimalToAnyBase(20));
		System.out.println("(int value) 6544 to base 2 is " + Tester19.decimalToAnyBase(2));
		System.out.println("(int value) 742 to base 6 is " + Tester20.decimalToAnyBase(6));


		System.out.println();

		//anyBaseToDecimal()
		System.out.println("anyBaseToDecimal() tests:");
		System.out.println("(default constructor) 10 from base 10 to decimal is " + Tester00.anyBaseToDecimal());
		System.out.println("(int value) 8765351 from base 10 to decimal is " + Tester01.anyBaseToDecimal());
		System.out.println("0111111111111111100 from base 2 to decimal is " + Tester02.anyBaseToDecimal());
		System.out.println("(String value, int base) 13A63 from base 8 to decimal is " + Tester03.anyBaseToDecimal());
		System.out.println("(String value) 3EDD4C29 base 16 to decimal is " + Tester04.anyBaseToDecimal());
		System.out.println("(String value, int base) G9BG5H5 from base 20 to decimal is " + Tester05.anyBaseToDecimal());
		System.out.println("(String value, int base) 257P889 from base 28 to decimal is " + Tester06.anyBaseToDecimal());
		System.out.println("(String value, int base) H9CL3Q5 from base 34 to decimal is " + Tester07.anyBaseToDecimal());
		System.out.println("(int value) 1122 from base 10 to decimal is " + Tester08.anyBaseToDecimal());
		System.out.println("(String value, int base) 0 from base 7 to decimal is  " + Tester26.anyBaseToDecimal());

		//anyBaseToDecimal() various error checking tests
		System.out.println("anyBaseToDecimal() ERROR tests:");
		System.out.println();
		System.out.println("(String value, int base) IJ4LSA from base 16 to decimal is " + Tester09.anyBaseToDecimal());
		System.out.println();
		System.out.println("(String value, int base) 02468 from base 1 to decimal is " + Tester10.anyBaseToDecimal());
		System.out.println();
		System.out.println("(String value, int base) 1 (empty string) from base 24 to decimal is  " + Tester11.anyBaseToDecimal());
		System.out.println();
		System.out.println("(String value, int base) (spaces in string) from base 36 to decimal is  " + Tester12.anyBaseToDecimal());
		System.out.println();
		System.out.println("(String value, int base) 3HE215 from base 3 to decimal is  " + Tester14.anyBaseToDecimal());
		System.out.println();
		System.out.println("(String value, int base) ABCDEF from base 4 to decimal is  " + Tester15.anyBaseToDecimal());
		System.out.println();
		System.out.println("(String value, int base) FHfgd from base 16 to decimal is  " + Tester21.anyBaseToDecimal());
		System.out.println();
		System.out.println("(String value, int base) 4AHE63S5Z from base 1 to decimal is  " + Tester22.anyBaseToDecimal());
		System.out.println();
		System.out.println("(String value, int base) 180Z6A4 from base 34 to decimal is  " + Tester23.anyBaseToDecimal());
		System.out.println();
		System.out.println("(String value, int base) w876 from base 67 to decimal is  " + Tester24.anyBaseToDecimal());
		System.out.println();
		System.out.println("(String value, int base) 76HGFD from base 7 to decimal is  " + Tester25.anyBaseToDecimal());
		System.out.println();



		//You provide decimalToAnyBase() various error checking tests
		System.out.println("decimalToAnyBase() ERROR tests:");
		System.out.println("(String value, int base) 111111 to base 2 is " + Tester13.decimalToAnyBase(0));
		System.out.println("(String value, int base) 111111 to base 2 is " + Tester13.decimalToAnyBase(2));
		System.out.println("(String value, int base) 3HE215 to base 8 is " + Tester14.decimalToAnyBase(8));
		System.out.println("(String value, int base) 3HE215 to base 10 is " + Tester14.decimalToAnyBase(10));
		System.out.println("(String value, int base) ABCDEF to base 16 is " + Tester15.decimalToAnyBase(16));
		System.out.println("(String value, int base) ABCDEF to base 37 is " + Tester15.decimalToAnyBase(37));
		System.out.println("(String value, int base) FSGSG to base 36 is " + Tester16.decimalToAnyBase(36));
		System.out.println("(String value, int base) FSGSG to base 2 is " + Tester16.decimalToAnyBase(2));
		System.out.println("(int value) 1054690345 to base 57 is " + Tester01.decimalToAnyBase(57));
		System.out.println("(String value) ABCDEFG1234567 to base 5 is " + Tester17.decimalToAnyBase(5));
		System.out.println("(int value) 46986576 to base 1 is " + Tester18.decimalToAnyBase(1));
		System.out.println("(int value) 6544 to base 45 is " + Tester19.decimalToAnyBase(45));
		System.out.println("(default constructor) 10 to base 0 is " + Tester00.decimalToAnyBase(0));

		System.out.println();
		//...
    }
}

/*
decimalToAnyBase() tests:
(default constructor) 10 to base 7 is 13
(int value) 8765351 to base 4 is 201123332213
(int value) 8765351 to base 36 is 57VDZ
(int value) 1122 to base 2 is 10001100010
(default constructor) 10 to base 10 is 10
(int value) 8765351 to base 20 is 2EFD7B
(int value) 6544 to base 2 is 1100110010000
(int value) 742 to base 6 is 3234

anyBaseToDecimal() tests:
(default constructor) 10 from base 10 to decimal is 10
(int value) 8765351 from base 10 to decimal is 8765351
0111111111111111100 from base 2 to decimal is 262140
(String value, int base) 13A63 from base 8 to decimal is 1466015
(String value) 3EDD4C29 base 16 to decimal is 1590840100
(String value, int base) G9BG5H5 from base 20 to decimal is 1749819571
(String value, int base) 257P889 from base 28 to decimal is 395254032
(String value, int base) H9CL3Q5 from base 34 to decimal is 2147483647
(int value) 1122 from base 10 to decimal is 1122

anyBaseToDecimal() ERROR tests:

Error: digit beyond the range of the base
(String value, int base) IJ4LSA from base 16 to decimal is -1

Error: base must be in the  range 2 to 36
(String value, int base) 02468 from base 1 to decimal is -1

Error: empty number string
(String value, int base) 1 (empty string) from base 24 to decimal is  -1

Error: base must be in the  range 2 to 36
(String value, int base) (spaces in string) from base 36 to decimal is  -1

Error: digit beyond the range of the base
(String value, int base) 3HE215 from base 3 to decimal is  -1

Error: digit beyond the range of the base
(String value, int base) ABCDEF from base 4 to decimal is  -1

Error: digit beyond the range of the base
(String value, int base) FHfgd from base 16 to decimal is  -1

Error: base must be in the  range 2 to 36
(String value, int base) 4AHE63S5Z from base 1 to decimal is  -1

Error: digit beyond the range of the base
(String value, int base) 180Z6A4 from base 34 to decimal is  -1

Error: base must be in the  range 2 to 36
(String value, int base) w876 from base 67 to decimal is  -1

Error: digit beyond the range of the base
(String value, int base) 76HGFD from base 7 to decimal is  -1

decimalToAnyBase() ERROR tests:
(String value, int base) 111111 to base 2 is a value to be converted must be a positive number
(String value, int base) 111111 to base 2 is a value to be converted must be a positive number
(String value, int base) 3HE215 to base 8 is a value to be converted must be a positive number
(String value, int base) 3HE215 to base 10 is a value to be converted must be a positive number
(String value, int base) ABCDEF to base 16 is a value to be converted must be a positive number
(String value, int base) ABCDEF to base 37 is a value to be converted must be a positive number
(String value, int base) FSGSG to base 36 is a value to be converted must be a positive number
(String value, int base) FSGSG to base 2 is a value to be converted must be a positive number
(int value) 1054690345 to base 57 is a base that must be in the range 2 to 36
(String value) ABCDEFG1234567 to base 5 is a value to be converted must be a positive number
(int value) 46986576 to base 1 is a base that must be in the range 2 to 36
(int value) 6544 to base 45 is a base that must be in the range 2 to 36
(default constructor) 10 to base 0 is a base that must be in the range 2 to 36
*/