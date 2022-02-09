package nl.hu.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Opdracht21 {
    public static void main(String[] args) {
        // We gaan een lijst bijhouden met je favoriete artiesten.
        // We gaan de lijst eerst creëren met 1 artiest en dan uitbreiden. Schrijf per stap een expressie om:
        // een nieuwe list met 1 artiest aan te maken met de naam favorieten.

        // Die extra nieuwe lijst is nodig, omdat je standaard geen nieuwe elementen toe mag voegen aan List.of...
        // Python: favorieten = ['The Postal Service']
        List<String> favorieten = new ArrayList<>(List.of("The Postal Service"));
        System.out.println("1: " + favorieten);
        // de lijst uit te breiden met een tweede artiest.

        // Python: favorieten.append('Little People')
        favorieten.add("Little People");
        System.out.println("2: " + favorieten);

        // de tweede artiest te vervangen door een andere naam.
        // Python: favorieten[1] = 'Yppah'
        favorieten.set(1, "Yppah");
        System.out.println("3: " + favorieten);

    }
}
