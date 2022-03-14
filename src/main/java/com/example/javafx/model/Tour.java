package com.example.javafx.model;

public class Tour {
    private String name;
    private String descrption;

    public Tour(String name, String descrption) {
        this.name = name;
        this.descrption = descrption;
    }

    public String getName() {
        return "Tourname: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
}
