let button = document.querySelector("#button");
let input = document.querySelector("#input") as HTMLInputElement;
let input2 = document.querySelector("#input2") as HTMLInputElement;
let mustPrint = true;

function sumNumbers(num1: number, num2: number, mustPrint: boolean): number {
    let result = num1 + num2;

    if (mustPrint) {
        console.log(`The result is ${result}`);
    }

    return result;
}

button?.addEventListener("click", () =>
    sumNumbers(Number(input?.value), Number(input2?.value), mustPrint)
);
