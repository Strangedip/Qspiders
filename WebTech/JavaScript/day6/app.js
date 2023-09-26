// ar.filter( func() ) - here func() returntype is boolean to check condtion and filter the element
let ar = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];
let evenAr = ar.filter(val => val % 2 == 0);
console.log(ar);
console.log(evenAr);

// ar.map( func() ) -performs specific action on each element, func() return changed element (updated values in function)
let addTen = ar.map(val => val + 10);
console.log(addTen);

// ar.some( func() ) - returns true if any one element satisfies boolean func() condition
// ar.every( func() ) - returns true if All element satisfies boolean func() condition


// Reverse String in js (reverse char array and join)
let str = "Sandip Gupta";
let revStr = str.split("").reverse().join("");
console.log(str, revStr);


// sort( func() ) - sorting in js (if func return <0 first is smaller than second and sorts)
let arr = [2, 4, 5, 1, 2, 37, 7];
console.log(arr.sort()) // this will osrt based on string values (default)
console.log(arr.sort((a, b) => a - b)); // this will sort based on retuned value of func


// flat method in js used to convert multidimensional array into sinle dimension array
let mulAr = [1, 2, [1, 2, [3, 1, [3], 3], 4], 5];
console.log(mulAr.flat()); // will remove fisrt nested arr and merge 
console.log(mulAr.flat(3)); // will remove fisrt 3 nested arr and merge 