package nl.hu.oop.werkboek.week1.les1.opdracht5;

public class Student {

    private String naam;
    private int studentnr;

    public Student(String nm) {
        naam = nm;
    }

    public Student(String nm, int nr) {
        naam = nm;
        studentnr = nr;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        return "Deze student heet " + naam + " en heeft nummer " + this.studentnr;
    }

    public int getStudentNummer() {
        return studentnr;
    }

    public void setStudentNummer(int nr) {
        studentnr = nr;
    }
}
