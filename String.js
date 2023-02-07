var firstNane = "Alan";
var lastName = "Turing";


var myStr = "I am a \"double quoted\" string\n inside \"double quotes\""; //use double quotes in a string

var myStr2 = '<a href="http://www.example.com" target="_blank">Link</a>';// use only single quote in a stirng


var myStr3 = `'<a href="http://www.example.com" target="_blank">Link</a>'`; //use double and single quotes in a string

/*
    \'single quote 
    \" double quote
    \\ backlash
    \n newline
    \r carriage return
    \t tab
    \b backspace
    \f form feed


*/
var ourStr = "I come first. " + "U come second.";
console.log(ourStr);



var thrStr = "I come first. ";
thrStr += "I come second. ";
console.log(thrStr);



var ourName = "freeCodeCamp";
var ourStr = "Hello, our name is " + ourName + ", how are you?";


var anAdjective = "awesome!";
var str = "freeCodeCamp is ";
str += anAdjective;

length = str.length; //.length returns number of characters

firstCharacter = str[0];

thirdCharacter = str[1];

lastCharacter = str[str.length];