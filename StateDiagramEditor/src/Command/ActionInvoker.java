package Command;

public class ActionInvoker {
	
	private SDEditorCommand command;
	
	public ActionInvoker(SDEditorCommand command){
		
		this.command = command;
	}
	public void execute(){
		
		this.command.execute();
	}
	

}
