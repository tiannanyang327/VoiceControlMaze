package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.*;


public class Main extends Application
{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{


        MapView mapView = new MapView("src/Beginner.txt");
        SelectCharacterView scv= new SelectCharacterView();
        SelectLevelView slv= new SelectLevelView();

        Scene ChaScene = new Scene(scv,800,800);
        Scene LevScene = new Scene(slv,800,800);
        Scene MapScene = new Scene(mapView, 800,800);


        scv.btnnext.setOnMouseClicked( e->primaryStage.setScene(LevScene));
        slv.btnnext.setOnMouseClicked( e-> primaryStage.setScene(MapScene));
        slv.previous.setOnMouseClicked(e-> primaryStage.setScene(ChaScene));


        scv.char1.setOnMouseClicked( e -> {
            scv.char1.setStyle("-fx-background-color: #FFA23D; ");
            scv.char2.setStyle("-fx-background-color: transparent; ");
            scv.char3.setStyle("-fx-background-color: transparent; ");
        });

        scv.char2.setOnMouseClicked( e -> {
            scv.char2.setStyle("-fx-background-color: #FFA23D; ");
            scv.char1.setStyle("-fx-background-color: transparent; ");
            scv.char3.setStyle("-fx-background-color: transparent; ");
        });

        scv.char3.setOnMouseClicked( e -> {
            scv.char3.setStyle("-fx-background-color: #FFA23D; ");
            scv.char1.setStyle("-fx-background-color: transparent; ");
            scv.char2.setStyle("-fx-background-color: transparent; ");
        });

        slv.lev1.setOnMouseClicked( e -> {
            slv.lev1.setStyle("-fx-background-color: #FFA23D; ");
            slv.lev2.setStyle("-fx-background-color: transparent; ");
            slv.lev3.setStyle("-fx-background-color: transparent; ");
        });

        slv.lev2.setOnMouseClicked( e -> {
            slv.lev2.setStyle("-fx-background-color: #FFA23D; ");
            slv.lev1.setStyle("-fx-background-color: transparent; ");
            slv.lev3.setStyle("-fx-background-color: transparent; ");
        });

        slv.lev3.setOnMouseClicked( e -> {
            slv.lev3.setStyle("-fx-background-color: #FFA23D; ");
            slv.lev1.setStyle("-fx-background-color: transparent; ");
            slv.lev2.setStyle("-fx-background-color: transparent; ");
        });


        primaryStage.setTitle("VoiceControlMario");
        primaryStage.setScene(ChaScene);
        primaryStage.show();
    }
}

