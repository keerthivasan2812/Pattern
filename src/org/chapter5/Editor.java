package org.chapter5;

public class Editor {
private  String clipboard;
private StringBuilder  text=new  StringBuilder();
private String lastPasted;

public void copy() {
	
	clipboard=text.toString();
	System.out.println("copied text: "+ clipboard);
	
}

public void paste() {
	lastPasted=clipboard;
	text.append(clipboard);
	
	System.out.println("pasted text:"+text.toString());
}

public void undoPaste() {
    if (lastPasted != null && text.toString().endsWith(lastPasted)) {
        text.setLength(text.length() - lastPasted.length());
        System.out.println("Undo paste: " + text.toString());
    }
}

public void setText(String newText) {
    text = new StringBuilder(newText);
}

public String getText() {
    return text.toString();
}
	

}
