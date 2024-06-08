package org.chapter1;

public class DanceSimulator {
	
	
	public static void main(String[] args) {
		
		
		Dance model1=new MichealJackson();
		
		model1.display();
		
		model1.performDance();
		model1.performjump();
		model1.SetCanDance(new CannotDance());
		model1.performDance();
		
	}

}
