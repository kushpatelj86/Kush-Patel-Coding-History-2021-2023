/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          11/25/21
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 10.1
 *<BR> Description:  We will be calculating the reverse ,palindrome, pig latin, shorthand, vowel position, is vowel, and clean strings of the string
 *<BR> Cite Sources:  Mr.Eliot taught me what pig latin is. Websites I used: https://courses.mreliot.com/pluginfile.php/2262/mod_resource/content/29/apcsa_ICT_L10_pseudocode.pdf, https://lingojam.com/PigLatinTranslator, http://www.derf.net/palindromes/old.palindrome.html 
 */

public class StringUtilTester
{
    public static void main(String[] args) 
    {
        System.out.println("Reverse tests:");
        System.out.println("The Reverse of \"Former Vice President Joe Biden is elected the 46th US President\" is \"" + StringUtil.reverse("Former Vice President Joe Biden is elected the 46th US President") + "\"");
        System.out.println("The Reverse of \"Hello\" is \"" + StringUtil.reverse("Hello") + "\"");
        System.out.println("The Reverse of \"50 US States\" is \"" + StringUtil.reverse("50 US States") + "\"");
        System.out.println("The Reverse of \"150 lbs\" is \"" + StringUtil.reverse("150 lbs") + "\"");
        System.out.println("The Reverse of \"India is projected to be the most populous country by 2050\" is \"" + StringUtil.reverse("India is projected to be the most populous country by 2050") + "\"");
        System.out.println("The Reverse of \"India's real covid numbers are much higher than the reported number and have the most suspected covid 19 cases in the world\" is \"" + StringUtil.reverse("India's real covid numbers are much higher than the reported number and have the most suspected covid 19 cases in the world") + "\"");
        System.out.println("The Reverse of \"The US Afghanisthan War ended on August 30, 2021\" is \"" + StringUtil.reverse("The US Afghanisthan War ended on August 30, 2021") + "\"");
        System.out.println("The Reverse of \"YLHS opened in 2009\" is \"" + StringUtil.reverse("YLHS opened in 2009") + "\"");
        System.out.println("The Reverse of \"Marge, let dam dogs in. Am on satire! Vow I am Cain. Am on spot. Am a Jap sniper. Red, raw murder on GI. Ignore drum. (Warner rips pajama tops.) No maniac, Ma! Iwo veritas: no man is God - Mad telegram.\" is \"" + StringUtil.reverse("Marge, let dam dogs in. Am on satire! Vow I am Cain. Am on spot. Am a Jap sniper. Red, raw murder on GI. Ignore drum. (Warner rips pajama tops.) No maniac, Ma! Iwo veritas: no man is God - Mad telegram.") + "\"");
        System.out.println("The Reverse of \"Donald Trump was the first non-politician to be president\" is \"" + StringUtil.reverse("Donald Trump was the first non-politician to be president") + "\"");
        System.out.println("The Reverse of \"Avatar was the highest grossing film of all time\" is \"" + StringUtil.reverse("Avatar was the highest grossing film of all time") + "\"");
        System.out.println("The Reverse of \"There are over 330 Million People living in the United States\" is \"" + StringUtil.reverse("There are over 330 Million People living in the United States") + "\"");
        System.out.println("The Reverse of \"1680 kids attend YLHS\" is \"" + StringUtil.reverse("1680 kids attend YLHS") + "\"");
        System.out.println("The Reverse of \"Has there been a president that served more than two terms?\" is \"" + StringUtil.reverse("Has there been a president that served more than two terms?") + "\"");
        System.out.println("The Reverse of \"Franklin Delano Roosevelt served 3 full terms and 1 very short term before he did died from 1933-1945\" is \"" + StringUtil.reverse("Franklin Delano Roosevelt served 3 full terms and 1 very short term before he did died from 1933-1945") + "\"");
        System.out.println("The Reverse of \" Vice President Harry S Truman assumed the presidency after FDR died and led the us in World War 2 \" is \"" + StringUtil.reverse(" Vice President Harry S Truman assumed the presidency after FDR died and led the us in World War 2 ") + "\"");
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Palindrome tests:");
        System.out.println("If there is a Palindrome for \"radar\" then it is \"" + StringUtil.palindrome("radar") + "\"");
        System.out.println("If there is a Palindrome for \"redivider\" then it is \"" + StringUtil.palindrome("redivider") + "\"");
        System.out.println("If there is a Palindrome for \"deified\" then it is \"" + StringUtil.palindrome("deified") + "\"");
        System.out.println("If there is a Palindrome for \"civic\" then it is \"" + StringUtil.palindrome("civic") + "\"");
        System.out.println("If there is a Palindrome for \"rotor\" then it is \"" + StringUtil.palindrome("rotor") + "\"");
        System.out.println("If there is a Palindrome for \"kayak\" then it is \"" + StringUtil.palindrome("kayak") + "\"");
        System.out.println("If there is a Palindrome for \"reviver\" then it is \"" + StringUtil.palindrome("reviver") + "\"");
        System.out.println("If there is a Palindrome for \"racecar\" then it is \"" + StringUtil.palindrome("racecar") + "\"");
        System.out.println("If there is a Palindrome for \"madam\" then it is \"" + StringUtil.palindrome("madam") + "\"");
        System.out.println("If there is a Palindrome for \"refer\" then it is \"" + StringUtil.palindrome("refer") + "\"");
        System.out.println("If there is a Palindrome for \"level\" then it is \"" + StringUtil.palindrome("Level") + "\"");
        System.out.println("If there is a Palindrome for \"J\" then it is \"" + StringUtil.palindrome("J") + "\"");
        System.out.println("If there is a Palindrome for \"Lewd did I live, & evil I did dwel.\" then it is \"" + StringUtil.palindrome("Lewd did I live, & evil I did dwel.") + "\"");
        System.out.println("If there is a Palindrome for \"I like Java!\" then it is \"" + StringUtil.palindrome("I like Java!") + "\"");
        System.out.println("If there is a Palindrome for \"Straw? No, too stupid a fad, I put soot on warts.\" then it is \"" + StringUtil.palindrome("Straw? No, too stupid a fad, I put soot on warts.") + "\"");
        System.out.println("If there is a Palindrome for \"Are we not pure? No sir, Panama's moody Noriega brags. It is garbage! Irony dooms a man; a prisoner up to new era.\" then it is \"" + StringUtil.palindrome("Are we not pure? No sir, Panama's moody Noriega brags. It is garbage! Irony dooms a man; a prisoner up to new era.") + "\"");
        System.out.println("If there is a Palindrome for \"Irony dooms a man; a prisoner up to new era.\" then it is \"" + StringUtil.palindrome("Irony dooms a man; a prisoner up to new era.") + "\"");
        System.out.println("If there is a Palindrome for \"Able was I, ere I saw Elba.\" then it is \"" + StringUtil.palindrome("Able was I, ere I saw Elba.") + "\"");
        System.out.println("If there is a Palindrome for \"Mr. Owl ate my metal worm\" then it is \"" + StringUtil.palindrome("Mr. Owl ate my metal worm") + "\"");
        System.out.println("If there is a Palindrome for \"No, Mel Gibson is a casino’s big lemon\" then it is \"" + StringUtil.palindrome("No, Mel Gibson is a casino’s big lemon") + "\"");
        System.out.println("If there is a Palindrome for \"A Santa spit taboo bat tips at NASA.\" then it is \"" + StringUtil.palindrome("A Santa spit taboo bat tips at NASA.") + "\"");
        System.out.println("If there is a Palindrome for \"Egad, a base tone denotes a bad age.\" then it is \"" + StringUtil.palindrome("Egad, a base tone denotes a bad age.") + "\"");
        System.out.println("If there is a Palindrome for is \"KC, answer DNA loop award. Emit time. Draw a pool. Andrew, snack.\" then it is \"" + StringUtil.palindrome("KC, answer DNA loop award. Emit time. Draw a pool. Andrew, snack.") + "\"");
        System.out.println("If there is a Palindrome for \"We're in a pandemic\" then it is \"" + StringUtil.palindrome("We're in a pandemic") + "\"");
        System.out.println("If there is a Palindrome for \"A but of stressed desserts fo' tuba.\" then it is \"" + StringUtil.palindrome("A but of stressed desserts fo' tuba.") + "\"");
        System.out.println("If there is a Palindrome for \"A Fool, A Tool, A Pool; LOOPALOOTALOOFA!\" then it is \"" + StringUtil.palindrome("A Fool, A Tool, A Pool; LOOPALOOTALOOFA!") + "\"");
        System.out.println("If there is a Palindrome for \"What are those!\" then it is \"" + StringUtil.palindrome("What are those!") + "\"");
        System.out.println("If there is a Palindrome for \"I have concluded it has closed\" then it is \"" + StringUtil.palindrome("I have concluded it has closed") + "\"");
        System.out.println("If there is a Palindrome for \"There's a disturbance in the force!\" then it is \"" + StringUtil.palindrome("There's a disturbance in the force!") + "\"");
        System.out.println("If there is a Palindrome for \"Lid of fade, metallic soot, emit Garret-simple, help mister ragtime to oscillate me, daffodil..\" then it is \"" + StringUtil.palindrome("Lid of fade, metallic soot, emit Garret-simple, help mister ragtime to oscillate me, daffodil!") + "\"");
        System.out.println("If there is a Palindrome for \"There's a disturbance in the force!\" then it is \"" + StringUtil.palindrome("There's a disturbance in the force!") + "\"");
        System.out.println("If there is a Palindrome for \"A man, a plan, a canal - Panama!\" then it is \"" + StringUtil.palindrome("A man, a plan, a canal - Panama!") + "\"");
        System.out.println("If there is a Palindrome for \"T. Eliot, top bard, notes putrid tang emanating, is sad, I'd assign it a name: gnat dirt upset on drab pot toilet.\" then it is \"" + StringUtil.palindrome("T. Eliot, top bard, notes putrid tang emanating, is sad, I'd assign it a name: gnat dirt upset on drab pot toilet.") + "\"");
        System.out.println("If there is a Palindrome for \"Was raw tap ale not a reviver at one lap at Warsaw?\" then it is \"" + StringUtil.palindrome("Was raw tap ale not a reviver at one lap at Warsaw?") + "\"");
        System.out.println("If there is a Palindrome for \"tattarrattat\" then it is \"" + StringUtil.palindrome("tattarrattat") + "\"");   
        System.out.println("If there is a Palindrome for \"Eva, can I see bees in a cave?\" then it is \"" + StringUtil.palindrome("Eva, can I see bees in a cave?") + "\"");   
        System.out.println("If there is a Palindrome for \"Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, and Ellen sinned.\" then it is \"" + StringUtil.palindrome("Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, and Ellen sinned.") + "\"");           
        System.out.println("If there is a Palindrome for \"Miry rim So many daffodils Delia wailed slid off a dynamo’s miry rim\" then it is \"" + StringUtil.palindrome("Miry rim So many daffodils Delia wailed slid off a dynamo’s miry rim") + "\"");           
        System.out.println("If there is a Palindrome for \"Do good? I? No. Evil anon I deliver. I maim nine more hero-men in Saginaw, sanitary sword a-tuck, Carol, I. Lo! Rack, cut a drowsy rat in Aswan. I gas nine more hero-men in Miami. Reviled, I (Nona) live on. I do, O God.\" then it is \"" + StringUtil.palindrome("Do good? I? No. Evil anon I deliver. I maim nine more hero-men in Saginaw, sanitary sword a-tuck, Carol, I. Lo! Rack, cut a drowsy rat in Aswan. I gas nine more hero-men in Miami. Reviled, I (Nona) live on. I do, O God.") + "\"");
        System.out.println("If there is a Palindrome for \"A relic Odin I’m a mini docile Ra\" then it is \"" + StringUtil.palindrome("A relic Odin I’m a mini docile Ra") + "\"");
        System.out.println("If there is a Palindrome for \"Bombard a drab mob\" then it is \"" + StringUtil.palindrome("Bombard a drab mob") + "\"");
        System.out.println("If there is a Palindrome for \"Campus motto: Bottoms up Mac\" then it is \"" + StringUtil.palindrome("Campus motto: Bottoms up Mac") + "\"");
        System.out.println("If there is a Palindrome for \"Delia and Edna ailed\" then it is \"" + StringUtil.palindrome("Delia and Edna ailed") + "\"");
        System.out.println("If there is a Palindrome for \"Embargos are macabre Sad Nell listen O not to no nets I’ll lend a Serb a camera so grab me\" then it is \"" + StringUtil.palindrome("Embargos are macabre Sad Nell listen O not to no nets I’ll lend a Serb a camera so grab me") + "\"");
        System.out.println("If there is a Palindrome for \"Feeble el beef\" then it is \"" + StringUtil.palindrome("Feeble el beef") + "\"");
        System.out.println("If there is a Palindrome for \"Zeus was deified saw Suez\" then it is \"" + StringUtil.palindrome("Zeus was deified saw Suez") + "\"");
        System.out.println("If there is a Palindrome for \"Young Ada had a gnu Oy!\" then it is \"" + StringUtil.palindrome("Young Ada had a gnu Oy!") + "\"");
        System.out.println("If there is a Palindrome for \"Wontons? Not now\" then it is \"" + StringUtil.palindrome("Wontons? Not now") + "\"");
        System.out.println("If there is a Palindrome for \"Vote to not slip up refer pupils to note TOV\" then it is \"" + StringUtil.palindrome("Vote to not slip up refer pupils to note TOV") + "\"");
        System.out.println("If there is a Palindrome for \"Madam, I'm Adam\" then it is \"" + StringUtil.palindrome("Madam, I'm Adam") + "\"");
        System.out.println("If there is a Palindrome for \"A man, a plan, a canal: Panama\" then it is \"" + StringUtil.palindrome("A man, a plan, a canal: Panama") + "\"");
        System.out.println("If there is a Palindrome for \"test\" then it is \"" + StringUtil.palindrome("test") + "\"");
        System.out.println("If there is a Palindrome for \"Jack Sparrow\" then it is \"" + StringUtil.palindrome("Jack Sparrow") + "\"");
        System.out.println("If there is a Palindrome for \"Recursion is a method that repeats itself inside a method\" then it is \"" + StringUtil.palindrome("Recursion is a method that repeats itself inside a method") + "\"");
        System.out.println("If there is a Palindrome for \"Setter methods are mutator methods\" then it is \"" + StringUtil.palindrome("Setter methods are mutator methods") + "\"");
        System.out.println("If there is a Palindrome for \"Unremarkable was I ere I saw Elba Kramer nu?\" then it is \"" + StringUtil.palindrome("Unremarkable was I ere I saw Elba Kramer nu?") + "\"");
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Pig Latin tests:");
        System.out.println("The Pig Latin of \"dog\" is \"" + StringUtil.pigLatin("dog") + "\"");
        System.out.println("The Pig Latin of \"crisp\" is \"" + StringUtil.pigLatin("crisp") + "\"");
        System.out.println("The Pig Latin of \"paris\" is \"" + StringUtil.pigLatin("paris") + "\"");
        System.out.println("The Pig Latin of \"amazon\" is \"" + StringUtil.pigLatin("amazon") + "\"");

        System.out.println("The Pig Latin of \"Hello World\" is \"" + StringUtil.pigLatin("Hello World") + "\"");
        System.out.println("The Pig Latin of \"Eat it\" is \"" + StringUtil.pigLatin("Eat it") + "\"");
        System.out.println("The Pig Latin of \"Smell\" is \"" + StringUtil.pigLatin("Smell") + "\"");
        System.out.println("The Pig Latin of \"Don't run in the blacktop\" is \"" + StringUtil.pigLatin("Don't run in the blacktop") + "\"");
        System.out.println("The Pig Latin of \"Ice Cream\" is \"" + StringUtil.pigLatin("Ice Cream") + "\"");
        System.out.println("The Pig Latin of \"I am almost six feet tall\" is \"" + StringUtil.pigLatin("I am almost six feet tall") + "\"");
        System.out.println("The Pig Latin of \"Elon Musk own SpaceX\" is \"" + StringUtil.pigLatin("Elon Musk owns SpaceX") + "\"");
        System.out.println("The Pig Latin of \"Rhythm\" is \"" + StringUtil.pigLatin("Rhythm") + "\"");
        System.out.println("The Pig Latin of \"Crypt\" is \"" + StringUtil.pigLatin("Crypt") + "\"");
        System.out.println("The Pig Latin of \"Stestanko\" is \"" + StringUtil.pigLatin("Stestanko") + "\"");
        System.out.println("The Pig Latin of \"Kamala Harris is the first female vice president\" is \"" + StringUtil.pigLatin("Kamala Harris is the first female vice president") + "\"");
        System.out.println("The Pig Latin of \"Yorba Linda High School Resource Officer is Nick Doty\" is \"" + StringUtil.pigLatin("Yorba Linda High School Resource Officer is Nick Doty") + "\"");
        System.out.println("The Pig Latin of \"Google, Apple, and Microsoft are companies that computer science graduates work at\" is \"" + StringUtil.pigLatin("Google, Apple, and Microsoft are companies that computer science graduates work at") + "\"");
        System.out.println("The Pig Latin of \"The Marvel Cinematic Universe is owned by Disney\" is \"" + StringUtil.pigLatin("The Marvel Cinematic Universe is owned by Disney") + "\"");
        System.out.println("The Pig Latin of \"George Lucas sold Star Wars to Disney\" is \"" + StringUtil.pigLatin("George Lucas sold Star Wars to Disney") + "\"");        
        System.out.println("The Pig Latin of \"I have travelled to eight different states in India, which are Gurjrat, Rajasthan, Uttar Pradesh, Maharastra, Karnataka, Madya Prdadesh, Telegana, and West Bengal\" is \"" + StringUtil.pigLatin("I have travelled to eight different states in India, which are Gurjrat, Rajasthan, Uttar Pradesh, Maharastra, Karnataka, Madya Prdadesh, Telegana, and West Bengal") + "\"");
        System.out.println("The Pig Latin of \"Spy kids\" is \"" + StringUtil.pigLatin("Spy kids") + "\"");
        System.out.println("The Pig Latin of \"Shh\" is \"" + StringUtil.pigLatin("Shh") + "\"");
        System.out.println("The Pig Latin of \"Lynch\" is \"" + StringUtil.pigLatin("Lynch") + "\"");
        System.out.println("The Pig Latin of \"Lymph nodes\" is \"" + StringUtil.pigLatin("Lymph nodes") + "\"");
        System.out.println("The Pig Latin of \"Gym Shark\" is \"" + StringUtil.pigLatin("Gym Shark") + "\"");     
        System.out.println("The Pig Latin of \"Shark Tank\" is \"" + StringUtil.pigLatin("Shark Tank") + "\"");    
        System.out.println("The Pig Latin of \"Hasta la vista baby\" is \"" + StringUtil.pigLatin("Hasta la vista baby") + "\""); 
        System.out.println("The Pig Latin of \"All American Adults will be elligible for the vaccine no later than May 1st\" is \"" + StringUtil.pigLatin("All American Adults will be elligible for the vaccine no later than may 1st") + "\"");
        System.out.println("The Pig Latin of \"Pig Latin\" is \"" + StringUtil.pigLatin("Pig Latin") + "\"");     
        System.out.println("The Pig Latin of \"yellow\" is \"" + StringUtil.pigLatin("yellow") + "\"");     
        System.out.println("The Pig Latin of \"ocean\" is \"" + StringUtil.pigLatin("ocean") + "\"");     
        System.out.println("The Pig Latin of \"food\" is \"" + StringUtil.pigLatin("food") + "\"");     
        System.out.println("The Pig Latin of \"island\" is \"" + StringUtil.pigLatin("island") + "\"");     
        System.out.println("The Pig Latin of \"eunoia\" is \"" + StringUtil.pigLatin("eunoia") + "\"");     

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Shorthand tests:");
        System.out.println("The Shorthand of \"handy\" is \"" + StringUtil.shorthand("handy") + "\"");
        System.out.println("The Shorthand of \"entry\" is \"" + StringUtil.shorthand("entry") + "\"");
        System.out.println("The Shorthand of \"to be or not to be\" is \"" + StringUtil.shorthand("to be or not to be") + "\"");
        System.out.println("The Shorthand of \"You are smart\" is \"" + StringUtil.shorthand("You are smart") + "\"");
        System.out.println("The Shorthand of \"Between\" is \"" + StringUtil.shorthand("Between") + "\"");
        System.out.println("The Shorthand of \"What about you\" is \"" + StringUtil.shorthand("What about you") + "\"");
        System.out.println("The Shorthand of \"For the Resistance\" is \"" + StringUtil.shorthand("For the Resistance") + "\"");
        System.out.println("The Shorthand of \" i want \" is \"" + StringUtil.shorthand(" i want") + "\"");
        System.out.println("The Shorthand of \"I want\" is \"" + StringUtil.shorthand("I want") + "\"");
        System.out.println("The Shorthand of \"Useful\" is \"" + StringUtil.shorthand("Useful") + "\"");
        System.out.println("The Shorthand of \"Jim and i both started a coding club\" is \"" + StringUtil.shorthand("Jim and i both started a coding club") + "\"");
        System.out.println("The Shorthand of \"Andy\" is \"" + StringUtil.shorthand("Andy") + "\"");
        System.out.println("The Shorthand of \"A\" is \"" + StringUtil.shorthand("A") + "\"");
        System.out.println("The Shorthand of \"The End\" is \"" + StringUtil.shorthand("The End") + "\"");
        System.out.println("The Shorthand of \"You are unassailable\" is \"" + StringUtil.shorthand("You are unassailable") + "\"");
        System.out.println("The Shorthand of \"You are smart\" is \"" + StringUtil.shorthand("You are smart") + "\"");      
        System.out.println("The Shorthand of \"Who threw that paper? I did!\" is \"" + StringUtil.shorthand("Who threw that paper? I did!") + "\"");        
        System.out.println("The Shorthand of \"Who do I send it to?\" is \"" + StringUtil.shorthand("Who do I send it to?") + "\"");
        System.out.println("The Shorthand of \"Who is this for?\" is \"" + StringUtil.shorthand("Who is this for?") + "\"");
        System.out.println("The Shorthand of \"Congratulations you are promoted\" is \"" + StringUtil.shorthand("Congratulations you are promoted") + "\"");
        System.out.println("The Shorthand of \"Magnesium\" is \"" + StringUtil.shorthand("Magnesium") + "\"");
        System.out.println("The Shorthand of \"Magnet\" is \"" + StringUtil.shorthand("Magnet") + "\"");
        System.out.println("The Shorthand of \"Projection\" is \"" + StringUtil.shorthand("Projection") + "\"");
        System.out.println("The Shorthand of \"Rejection\" is \"" + StringUtil.shorthand("Rejection") + "\"");
        System.out.println("The Shorthand of \"Mark Martinez\" is \"" + StringUtil.shorthand("Mark Martinez") + "\"");
 
        System.out.println();
        System.out.println();
        System.out.println();

       /* System.out.println("Clean String tests:");
        System.out.println("The Clean String of \"Hello\" is \"" + StringUtil.cleanString("Hello") + "\"");
        System.out.println("The Clean String of \"There are 9 laps\" is \"" + StringUtil.cleanString("There are 9 laps") + "\"");
        System.out.println("The Clean String of \"Hello, my name is\" is \"" + StringUtil.cleanString("Hello, my name is") + "\"");
        System.out.println("The Clean String of \"Where is the key?\" is \"" + StringUtil.cleanString("Where is the key?") + "\"");
        System.out.println("The Clean String of \"There are 50 bass, 30 cat fish, 60 trout, and 200 blue gills at East Lake Village\" is \"" + StringUtil.cleanString("There are 50 bass, 30 cat fish, 60 trout, and 200 blue gills at East Lake Village") + "\"");
        System.out.println("The Clean String of \"20% of the School is a freshman, 25% of the School is a sophomore, 25% of the School is a junior, and 30% of the School is a senior\" is \"" + StringUtil.cleanString("20% of the School is a freshman, 25% of the School is sophomore, 25% of the School is a junior, and 30% of the School is a senior") + "\"");
        System.out.println("The Clean String of \"Prime Minister Narendra Modi is 70 years old\" is \"" + StringUtil.cleanString("Prime Minister Narendra Modi is 70 years old") + "\"");
        System.out.println("The Clean String of \"India's 2nd wave was caused by the new Covid 19 Variants\" is \"" + StringUtil.cleanString("India's 2nd wave was caused by the new Covid 19 Variants") + "\"");
        System.out.println("The Clean String of \"Al Gore & Tipper Gore were the 2nd family of the United States from 1993-2001\" is \"" + StringUtil.cleanString("Al Gore & Tipper Gore were the 2nd family of the United States from 1993-2001") + "\"");
        System.out.println("The Clean String of \"#56 is my lucky number\" is \"" + StringUtil.cleanString("#56 is my lucky number") + "\"");
        System.out.println("The Clean String of \"3^2 equals(=) 9(nine)\" is \"" + StringUtil.cleanString("3^2 equals(=) 9(nine)") + "\"");
        System.out.println("The Clean String of \"Code Red!\" is \"" + StringUtil.cleanString("Code Red!") + "\"");
        System.out.println("The Clean String of \"Recursion Formula = n * myFactorial(n - 1)\" is \"" + StringUtil.cleanString("Recursion Formula = n * myFactorial(n - 1)") + "\"");
        System.out.println("The Clean String of \"At least is greater than or equal( >= )\" is \"" + StringUtil.cleanString("At least is greater than or equal( >= )") + "\"");
        System.out.println("The Clean String of \"Marge, let dam dogs in. Am on satire! Vow I am Cain. Am on spot. Am a Jap sniper. Red, raw murder on GI. Ignore drum. (Warner rips pajama tops.) No maniac, Ma! Iwo veritas: no man is God - Mad telegram.\" is \"" + StringUtil.cleanString("Marge, let dam dogs in. Am on satire! Vow I am Cain. Am on spot. Am a Jap sniper. Red, raw murder on GI. Ignore drum. (Warner rips pajama tops.) No maniac, Ma! Iwo veritas: no man is God - Mad telegram.") + "\"");
        System.out.println("The Clean String of \"Covid-19 Vaccines are Safe and Effective & Pfizer is the #1 vaccine\" is \"" + StringUtil.cleanString("Covid-19 Vaccines are Safe and Effective & Pfizer is the #1 vaccine") + "\"");
        System.out.println();
        System.out.println();
        System.out.println(); */
        
        /*System.out.println("Vowel Position tests:");
        System.out.println("The Vowel Position of \"Abacus\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "Abacus") + "\"");
        System.out.println("The Vowel Position of \"Why are there tests?\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "Why are there tests?") + "\"");
        System.out.println("The Vowel Position of \"Water Polo\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "Water Polo") + "\"");
        System.out.println("The Vowel Position of \"Candy Canes\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "Candy Canes") + "\"");
        System.out.println("The Vowel Position of \"Crayon\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "Crayon") + "\"");
        System.out.println("The Vowel Position of \"Trout Species of Fish\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "Trout Species of Fish") + "\"");
        System.out.println("The Vowel Position of \"SpaceX\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "SpaceX") + "\"");
        System.out.println("The Vowel Position of \"There are two\", if start position is \"0\" is \"" + StringUtil.vowelPosition(0, "There are two") + "\"");
        System.out.println("The Vowel Position of \"The Rise of Skywalker\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "The Rise of Skywalker") + "\"");
        System.out.println("The Vowel Position of \"Odisha\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "Odisha") + "\"");
        System.out.println("The Vowel Position of \"Krypton\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "Krypton") + "\"");
        System.out.println("The Vowel Position of \"Ryloth\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "Ryloth") + "\"");
        System.out.println("The Vowel Position of \"Kyrgyzstan\", if start position is \"0\" is \""  + StringUtil.vowelPosition(0, "Kyrgyzstan") + "\"");
        System.out.println("The Vowel Position of \"Crypt\", if start position is \"0\"  is \"" + StringUtil.vowelPosition(0, "Crypt") + "\"");
        System.out.println("The Vowel Position of \"Where is the football?\", if start position is \"0\" is \"" + StringUtil.vowelPosition(0,"Where is the football?") + "\"");
        System.out.println("The Vowel Position of \"Arana\", if start position is \"1\" \" is \"" + StringUtil.vowelPosition(1, "Arana") + "\"");
        System.out.println("The Vowel Position of \"Here is the two kids\", if start position is \"1\" is \"" + StringUtil.vowelPosition(1, "Here is the two kids") + "\"");
        System.out.println("The Vowel Position of \"Crypt\", if start position is \"1\" is " + StringUtil.vowelPosition(1, "dryly") + "\"");
        System.out.println("The Vowel Position of \"it is the tape recorder?\", if start position is \"2\" is \"" + StringUtil.vowelPosition(2,"it is the tape recorder?") + "\"");
        System.out.println("The Vowel Position of \"She is here?\", if start position is \"3\" is \"" + StringUtil.vowelPosition(3,"She is here") + "\"");
        System.out.println("The Vowel Position of \"Harris is the vice president \", if start position is \"4\" is \"" + StringUtil.vowelPosition(4,"Harris is the vice president") + "\"");
        System.out.println("The Vowel Position of \"Donde esta la leche \", if start position is \"5\" is \"" + StringUtil.vowelPosition(5,"Donde esta la leche") + "\"");
        System.out.println("The Vowel Position of \"Rhythm \", if start position is \"4\" is \"" + StringUtil.vowelPosition(5,"Rhythm") + "\"");
        System.out.println("The Vowel Position of \"Newsom imposed a vaccine mandate \", if start position is \"5\" is \"" + StringUtil.vowelPosition(5,"Newsom imposed a vaccine mandate") + "\"");
        System.out.println("The Vowel Position of \"Desantis banned a vaccine mandate \", if start position is \"7\" is \"" + StringUtil.vowelPosition(7,"Desantis banned a vaccine mandate") + "\"");
        System.out.println("The Vowel Position of \"Trump urged people to take the vaccine \", if start position is \"12\" is \"" + StringUtil.vowelPosition(12,"Trump urged people to take the vaccine") + "\"");

        System.out.println();
        System.out.println();
        System.out.println(); */

     /*   System.out.println("Is Vowel tests:");
        System.out.println("If \'a\' is a vowel, it is \"" + StringUtil.isVowel('a') + "\"");
        System.out.println("If \'A\' is a vowel, it is \"" + StringUtil.isVowel('A') + "\"");
        System.out.println("If \'e\' is a vowel, it is \"" + StringUtil.isVowel('e') + "\"");
        System.out.println("If \'E\' is a vowel, it is \"" + StringUtil.isVowel('E') + "\"");
        System.out.println("If \'i\' is a vowel, it is \"" + StringUtil.isVowel('i') + "\"");
        System.out.println("If \'I\' is a vowel, it is \"" + StringUtil.isVowel('I') + "\"");
        System.out.println("If \'o\' is a vowel, it is \"" + StringUtil.isVowel('o') + "\"");
        System.out.println("If \'O\' is a vowel, it is \"" + StringUtil.isVowel('O') + "\"");
        System.out.println("If \'u\' is a vowel, it is \"" + StringUtil.isVowel('u') + "\"");
        System.out.println("If \'U\' is a vowel, it is \"" + StringUtil.isVowel('U') + "\"");
        System.out.println("If \'b\' is a vowel, it is \"" + StringUtil.isVowel('b') + "\"");
        System.out.println("If \'C\' is a vowel, it is \"" + StringUtil.isVowel('C') + "\"");
        System.out.println("If \'d\' is a vowel, it is \"" + StringUtil.isVowel('d') + "\"");
        System.out.println("If \'2\' is a vowel, it is \"" + StringUtil.isVowel('2') + "\"");
        System.out.println("If \'F\' is a vowel, it is \"" + StringUtil.isVowel('F') + "\"");
        System.out.println("If \'g\' is a vowel, it is \"" + StringUtil.isVowel('g') + "\"");
        System.out.println("If \'H\' is a vowel, it is \"" + StringUtil.isVowel('H') + "\"");
        System.out.println("If \'3\' is a vowel, it is \"" + StringUtil.isVowel('3') + "\"");
        System.out.println("If \'j\' is a vowel, it is \"" + StringUtil.isVowel('j') + "\"");
        System.out.println("If \'K\' is a vowel, it is \"" + StringUtil.isVowel('K') + "\"");
        System.out.println();
        System.out.println();
        System.out.println(); */

     /*   System.out.println("Clean String Pig Latin tests:");
        System.out.println("The Clean String Pig Latin of \"Hello there\" is \"" + StringUtil.cleanStringPigLatin("Hello there") + "\"");
        System.out.println("The Clean String Pig Latin of \"Who let the dog out\" is \"" + StringUtil.cleanStringPigLatin("Who let the dog out") + "\"");
        System.out.println("The Clean String Pig Latin of \"Head over heals\" is \"" + StringUtil.cleanStringPigLatin("Head over heals") + "\"");
        System.out.println("The Clean String Pig Latin of \"Where is the key(entrance)?\" is \"" + StringUtil.cleanStringPigLatin("Where is the key(entrance)?") + "\"");
        System.out.println("The Clean String Pig Latin of \"There are 12 snakes in Mike's breeding home\" is \"" + StringUtil.cleanStringPigLatin("There are 12 snakes in Mike's breeding home") + "\"");
        System.out.println("The Clean String Pig Latin of \"20% of the grade is the Final Exam,\" is \"" + StringUtil.cleanStringPigLatin("20% of the grade is the Final Exam,") + "\"");
        System.out.println("The Clean String Pig Latin of \"Boris Johnson is the Prime Minister of the United Kingdom\" is \"" + StringUtil.cleanStringPigLatin("Boris John is the Prime Minister of the United Kingdom") + "\"");
        System.out.println("The Clean String Pig Latin of \"The UK is made up of 4 countries:England, Scottland, Wales, and Northern Ireland\" is \"" + StringUtil.cleanStringPigLatin("The UK is made up of 4 countries:England, Scottland, Wales, and Northern Ireland") + "\"");
        System.out.println("The Clean String Pig Latin of \"Artifical Inteligence is used in Robots\" is \"" + StringUtil.cleanStringPigLatin("Artifical Inteligence is used in Robots") + "\"");
        System.out.println("The Clean String Pig Latin of \"Yorba Linda's population is 67,725(2019)\" is \"" + StringUtil.cleanStringPigLatin("Yorba Linda's population is 67,725(2019)") + "\"");
        System.out.println("The Clean String Pig Latin of \"Robin, Batgirl, Nightwing, and Red Hood are the 4 main characters in the Gotham Knights\" is \"" + StringUtil.cleanStringPigLatin("Robin, Batgirl, Nightwing, and Red Hood are the 4 main characters in the Gotham Knights") + "\"");
        System.out.println("The Clean String Pig Latin of \"N * (N -1)\" is \"" + StringUtil.cleanStringPigLatin("N * (N -1)") + "\"");
        System.out.println("The Clean String Pig Latin of \"F^!s2#g$*j-+K?4Y{}[ry]`~Es|\fBI\" is \"" + StringUtil.cleanStringPigLatin("F^!s2#g$*j-+K?4Y{}[ry]`~Es|\fBI") + "\"");
        System.out.println("The Clean String Pig Latin of \"The surfside collaped took the lives of 99 people\" is \"" + StringUtil.cleanStringPigLatin("The surfside collaped took the lives of 99 people") + "\"");
        System.out.println("The Clean String Pig Latin of \"My religious group and I gathered to commiserate the indian family who lost their lives in the collapse in Surfiside, Florida.\" is \"" + StringUtil.cleanStringPigLatin("My religious group and I gathered to commiserate the indian family who lost their lives in the collapse in Surfiside, Florida.") + "\"");
        System.out.println();
        System.out.println();
        System.out.println();*/

            

    }
}





/*
RUN OUTPUT:
Reverse tests:
The Reverse of "Former Vice President Joe Biden is elected the 46th US President" is "tnediserP SU ht64 eht detcele si nediB eoJ tnediserP eciV remroF"
The Reverse of "Hello" is "olleH"
The Reverse of "50 US States" is "setatS SU 05"
The Reverse of "150 lbs" is "sbl 051"
The Reverse of "India is projected to be the most populous country by 2050" is "0502 yb yrtnuoc suolupop tsom eht eb ot detcejorp si aidnI"
The Reverse of "India's real covid numbers are much higher than the reported number and have the most suspected covid 19 cases in the world" is "dlrow eht ni sesac 91 divoc detcepsus tsom eht evah dna rebmun detroper eht naht rehgih hcum era srebmun divoc laer s'aidnI"
The Reverse of "The US Afghanisthan War ended on August 30, 2021" is "1202 ,03 tsuguA no dedne raW nahtsinahgfA SU ehT"
The Reverse of "YLHS opened in 2009" is "9002 ni denepo SHLY"
The Reverse of "Marge, let dam dogs in. Am on satire! Vow I am Cain. Am on spot. Am a Jap sniper. Red, raw murder on GI. Ignore drum. (Warner rips pajama tops.) No maniac, Ma! Iwo veritas: no man is God - Mad telegram." is ".margelet daM - doG si nam on :satirev owI !aM ,cainam oN ).spot amajap spir renraW( .murd erongI .IG no redrum war ,deR .repins paJ a mA .tops no mA .niaC ma I woV !eritas no mA .ni sgod mad tel ,egraM"
The Reverse of "Donald Trump was the first non-politician to be president" is "tnediserp eb ot naicitilop-non tsrif eht saw pmurT dlanoD"
The Reverse of "Avatar was the highest grossing film of all time" is "emit lla fo mlif gnissorg tsehgih eht saw ratavA"
The Reverse of "There are over 330 Million People living in the United States" is "setatS detinU eht ni gnivil elpoeP noilliM 033 revo era erehT"
The Reverse of "1680 kids attend YLHS" is "SHLY dnetta sdik 0861"
The Reverse of "Has there been a president that served more than two terms?" is "?smret owt naht erom devres taht tnediserp a neeb ereht saH"
The Reverse of "Franklin Delano Roosevelt served 3 full terms and 1 very short term before he did died from 1933-1945" is "5491-3391 morf deid did eh erofeb mret trohs yrev 1 dna smret lluf 3 devres tlevesooR onaleD nilknarF"
The Reverse of " Vice President Harry S Truman assumed the presidency after FDR died and led the us in World War 2 " is " 2 raW dlroW ni su eht del dna deid RDF retfa ycnediserp eht demussa namurT S yrraH tnediserP eciV "



Palindrome tests:
If there is a Palindrome for "radar" then it is "true"
If there is a Palindrome for "J" then it is "true"
If there is a Palindrome for "Lewd did I live, & evil I did dwel." then it is "true"
If there is a Palindrome for "I like Java!" then it is "false"
If there is a Palindrome for "Straw? No, too stupid a fad, I put soot on warts." then it is "true"
If there is a Palindrome for "Are we not pure? No sir, Panama's moody Noriega brags. It is garbage! Irony dooms a man; a prisoner up to new era." then it is "true"
If there is a Palindrome for "Irony dooms a man; a prisoner up to new era." then it is "false"
If there is a Palindrome for "Able was I, ere I saw Elba." then it is "true"
If there is a Palindrome for "Mr. Owl ate my metal worm" then it is "true"
If there is a Palindrome for "No, Mel Gibson is a casino?s big lemon" then it is "true"
If there is a Palindrome for "A Santa spit taboo bat tips at NASA." then it is "true"
If there is a Palindrome for "Egad, a base tone denotes a bad age." then it is "true"
If there is a Palindrome for is "KC, answer DNA loop award. Emit time. Draw a pool. Andrew, snack." then it is "true"
If there is a Palindrome for "We're in a pandemic" then it is "false"
If there is a Palindrome for "A but of stressed desserts fo' tuba." then it is "true"
If there is a Palindrome for "A Fool, A Tool, A Pool; LOOPALOOTALOOFA!" then it is "true"
If there is a Palindrome for "What are those!" then it is "false"
If there is a Palindrome for "I have concluded it has closed" then it is "false"
If there is a Palindrome for "There's a disturbance in the force!" then it is "false"
If there is a Palindrome for "Lid of fade, metallic soot, emit Garret-simple, help mister ragtime to oscillate me, daffodil.." then it is "true"
If there is a Palindrome for "There's a disturbance in the force!" then it is "false"
If there is a Palindrome for "A man, a plan, a canal - Panama!" then it is "true"
If there is a Palindrome for "T. Eliot, top bard, notes putrid tang emanating, is sad, I'd assign it a name: gnat dirt upset on drab pot toilet." then it is "true"
If there is a Palindrome for "Was raw tap ale not a reviver at one lap at Warsaw?" then it is "true"
If there is a Palindrome for "tattarrattat" then it is "true"
If there is a Palindrome for "Eva, can I see bees in a cave?" then it is "true"
If there is a Palindrome for "Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, and Ellen sinned." then it is "true"
If there is a Palindrome for "Miry rim So many daffodils Delia wailed slid off a dynamo?s miry rim" then it is "true"
If there is a Palindrome for "Do good? I? No. Evil anon I deliver. I maim nine more hero-men in Saginaw, sanitary sword a-tuck, Carol, I. Lo! Rack, cut a drowsy rat in Aswan. I gas nine more hero-men in Miami. Reviled, I (Nona) live on. I do, O God." then it is "true"
If there is a Palindrome for "A relic Odin I?m a mini docile Ra" then it is "true"
If there is a Palindrome for "Bombard a drab mob" then it is "true"
If there is a Palindrome for "Campus motto: Bottoms up Mac" then it is "true"
If there is a Palindrome for "Delia and Edna ailed" then it is "true"
If there is a Palindrome for "Embargos are macabre Sad Nell listen O not to no nets I?ll lend a Serb a camera so grab me" then it is "true"
If there is a Palindrome for "Feeble el beef" then it is "true"
If there is a Palindrome for "Zeus was deified saw Suez" then it is "true"
If there is a Palindrome for "Young Ada had a gnu Oy!" then it is "true"
If there is a Palindrome for "Wontons? Not now" then it is "true"
If there is a Palindrome for "Vote to not slip up refer pupils to note TOV" then it is "true"
If there is a Palindrome for "Madam, I'm Adam" then it is "true"
If there is a Palindrome for "A man, a plan, a canal: Panama" then it is "true"
If there is a Palindrome for "test" then it is "false"
If there is a Palindrome for "Jack Sparrow" then it is "false"
If there is a Palindrome for "Recursion is a method that repeats itself inside a method" then it is "false"
If there is a Palindrome for "Setter methods are mutator methods" then it is "false"
If there is a Palindrome for "Unremarkable was I ere I saw Elba Kramer nu?" then it is "true"



Pig Latin tests:
The Pig Latin of "Hello World" is "ellohay orldway "
The Pig Latin of "Eat it" is "eatyay ityay "
The Pig Latin of "Smell" is "ellsmay "
The Pig Latin of "Don't run in the blacktop" is "ontday unray inyay ethay acktopblay "
The Pig Latin of "Ice Cream" is "iceyay eamcray "
The Pig Latin of "I am almost six feet tall" is "iyay amyay almostyay ixsay eetfay alltay "
The Pig Latin of "Elon Musk own SpaceX" is "elonyay uskmay ownsyay acexspay "
The Pig Latin of "Rhythm" is "rhythmay "
The Pig Latin of "Crypt" is "cryptay "
The Pig Latin of "Stestanko" is "estankostay "
The Pig Latin of "Kamala Harris is the first female vice president" is "amalakay arrishay isyay ethay irstfay emalefay icevay esidentpray "
The Pig Latin of "Yorba Linda High School Resource Officer is Nick Doty" is "orbayay indalay ighhay oolschay esourceray officeryay isyay icknay otyday "
The Pig Latin of "Google, Apple, and Microsoft are companies that computer science graduates work at" is "ooglegay appleyay andyay icrosoftmay areyay ompaniescay atthay omputercay iencescay aduatesgray orkway atyay "
The Pig Latin of "The Marvel Cinematic Universe is owned by Disney" is "ethay arvelmay inematiccay universeyay isyay ownedyay byay isneyday "
The Pig Latin of "George Lucas sold Star Wars to Disney" is "eorgegay ucaslay oldsay arstay arsway otay isneyday "
The Pig Latin of "I have travelled to eight different states in India, which are Gurjrat, Rajasthan, Uttar Pradesh, Maharastra, Karnataka, Madya Prdadesh, Telegana, and West Bengal" is "iyay avehay avelledtray otay eightyay ifferentday atesstay inyay indiayay ichwhay areyay urjratgay ajasthanray uttaryay adeshpray aharastramay arnatakakay adyamay adeshprday eleganatay andyay estway engalbay "    
The Pig Latin of "Spy kids" is "spyay idskay "
The Pig Latin of "Shh" is "shhay "
The Pig Latin of "Lynch" is "lynchay "
The Pig Latin of "Lymph nodes" is "lymphay odesnay "
The Pig Latin of "Gym Shark" is "gymay arkshay "
The Pig Latin of "Shark Tank" is "arkshay anktay "
The Pig Latin of "Hasta la vista baby" is "astahay alay istavay abybay "
The Pig Latin of "All American Adults will be elligible for the vaccine no later than May 1st" is "allyay americanyay adultsyay illway ebay elligibleyay orfay ethay accinevay onay aterlay anthay aymay stay "
The Pig Latin of "Pig Latin" is "igpay atinlay "
The Pig Latin of "yellow" is "ellowyay "
The Pig Latin of "ocean" is "oceanyay "
The Pig Latin of "food" is "oodfay "
The Pig Latin of "island" is "islandyay "
The Pig Latin of "eunoia" is "eunoiayay "



Shorthand tests:
The Shorthand of "handy" is "h&y"
The Shorthand of "entry" is "ntry"
The Shorthand of "to be or not to be" is "2 b r nt 2 b"
The Shorthand of "You are smart" is "U r smrt"
The Shorthand of "Between" is "btwn"
The Shorthand of "What about you" is "wht bt U"
The Shorthand of "For the Resistance" is "4 th rsstnc"
The Shorthand of " i want " is " I wnt"
The Shorthand of "I want" is " wnt"
The Shorthand of "Useful" is "sfl"
The Shorthand of "Jim and i both started a coding club" is "jm & I bth strtd  cdng clb"
The Shorthand of "Andy" is "&y"
The Shorthand of "A" is ""
The Shorthand of "The End" is "th nd"
The Shorthand of "You are unassailable" is "U r nsslbl"
The Shorthand of "You are smart" is "U r smrt"
The Shorthand of "Who threw that paper? I did!" is "wh thrw tht ppr? I dd!"
The Shorthand of "Who do I send it to?" is "wh d I snd t 2?"
The Shorthand of "Who is this for?" is "wh s ths 4?"
The Shorthand of "Congratulations you are promoted" is "cngrtltns U r prmtd"
The Shorthand of "Magnesium" is "mgnsm"
The Shorthand of "Magnet" is "mgnt"
The Shorthand of "Projection" is "prjctn"
The Shorthand of "Rejection" is "rjctn"
The Shorthand of "Mark Martinez" is "mrk mrtnz"



Clean String tests:
The Clean String of "Hello" is "hello"
The Clean String of "There are 9 laps" is "therearelaps"
The Clean String of "Hello, my name is" is "hellomynameis"
The Clean String of "Where is the key?" is "whereisthekey"
The Clean String of "There are 50 bass, 30 cat fish, 60 trout, and 200 blue gills at East Lake Village" is "therearebasscatfishtroutandbluegillsateastlakevillage"
The Clean String of "20% of the School is a freshman, 25% of the School is a sophomore, 25% of the School is a junior, and 30% of the School is a senior" is "oftheschoolisafreshmanoftheschoolissophomoreoftheschoolisajuniorandoftheschoolisasenior"
The Clean String of "Prime Minister Narendra Modi is 70 years old" is "primeministernarendramodiisyearsold"
The Clean String of "India's 2nd wave was caused by the new Covid 19 Variants" is "indiasndwavewascausedbythenewcovidvariants"       
The Clean String of "Al Gore & Tipper Gore were the 2nd family of the United States from 1993-2001" is "algoretippergorewerethendfamilyoftheunitedstatesfrom"
The Clean String of "#56 is my lucky number" is "ismyluckynumber"
The Clean String of "3^2 equals(=) 9(nine)" is "equalsnine"
The Clean String of "Code Red!" is "codered"
The Clean String of "Recursion Formula = n * myFactorial(n - 1)" is "recursionformulanmyfactorialn"
The Clean String of "At least is greater than or equal( >= )" is "atleastisgreaterthanorequal"
The Clean String of "Marge, let dam dogs in. Am on satire! Vow I am Cain. Am on spot. Am a Jap sniper. Red, raw murder on GI. Ignore drum. (Warner rips pajama tops.) No maniac, Ma! Iwo veritas: no man is God - Mad telegram." is "margeletdamdogsinamonsatirevowiamcainamonspotamajapsniperredrawmurderongiignoredrumwarnerripspajamatopsnomaniacmaiwoveritasnomanisgodmadtelegram"
The Clean String of "Covid-19 Vaccines are Safe and Effective & Pfizer is the #1 vaccine" is "covidvaccinesaresafeandeffectivepfizeristhevaccine"



Vowel Position tests:
The Vowel Position of "Abacus", if start position is "0" is "0"
The Vowel Position of "Why are there tests?", if start position is "0" is "4"
The Vowel Position of "Water Polo", if start position is "0" is "1"
The Vowel Position of "Candy Canes", if start position is "0" is "1"
The Vowel Position of "Crayon", if start position is "0" is "2"
The Vowel Position of "Trout Species of Fish", if start position is "0" is "2"
The Vowel Position of "SpaceX", if start position is "0" is "2"
The Vowel Position of "There are two", if start position is "0" is "2"
The Vowel Position of "The Rise of Skywalker", if start position is "0" is "2"
The Vowel Position of "Odisha", if start position is "0" is "0"
The Vowel Position of "Krypton", if start position is "0" is "5"
The Vowel Position of "Ryloth", if start position is "0" is "3"
The Vowel Position of "Kyrgyzstan", if start position is "0" is "8"
The Vowel Position of "Crypt", if start position is "0"  is "-1"
The Vowel Position of "Where is the football?", if start position is "0" is "2"
The Vowel Position of "Arana", if start position is "1" " is "2"
The Vowel Position of "Here is the two kids", if start position is "1" is "1"
The Vowel Position of "Crypt", if start position is "1" is -1"
The Vowel Position of "it is the tape recorder?", if start position is "2" is "3"
The Vowel Position of "She is here?", if start position is "3" is "4"
The Vowel Position of "Harris is the vice president ", if start position is "4" is "4"
The Vowel Position of "Donde esta la leche ", if start position is "5" is "6"
The Vowel Position of "Rhythm ", if start position is "4" is "-1"



Is Vowel tests:
If 'a' is a vowel, it is "true"
If 'A' is a vowel, it is "true"
If 'e' is a vowel, it is "true"
If 'E' is a vowel, it is "true"
If 'i' is a vowel, it is "true"
If 'I' is a vowel, it is "true"
If 'o' is a vowel, it is "true"
If 'O' is a vowel, it is "true"
If 'u' is a vowel, it is "true"
If 'U' is a vowel, it is "true"
If 'b' is a vowel, it is "false"
If 'C' is a vowel, it is "false"
If 'd' is a vowel, it is "false"
If '2' is a vowel, it is "false"
If 'F' is a vowel, it is "false"
If 'g' is a vowel, it is "false"
If 'H' is a vowel, it is "false"
If '3' is a vowel, it is "false"
If 'j' is a vowel, it is "false"
If 'K' is a vowel, it is "false"



Clean String Pig Latin tests:
The Clean String Pig Latin of "Hello there" is "hello there"
The Clean String Pig Latin of "Who let the dog out" is "who let the dog out"
The Clean String Pig Latin of "Head over heals" is "head over heals"
The Clean String Pig Latin of "Where is the key(entrance)?" is "where is the keyentrance"
The Clean String Pig Latin of "There are 12 snakes in Mike's breeding home" is "there are  snakes in mikes breeding home"
The Clean String Pig Latin of "20% of the grade is the Final Exam," is " of the grade is the final exam"
The Clean String Pig Latin of "Boris Johnson is the Prime Minister of the United Kingdom" is "boris john is the prime minister of the united kingdom"
The Clean String Pig Latin of "The UK is made up of 4 countries:England, Scottland, Wales, and Northern Ireland" is "the uk is made up of  countriesengland scottland wales and northern ireland"
The Clean String Pig Latin of "Artifical Inteligence is used in Robots" is "artifical inteligence is used in robots"
The Clean String Pig Latin of "Yorba Linda's population is 67,725(2019)" is "yorba lindas population is "
The Clean String Pig Latin of "Robin, Batgirl, Nightwing, and Red Hood are the 4 main characters in the Gotham Knights" is "robin batgirl nightwing and red hood are the  main characters in the gotham knights"
The Clean String Pig Latin of "N * (N -1)" is "n  n "
The Clean String Pig Latin of "F^!s2#g$*j-+K?4Y{}[ry]`~Es|♀BI" is "fsgjkyryesbi"
The Clean String Pig Latin of "The surfside collaped took the lives of 99 people" is "the surfside collaped took the lives of  people"
The Clean String Pig Latin of "My religious group and I gathered to commiserate the indian family who lost their lives in the collapse in Surfiside, Florida." is "my religious group and i gathered to commiserate the indian family who lost their lives in the collapse in surfiside florida"

*/