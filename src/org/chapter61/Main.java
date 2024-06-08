package org.chapter61;

public class Main {
	
	public static void main(String[] args) {
		Tv tv=new Tv();
		DvdPlayer dvd=new DvdPlayer();
		SoundSystem sysm=new SoundSystem();
		
		HomeTheatreFacade hf=new HomeTheatreFacade(tv,dvd,sysm);
		
		hf.watchMovie("inception");
		hf.endMovie();
	}

}
