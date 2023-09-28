// creaing object is js 
// 1. litral way
let emp = {
    name: "Sandip Gupta",
    empId: 9987,
    salary: 10000,
    skills: ["java", "python", "js", "SQL"]
}
console.log(emp);

// adding key values in the object
emp.location = "thane";
console.log(emp);

// deleting key value pair
delete emp.empId;
console.log(emp);

//updating value
emp.salary = 20000;
emp["salary"] = 20000;
console.log(emp);

//fetching value
console.log(emp.name);
console.log(emp["salary"]);

// array of objects
let objCollection = [
    {
        key1: "value",
        key2: "value",
        key3: "value"
    },
    {
        key1: "value1",
        key2: "value1",
        key3: "value1"
    },
    {
        key1: "value2",
        key2: "value2",
        key3: "value2"
    }
]

objCollection.forEach(val => {
    console.log(val);
    console.log(val.key1, val.key2, val.key3);
})

// 2. using constructor function
function Student(id,name){
    // here this refers to the current object not window object
    this.id=id;
    this.name=name;
}

let s1= new Student(12,"Sandip");
let s2= new Student(11,"vibhakar");
console.log(s1,s2);

// 3. using Object Constructor
let obj= new Object();
obj.id=11;
obj.name="sandip";
console.log(obj);