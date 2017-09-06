package App.Models;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Kamer {

    private SimpleIntegerProperty _kamerId;

    private SimpleIntegerProperty _aantalPersonen;

    private SimpleBooleanProperty _isBezet;

    private ObservableList<Persoon> _personen;

    public Kamer(Integer kamerId, Integer aantalPersonen) {
        _personen = FXCollections.observableArrayList();

        _kamerId = new SimpleIntegerProperty(kamerId);
        _aantalPersonen = new SimpleIntegerProperty(aantalPersonen);
        _isBezet = new SimpleBooleanProperty(false);


        if (aantalPersonen > 0) {
            _isBezet.set(true);
        }
    }


    public ObservableList<Persoon> get_personen() {
        return _personen;
    }

    public void set_personen(ObservableList<Persoon> _personen) {
        this._personen = _personen;
    }

    public int get_kamerId() {
        return _kamerId.get();
    }

    public SimpleIntegerProperty _kamerIdProperty() {
        return _kamerId;
    }

    public void set_kamerId(int _kamerId) {
        this._kamerId.set(_kamerId);
    }

    public int get_aantalPersonen() {
        return _aantalPersonen.get();
    }

    public SimpleIntegerProperty _aantalPersonenProperty() {
        return _aantalPersonen;
    }

    public void set_aantalPersonen(int _aantalPersonen) {
        this._aantalPersonen.set(_aantalPersonen);
    }

    public boolean is_isBezet() {
        return _isBezet.get();
    }

    public SimpleBooleanProperty _isBezetProperty() {
        return _isBezet;
    }

    public void set_isBezet(boolean _isBezet) {
        this._isBezet.set(_isBezet);
    }
}
