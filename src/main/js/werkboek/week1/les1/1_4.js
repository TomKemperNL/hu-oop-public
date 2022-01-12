class Student {
    #name;

    constructor(nm) {
        this.#name = nm;
    }

    get naam() {
        return this.#name;
    }

    toString() {
        return "Deze student heet " + this.#name
    }
}

let st1 = new Student("Sylvester")
console.log("getter: " + st1.naam);
console.log("toString: " + st1.toString());
console.log("toString (impliciet): " + st1);

let st2 = new Student("Karel");


