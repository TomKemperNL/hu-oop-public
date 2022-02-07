package nl.hu.ooad.week1.praxa1;

import java.util.ArrayList;

public class Winkel {
    private String plaats;
    private ArrayList<Voorraad> voorraad;

    public Winkel(String plaats) {
        this.plaats = plaats;
        this.voorraad = new ArrayList<>();
    }

    public String getPlaats() {
        return plaats;
    }

    public int getAantal(Product product) {
        for (Voorraad v : this.voorraad) {
            if (v.getProduct() == product) {
                return v.getAantal();
            }
        }
        return 0;
    }

    public void leverProduct(Product product, int aantal) {
        for (Voorraad v : this.voorraad) {
            if (v.getProduct().equals(product)) {
                int oudAantal = v.getAantal();
                v.setAantal(oudAantal + aantal);
                break;
            }
        }
        this.voorraad.add(new Voorraad(product, aantal));
    }

    public boolean verkoopProduct(Product product, int aantal) {
        for (Voorraad v : this.voorraad) {
            if (v.getProduct().equals(product) && v.getAantal() >= aantal) {
                int oudAantal = v.getAantal();
                v.setAantal(oudAantal - aantal);
                return true;
            }
        }
        return false;
    }
}
