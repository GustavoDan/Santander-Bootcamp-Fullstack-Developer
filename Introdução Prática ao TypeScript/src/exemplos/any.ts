let anyValue: any;
anyValue = 3;
anyValue = "ola";
anyValue = true;

let stringValue: string = "teste";
stringValue = anyValue;
let stringValue2: string = "teste";
stringValue2 = anyValue;

function sumStrings(str1: string, str2: string) {
    console.log(str1 + str2);
}

sumStrings(stringValue, stringValue2);
sumStrings("ola", ", como vai?");
