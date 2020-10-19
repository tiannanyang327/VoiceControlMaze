package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.SelectCharacterView;
import view.SelectLevelView;

import java.io.IOException;

public class Main extends Application {
	
	public static StackPane root;
	
    public int characterNum;
    public int mapNum;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	root = new StackPane();
    	root.setPrefSize(800, 800);
    	Scene scene = new Scene(root);
    	
    	
    	
        System.out.println("main:"+this.characterNum);
        App app = new App(this.mapNum,this.characterNum);
        Pane mapView = new Pane();
        mapView.getChildren().add(app);
        //Scene MapScene = new Scene(mapView,800,800);


        SelectCharacterView scv= new SelectCharacterView();
        SelectLevelView slv= new SelectLevelView();

        //Scene ChaScene = new Scene(scv,800,800);
        //Scene LevScene = new Scene(slv,800,800);


        scv.btnnext.setOnMouseClicked( e-> {
        	root.getChildren().add(slv);
        	});
        //slv.btnnext.setOnMouseClicked( e-> primaryStage.setScene(MapScene));
        slv.previous.setOnMouseClicked(e-> {
        	root.getChildren().add(scv);
        	});
        app.exitBtn.setOnMouseClicked(e -> {
        	root.getChildren().add(slv);
        	});


        scv.char1.setOnMouseClicked( e -> {
            scv.char1.setStyle("-fx-background-color: #FFA23D; ");
            scv.char2.setStyle("-fx-background-color: transparent; ");
            scv.char3.setStyle("-fx-background-color: transparent; ");
            this.characterNum =0;
            app.mapView.pig.repaint(characterNum);
        });

        scv.char2.setOnMouseClicked( e -> {
            scv.char2.setStyle("-fx-background-color: #FFA23D; ");
            scv.char1.setStyle("-fx-background-color: transparent; ");
            scv.char3.setStyle("-fx-background-color: transparent; ");
            this.characterNum =1;
            app.mapView.pig.repaint(characterNum);
        });

        scv.char3.setOnMouseClicked( e -> {
            scv.char3.setStyle("-fx-background-color: #FFA23D; ");
            scv.char1.setStyle("-fx-background-color: transparent; ");
            scv.char2.setStyle("-fx-background-color: transparent; ");
            this.characterNum =2;
            app.mapView.pig.repaint(characterNum);
        });

        slv.lev1.setOnMouseClicked( e -> {
            slv.lev1.setStyle("-fx-background-color: #FFA23D; ");
            slv.lev2.setStyle("-fx-background-color: transparent; ");
            slv.lev3.setStyle("-fx-background-color: transparent; ");
            this.mapNum=0;
            try {
                app.initiate(this.mapNum,this.characterNum);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        slv.lev2.setOnMouseClicked( e -> {
            slv.lev2.setStyle("-fx-background-color: #FFA23D; ");
            slv.lev1.setStyle("-fx-background-color: transparent; ");
            slv.lev3.setStyle("-fx-background-color: transparent; ");
            this.mapNum=1;
            try {
                app.initiate(this.mapNum,this.characterNum);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        });

        slv.lev3.setOnMouseClicked( e -> {
            slv.lev3.setStyle("-fx-background-color: #FFA23D; ");
            slv.lev1.setStyle("-fx-background-color: transparent; ");
            slv.lev2.setStyle("-fx-background-color: transparent; ");
            this.mapNum=2;
            try {
                app.initiate(this.mapNum,this.characterNum);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        root.getChildren().add(scv);
        primaryStage.setTitle("VoiceControlMario");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
