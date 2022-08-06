let anyValue2: any;
anyValue2 = 3;
anyValue2 = "ola";
anyValue2 = true;

let strValue: string = "teste";
strValue = anyValue2;

let unknownValue: unknown;
unknownValue = 3;
unknownValue = "ola";
unknownValue = true;
unknownValue = "agora vai";

let strValue2: string = "teste";
//strValue2 = unknownValue;

if (typeof unknownValue === "string") {
    strValue2 = unknownValue;
}

function throwError(error: string, code: number): never {
    throw { error: error, code: code };
}

throwError("Deu erro", 500);
