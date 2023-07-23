package Program;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class AppFolders {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scString = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter folder path: ");
		String strPath = scString.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);
		File[] files = path.listFiles(File::isFile);
		System.out.println("-----------------");
		System.out.println("Folders list:");
		System.out.println();

		for (File folder : folders) {
			System.out.println(folder);
		}

		System.out.println("-----------------");
		System.out.println("Files list: ");
		System.out.println();

		for (File file : files) {
			System.out.println(file);
		}

		System.out.println("_________________");

		boolean success = new File(strPath + "\\dirTest2").mkdir();
		System.out.println("Directory created successfully: " + success);

		System.out.print("Enter a file path: ");
		strPath = sc.nextLine();
		File file = new File(strPath);
		System.out.println("File name: " + file.getName());
		System.out.println("File directory (Parent): " + file.getParent());
		System.out.println("File directory (Parent): " + file.getPath());

		scString.close();
		sc.close();
	}

}
