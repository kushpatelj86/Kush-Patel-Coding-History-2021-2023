function pairElement(str) {
  let newArr = [];
  for(let i = 0; i < str.length;i++)
  {
    if(str[i] == "G")
    {
      newArr.push(["G","C"])
    }

    if(str[i] == "C")
    {
      newArr.push(["C","G"])
    }


    if(str[i] == "T")
    {
      newArr.push(["T","A"])
    }


    if(str[i] == "A")
    {
      newArr.push(["A","T"])
    }






  }
  return newArr;
}

pairElement("GCG");