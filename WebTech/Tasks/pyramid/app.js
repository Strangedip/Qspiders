
function printPyramid1() {
    let a = document.getElementById('num').value;
    let ans = "";
    for (let i = 0; i <= Math.floor(a / 2) + 1; i++) {
        for (let j = 0; j < Math.floor(a / 2) + 1; j++) {
            ans += " ";
        }
        for (let j = 0; j < 2 * i - 1; j++) {
            ans += "* ";
        }
        for (let j = 0; j < Math.floor(a / 2) + 1; j++) {
            ans += " ";
        }
        ans += "<br>";
    }
    document.getElementById('ans').innerHTML = ans;
}

function printPyramid() {
    let a = document.getElementById('num').value;
    let ans = "";
    for (let i = 0; i < a; i++) {
        for (let j = 0; j < Math.floor(a / 2) + 1; j++) {
            ans += " ";
        }
        for (let j = 0; j <= a - (a - i); j++) {
            ans += "* ";
        }
        for (let j = 0; j < Math.floor(a / 2) + 1; j++) {
            ans += " ";
        }
        ans += "<br>";
    }
    document.getElementById('ans').innerHTML = ans;
}

