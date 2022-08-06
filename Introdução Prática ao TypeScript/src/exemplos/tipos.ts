type input = number | string;

function sumValues(input1: input, input2: input): input {
    if ([typeof input1, typeof input2].includes("string")) {
        return (input1 as string) + (input2 as string);
    } else {
        return (input1 as number) + (input2 as number);
    }
}

console.log(sumValues(1, 5));
console.log(sumValues("Ola", ", tudo bem?"));
console.log(sumValues("Que dia é hoje? ", 5));
