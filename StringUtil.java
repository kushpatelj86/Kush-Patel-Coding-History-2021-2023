/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          11/25/21
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 10.1
 *<BR> Description:  We will be calculating the reverse ,palindrome, pig latin, shorthand, vowel position, is vowel, and clean strings of the string
 *<BR> Cite Sources:  Mr.Eliot taught me what pig latin is. Websites I used: https://courses.mreliot.com/pluginfile.php/2262/mod_resource/content/29/apcsa_ICT_L10_pseudocode.pdf, https://lingojam.com/PigLatinTranslator, http://www.derf.net/palindromes/old.palindrome.html 
 */
import java.util.*;


public class StringUtil
{
   public static String reverse(String Input)
   {
       String Result;
       int Length;
       String OtherWords;
       String LastWord;
       Length = Input.length();
       if(Length > 1)
       {
        OtherWords = Input.substring(0, Length - 1);
        LastWord = Input.substring(Length - 1);
        Result = LastWord + reverse(OtherWords);

       }
       else
       {
           Result = Input;
       }
       return Result;
   }

   private static String cleanString(String Input)
   {
       Input = Input.toLowerCase();
       Input.length();
       char firstCharacter;
       String restOfString;
       String Result;
       Result = "";

       if(Input.length() >= 1)
       {
           firstCharacter = Input.charAt(0);
           restOfString = Input.substring(1, Input.length());
           
           if(firstCharacter >= 'a' && firstCharacter <= 'z')
           {
               Result = firstCharacter + cleanString(restOfString);
           }

           else
           {
               Result = cleanString(restOfString);
           }
       }

       return Result;
   }

   public static boolean palindrome(String Input)
   {
       String cleanString;
       String reverseString;

       cleanString = cleanString(Input);
       reverseString = cleanString(reverse(Input));
       
       
       if(cleanString.equals(reverseString))
       {
           return true;
       }

       else
       {
           return false;
       }
   }

   private static int vowelPosition(int startPos, String Input) 
   {
       int foundPos;
       char character;
       foundPos = -1;
       Input.length();

       if(startPos < Input.length())
       {
           character = Input.charAt(startPos);
           if(isVowel(character) == true)
           {
               foundPos = startPos;
           }
           else
           {
               foundPos = vowelPosition(startPos + 1, Input);
           }
       }
       return foundPos;
   }

   private static boolean isVowel(char letter)
   { 
       if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
       {
           return true;
       }

       else
       {
           return false;
       }
   }

   public static String pigLatin(String Input)
   {
       String firstWord;
       String otherWords;
       String Result;
       String start;
       String end;
       int vowelPosition;
       int startPos;
       startPos = 0;
       Input = Input.trim().toLowerCase();
       Input = cleanStringPigLatin(Input);
       vowelPosition = vowelPosition(startPos, Input);
       Result = " ";
       if(Input.length() > 0)
       {
           if(Input.indexOf(" ") > 0)
           {
               firstWord = Input.substring(0, Input.indexOf(" "));
               otherWords = Input.substring(Input.indexOf(" ") + 1, Input.length());
               Result = pigLatin(firstWord) + pigLatin(otherWords);
           }
           else
           {
               if(vowelPosition == 0)
               {
                   Result = Input + "yay ";
               }
               else if(vowelPosition > 0)
               {
                   start = Input.substring(0, vowelPosition);
                   end = Input.substring(vowelPosition);
                   Result = end + start + "ay ";
               }

               else
               {
                   Result = Input + "ay ";
               }
           }

       }
       return Result;
   }

   public static String shorthand(String Input)
   {
       
       
       String Result;
       Input = Input.toLowerCase();
       
       Input = Input.replace("and", "&");
       
       Input = Input.replace("to", "2");
       
       Input = Input.replace("you", "U");

       Input = Input.replace("for", "4");

       Input = Input.replace(" i ", " I ");

       Input = Input.replace("a", "");

       Input = Input.replace("e", "");

       Input = Input.replace("i", "");

       Input = Input.replace("o", "");

       Input = Input.replace("u", "");
       
       Result = Input;
    
       return Result;
   } 
   
   private static String cleanStringPigLatin(String Input)
   {
       Input = Input.toLowerCase();
       Input.length();
       char firstCharacter;
       String restOfString;
       String Result;
       Result = "";
       
       if(Input.length() >= 1)
       {
           firstCharacter = Input.charAt(0);
           restOfString = Input.substring(1, Input.length());
           
           if(firstCharacter >= 'a' && firstCharacter <= 'z' || firstCharacter == ' ')
           {
               Result = firstCharacter + cleanStringPigLatin(restOfString);
           }

           else
           {
               Result = cleanStringPigLatin(restOfString);
           }
       }

       return Result;
   }
}