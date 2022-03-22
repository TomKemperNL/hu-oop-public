package nl.hu.oop.demos.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Persoon implements Serializable {
    private long id;
    private String name;

    public Persoon(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Persoon " + id;
    }

    public boolean equals(Object other) {
        if (other instanceof Persoon) {
            Persoon otherPersoon = (Persoon) other;
            String name = otherPersoon.getName();
            double id = otherPersoon.getId();
            return name.equals(this.name) && id == this.id;
        } else {
            return false;
        }
    }

}
