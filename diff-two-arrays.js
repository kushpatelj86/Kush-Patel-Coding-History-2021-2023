function diffArray(arr1, arr2) {
  const newArr = [];




  function first(first, second) {
    // Looping through an array to find elements that don't exist in another array
    for (let i = 0; i < first.length; i++) {
      if (second.indexOf(first[i]) === -1) {
        // Pushing the elements unique to first to newArr
        newArr.push(first[i]);
      }
    }
  }

  first(arr1, arr2);
  first(arr2, arr1);


















  return newArr;
}

diffArray([1, 2, 3, 5], [1, 2, 3, 4, 5]);