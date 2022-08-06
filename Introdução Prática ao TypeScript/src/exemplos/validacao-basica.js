let button = document.querySelector("#button");
let input = document.querySelector("#input");
let input2 = document.querySelector("#input2");

function sumNumbers(num1, num2) {
    return Number(num1) + Number(num2);
}

button.addEventListener("click", () =>
    console.log(sumNumbers(input.value, input2.value))
);
