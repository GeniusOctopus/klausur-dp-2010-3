package com.company;

import java.io.Serializable;

public class Kunde implements Serializable {

    private String name;
    private String adresse;

    public Kunde() {

    }

    public Kunde(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public Kunde(Kunde other) {
        name = other.name;
        adresse = other.adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
