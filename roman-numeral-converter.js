function convertToRoman(num) {
 
 let str = num.toString();
  let newStr = "";

  if(str.length == 4)
  {
    switch(str[str.length - 4])
    {
      case '1':
        newStr += "M";
        break;
      case '2':
        newStr += "MM";
        break;

      case '3':
        newStr += "MMM";
        break;

    }
    switch(str[str.length - 3])
    {
      case '1':
        newStr += "C";
        break;

      case '2':
        newStr += "CC";
        break;

      case '3':
        newStr += "CCC";
        break;

      case '4':
        newStr += "CD";
        break;

      case '5':
        newStr += "D";
        break;

      case '6':
        newStr += "DC";
        break;

      case '7':
        newStr += "DCC";
        break;

      case '8':
        newStr += "DCCC";
        break;   

      case '9':
        newStr += "CM";
        break; 
    }
    
    switch(str[str.length - 2])
    {
      case '1':
        newStr += "X";
        break;

      case '2':
        newStr += "XX";
        break;

      case '3':
        newStr += "XXX";
        break;

      case '4':
        newStr += "XL";
        break;

      case '5':
        newStr += "L";
        break;

      case '6':
        newStr += "LX";
        break;

      case '7':
        newStr += "LXX";
        break;

      case '8':
        newStr += "LXXX";
        break;   

      case '9':
        newStr += "XC";
        break; 
    }

    switch(str[str.length - 1])
    {
      case '1':
        newStr += "I";
        break;

      case '2':
        newStr += "II";
        break;

      case '3':
        newStr += "III";
        break;

      case '4':
        newStr += "IV";
        break;

      case '5':
        newStr += "V";
        break;

      case '6':
        newStr += "VI";
        break;

      case '7':
        newStr += "VII";
        break;

      case '8':
        newStr += "VIII";
        break;   

      case '9':
        newStr += "IX";
        break; 
    }
 
  }
  
 else if(str.length == 3)
 {
     switch(str[str.length - 3])
    {
      case '1':
        newStr += "C";
        break;

      case '2':
        newStr += "CC";
        break;

      case '3':
        newStr += "CCC";
        break;

      case '4':
        newStr += "CD";
        break;

      case '5':
        newStr += "D";
        break;

      case '6':
        newStr += "DC";
        break;

      case '7':
        newStr += "DCC";
        break;

      case '8':
        newStr += "DCCC";
        break;   

      case '9':
        newStr += "CM";
        break; 
    }
    
    switch(str[str.length - 2])
    {
      case '1':
        newStr += "X";
        break;

      case '2':
        newStr += "XX";
        break;

      case '3':
        newStr += "XXX";
        break;

      case '4':
        newStr += "XL";
        break;

      case '5':
        newStr += "L";
        break;

      case '6':
        newStr += "LX";
        break;

      case '7':
        newStr += "LXX";
        break;

      case '8':
        newStr += "LXXX";
        break;   

      case '9':
        newStr += "XC";
        break; 
    }

    switch(str[str.length - 1])
    {
      case '1':
        newStr += "I";
        break;

      case '2':
        newStr += "II";
        break;

      case '3':
        newStr += "III";
        break;

      case '4':
        newStr += "IV";
        break;

      case '5':
        newStr += "V";
        break;

      case '6':
        newStr += "VI";
        break;

      case '7':
        newStr += "VII";
        break;

      case '8':
        newStr += "VIII";
        break;   

      case '9':
        newStr += "IX";
        break; 
    } 
 }
 
 else if(str.length == 2)
 {
    switch(str[str.length - 2])
    {
      case '1':
        newStr += "X";
        break;

      case '2':
        newStr += "XX";
        break;

      case '3':
        newStr += "XXX";
        break;

      case '4':
        newStr += "XL";
        break;

      case '5':
        newStr += "L";
        break;

      case '6':
        newStr += "LX";
        break;

      case '7':
        newStr += "LXX";
        break;

      case '8':
        newStr += "LXXX";
        break;   

      case '9':
        newStr += "XC";
        break; 
    }

    switch(str[str.length - 1])
    {
      case '1':
        newStr += "I";
        break;

      case '2':
        newStr += "II";
        break;

      case '3':
        newStr += "III";
        break;

      case '4':
        newStr += "IV";
        break;

      case '5':
        newStr += "V";
        break;

      case '6':
        newStr += "VI";
        break;

      case '7':
        newStr += "VII";
        break;

      case '8':
        newStr += "VIII";
        break;   

      case '9':
        newStr += "IX";
        break; 
    }
 }
 else if(str.length == 1)
 {
      switch(str[str.length - 1])
    {
      case '1':
        newStr += "I";
        break;

      case '2':
        newStr += "II";
        break;

      case '3':
        newStr += "III";
        break;

      case '4':
        newStr += "IV";
        break;

      case '5':
        newStr += "V";
        break;

      case '6':
        newStr += "VI";
        break;

      case '7':
        newStr += "VII";
        break;

      case '8':
        newStr += "VIII";
        break;   

      case '9':
        newStr += "IX";
        break; 
    }
 }
 
 return newStr;
}

convertToRoman(36);