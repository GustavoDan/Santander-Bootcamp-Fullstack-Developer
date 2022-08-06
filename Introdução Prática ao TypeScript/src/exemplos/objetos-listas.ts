const person = {
    name: "Mariana",
    age: 28,
    occupation: "desenvolvedora",
};

const andre: { name: string; age: number; occupation: string } = {
    name: "Andre",
    age: 25,
    occupation: "pintor",
};

const paula: { name: string; age: number; occupation: string } = {
    name: "Paula",
    age: 25,
    occupation: "Desenvolvedora",
};

enum Occupations {
    Professora,
    Atriz,
    Desenvolvedora,
    JogadoraDeFutebol,
}

interface Person {
    name: string;
    age: number;
    occupation?: Occupations;
}

interface Student extends Person {
    classes: string[];
}

const vanessa: Person = {
    name: "Vanessa",
    age: 23,
    occupation: Occupations.Desenvolvedora,
};

const maria: Person = {
    name: "Maria",
    age: 23,
    occupation: Occupations.Desenvolvedora,
};

const jessica: Student = {
    name: "Jessica",
    age: 28,
    occupation: Occupations.Desenvolvedora,
    classes: ["Matemática discreta", "Programação"],
};

const monica: Student = {
    name: "Monica",
    age: 28,
    classes: ["Matemática discreta", "Programação"],
};

function printList(list: string[]): void {
    for (const item of list) {
        console.log(`- ${item}`);
    }
}

printList(monica.classes);
