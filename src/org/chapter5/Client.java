package org.chapter5;

public class Client {

	public static void main(String[] args) {
		
		Editor editor=new Editor();
		editor.setText("hello world");
		
		Command  copy=new CopyComand(editor);
		Command  paste=new Pastecommand(editor);
		Button cb = new Button(copy);
        Button pb = new Button(paste);
        
        cb.press();
        editor.setText("iam a little superstar");
        
        pb.press();
        pb.pressUndo();
		
	}

}
