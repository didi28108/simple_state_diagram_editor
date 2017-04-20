package GUI;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditStateDialog extends JDialog{
	
	//the attributes of button 
	private JButton okbtn;
	private JButton cancelbtn;
	private JButton Clearbtn;
	
	//the attributes of TextField
	private JTextField editname;
	
	//constructor
	public EditStateDialog(){
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel dialogPanel = new JPanel();
		add(dialogPanel);
		
		okbtn=new JButton("OK");
		add(okbtn);
		
		cancelbtn =new JButton("Cancel");
		add(cancelbtn);
		
		Clearbtn =new JButton("Cancel");
		add(Clearbtn);
		
		editname = new JTextField("");
		add(editname);
		
	
	}
	
	
	

}
