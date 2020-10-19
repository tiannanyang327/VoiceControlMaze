package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import model.MapModel;

import java.io.IOException;

public class CharacterView extends StackPane {

    int x, y;
    public MapModel mapModel;


    public CharacterView(int characterNum) {
        System.out.println("characterView:"+characterNum);
        DrawCharacter(characterNum);
    }
    public void repaint(int characterNum){
        this.getChildren().clear();
        DrawCharacter(characterNum);
    }


    public ImageView DrawCharacter( int characterNum ){
        // to-do integrate characterNum to string
        String filePath = "img/G"+characterNum+".png";
        System.out.println("filepath"+filePath);
        Image characterImg = new Image("img/G"+characterNum+".png");
        ImageView imgView = new ImageView();
        imgView.setImage(characterImg);
        imgView.setFitHeight(40);
        imgView.setFitWidth(40);
        this.getChildren().addAll(imgView);
        return imgView;
    }
    public void moveForward(){
        mapModel = new MapModel();
        if(x < 20 && mapModel.map[x+1][y] == 1){
            this.setTranslateX(this.x * 40 + 25);
            x++;
        }
    }
    public void jump(){
        mapModel = new MapModel();
        if(y > 0 && mapModel.map[x][y-1] == 1){
            this.setTranslateY(this.y * 40 - 25);
            y--;
        }

    }

}
