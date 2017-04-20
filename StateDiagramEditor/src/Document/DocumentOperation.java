package Document;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;

import Composite.DiagramElement;
import Composite.StateDiagram;
import Controller.Controller;

public class DocumentOperation extends SDEDocument {

	public ObjectOutputStream output;
	public ObjectInputStream input;
	

	@Override
	public void openFile(File fileName) {

		try {
			output = new ObjectOutputStream(new FileOutputStream(fileName));
		} catch (IOException ioException) {
			System.err.println("Error loading file: " + fileName);
			return;
		}

	}

	@Override
	public File getFileName(Controller c) {

		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fileChooser.setCurrentDirectory(new File("/Users/stevevitali/Desktop"));

		int result = fileChooser.showOpenDialog(c);

		File fileName = fileChooser.getSelectedFile();

		return fileName;

	}

	@Override
	public void loadFile(File fileName) {

		try {
			input = new ObjectInputStream(new FileInputStream(fileName));
		} catch (IOException ioException) {
			System.err.println("Error loading file: " + fileName);
			return;
		}

	}

	@Override
	public void loadElementsFromFile(StateDiagram de) {

		try {
			de.getComponent().clear();
			while (true) {
				de.addComponent((DiagramElement) input.readObject());
			}
		} catch (IOException exception) {
			return;
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Unable to create object.");
		}

	}

	@Override
	public void closeFile() {

		try {
			if (output != null)
				output.close();
		} catch (IOException exception) {
			System.err.println("Error closing file");
			System.exit(1);
		}

	}

	@Override
	public void writeSketchToFile(StateDiagram de) {

		try {
			for (int i = 0; i < de.getComponent().size(); i++) {
				DiagramElement elem = de.getComponent().get(i);
				output.writeObject(elem);
			}
		} catch (IOException exception) {
			System.err.println("Error writing to file.");
			return;
		}

	}

}
