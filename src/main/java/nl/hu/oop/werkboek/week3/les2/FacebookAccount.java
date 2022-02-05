package nl.hu.oop.werkboek.week3.les2;

import java.util.ArrayList;

public class FacebookAccount {
    private final String naam;
    private ArrayList<Vriend> vrienden = new ArrayList<>();

    public FacebookAccount(String naam) {
        self.naam = naam;
    }

    public void voegVriendToe(Vriend vriend) {
        if (!self.vrienden.contains(vriend)) {
            self.vrienden.add(vriend);
        }
    }

    public int aantalVrienden() {
        return self.vrienden.size();
    }

    public boolean isVriendMet(Vriend vriend) {
        return self.vrienden.contains(vriend);
    }

    public boolean verwijderVriend(Vriend vriend) {
        return self.vrienden.remove(vriend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("%s heeft %d vrienden", self.naam, self.vrienden.size()));
        for(Vriend v: self.vrienden){
            sb.append("\n");
            sb.append(v.toString());
        }
        return sb.toString();
    }
}
