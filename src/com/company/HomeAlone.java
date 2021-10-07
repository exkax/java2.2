package com.company;

public class HomeAlone extends Films implements Printable {
    private String comedy;

    public String getComedy() {
        return comedy;
    }

    public void setComedy(String comedy) {
        this.comedy = comedy;
    }

    @Override
    public void print() {
        System.out.println("Жанр фильма  «Home Alone» -  " + getComedy());
    }
}
