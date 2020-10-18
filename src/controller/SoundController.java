package controller;

import javafx.animation.AnimationTimer;

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
			if(vol < 0.01) {
				//noise, ignore sound with low amplitude
			} else if (vol >= 0.01 && vol < 0.03) {
				//in a low voice, keep horizontal move
				//TODO
			} else {
				//louder, add vertical movement
				//TODO
			}
		}		
		
		
	}
	
		

}
