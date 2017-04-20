package GUI;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.print.DocFlavor.URL;
import javax.swing.*;
import javax.swing.border.EmptyBorder;



public class View extends JFrame{
	
	private JMenu file, edit, tool;
	private JMenuItem open, save, save_as, close, print, exit, undo, redo, copy, cut, paste, delete, choose_all;
	static final private String OPEN = "open";
	static final private String SAVE = "save";
	static final private String NEXT = "next";
	
	private JPanel contentPanel;
	private JPanel L_side_bar;
	private JComponent draw_block;
	
	private JButton State_btn;
	private JButton Trans_btn;
	
	
	public View(){
		
		setTitle("StateDiagramEditor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		JMenuBar jb = new JMenuBar();
		jb.setBounds(0, 0, 750, 26);
		contentPanel.add(jb);

		file = new JMenu("File");
		// menu.setMnemonic(KeyEvent.VK_A);
		jb.add(file);
		edit = new JMenu("Edit");
		jb.add(edit);
		tool = new JMenu("tool");
		jb.add(tool);
		
		
		open = new JMenuItem("Open file"/* , KeyEvent.VK_T */);
		// menuItem.setAccelerator(KeyStroke.getKeyStroke(
		// KeyEvent.VK_1, ActionEvent.ALT_MASK));
		file.add(open);
		file.addSeparator();
		// save
		save = new JMenuItem("Save");
		file.add(save);
		// save_as
		save_as = new JMenuItem("Save as");
		file.add(save_as);
		file.addSeparator();
		// close
		close = new JMenuItem("Close");
		file.add(close);
		file.addSeparator();
		// print
		print = new JMenuItem("Print");
		file.add(print);
		file.addSeparator();
		// exit
		exit = new JMenuItem("Exit");
		file.add(exit);
		// Undo
		undo = new JMenuItem("Undo");
		edit.add(undo);
		// Redo
		redo = new JMenuItem("Redo");
		edit.add(redo);
		edit.addSeparator();
		// copy
		copy = new JMenuItem("Copy");
		edit.add(copy);
		// cut
		cut = new JMenuItem("Cut");
		edit.add(cut);
		// Paste
		paste = new JMenuItem("Paste");
		edit.add(paste);
		edit.addSeparator();
		// Delete
		delete = new JMenuItem("Delete");
		edit.add(delete);
		// choose_all
		choose_all = new JMenuItem("Choose all");
		edit.add(choose_all);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 25, 750, 21);
		contentPanel.add(toolBar);
		addButtons(toolBar);
		
		
		//right side bar(panel)
		L_side_bar = new JPanel();
		L_side_bar.setBounds(0,50, 150, 750);
		L_side_bar.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPanel.add(L_side_bar);
		
		//draw block
		
		draw_block = new JPanel();
		draw_block.setLayout(null);
		draw_block.setBounds(150,50,700,500);
		draw_block.setBackground(Color.white);
		
		/*
		draw_block.setLayout(null);
		draw_block.setBounds(150,100,600,350);
		draw_block.setBackground(Color.white);
		*/
		contentPanel.add(draw_block);
		
		//state button
		State_btn = new JButton("State");
		State_btn.setBounds(50, 150, 100, 100);
		L_side_bar.add(State_btn);
		
		//transition button
		Trans_btn = new JButton("Transition");
		Trans_btn.setBounds(50, 150, 100, 100);
		L_side_bar.add(Trans_btn);
		
		


	}
	
	
	
	protected void addButtons(JToolBar toolBar) {
		JButton button = null;

		// first button
		button = makeNavigationButton("open", OPEN, "Open file", "Open");
		toolBar.add(button);

		// second button
		button = makeNavigationButton("save", SAVE, "Save current file", "Save");
		toolBar.add(button);

	}

	protected JButton makeNavigationButton(String imageName, String actionCommand, String toolTipText, String altText) {
		// Look for the image.
		String imgLocation = "images/" + imageName + ".png";
		java.net.URL imageURL = View.class.getResource(imgLocation);

		// Create and initialize the button.
		JButton button = new JButton();
		button.setActionCommand(actionCommand);
		button.setToolTipText(toolTipText);
		// button.addActionListener(this);

		if (imageURL != null) { // image found
			button.setIcon(new ImageIcon(imageURL, altText));
		} else { // no image found
			button.setText(altText);
			System.err.println("Resource not found: " + imgLocation);
		}

		return button;
	}
	
	
	public void addStateListener(ActionListener listenForCalcButton){
		
		State_btn.addActionListener(listenForCalcButton);
	}
	
	public void addTransListener(ActionListener listenForCalcButton){
		
		Trans_btn.addActionListener(listenForCalcButton);
	}
	
	public void addMouseClickedListener(MouseListener listenForMouse){
		
		draw_block.addMouseListener(listenForMouse);
		
	}
	
	public void addMouseDraggedListener(MouseListener listenForMouse){
		
		draw_block.addMouseListener(listenForMouse);
		
	}
	
	public void addMousePressedListener(MouseListener listenForMouse){
		
		draw_block.addMouseListener(listenForMouse);
		
	}
	
	public void addMouseReleasedListener(MouseListener listenForMouse){
		
		draw_block.addMouseListener(listenForMouse);
		
	}
	
	
	
	
	public JComponent getDraw_block(){
		
		return draw_block;
		
	}
	 
}
