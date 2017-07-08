package contoroller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Ali on 7/7/2017.
 */
public class ServerMenu implements Initializable {
    private int port ;
    private boolean ok ;
    private boolean cancel ;
    @FXML
    private Button Ok ;
    @FXML
    private Button Cancel ;
    @FXML
    private TextField Port ;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                port=Integer.parseInt(Port.getText()) ;
                ok=true ;
                cancel=false ;
            }
        });
        Cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cancel=true ;
                ok=false ;
            }
        });
    }

    public int getPort() {
        return port;
    }
}
