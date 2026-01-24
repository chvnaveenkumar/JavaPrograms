package BehaviourlPattern.MementoPattern;

public class TextEditorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextEditor editor = new TextEditor();
		HistoryClass historyClass = new HistoryClass();
		editor.write("Hello World");
		editor.write("Hello Everyone");
		
		historyClass.saveState(editor);
		
		editor.write("Learn Design Pattern");
		historyClass.saveState(editor);
		
		editor.write("Testing");
		historyClass.saveState(editor);

		System.out.println(editor.getContent());

		historyClass.undo(editor);
		
		System.out.println("\n\n****");

		System.out.println(editor.getContent());

		historyClass.undo(editor);
		System.out.println("\n\n****");
		System.out.println(editor.getContent());
		
		
		
	}

}
