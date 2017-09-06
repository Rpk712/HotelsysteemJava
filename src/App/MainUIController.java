package App;

import App.Models.Hotel;
import App.Models.Kamer;
import  App.Models.Persoon;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.beans.EventHandler;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.function.Function;

public class MainUIController implements Initializable {

    @FXML
    private TableView<Kamer> KamerTableView;

    @FXML
    private TableColumn<Kamer, Integer> kamerNrColumn;

    @FXML
    private TableColumn<Kamer, Integer> aantalPersonenColumn;

    @FXML
    private TableColumn<Kamer, Boolean> isBezetColumn;

    @FXML
    private Button kamerdetailsBtn;

    @FXML
    private TextField kamerInputfield;

    @FXML
    private Button reserveerBtn;


    @FXML
    private Button persoonToevoegenBtn;

    @FXML
    private TextField persoonNaamTb;

    @FXML
    private TextField achternaamTb;

    @FXML
    private TextField telefoonNrTb;

    @FXML
    private TextField emailTb;



    private Hotel hotel;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        hotel = Hotel.getHotel();

       KamerTableView.setItems(hotel.KamerLijst());
       kamerNrColumn.setCellValueFactory(rowData -> rowData.getValue()._kamerIdProperty().asObject());
       aantalPersonenColumn.setCellValueFactory(rowData -> rowData.getValue()._aantalPersonenProperty().asObject());
       isBezetColumn.setCellValueFactory(rowData -> rowData.getValue()._isBezetProperty());

    }

    @FXML
    private void reserveerBtnClicked(ActionEvent event) {
        Kamer selectedKamer = Hotel.getHotel().KamerLijst().get(Integer.parseInt(kamerInputfield.getText()));
       // selectedKamer.set_aantalPersonen(personenSpinner.getValue());

    }

    @FXML
    private void PersoonToevoegenBtnClicked(ActionEvent event){
        Persoon p = new Persoon(persoonNaamTb.getText(), achternaamTb.getText());
        p.setEmail(emailTb.getText());
        p.setTelefoonNummer(telefoonNrTb.getText());

        Hotel.getHotel().PersonenLijst().add(p);
    }


    @FXML
    private void TableViewClicked(){

        Kamer selectedKamer = KamerTableView.getSelectionModel().getSelectedItem();
       kamerInputfield.setText( Integer.toString(selectedKamer.get_kamerId()));
    }

    @FXML
    private void KamerDetailsClicked(){


        Kamer selectedKamer = KamerTableView.getSelectionModel().getSelectedItem();

        selectedKamer.get_personen().add(new Persoon("Lars", "Lemkens"));

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("KamerUI.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Kamer : " + selectedKamer.get_kamerId());
            stage.show();



            //Geef kamer mee aan het scherm
            KamerUIController controller =  fxmlLoader.getController();
            controller.setKamer(selectedKamer);

        }catch (Exception e){
            System.out.println(e);
        }


    }
}
