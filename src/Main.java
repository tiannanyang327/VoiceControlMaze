import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import view.MapView;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root= new Pane();
        MapView mapView = new MapView("src/Beginner.txt");
        Scene launchView = new Scene(mapView, 800,800);

        primaryStage.setTitle("VoiceControlMario");
        primaryStage.setScene(launchView);
        primaryStage.show();

    }
}
