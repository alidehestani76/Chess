package contoroller;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import model.Bishop;
import netmork.NetworkConnection;

import static contoroller.ChessGui.stage;

/**
 * Created by Ali on 7/8/2017.
 */
public class MenuConotoroller {
    private NetworkConnection networkConnection;
    private Boolean offline=false;
    private ChessBoard chessBoard;
    private Pane root;
    MenuConotoroller(){
        chessBoard = new ChessBoard();
        root = new Pane();
    }
    public void offlinegame(){
        root.getChildren().add(chessBoard.getGridPane());
        Scene scene = new Scene(root);
        ChessGui.stage.setScene(scene);
        ChessGui.stage.setTitle("offline");
        chessBoard.setGameController();
        chessBoard.setMode(offline);
    }
    public Boolean getOffline() {
        return offline;
    }

    public void setOffline(Boolean offline) {
        this.offline = offline;

    }


}
