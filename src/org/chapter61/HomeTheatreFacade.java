package org.chapter61;

public class HomeTheatreFacade {
	
	private Tv tv;
	private DvdPlayer dvd;
	private SoundSystem sysm;
	
	public HomeTheatreFacade(Tv tv,DvdPlayer dvd,SoundSystem sysm) {
		
		this.tv=tv;
		this.dvd=dvd;
		this.sysm=sysm;
		
	}
	
	public void watchMovie(String movie) {
		System.out.println("get ready to watch the movie");
		tv.on();
		sysm.on();
		sysm.setVolume(45);
		dvd.on();
		dvd.play(movie);
		
	}
	
	public void endMovie() {
		System.out.println("shutting down the home theatre");
		
		dvd.off();
		sysm.off();
		tv.off();
		
	}

}
