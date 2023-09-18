// primitive in javascript 
//   string number boolean bigint
//   undefined(datatype undefined) NaN(datatype number) Null(datatype Object)

console.log(typeof "12");  //string
console.log(typeof 12);  //number (-2^53 to 2^53-1)
console.log(typeof true); //boolean
console.log(typeof 12n);  // bigInt
console.log(typeof undefined); // undefined
console.log(typeof null);  // Object
console.log(typeof 10 - "num");  // NaN

console.log(`sum of 20 and 33 is ${20 + 33}`); // backtick `` is used to print with values and expressions

//implicite typecasting
let a=10+"20"; //automatically converted into string and concatenated
console.log(a);

//explicite typecasting
let b= String(12)+"hello";  // explicitely converted 12 into string and concatenated
console.log(b);