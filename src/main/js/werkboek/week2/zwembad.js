class Zwembad {
    constructor(breedte, lengte, diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    get inhoud() {
        return this.breedte * this.lengte * this.diepte;
    }

    toString() {
        return "Dit zwembad is " + this.breedte + " meter breed, " + this.lengte + " meter lang, en " + this.diepte + " meter diep";
    }
}

module.exports = {Zwembad}
