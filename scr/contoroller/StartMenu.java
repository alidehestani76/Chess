package contoroller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Ali on 6/2/2017.
 */
public class StartMenu implements Initializable {
    private boolean online=false ;
    private MenuConotoroller menuConotoroller;

    @FXML
    private Button ONLINE ;
    @FXML
    private Button OFFLINE ;
//    private MenuConotoroller menuConotoroller;
//    StartMenu(MenuConotoroller menuConotoroller){
//        this.menuConotoroller=menuConotoroller;
//    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
            ONLINE.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    menuConotoroller= new MenuConotoroller();
                    menuConotoroller.setOffline(false);
                    try {
                        ChessGui.stage.setScene(new Scene(
                                FXMLLoader.load(getClass().getResource("/view/BOW.fxml"))));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ChooseMenu chooseMenu= new ChooseMenu(menuConotoroller);
                }
            });
            OFFLINE.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    menuConotoroller= new MenuConotoroller();
                    menuConotoroller.setOffline(true);
                    menuConotoroller.offlinegame();
                }
            });
    }

    public MenuConotoroller getMenuConotoroller() {
        return menuConotoroller;
    }

    public void setMenuConotoroller(MenuConotoroller menuConotoroller) {
        this.menuConotoroller = menuConotoroller;
    }

    public boolean isOnline() {
        return online;
    }

}
