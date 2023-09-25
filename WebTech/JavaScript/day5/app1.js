// methods of array in javascript

// ar.push(...values) - will add elemtns at the end of the array (returns new length)
// ar.pop() - will remove last element of the array ( return removed element)

// ar.unshift(...values) - will add elemtns at the begining of the array (returns new length)
// ar.shift() - will remove first element of the array ( return removed element)

let arr = [1, 2, 3, 4, 5, 6];
arr.push(12, 14); // add at last of array return new length
console.log(arr);

arr.pop();  // remove last element and return it
console.log(arr);

arr.unshift(-1, 0);  // add at the start of the array return new length
console.log(arr);

arr.shift();  // remove first element and return it
console.log(arr);

