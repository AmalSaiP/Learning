package LockedMe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileHandling {
	static class MenuOptions {

		public static void WelcomeScreen() {
			
			System.out.println("Welcome to Locked Me which is developed by Amal\n");

			System.out.println("You can retrieve all file names, search, add, or delete files\n");
		}

		public static void displayMenu() {
			String menu = "\nSelect \n"
					+ "1 to Retrieve all files inside folder\n"
					+ "2 to Display menu for File operations\n" + "3 to Exit program\n";
			System.out.println(menu);

		}

		public static void FileMenu() {
			String fileMenu = "\nSelect \n"
					+ "1 to Add a file\n"
					+ "2 to Delete a file\n"
					+ "3 to Search for a file\n" + "4 to Show Previous Menu\n";

			System.out.println(fileMenu);
		}

	}
	public static void createFile(String folderName) {
		File file = new File(folderName);

		if (!file.exists()) {
			file.mkdirs();
		}
	}

	public static void viewFiles(String path) {
		FileHandling.createFile("Phase1 Assignment/Hi");

		List<String> filesListNames = FileHandling.allfiles(path, 0, new ArrayList<String>());

		System.out.println("Displaying all files in ascending order\n");

		filesListNames.stream().forEach(System.out::println);
	}

	private static List<String> allfiles(String path, int i, ArrayList<String> arrayList) {
		// TODO Auto-generated method stub
		File dir = new File(path);
		File[] files = dir.listFiles();
		List<File> filesList = Arrays.asList(files);

		
		if (files != null && files.length > 0) {
			for (File file : filesList) {
				arrayList.add(file.getName());
			}
		}

		return arrayList;

	}

	public static void createFile(String fileToAdd, Scanner sc) {
		FileHandling.createFile("Phase1 Assignment/Hi");
		Path pathToFile = Paths.get("./Phase1 Assignment/Hi/" + fileToAdd);
		try {
			Files.createDirectories(pathToFile.getParent());
			Files.createFile(pathToFile);
			System.out.println(fileToAdd + " created successfully");

			System.out.println("Would you like to add some content? Press Y to yes and N to no");
			String choice = sc.next().toLowerCase();

			sc.nextLine();
			if (choice.equals("y")) {
				System.out.println("\n\nInput content and press enter\n");
				String content = sc.nextLine();
				Files.write(pathToFile, content.getBytes());
				System.out.println("\nContent written to file " + fileToAdd);
				
			}

		} catch (IOException e) {
			System.out.println("Failed to create file " + fileToAdd);
			System.out.println(e.getClass().getName());
		}
	}

	public static List<String> displayFile(String fileName, String path) {
		List<String> fileListNames = new ArrayList<>();
		FileHandling.searchFile(path, fileName, fileListNames);

		if (fileListNames.isEmpty()) {
			System.out.println("\n Couldn't find any file with given file name \"" + fileName + "\"\n");
		} else {
			System.out.println("\nFound file at below location(s):");

			List<String> files = IntStream.range(0, fileListNames.size())
					.mapToObj(index -> (index + 1) + ": " + fileListNames.get(index)).collect(Collectors.toList());

			files.forEach(System.out::println);
		}

		return fileListNames;
	}

	public static void searchFile(String path, String fileName, List<String> fileListNames) {
		File dir = new File(path);
		File[] files = dir.listFiles();
		List<File> filesList = Arrays.asList(files);

		if (files != null && files.length > 0) {
			for (File file : filesList) {

				if (file.getName().startsWith(fileName)) {
					fileListNames.add(file.getAbsolutePath());
				}

				if (file.isDirectory()) {
					searchFile(file.getAbsolutePath(), fileName, fileListNames);
				}
			}
		}
	}

	public static void deleteFile(String path) {

		File currFile = new File(path);
		File[] files = currFile.listFiles();

		if (files != null && files.length > 0) {
			for (File file : files) {

				String fileName = file.getName() + " at " + file.getParent();
				if (file.isDirectory()) {
					deleteFile(file.getAbsolutePath());
				}

				if (file.delete()) {
					System.out.println(fileName + " deleted successfully");
				} else {
					System.out.println("Failed to delete " + fileName);
				}
			}
		}

		String currFileName = currFile.getName() + " at " + currFile.getParent();
		if (currFile.delete()) {
			System.out.println(currFileName + " deleted successfully");
		} else {
			System.out.println("Failed to delete " + currFileName);
		}
	}

	

	static class HandleOptions {
		public static void WelcomeScreen() {
			boolean running = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					MenuOptions.displayMenu();
					int input = sc.nextInt();

					switch (input) {
					case 1:
						FileHandling.viewFiles("Phase1 Assignment/Hi");
						break;
					case 2:
						HandleOptions.FileMenu();
						break;
					case 3:
						System.out.println("Program exited successfully.");
						running = false;
						sc.close();
						System.exit(0);
						break;
					default:
						System.out.println("Please select a valid option from above.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					WelcomeScreen();
				}
			} while (running == true);
		}

		public static void FileMenu() {
			boolean running = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					MenuOptions.FileMenu();
					FileHandling.createFile("Phase1 Assignment/Hi");

					int input = sc.nextInt();
					switch (input) {
					case 1:
						System.out.println("Enter the name of the file to be added");
						String fileToAdd = sc.next();

						FileHandling.createFile(fileToAdd, sc);

						break;
					case 2:
						// File/Folder delete
						System.out.println("Enter the name of the file to be deleted");
						String fileToDelete = sc.next();

						FileHandling.createFile("Phase1 Assignment/Hi");
						List<String> filesToDelete = FileHandling.displayFile(fileToDelete,
								"Phase1 Assignment/Hi");

						String deletionPrompt = "\nSelect index of which file to delete?"
								+ "\nEnter 0 if you want to delete ";
						System.out.println(deletionPrompt);

						int i = sc.nextInt();

						if (i != 0) {
							FileHandling.deleteFile(filesToDelete.get(i - 1));
						} else {

							for (String path : filesToDelete) {
								FileHandling.deleteFile(path);
							}
						}

						break;
					case 3:
						
						System.out.println(
								"Enter the name of the file to be searched from \"Phase1 Assignment/Hi\" folder");
						String fileName = sc.next();

						FileHandling.createFile("Phase1 Assignment/Hi");
						FileHandling.displayFile(fileName, "Phase1 Assignment/Hi");

						break;
					case 4:
						
						return;
					
					default:
						System.out.println("Please select a valid option from above.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					FileMenu();
				}
			} while (running == true);
		}
	}

}
