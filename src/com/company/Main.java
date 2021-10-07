package com.company;

public class Main {
    public static void main(String[] args) {
	Films[] arrayFilms = {createObject("Avengers"), createObject("Divergent"),createObject ("HomeAlone")};
        for (Films F : arrayFilms) {

        }

    }

    public static Films createObject(String className){
switch (className){
    case "Avengers":
        Avengers avengers = new Avengers();
        avengers.setFantastic("фантастика, боевик;");
        avengers.print();

        return avengers;
    case "Divergent":
        Divergent divergent = new Divergent();
        divergent.setThriller("Триллер-боевик;");
        divergent.print();
        return divergent;
    case "HomeAlone":
        HomeAlone homeAlone = new HomeAlone();
        homeAlone.setComedy("Комедия.);
        homeAlone.print();
        return homeAlone;
}

   return null;
    }
}
