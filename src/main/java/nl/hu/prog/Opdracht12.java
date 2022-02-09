package nl.hu.prog;

import java.util.*;
import java.util.stream.Collectors;

public class Opdracht12 {
    public static void main(String[] args) {
        // 1. Hoeveel letters zijn er in "Supercalifragilisticexpialidocious"?

        // Python: resultaat = len('Supercalifragilisticexpialidocious')
        int r1 = "Supercalifragilisticexpialidocious".length();
        System.out.println(r1);

        // 2. Komt in "Supercalifragilisticexpialidocious" de tekst "ice" voor?
        // Python: resultaat = 'ice' in 'Supercalifragilisticexpialidocious'
        boolean r2 = "Supercalifragilisticexpialidocious".contains("ice");
        System.out.println(r2);

        // 3. Is het woord "Antidisestablishmentarianism" langer dan "Honorificabilitudinitatibus"?
        // Python: resultaat = len('Antidisestablishmentarianism') > len('Honorificabilitudinitatibus')
        boolean r3 = "Antidisestablishmentarianism".length() > "Honorificabilitudinitatibus".length();
        System.out.println(r3);

        // Lijsten zijn in Java een stuk onhandiger om mee te werken, daarom komen ze in OOP wat later aan bod
        // Maar bij Python konden we ze al gelijk in les 1 gebruiken.

        // 4. Welke componist komt in alfabetische volgorde het eerst: "Berlioz", "Borodin", "Brian", "Bartok", "Bellini", "Buxtehude", "Bernstein"?
        // Python: componisten = ['Berlioz', 'Borodin', 'Brian', 'Bartok', 'Bellini', 'Buxtehude', 'Bernstein']
        List<String> componisten = List.of("Berlioz", "Borodin", "Brian", "Bartok", "Bellini", "Buxtehude", "Bernstein");

        // twee mogelijkheden:
        // A) Zonder de componisten-lijst aan te passen
        // Python: resultaat = sorted(componisten)

        //Kijk die Java eens gaan... wat een moeite:
        List<String> sortedComponisten = componisten.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedComponisten.get(0));

        // 5. Welke het laatst in het rijtje van vraag 4?
        // Python: resultaat = sorted(componisten, reverse = True)
        List<String> reverseSortedComponisten = componisten.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedComponisten.get(0));

        // B) Wel de componisten-lijst aan te passen
        // Python: componisten.sort()
        componisten.sort(Comparator.naturalOrder());
        System.out.println(componisten.get(0));

        // 5. Welke het laatst in het rijtje van vraag 4?
        // Python: componisten.sort(reverse = True)
        componisten.sort(Comparator.reverseOrder());
        System.out.println(componisten.get(0));
    }
}
