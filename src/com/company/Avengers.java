package com.company;

public class Avengers extends Films implements Printable{
    private String fantastic;

    public String getFantastic() {
        return fantastic;
    }

    public void setFantastic(String fantastic) {
        this.fantastic = fantastic;
    }

    @Override
    public void print() {
        System.out.println("Жанр фильма  «Avengers» - " + getFantastic());
    }
}
