package Command;

import Composite.StateDiagram;
import Memento.Caretaker;

public class UndoCommand implements SDEditorCommand{

	private StateDiagram sd;
	private Caretaker ct;
	
	public UndoCommand(StateDiagram sd,Caretaker ct) {
		
		this.sd = sd;
		this.ct = ct;
		
	}

	@Override
	public void execute() {
		
		System.out.println("undo execute");
		this.sd.SetMemento(ct.getMemento(sd.getCurrentVersion()-1));
		sd.minusCurrentVersion();
		
	}
	
}
