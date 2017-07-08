package contoroller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Ali on 7/7/2017.
 */
public class pawn_endBlack implements Initializable {
    @FXML
    private Button knight ;
    @FXML
    private Button bishop ;
    @FXML
    private Button queen ;
    @FXML
    private Button rock ;
    private String nameofpiece ;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        knight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nameofpiece="Knight" ;
            }
        });
        queen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nameofpiece="Queen" ;
            }
        });
        bishop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nameofpiece="Bishop" ;
            }
        });
        rock.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nameofpiece="Rock" ;
            }
        });
    }
}
