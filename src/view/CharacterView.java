package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import model.MapModel;

import java.io.IOException;

public class CharacterView extends StackPane {
    int x, y;
    public CharacterView() {
        DrawCharacter(40,40,1);
    }

    public ImageView DrawCharacter(int width, int height, int characterNum){
        // to-do integrate characterNum to string
        Image characterImg = new Image("img/Ball_white.png");
        ImageView imgView = new ImageView();
        imgView.setImage(characterImg);
        imgView.setFitHeight(width);
        imgView.setFitWidth(height);
        this.getChildren().addAll(imgView);
        return imgView;
    }

}
