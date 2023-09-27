// for in loop - used to iterate over every index of array 
let ar = [10, 20, 20, 30, 40, 40, 50];
for (const i in ar) {
    console.log(i);
}

// for of loop - used to iterate over every value of the array
for (const val of ar) {
    console.log(val);
}

// ar.forEach( func(val,index,ar) ) - HOF used to iterate over array with every value and index
ar.forEach((val, ind, ar) => {
    console.log(ind, val);
});

// iterators for key value entries treating array as iterable
// keys
let keys = ar.keys();
for (const key of keys) {
    console.log(key);
}

//values
let values = ar.values();
for (const value of values) {
    console.log(value);
}

// entries
let entries = ar.entries();
for (const entry of entries) {
    console.log(entry);
}
