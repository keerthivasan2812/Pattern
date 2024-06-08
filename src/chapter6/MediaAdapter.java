 package chapter6;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer ap;


	public  MediaAdapter(String audioType) {
		// TODO Auto-generated method stub
		
		if(audioType.equalsIgnoreCase("vlc")) {
			
			ap=new AdvancedMediaPlayer();
			
		}else if(audioType.equalsIgnoreCase("mp4")){
			ap=new AdvancedMediaPlayer();
			
		}
		
	}

	@Override
	public void play(String audioType, String Filename) {
		// TODO Auto-generated method stub
		
		if(audioType.equalsIgnoreCase("vlc")) {
			
			ap.playVlc(Filename);
			
		}else if(audioType.equalsIgnoreCase("mp4")) {
			
			ap.playMp4(Filename);
			
		}
		
	}
	

}
