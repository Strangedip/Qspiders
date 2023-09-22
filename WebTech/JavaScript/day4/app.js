// arrow function 
let fn1 = () => {
    console.log("arrow function called");
}
fn1();

// anonymouse function 
let fn2 = function () {
    console.log("anonymouse function called")
}
fn2();

// Higher order function -  it takes function as an argument
let fn3 = (fn1, fn2) => {
    console.log("inside higher order function")
    fn1();
    fn2();
}

fn3(fn1, fn2);
// callback function - the fucntion which is being passed as arguement eg.fn1 fn2 above

// Immediate invoke function expression - used to create and run the function once just after creating
(() => { console.log("IIFE created and called once") })();

// nested fucntion 
function f1() {
    console.log("f1 called");

    function f2() {
        console.log("f2 called");

        function f3() {
            console.log("f3 called");
        }

        return f3;
    }
    return f2;
}
var x = f1()()(); // function returns other functions body which is again called with () or we can call it inside body itsefl

