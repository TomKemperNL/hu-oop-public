const { Zwembad } = require('./zwembad')


let z1 = new Zwembad(2.0, 5.5, 1.5);
console.log("BREEDTE: " + z1.breedte);
console.log("LENGTE: " + z1.lengte);
console.log("DIEPTE: " + z1.diepte);
console.log("BEREKENDE INHOUD: " + z1.inhoud);
console.log();

let z2 = new Zwembad();
z2.breedte = 2.5;
z2.lengte = 100.0;
z2.diepte = 2.0;
let inh = z2.inhoud;
console.log("GEGEVENS ZWEMBAD: " + z2.toString());
console.log("BEREKENDE INHOUD: " + z2.inhoud);

