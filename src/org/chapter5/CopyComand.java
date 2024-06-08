package org.chapter5;

public class CopyComand  implements Command {
	private Editor editor;
	
	public CopyComand(Editor editor) {
		
		this.editor=editor;
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		editor.copy();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
