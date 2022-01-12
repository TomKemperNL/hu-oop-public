class Student {
    constructor(nm){
        this.name = nm;
    }  // Javascript doet in principe niet moeilijk over public/private
}



let student1 = new Student("Jan")
let student2 = new Student("Wim")

console.log(student1)
console.log(student1.name)
console.log(student2)
console.log(student2.name)

// In Javascript ziet het er standaard al best aardig uit!
