package controller;

import java.util.HashMap;

import javafx.animation.AnimationTimer;
import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import view.MapView;

public class SoundController extends AnimationTimer {
	
	float vol;	

	@Override
	public void handle(long now) {
		
		
		//frequently get the amplitude
		vol = model.SoundModel.getVolume();		
		
		//sound range: 0.01-0.6		
		
		//initial view
		if(sample.Main.root.lookup("#level-view").isVisible()) {			
			//shout to start
			if(vol > 0.03) {
				
				//Button btn = view.SelectCharacterView.btnnext;
				view.SelectCharacterView.btnnext.setDisable(false);
				//view.SelectCharacterView.btnnext.setStyle("-fx-background-color: #FFA23D;");
				
				//DropShadow dropShadow = new DropShadow();
				//dropShadow.setRadius(5.0);
				//dropShadow.setOffsetX(3.0);
				//dropShadow.setOffsetY(3.0);
				//dropShadow.setColor(Color.color(0.4, 0.5, 0.5));
				//view.SelectLevelView.shout.setEffect(dropShadow);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//switch scene
				MapView mapView = new MapView("src/Beginner.txt");
				sample.Main.root.getChildren().add(mapView);
			}
		}
		
		/*
		//map view
		if(root.lookup("#map-view").isVisible()) {
			
			Double x =  20.0; //horizontal movement
			Double y = 20.0; //vertical movement
			Node target ;//add character
			
			if(vol < 0.01) {
				//noise, ignore sound with low amplitude
			} else if (vol >= 0.01 && vol < 0.03) {
				//in a low voice, keep horizontal move
				//TODO
				target.setTranslateX(x);
			} else {
				//louder, add vertical movement
				//TODO
				target.setTranslateX(x);
				target.setTranslateY(y);
			}
		}		
		*/
		
	}
	
	//TODO
	//game over > stop
	@Override
    public void stop() {
		
        super.stop();
       
    }
	
		

}
