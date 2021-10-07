package com.company;

public class Divergent extends Films implements Printable {
    private String thriller;

    public String getThriller() {
        return thriller;
    }

    public void setThriller(String thriller) {
        this.thriller = thriller;
    }

    @Override
    public void print() {
        System.out.println("Жанр фильма  «Divergent» - " + getThriller());
    }
}
