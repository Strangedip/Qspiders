// * Variables in javascript
// var - (global scope), reinitialize, redeclare
// let - (script scope), reinitialize,
// const - (script scope), no reinitialize, no redeclare

var a= 10;
let b= 20;
const c=3.14;

a=20;
b=20;
// c=3; reinitialization not allowed

var a=20;
// let b=20; no redclaration allowed 
// const c=20; no redeclaration allowed

console.log(a,b,c);