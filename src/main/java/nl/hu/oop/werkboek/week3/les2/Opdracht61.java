package nl.hu.oop.werkboek.week3.les2;

public class Opdracht61 {
    public static void main(String[] args) {
        String s1 = "route" + 6 + 6;
        System.out.println(s1);
        String s2 = 6 + 6 + "route";
        System.out.println(s2);

        String s3 = "concert" + "piano";
        String s4 = "concertpiano";
        System.out.println(s3 == s4); //Strikvraag, waarom is dit toch true?
        System.out.println(s3.equals(s4));

        System.out.println("Als spaties niet meetellen zou " + "geenspaties".length() + " even lang zijn als " + "geen spaties".length());
        System.out.println("Boom komt voor roos, dus compareTo zegt iets kleiner dan 0: " + ("boom".compareTo("roos") < 0));

        System.out.println(Integer.parseInt("42"));
        System.out.println(Double.parseDouble("42.5"));
    }
}
