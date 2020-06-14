package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialisierer {

    public static void main(String[] args) throws Exception {

        Kunde kunde1 = new Kunde("Rudi", "Mentärgasse");
        Kunde kunde2 = new Kunde("Schlami", "Schlumbstädt");

        List<Kunde> kundenListe = new ArrayList<>();
        kundenListe.add(kunde1);
        kundenListe.add(kunde2);
        kundenListe.add(kunde2);


        FileOutputStream fileOutputStream = new FileOutputStream("kunden.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(kundenListe);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("kunden.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Kunde> kundenAusDatei = (List<Kunde>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        kundenAusDatei.forEach(kunde -> {
            System.out.println("Name: " + kunde.getName() + " Adresse: " + kunde.getAdresse());
        });

        System.out.println("Vergleich: " + kundenAusDatei.get(1).equals(kundenAusDatei.get(2)));
        System.out.println("Vergleich: " + (kundenAusDatei.get(1) == kundenAusDatei.get(2)));
    }
}
