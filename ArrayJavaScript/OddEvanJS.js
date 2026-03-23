let arr = [10, 15, 20, 25, 30, 33];

let evenCount = 0;
let oddCount = 0;

for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 === 0) {
        evenCount++;
    } else {
        oddCount++;
    }
}

console.log("Even count:", evenCount);
console.log("Odd count:", oddCount);