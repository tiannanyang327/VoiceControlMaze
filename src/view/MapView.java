package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import model.MapModel;


import java.io.IOException;

public class MapView extends BorderPane {
    public static int boxSize=40;
    public int[][] map = null;
    public BorderPane root;
    public Pane topMenu;
    public Button exitBtn;
    public AnchorPane mazeView;
    public Label timer;

    public MapView(String mapfile) throws IOException {
        MapModel newMap = new MapModel();
        // to-do :  change the mapName based on level selection
        CharacterView pig = new CharacterView();

        root = new BorderPane();

        exitBtn = new Button("Exit Game");
        exitBtn.setLayoutX(300);
        exitBtn.setLayoutY(50);
        exitBtn.setPrefSize(200,50);
        exitBtn.setStyle("-fx-background-color:ORANGE");
        exitBtn.setTextFill(Color.WHITE);
        exitBtn.setLayoutX(20);
        exitBtn.setLayoutY(20);
        //to-do write a timer
        timer = new Label("00:00");
        timer.setLayoutX(300);
        timer.setLayoutY(40);
        timer.setTextFill(Color.BLACK);
        topMenu = new Pane (exitBtn,timer);
        topMenu.setPrefSize(800,80);
        topMenu.setStyle("-fx-background-color:WHITE");





        mazeView = new AnchorPane();

        mapfile = "src/1.txt";
        //read the map from txt file
        map = newMap.readMap(mapfile);

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(i==14 && j==0){
                    Box box = new Box(j,i);
                    pig.setTranslateX(j*boxSize);
                    pig.setTranslateY((i-1)*boxSize);
                    mazeView.getChildren().addAll(box,pig);
                }
                else if(map[i][j]==0){
                    Obstacle wall = new Obstacle(j,i);
                    mazeView.getChildren().addAll(wall);
            }else if (map[i][j]==1){
                    Box box = new Box(j,i);
                    mazeView.getChildren().addAll(box);
                }
            }
        }

        root.setTop(topMenu);
        root.setCenter(mazeView);
        this.getChildren().addAll(root);

    }

    public class Box extends StackPane {
        Rectangle box = new Rectangle(boxSize,boxSize);
        public Box(int x, int y) {
            box.setFill(Color.rgb(1,82,133));
            getChildren().addAll(box);
            this.setTranslateX(x * boxSize);
            this.setTranslateY(y * boxSize);
        }
    }

    public class Obstacle extends StackPane{
        Rectangle obstacle = new Rectangle(boxSize,boxSize);
        public Obstacle(int x, int y) {
            obstacle.setFill(Color.rgb(255,184,84));
            getChildren().addAll(obstacle);
            this.setTranslateX(x * boxSize);
            this.setTranslateY(y * boxSize);
        }
    }
}
