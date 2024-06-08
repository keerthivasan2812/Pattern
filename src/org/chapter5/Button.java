package org.chapter5;

public class Button {
	private Command command;
	
	public Button(Command command) {
		
		this.command=command;
		
	}
	
	public void press() {
		command.execute();
	}
	
	public void pressUndo() {
		command.undo();
	}
	

}
