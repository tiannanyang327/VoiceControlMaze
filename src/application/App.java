package application;

import controllers.CharControl;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import view.MapView;

import java.io.IOException;

public class App extends AnchorPane {
    public MapView mapView;
    public Button exitBtn;

    public App(int mapNum,int characterNum) throws IOException {
        System.out.println("App:"+characterNum);
        System.out.println("App:"+mapNum);
        initiate(mapNum,characterNum);
        setVisible(true);
    }

    public void initiate(int mapNum, int characterNum) throws IOException {
        mapView = new MapView(mapNum,characterNum);
        exitBtn = mapView.exitBtn;


        this.getChildren().add(mapView);
//        this.setTop(topPane);
//        this.setCenter(centerPane);
    }

}
