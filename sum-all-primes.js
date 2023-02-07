function sumPrimes(num) 
{
  //helper function
  function isPrime(num)
  {
    for(let i = 2; i <= Math.sqrt(num);i++)
    {
      if(num % i == 0)
      {
        return false;
      }
    }
    return true;
  }



  let result = 0;
  for (let i = 2; i <= num; i++) {
    if (isPrime(i))
      result += i;
  }
  return result;












  }




sumPrimes(10);