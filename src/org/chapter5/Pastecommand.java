package org.chapter5;

public class Pastecommand implements Command {
	
	private Editor editor;
	
	
	public Pastecommand(Editor editor) {
		
		this.editor=editor;
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		editor.paste();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
		editor.undoPaste();
		
	}
	
	

}
