class Rekening {
    constructor(nr) {
        this.nr = nr;
        this.rekeningType = "standaard";
    }
}

let r = new Rekening(123);

console.log(r.rekeningType);