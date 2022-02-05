package nl.hu.oop.werkboek.week3.les2;

import java.util.ArrayList;

public class FacebookAccount {
    private final String naam;
    private ArrayList<Vriend> vrienden = new ArrayList<>();

    public FacebookAccount(String naam) {
        this.naam = naam;
    }

    public void voegVriendToe(Vriend vriend) {
        if (!this.vrienden.contains(vriend)) {
            this.vrienden.add(vriend);
        }
    }

    public int aantalVrienden() {
        return this.vrienden.size();
    }

    public boolean isVriendMet(Vriend vriend) {
        return this.vrienden.contains(vriend);
    }

    public boolean verwijderVriend(Vriend vriend) {
        return this.vrienden.remove(vriend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("%s heeft %d vrienden", this.naam, this.vrienden.size()));
        for(Vriend v: this.vrienden){
            sb.append("\n");
            sb.append(v.toString());
        }
        return sb.toString();
    }
}
