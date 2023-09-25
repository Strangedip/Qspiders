// arr.slice(start, end) - returns subarray of the original array
// arr.splice(index, delCount, ...values) - to delete or replace a part of array returns original after removal

// arr.find( higher order function ) - returns first fucntion condition satisfying element returns the element
// here HOF takes 3 arguements HOF(value, startIndex, originalArray)
// arr.find( higher order function ) - returns first fucntion condition satisfying element returns the index of element
let arr = [1, 2, 3, 44, 5];
let a = arr.splice(2, 3, [1, 2, 3, 4]);
console.log();