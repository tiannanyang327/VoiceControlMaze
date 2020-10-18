package model;

import javax.sound.sampled.AudioFormat;

public class SoundModel {	
	
	private static AudioFormat format;
	public static float volume;
	
	
	//get the audio format for CaptureSoundController
	public static AudioFormat getAudioFormat() {
		
		float sampleRate = 16000;
        int sampleSizeInBits = 8;
        int channels = 2;
        boolean signed = true;
        boolean bigEndian = true;
        format = new AudioFormat(sampleRate, sampleSizeInBits,
                                             channels, signed, bigEndian);
        return format;
	}
	//get the sound amplitude
	public static float getVolume() {	
		
        return volume;
        
    }

}
