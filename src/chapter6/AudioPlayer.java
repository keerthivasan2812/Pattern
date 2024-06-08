package chapter6;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String Filename) {
		// TODO Auto-generated method stub
		
		if(audioType.equalsIgnoreCase("mp3")) {
			
			System.out.println("playing mp3  file.name"+Filename);
		}else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp3")) {
			
			mediaAdapter=new MediaAdapter(audioType) ;
			
			mediaAdapter.play(audioType, Filename);
			
		}else {
			System.out.println("invalid media"+audioType+"format not supported");
		}
		
	}

}
