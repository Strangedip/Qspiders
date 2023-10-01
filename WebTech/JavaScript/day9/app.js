let emp = {
    id: 121,
    name: "sandip",
    sal: 120000
}
// Object.freez( obj ) to freez object it wont allow any modification, insertion or deletion
//Object.freeze(emp);
emp.dept = "development";  //wont allow
emp.id = 11111;             //wont allow
console.log(Object.isFrozen(emp)); // freez status true

// Object.seal( obj ) to seal object. it wont allow any insertion or deletion but allows modification
//Object.seal(emp);
emp.id = 112211; // allows

// get array of keys(string array), values, entries
let keys = Object.keys(emp);
let values = Object.values(emp);
let entries = Object.entries(emp);
console.log(keys, values, entries);

