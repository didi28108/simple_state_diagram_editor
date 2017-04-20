package GUI;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.print.DocFlavor.URL;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import Composite.*;

public class View {

	public JFrame frame;

	private JMenu file, edit;
	private JMenuItem open, save, undo, redo;

	private JPanel contentPanel;
	private JPanel L_side_bar;
	private JPanel draw_block;
	private JButton open_btn;
	private JButton save_btn;
	private JButton Undo_btn;
	private JButton Redo_btn;
	private JButton State_btn;
	private JButton Trans_btn;
	private JButton delete_btn;
	private JButton saveMemento;

	public View() {

		this.frame = new JFrame("StateDiagramEditor");
		// setTitle("StateDiagramEditor");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 750, 500);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPanel);
		contentPanel.setLayout(null);

		JMenuBar jb = new JMenuBar();
		jb.setBounds(0, 0, 750, 26);
		contentPanel.add(jb);

		file = new JMenu("File");
		// menu.setMnemonic(KeyEvent.VK_A);
		jb.add(file);
		edit = new JMenu("Edit");
		jb.add(edit);

		open = new JMenuItem("Open file"/* , KeyEvent.VK_T */);
		// menuItem.setAccelerator(KeyStroke.getKeyStroke(
		// KeyEvent.VK_1, ActionEvent.ALT_MASK));
		file.add(open);
		file.addSeparator();
		// save
		save = new JMenuItem("Save");
		file.add(save);
		// Undo
		undo = new JMenuItem("Undo");
		edit.add(undo);
		// Redo
		redo = new JMenuItem("Redo");
		edit.add(redo);
		edit.addSeparator();

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 25, 750, 21);
		contentPanel.add(toolBar);

		// right side bar(panel)
		L_side_bar = new JPanel();
		L_side_bar.setBounds(0, 50, 150, 750);
		L_side_bar.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPanel.add(L_side_bar);

		// draw block

		draw_block = new JPanel();
		// draw_block.setLayout(null);
		draw_block.setBorder(new BevelBorder(BevelBorder.LOWERED, null, Color.white, null, null));
		draw_block.setBounds(150, 50, 700, 500);
		FlowLayout flowLaout = (FlowLayout) draw_block.getLayout();
		draw_block.setBackground(Color.white);
		frame.getContentPane().add(draw_block);
		/*
		 * draw_block.setLayout(null); draw_block.setBounds(150,100,600,350);
		 * draw_block.setBackground(Color.white);
		 */
		contentPanel.add(draw_block);

		// open file button
		open_btn = new JButton("Open");
		open_btn.setBounds(50, 150, 100, 100);
		L_side_bar.add(open_btn);

		// save file button
		save_btn = new JButton("Save");
		save_btn.setBounds(50, 150, 100, 100);
		L_side_bar.add(save_btn);

		// state button
		State_btn = new JButton("State");
		State_btn.setBounds(50, 150, 100, 100);
		L_side_bar.add(State_btn);

		// transition button
		Trans_btn = new JButton("Transition");
		Trans_btn.setBounds(50, 150, 100, 100);
		L_side_bar.add(Trans_btn);

		// Undo button
		Undo_btn = new JButton("Undo");
		Undo_btn.setBounds(50, 150, 100, 100);
		L_side_bar.add(Undo_btn);

		// Redo button
		Redo_btn = new JButton("Redo");
		Redo_btn.setBounds(50, 150, 100, 100);
		L_side_bar.add(Redo_btn);

		// delete_btn button
		delete_btn = new JButton("Delete");
		delete_btn.setBounds(50, 150, 100, 100);
		L_side_bar.add(delete_btn);
		delete_btn.disable();

		// saveMemento = new JButton("saveMemento");
		// saveMemento.setBounds(50, 150, 100, 100);
		// L_side_bar.add(saveMemento);

	}

	public void addSaveFileListener(ActionListener listenForCalcButton) {
		save_btn.addActionListener(listenForCalcButton);
		save.addActionListener(listenForCalcButton);
	}

	public void addOpenFileListener(ActionListener listenForCalcButton) {
		open_btn.addActionListener(listenForCalcButton);
		open.addActionListener(listenForCalcButton);
	}

	public void addundoListener(ActionListener listenForCalcButton) {
		undo.addActionListener(listenForCalcButton);
		Undo_btn.addActionListener(listenForCalcButton);
	}

	public void addredoListener(ActionListener listenForCalcButton) {
		redo.addActionListener(listenForCalcButton);
		Redo_btn.addActionListener(listenForCalcButton);
	}

	public void addStateListener(ActionListener listenForCalcButton) {

		State_btn.addActionListener(listenForCalcButton);
	}

	public void addTransListener(ActionListener listenForCalcButton) {

		Trans_btn.addActionListener(listenForCalcButton);
	}

	public void addDeleteListener(ActionListener listenForCalcButton) {
		delete_btn.addActionListener(listenForCalcButton);
	}

	public void addSaveMementoListener(ActionListener listenForCalcButton) {

		saveMemento.addActionListener(listenForCalcButton);
	}

	public void addMouseClickedListener(MouseListener listenForMouse) {

		draw_block.addMouseListener(listenForMouse);

	}

	public void addMouseDraggedListener(MouseListener listenForMouse) {

		draw_block.addMouseListener(listenForMouse);

	}

	public void addMousePressedListener(MouseListener listenForMouse) {

		draw_block.addMouseListener(listenForMouse);

	}

	public void addMouseReleasedListener(MouseListener listenForMouse) {

		draw_block.addMouseListener(listenForMouse);

	}

	public JPanel getDraw_block() {

		return draw_block;

	}

}
