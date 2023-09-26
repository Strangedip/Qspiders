function getNthFib() {
    let n = document.getElementById("num").value;
    let a = 0;
    let b = 1;
    while (n > 0) {
        let c = a + b;
        a = b;
        b = c;
        n--;
    }
    document.getElementById("ans").innerHTML = a;
}

function fact() {
    let n = document.getElementById("num").value;
    let a = 1;
    while (n > 0) {
        a=a*n;
        n--;
    }
    document.getElementById("ans").innerHTML = a;
}
