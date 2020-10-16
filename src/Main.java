import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import view.MapView;
import view.SelectCharacterView;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root= new Pane();
        MapView mapView = new MapView("src/1.txt");
//        AnchorPane selectCharacterView= FXMLLoader.load(getClass().getResource("view/SelectCharacter.fxml"));
//        Scene selectLevelView = FXMLLoader.load(getClass().getResource("view/SelectLevel.fxml"));
        Scene launchView = new Scene(mapView, 800,800);
        //Scene launchView = new Scene(mapView, 800,800);

        primaryStage.setTitle("VoiceControlMario");
        primaryStage.setScene(launchView);
        primaryStage.show();

    }
}
