package nl.hu.prog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Opdracht23 {
    public static void main(String[] args) {
        // Deze opdracht is gewoon vervelend in Java:)

        // De tuple letters kan in willekeurige volgorde de letters A, B en C bevatten. Bijvoorbeeld:
        List<String> letters = new ArrayList<>(List.of("A", "C", "B", "B", "C", "A", "C", "C", "B"));

        // Neem deze tuple over, en schrijf code waarmee je een nieuwe lijst maakt met het aantal voorkomens van de letters in
        // alfabetische volgorde. Tuple letters bevat 2 keer ‘A’, 3 keer ‘B’ en 4 keer ‘C’.
        // De lijst die dit programma maakt (en print) is dan: [2, 3, 4].

        // In Python waren er handige truukjes-methodes. In Java moeten we gewoon rauw door de lijst ploegen.
        List<Integer> aantallenPerLetter = new ArrayList<>();

        // We sorteren de lijst, dan kunnen we van voor tot achteren er doorheen lopen, en een tellertje bijhouden.
        // Dit tellertje werkt alleen omdat we zeker weten dat we dezelfde letter niet later nog een keer tegenkomen,
        // juist omdat de lijst gesorteerd is.
        letters.sort(Comparator.naturalOrder());

        String huidigeLetter = letters.get(0); // We beginnen met de eerste letter.
        int voorkomens = 0; // Die hebben we dan nog 0 keer gezien
        for (String letter : letters) {
            if (huidigeLetter.equals(letter)) {
                voorkomens++; // Als we dezelfde letter tegenkomen, tsja dan komt ie nog een keer voor
            } else { // Maar als we een nieuwe tegenkomen...
                aantallenPerLetter.add(voorkomens); // Dan slaan we op hoevaak we de vorige letter uiteindelijk hebben gezien
                huidigeLetter = letter; // En veranderen we met welke letter we bezig zijn
                voorkomens = 1; // En die nieuwe letter zijn we dus al een keer tegengekomen, dus we starten op 1 ipv. 0
            }
        }
        aantallenPerLetter.add(voorkomens); // Niet vergeten toe te voegen hoe vaak we de laatste letter (C) hebben gezien

        System.out.println(aantallenPerLetter);
    }
}
