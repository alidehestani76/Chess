package contoroller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Ali on 7/8/2017.
 */
public class BOW implements Initializable {
    @FXML
    private Button White ;
    @FXML
    private Button Black ;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        White.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("white");
            }
        });
        Black.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("black");
            }
        });
    }
}
