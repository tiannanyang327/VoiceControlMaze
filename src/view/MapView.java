package view;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import model.MapModel;

public class MapView extends Pane {
    public static int rows = 20;
    public static int columns = 20;
    public static int boxSize = 40;
    public static int endLevelLoc;

    public MapModel mapModel;
    public Pane mapPane;
    public AvatarView avatar;

    public MapView(String filename) {
        mapPane = new Pane();
        this.getChildren().add(mapPane);
        this.setId("map-view");

        mapModel = new MapModel(filename);
        setVisible(true);

//        avatar = new AvatarView();
//        avatar.setVisible(true);

        setUpMap(mapPane, mapModel.getMap());
    }

    private void setUpMap(Pane mapPane, int[][] map){
        for(int y = 0; y < columns; y++){
            for(int x = 0; x < rows; x++ ){
                Cell cell = new Cell(x, y, map[x][y]);
                mapPane.getChildren().addAll(cell);

//                if(x == 0 && map[x][y] == 1) {
//                    avatar.setTranslateX(x*boxSize);
//                    avatar.setTranslateY(y*boxSize);
//                    avatar.y = y;
//                    avatar.x = x;
//                    mapPane.getChildren().addAll(avatar);
//                }
            }
        }
    }

    private class Cell extends StackPane {
        private Rectangle cellContent = new Rectangle(boxSize, boxSize);
        public Cell(int x, int y, int type) {
            if(type == 0) {
                cellContent.setFill(Color.web("#FFB854"));
            } else if (type == 1) {
                cellContent.setFill(Color.web("#015285"));
                if(x == columns-1){
                    endLevelLoc = y;
                }
            }
            getChildren().addAll(cellContent);
            this.setTranslateX(x * boxSize);
            this.setTranslateY(y * boxSize);
        }

    }
}
