package BehaviourlPattern.MementoPattern;

import java.util.Stack;

// Responsibility of manage states(snapshots of the TextEditor state

public class HistoryClass {

	private final Stack<EditorMemento> history = new Stack<>();
	
	public void saveState(TextEditor editor) {
		history.push(editor.save());
	}
	
	public void undo(TextEditor editor) {
		if(!history.empty()) {
			history.pop();
			editor.restore(history.peek());
		}
	}
}


