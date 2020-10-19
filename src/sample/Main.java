package sample;

import java.awt.Container;
import java.util.HashMap;

import controller.SoundController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.*;


public class Main extends Application{
	
	
	public static StackPane root;

	
    public static void main(String[] args) {
    	
    	controller.CaptureSoundController.main(args);
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{        	
    	
    	
    	SoundController soundCapture = new SoundController();
    	
    	
    	root = new StackPane();
    	root.setPrefSize(800, 800);
        Scene scene = new Scene(root);
        

        MapView mapView = new MapView("src/Beginner.txt");
        SelectCharacterView scv= new SelectCharacterView();
        SelectLevelView slv= new SelectLevelView();
        
        root.getChildren().add(scv);


        //ChaScene = new Scene(scv,800,800);
        //LevScene = new Scene(slv,800,800);
        //MapScene = new Scene(mapView, 800,800);


        scv.btnnext.setOnMouseClicked( e-> {
        	//primaryStage.setScene(LevScene);
        	root.getChildren().add(slv);     	
        	soundCapture.start();
        	});
        
        slv.btnnext.setOnMouseClicked( e-> {
        	//primaryStage.setScene(MapScene);
        	root.getChildren().add(mapView);
        	});
        
        slv.previous.setOnMouseClicked(e-> {
        	//primaryStage.setScene(ChaScene);
        	root.getChildren().add(scv);
        	soundCapture.stop();
        	});


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
        
        
        scene.getStylesheets().add(sample.Main.class.getResource("style.css").toExternalForm());	
        primaryStage.setTitle("VoiceControlMario");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
}

