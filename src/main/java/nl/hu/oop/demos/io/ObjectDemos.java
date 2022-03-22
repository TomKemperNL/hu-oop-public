package nl.hu.oop.demos.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ObjectDemos {

    private static void schrijfPersoon(Persoon opslaan) throws IOException {
        try (FileOutputStream fs = new FileOutputStream("test.obj")) {
            try (GZIPOutputStream zipped = new GZIPOutputStream(fs)) {
                try (ObjectOutputStream oos = new ObjectOutputStream(zipped)) {
                    oos.writeObject(opslaan);
                }
            }
        }
    }


    private static void schrijfPersoonZipped(Persoon opslaan) throws IOException {
        try (FileOutputStream fs = new FileOutputStream("test.zip")) {
            try (ZipOutputStream zipped = new ZipOutputStream(fs)) {
                ZipEntry entry = new ZipEntry("test.obj");
                zipped.putNextEntry(entry);

                try (ObjectOutputStream oos = new ObjectOutputStream(zipped)) {
                    oos.writeObject(opslaan);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        schrijfPersoonZipped(new Persoon(42, "Bob"));
    }
}
