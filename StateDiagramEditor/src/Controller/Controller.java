package Controller;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JPanel;

import ActionListener.DeleteButtonListener;
import ActionListener.MouseClickedListener;
import ActionListener.MouseMove;
import ActionListener.OpenFileListener;
import ActionListener.RedoButtonListener;
import ActionListener.SaveFileListener;
import ActionListener.StateButtonListener;
import ActionListener.TransButtonListener;
import ActionListener.UndoButtonListener;
import Command.RedoCommand;
import Command.SDEditorCommand;
import Command.UndoCommand;
import Composite.DiagramElement;
import Composite.State;
import Composite.StateDiagram;
import Document.DocumentOperation;
import Document.SDEDocument;
import GUI.View;
import Memento.Caretaker;
import StateController.ControllerState;

public class Controller extends JPanel {

	private View v;
	private StateDiagram de;
	private ControllerState cs;
	private Caretaker ct;
	private SDEDocument dc;

	public Controller(View v, ControllerState cs, StateDiagram de, Caretaker caretaker) {
		this.v = v;
		this.cs = cs;
		this.de = de;
		this.ct = caretaker;
		
		//actionListener
		this.v.getDraw_block().add(this);
		this.v.addStateListener(new StateButtonListener(this));
		this.v.addTransListener(new TransButtonListener(this));
		this.v.addDeleteListener(new DeleteButtonListener(this));
		this.v.addMouseClickedListener(new MouseClickedListener(this));
		this.v.getDraw_block().addMouseMotionListener(new MouseMove(this));
		// redo & undo addListener
		this.v.addundoListener(new UndoButtonListener(this));
		this.v.addredoListener(new RedoButtonListener(this));
		this.v.addSaveFileListener(new SaveFileListener(this));
		this.v.addOpenFileListener(new OpenFileListener(this));

		dc = new DocumentOperation();

		DiagramElement d = new State("123", new Point(100, 100), 35);
		de.add(d);

		ct.addMemento(de.CreateMemento()); //initial memento 

	}
	
	//when this method be called, the draw panel will paint 
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		System.out.println("paint is work");

		for (DiagramElement d : de.getComponent()) {

			d.draw(g);

		}
		//print message to check 
		de.printStruct("");
		ct.printCaretaker();
	}

	@Override
	public Dimension getPreferredSize() {
		System.out.println("dimesion is work");
		return new Dimension(this.v.getDraw_block().getWidth(), this.v.getDraw_block().getHeight());
	}

	public void selectBtnClicked() {

		cs = cs.selectBtnClicked();

	}

	// stateBtnClicked
	public void stateBtnClicked(ActionEvent e) {

		System.out.println("state was clicked");

		cs = cs.stateBtnClicked(e);

		System.out.println(cs.getClass());

	}

	// transition button
	public void transBtnClicked(ActionEvent e) {

		System.out.println("trans");

		cs = cs.transBtnClicked(e);
		
		System.out.println(cs.getClass());
	}

	public void deleteBtnClicked(ActionEvent e) {
		
		System.out.println("deleteBtnClicked is work");
		cs = cs.deleteBtnClicked(e);

	}

	public void mouseClicked(MouseEvent e) {

		cs = cs.mouseClicked(e, de, ct);
		e.getComponent().repaint();
		
	}

	public void mouseDragged(MouseEvent e) {
		
		System.out.println("controller mouse dragged");

		cs = cs.mouseDragged(e, de);
		e.getComponent().repaint();

	}

	public void mousePressed(MouseEvent e) {
		
		cs = cs.mousePressed(e, de, ct);
		e.getComponent().repaint();

	}

	public void mouseReleased(MouseEvent e) {

		System.out.println("controller mouse released");
		cs = cs.mouseReleased(e, de, ct);

		System.out.println("how many components:" + de.getComponent().size());
		System.out.println(cs.getClass());
		e.getComponent().repaint();

	}

	public void undoBtnClicked(ActionEvent e) {
		
		System.out.println("undo was clicked");
		SDEditorCommand undocommand = new UndoCommand(de, ct);
		
		//control the range
		if (1 <= de.getCurrentVersion()) {
			undocommand.execute();
			repaint();
		} else {
			System.out.println("command can't execute");
		}
		
		repaint();
	}

	public void redoBtnClicked(ActionEvent e) {

		System.out.println("redo was clicked");
		SDEditorCommand redocommand = new RedoCommand(de, ct);
		
		//control the range
		if (de.getCurrentVersion() < (de.getVersion())) {
			redocommand.execute();
			repaint();
		} else {
			System.out.println("command can't execute");
		}

		repaint();
	}

	public void openFileBtnClicked() {
		//delegate SDEDocument to open document
		dc.openDocument(de, this);
		repaint();

	}

	public void saveFileBtnClicked() {
		//delegate SDEDocument to save document
		dc.saveDocument(de);

	}


}
