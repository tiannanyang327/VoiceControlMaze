package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import model.MapModel;

public class AvatarView extends StackPane {
    int x, y;
    private ImageView avatar;

    public AvatarView(){
        avatar = putAvatar(MapModel.boxSize, MapModel.boxSize);
        this.getChildren().addAll(avatar);
    }
    public void init(){
        avatar = putAvatar(MapModel.boxSize, MapModel.boxSize);
        this.getChildren().addAll(avatar);
    }
   public ImageView putAvatar(int w, int h) {
       Image img = new Image("img/Ball_white.png");
       ImageView imgView = new ImageView(img);
       imgView.setFitWidth(w);
       imgView.setFitHeight(h);

       return imgView;

   }
}
