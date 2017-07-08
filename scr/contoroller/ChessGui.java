package contoroller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import netmork.Client;
import netmork.NetworkConnection;
import netmork.Server;

import java.util.Scanner;

/**
 * Created by amirsaeed on 5/27/2017.
 */
public class ChessGui extends Application{


    private Pane root;
    private boolean offlineMode=false;

    private MenuConotoroller menuConotoroller;
    public static Stage stage;

    public  boolean isOfflineMode() {
        return offlineMode;
    }

    public void setOfflineMode(boolean offlineMode) {
        this.offlineMode = offlineMode;
    }

    @Override
    public void start(Stage stage) throws Exception {
            ChessGui.stage = stage;

            menuConotoroller=new MenuConotoroller();


            ChessGui.stage.setScene(new Scene(
                    FXMLLoader.load(getClass().getResource("/view/online.fxml")), 600, 400));

            ChessGui.stage.show();

//            System.out.println(menuConotoroller.getOffline());

        /*
//        Scanner scanner= new Scanner(System.in);
//        int a= scanner.nextInt();
        if(startMenu.isOnline()) {
            if(chooseMenu.isWhite())
                networkConnection = new Server(serverMenu.getPort(), chessBoard);
            else
                networkConnection = new Client(clientMenu.getIp(), clientMenu.getPort(), chessBoard);
        }
        else
            offlineMode=true;
        if (!offlineMode)
            networkConnection.startConnection();
        root.getChildren().add(chessBoard.getGridPane());
        Scene scene = new Scene(root);
        stage.setScene(scene);
//        chessBoard.setMode(offlineMode);
        if (!offlineMode)
            chessBoard.setNetworkConnection(networkConnection);
        if (!offlineMode) {
            if (networkConnection.isServer())
                stage.setTitle("White");
            else
                stage.setTitle("Black");
        }
        else {
            stage.setTitle("offline");
            chessBoard.setGameController();
        }
        chessBoard.setMode(offlineMode);
        stage.show();
        */
    }
}
