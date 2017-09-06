package App.Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Hotel {

    private final ObservableList<Kamer> kamerLijst = FXCollections.observableArrayList();
    private final ObservableList<Persoon> personenLijst = FXCollections.observableArrayList();


    private static Hotel hotel = null;

    private Hotel() {
        GenerateKamers();
    }


    public ObservableList<Persoon> PersonenLijst() {
        return personenLijst;
    }
    public ObservableList<Kamer> KamerLijst() {
        return kamerLijst;
    }

    public static Hotel getHotel() {

        if (hotel == null) {
            hotel = new Hotel();
        }


        return hotel;

    }


    private void GenerateKamers() {

        for (int i = 0; i < 10; i++) {
            Kamer k = new Kamer(i, 0);
            kamerLijst.add(k);
        }

    }
}
