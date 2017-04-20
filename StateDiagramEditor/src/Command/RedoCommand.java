package Command;

import Composite.StateDiagram;
import Memento.Caretaker;

public class RedoCommand implements SDEditorCommand{

	private StateDiagram sd;
	private Caretaker ct;
	
	//constructor
	public RedoCommand(StateDiagram sd,Caretaker ct) {

		this.sd = sd;
		this.ct = ct;
	}

	@Override
	public void execute() {
		
		//call the StateDigram to do setMemento() & addCurrentVersion()
		System.out.println("redo execute");
		this.sd.SetMemento(ct.getMemento(sd.getCurrentVersion()+1));
		sd.addCurrentVersion();
		
	}

}
