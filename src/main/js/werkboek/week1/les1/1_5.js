class Student {
    #name;
    #nummer;

    constructor(nm, nr = 0) {
        this.#name = nm;
        this.#nummer = nr;
    }

    get naam() {
        return this.#name;
    }

    get studentnr() {
        return this.#nummer;
    }

    set studentnr(nr) {
        this.#nummer = nr;
    }

    toString() {
        return "Deze student heet " + this.#name + " en heeft nummer " + this.#nummer;
    }
}

let st1 = new Student("Sylvester");

console.log("naam: " + st1.naam);
console.log("nummer: " + st1.studentnr);
st1.studentnr = 12345678;
console.log("toString: " + st1.toString());
console.log();

let st2 = new Student("Karel", 98765432);
console.log("naam: " + st2.naam);
console.log("nummer: " + st2.studentnr);
console.log("toString: " + st2.toString());
