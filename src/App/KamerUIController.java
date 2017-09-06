package App;

import App.Models.Kamer;
import App.Models.Persoon;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.swing.text.View;
import java.net.URL;
import java.util.ResourceBundle;

public class KamerUIController implements Initializable {

     private Kamer Kamer;

    public void setKamer(App.Models.Kamer kamer) {

      Kamer = kamer;
      ViewLoader();
    }

    @FXML
    private Label kamerNrLbl;

    @FXML
    private Label aantalPersonenLbl;

    @FXML
    private Button leegBtn;

    @FXML
    private Button sluitenBtn;


  @FXML
  private Label p1NaamTb;

  @FXML
  private Label p1AchternaamTb;

  @FXML
  private Label p1TelefoonTb;

  @FXML
  private Label p1EmailTb;

  @FXML
  private Label p2NaamTb;

  @FXML
  private Label p2AchternaamTb;

  @FXML
  private Label p2TelefoonTb;

  @FXML
  private Label p2EmailTb;

  @FXML
  private Label p3NaamTb;

  @FXML
  private Label p3AchternaamTb;

  @FXML
  private Label p3TelefoonTb;

  @FXML
  private Label p3EmailTb;

  @FXML
  private Label p4NaamTb;

  @FXML
  private Label p4AchternaamTb;

  @FXML
  private Label p4TelefoonTb;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


  private void ViewLoader(){
    this.kamerNrLbl.setText(this.Kamer.get_kamerId() +"");
    this.aantalPersonenLbl.setText(this.Kamer.get_aantalPersonen()+"");




    for (int i = 0; i < Kamer.get_personen().size() ; i++) {

      p1AchternaamTb.setText(Kamer.get_personen().get(0).getAchternaam());
      p1NaamTb.setText(Kamer.get_personen().get(0).getNaam());
      p1EmailTb.setText(Kamer.get_personen().get(0).getEmail());
      p1TelefoonTb.setText(Kamer.get_personen().get(0).getTelefoonNummer());
    }




    }
}
