package nl.hu.oop.demos.db;

import java.util.Objects;

public class Auto {

    private int id;
    private String merk;
    private String type;
    private int bouwjaar;

    public Auto(int id, String merk, String type, int bouwjaar) {
        this.id = id;
        this.merk = merk;
        this.type = type;
        this.bouwjaar = bouwjaar;
    }

    public int getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    public int getBouwjaar() {
        return bouwjaar;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", merk='" + merk + '\'' +
                ", type='" + type + '\'' +
                ", bouwjaar=" + bouwjaar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return id == auto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
