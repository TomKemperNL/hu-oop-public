class Piloot {
    constructor(naam) {
        this.naam = naam;
        this.vlieguren = 0;
        this.salaris = 0;
    }

    verhoogVliegurenMet(uren) {
        this.vlieguren += uren;
    }

    toString() {
        return `${this.naam} heeft ${this.vlieguren} vlieguren gemaakt en verdient ${this.salaris.toFixed(2)}.`
    }
}

let p1 = new Piloot("John Travolta");
p1.salaris = 123456.78;
console.log("Zonder vlieguren: " + p1.toString());
p1.verhoogVliegurenMet(12);
console.log("Eerste piloot: " + p1);
console.log();
let p2 = new Piloot("Leonardo di Caprio");
p2.salaris = 5000.00;
p2.verhoogVliegurenMet(3);
console.log("Vlieguren van tweede piloot: " + p2.vlieguren);
console.log("Salaris van tweede piloot: " + p2.salaris);
console.log("Tweede piloot: " + p2);
