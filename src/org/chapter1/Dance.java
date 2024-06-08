package org.chapter1;

public abstract class Dance {
	
	CanDance cd;
	Canjump cj;
	
	
	public abstract void display();
	
	
	public void performjump() {
		
		cj.jump();
		
	}
	public void  performDance() {
		
		cd.dance();
		
	}
	
	public void SetCanDance(CanDance d) {
		cd=d;
		
	}
public void  SetCanjump(Canjump j) {
	cj=j;
		
	}
	
	

}
