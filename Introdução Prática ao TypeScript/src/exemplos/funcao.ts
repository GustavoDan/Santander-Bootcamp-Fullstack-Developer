function sumNums(num1: number, num2: number): number {
    return num1 + num2;
}

console.log(sumNums(1, 5));

function printNums(num1: number, num2: number): void {
    console.log(num1 + num2);
}

printNums(6, 1);

function sumNumsWithCallback(
    num1: number,
    num2: number,
    callback: (num: number) => number
): number {
    let result = num1 + num2;

    return callback(result);
}

function square(num: number): number {
    return num ** 2;
}

function divideByItself(num: number): number {
    return num / num;
}

console.log(sumNumsWithCallback(2, 3, square));
console.log(sumNumsWithCallback(2, 3, divideByItself));
