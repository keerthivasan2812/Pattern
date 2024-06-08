package chapter6;

public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		AudioPlayer ap= new AudioPlayer();
		
		ap.play("mp3", "beyond_the_horizon.mp3");
		ap.play("mp4", "alone.mp4");
		ap.play("vlc", "far_far_away.vlc");
		ap.play("avi", "mind_me.avi");
	}

}
