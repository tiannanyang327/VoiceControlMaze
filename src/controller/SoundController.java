package controller;

import javafx.animation.AnimationTimer;
import javafx.scene.Node;

public class SoundController extends AnimationTimer {
	
	float vol;

	@Override
	public void handle(long now) {
		
		//frequently get the amplitude
		vol = model.SoundModel.getVolume();
		
		//sound range: 0.01-0.6
		
		//initial view
		if() {
			//shout to start
			if(vol > 0.03) {
				//switch scene
				//TODO
			}
		}
		
		//map view
		if() {
			
			Double x =  20.0; //horizontal movement
			Double y = 20.0; //vertical movement
			Node target = ;//add character
			
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
		
		
	}
	
	//TODO
	//game over > stop
	@Override
    public void stop() {
		
        super.stop();
       
    }
	
		

}
