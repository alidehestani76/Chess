package contoroller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.*;
import javafx.scene.control.TextField;
import netmork.NetworkConnection;
import sun.nio.ch.Net;


import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Ali on 7/7/2017.
 */
public class ClientMenu implements Initializable {
    private NetworkConnection networkConnection;
    private int port ;
    private String ip ;
    private boolean ok ;
    private boolean cancel ;
    @FXML
    private TextField Port ;
    @FXML
    private TextField IP ;
    @FXML
    private Button Ok ;
    @FXML
    private Button Cancel ;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                port=Integer.parseInt(Port.getText()) ;
                ip=IP.getText() ;
                ok=true ;
            }
        });
        Cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cancel=true ;
            }
        });
    }

    public int getPort() {
        return port;
    }

    public String getIp() {
        return ip;
    }
}
