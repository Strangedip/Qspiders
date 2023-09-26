
function printPrime() {
    let n = document.getElementById('num').value;
    let primes = [];
    for (let i = 2; i <= n; i++) {
        if (isPrime(i)) {
            primes.push(i);
        }
    }
    document.getElementById('ans').innerHTML = primes;
}
function isPrime(a) {
    for (let i = 2; i * i <= a; i++) {
        if (a%i==0) {
            return false
        }
    }
    return true;
}
