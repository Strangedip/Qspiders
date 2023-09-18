// printing statements in javascript
// console.log(), Document.write(), here console and document is the object
// log and write is functions present inside those object

console.log(12);
document.write(12);
document.writeln(13); //writeln gives extra space at the end of the statement
document.writeln(14);

alert("Error");
let string=prompt("enter String value"); // return type is string (can be parsed using parseInt(prompt()) )
let confirmation=confirm("Are your sure?"); // return type is boolean

document.writeln("<br/>"+string+confirmation);// use br tag to break statement to next line