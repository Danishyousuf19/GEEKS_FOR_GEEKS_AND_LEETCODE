
import java.io.*;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class fileHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Task 1: Create and Write to a File
		createAndWriteDiaryEntry(scanner);

		// Task 2: Read from a File
//		readDiaryFile();
//
//		// Task 3: Append Content to an Existing File
//		appendToDiaryFile(scanner);
//
//		// Task 4: List Files and Directories
//		listFilesAndDirectories(scanner);
//
//		// Task 5: Filter and List Specific File Types
//		listTextFiles(scanner);
//
//		// Task 6: Delete a Specific File
//		deleteFile(scanner);
//
//		// Task 7: Copy File Content
//		copyFile(scanner);
//
//		// Task 8: Rename a File
//		renameFile(scanner);
//
//		// Task 9: Display File Metadata
//		displayFileMetadata(scanner);

		// Task 10: Recursive Directory Listing
		recursiveDirectoryListing(scanner);
	}

	// Task 1: Create and Write to a File
	private static void createAndWriteDiaryEntry(Scanner scanner) {
		System.out.println("Enter your diary entry:");
		String entry = scanner.nextLine();

		try {
			File file = new File("diary.txt");
			if (file.exists()) {
				System.out.println("File already exists. Adding entry to existing file.");
			}

			FileWriter writer = new FileWriter(file, true);
			writer.write("\n");
			writer.write(getCurrentDate() + "\n");
			writer.write(entry + "\n");
			writer.close();

			System.out.println("Diary entry added successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}

	// Task 2: Read from a File
	private static void readDiaryFile() {
		try {
			File file = new File("diary.txt");
			if (!file.exists()) {
				System.out.println("Diary file does not exist.");
				return;
			}

			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			System.out.println("Diary Entries:");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}
	}

	// Task 3: Append Content to an Existing File
	private static void appendToDiaryFile(Scanner scanner) {
		System.out.println("Enter new diary entry:");
		String entry = scanner.nextLine();

		try {
			FileWriter writer = new FileWriter("diary.txt", true);
			writer.write("\n");
			writer.write(getCurrentDate() + "\n");
			writer.write(entry + "\n");
			writer.close();

			System.out.println("New entry appended to diary file.");
		} catch (IOException e) {
			System.out.println("An error occurred while appending to the file.");
			e.printStackTrace();
		}
	}

	// Task 4: List Files and Directories
	private static void listFilesAndDirectories(Scanner scanner) {
		System.out.println("Enter directory path:");
		String directoryPath = scanner.nextLine();

		File directory = new File(directoryPath);
		if (!directory.exists()) {
			System.out.println("Directory does not exist.");
			return;
		}

		File[] files = directory.listFiles();
		System.out.println("Files and directories in " + directoryPath + ":");
		for (File file : files) {
			System.out.println(file.getName());
		}
	}

	// Task 5: Filter and List Specific File Types
	private static void listTextFiles(Scanner scanner) {
		System.out.println("Enter directory path:");
		String directoryPath = scanner.nextLine();

		File directory = new File(directoryPath);
		if (!directory.exists()) {
			System.out.println("Directory does not exist.");
			return;
		}

		File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));
		System.out.println("Text files in " + directoryPath + ":");
		for (File file : files) {
			System.out.println(file.getName());
		}
	}

	// Task 6: Delete a Specific File
	private static void deleteFile(Scanner scanner) {
		System.out.println("Enter file name to delete:");
		String fileName = scanner.nextLine();

		File file = new File(fileName);
		if (!file.exists()) {
			System.out.println("File does not exist.");
			return;
		}

		if (file.delete()) {
			System.out.println("File deleted successfully.");
		} else {
			System.out.println("Failed to delete the file.");
		}
	}

	// Task 7: Copy File Content
	private static void copyFile(Scanner scanner) {
		System.out.println("Enter source file path:");
		String sourcePath = scanner.nextLine();

		System.out.println("Enter destination file path:");
		String destPath = scanner.nextLine();

		File sourceFile = new File(sourcePath);
		if (!sourceFile.exists()) {
			System.out.println("Source file does not exist.");
			return;
		}

		File destFile = new File(destPath);
		if (destFile.exists()) {
			System.out.println("Destination file already exists. Do you want to overwrite? (yes/no)");
			String response = scanner.nextLine();
			if (!response.equalsIgnoreCase("yes")) {
				System.out.println("Operation aborted.");
				return;
			}
		}

		try {
			Files.copy(sourceFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File copied successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while copying the file.");
			e.printStackTrace();
		}
	}

	// Task 8: Rename a File
	private static void renameFile(Scanner scanner) {
		System.out.println("Enter current file name:");
		String currentName = scanner.nextLine();

		System.out.println("Enter new file name:");
		String newName = scanner.nextLine();

		File file = new File(currentName);
		if (!file.exists()) {
			System.out.println("File does not exist.");
			return;
		}

		File newFile = new File(newName);
		if (file.renameTo(newFile)) {
			System.out.println("File renamed successfully.");
		} else {
			System.out.println("Failed to rename the file.");
		}
	}

	// Task 9: Display File Metadata
	private static void displayFileMetadata(Scanner scanner) {
		System.out.println("Enter file path:");
		String filePath = scanner.nextLine();

		File file = new File(filePath);
		if (!file.exists()) {
			System.out.println("File does not exist.");
			return;
		}

		System.out.println("File Name: " + file.getName());
		System.out.println("File Size: " + file.length() + " bytes");

		BasicFileAttributes attr;
		try {
			attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
			System.out.println("Last Modified Time: " + attr.lastModifiedTime());
		} catch (IOException e) {
			System.out.println("Error fetching file metadata.");
			e.printStackTrace();
		}
	}

	// Task 10: Recursive Directory Listing
	private static void recursiveDirectoryListing(Scanner scanner) {
		System.out.println("Enter directory path:");
		String directoryPath = scanner.nextLine();

		File directory = new File(directoryPath);
		if (!directory.exists()) {
			System.out.println("Directory does not exist.");
			return;
		}

		System.out.println("Contents of " + directoryPath + ":");
		listFilesRecursive(directory, 0);
	}

	private static void listFilesRecursive(File directory, int level) {
		if (directory.isDirectory()) {
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					for (int i = 0; i < level; i++) {
						System.out.print("\t");
					}
					System.out.println(file.getName());
					if (file.isDirectory()) {
						listFilesRecursive(file, level + 1);
					}
				}
			}
		}
	}

	// Utility method to get current date
	private static String getCurrentDate() {
		return java.time.LocalDate.now().toString();
	}
}
