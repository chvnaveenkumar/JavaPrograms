package BehaviourlPattern.MementoPattern;

//Memento Class: Stores the internal state of the TextEditor
public class EditorMemento {
	
	//Once we capture the content we cannot change it
	private final String content;
	
	public EditorMemento(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
}
