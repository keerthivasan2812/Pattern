package Chapter3;

public class StarbuzzCoffe {
	
	
	public static void main(String[] args) {
		
		Beaverages beavarages=new Espresso();
		beavarages=new Mocha(beavarages);
		System.out.println(beavarages.getDescription() 
				
				+"$"+beavarages.cost());

		
	}

}
