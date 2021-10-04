/*
 * @author  Austin Li
 * @version September 21, 2021
 */

package lab04;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileLocator {

	public static void main(String[] args) {
		try {

			// Initial statement
			System.out.println("File locator tool has started.");

			// Asking user for target file name
			String target = getTargetName();
			System.out.println("You selected this as the search target: " + target);

			// Obtaining Starting Folder
			File startingFolder;
			startingFolder = getStartingFolder();
			System.out.println("Your search will start in: " + startingFolder);

			// Starting the search
			searchFolder(startingFolder, target);

		} catch (IllegalArgumentException e) {
			System.out.println("The search has been cancelled.");
		} catch (Exception e) {
			System.out.println("The search encountered an error and has been cancelled.");
		}

	}

	public static String getTargetName() {
		String input = JOptionPane.showInputDialog("Enter a search term:");
		if (input == null)
			throw new IllegalArgumentException();
		if (input.length() == 0) {
			System.out.println("User input was empty.");
			throw new IllegalArgumentException();
		}

		return input;
	}

	public static File getStartingFolder() {
		JFileChooser chooser = new JFileChooser("D:\\Eclipse\\Eclipse Workspace\\CS 1420 - Fall 2021");
		chooser.setDialogTitle("Select a folder to search");
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

		// Processing result
		int result;
		result = chooser.showOpenDialog(null);

		if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("Operation was cancelled by user.");
			throw new IllegalArgumentException();
		}
		File folder = chooser.getSelectedFile();
		return folder;
	}

	public static void searchFolder(File folder, String target) {
		System.out.println("Searching: " + folder + " for filenames containing '" + target + "'.");
		File[] files;
		files = folder.listFiles();
		if (files != null) {
			for (File file : files) {
				String filename = file.getName();
				if (filename.contains(target))
					System.out.println("Found: " + filename);
				if (file.isDirectory())
					searchFolder(file, target);
			}
		} else {
			throw new NullPointerException();
		}

	}
}
