// Arrays in javascript
// to create an array we have three way.

// 1. litral way
let ar = [1, 2, 3, 4, 5];
console.log(ar);

// 2. using new Array() constructor
// let ar1= new Array(10);          here 10 will act as length of array
// let ar1= new Array(10,20,30);    here 10,20,30 will act as elements of array
let ar1 = new Array();
ar1[0] = "s1";
ar1[1] = "s2";
ar1[2] = "s3";
console.log(ar1);

// 3. using Array.of() method
let ar2 = Array.of(10, 20, 10, 11, 20);
console.log(ar2);

// delete operator deletes the element and marks the index as empty
delete ar2[0];
console.log(ar2);

