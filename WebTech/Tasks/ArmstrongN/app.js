
function isArmstrong() {
    let a = document.getElementById('num').value;
    let temp = a;
    let digit = getDigit(a);
    let sum = 0;
    while (a > 0) {
        let d = a % 10;
        sum += Math.pow(d, digit);
        a = Math.floor(a / 10);
    }
    if (sum == temp) {
        document.getElementById('ans').innerHTML = "Armstrong Number";
    } else {
        document.getElementById('ans').innerHTML = "Not an Armstrong Number";

    }
}
function getDigit(a) {
    return Math.floor(Math.log10(a)) + 1;
}
